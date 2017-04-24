<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<h1>VEIW</h1>

	<!-- jquery cdn -->

	<div>
		<p>
			<input type="text" id="reText" value="테스트 한글">
		</p>
		<p>
			<input type="text" id="replyer" value="replyer001">
		</p>
		<p>
			<button id="saveBtn">Save</button>
		</p>

	</div>

	<button id="delBtn">DELETE BUTTON</button>
	<button id="modBtn">MODIFY</button>

	<script src="https://code.jquery.com/jquery-3.2.1.min.js"
		integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4="
		crossorigin="anonymous"></script>

	<!-- ajax로 데이타를 보내는 방법 -->
	<script>
  /* json데이타 보내주기  */
  
  $(document).ready(function () {
	
	  
	  $('#modBtn').click(function (e) {
		  
		  var obj={reText:"한글테스트",replyer:"나나나"};
		  
		  $.ajax({
			  type:'put',
			  url:'/replies/321/21',
			  headers:{"Content-Type":"application/json",
				  "X-HTTP-Method-Override": "POST"/* 지금내가보내는 데이타는 json이다 */
			  },
			  data: JSON.stringify(obj),
			  success:function(result){
				  console.log(result);
				  console.log(result.reText);
			  }
		  });//end ajax
	  });
		
	
  
	  
	  
	  $('#delBtn').click(function (e) {   //delBtn 테스트
		  
		$.ajax({
			type:'delete',
			url:'/replies/321/21',
			success:function(msg){
				  console.log(msg);
			  }
		});
		  
	});
	  
	  $("#saveBtn").click(function (e) {
		
		  var obj={
				  reText:$('#reText').val(),
				  replyer:$('#replyer').val()
		  }; /* 자바스크립트 객체는 한번 묵어주면 됨 */
		  
		  $.ajax({
			  type:'post',
			  url:'/replies/321',
			  headers:{"Content-Type":"application/json"},/* 지금내가보내는 데이타는 json이다 */
			  data: JSON.stringify(obj),
			  success:function(result){
				  console.log(result);
				  console.log(result.reText);
			  }
		  });//end ajax
	});//end click
});
  
  
  </script>

</body>
</html>
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
			<input type="text" id="reText" value="�׽�Ʈ �ѱ�">
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

	<!-- ajax�� ����Ÿ�� ������ ��� -->
	<script>
  /* json����Ÿ �����ֱ�  */
  
  $(document).ready(function () {
	
	  
	  $('#modBtn').click(function (e) {
		  
		  var obj={reText:"�ѱ��׽�Ʈ",replyer:"������"};
		  
		  $.ajax({
			  type:'put',
			  url:'/replies/321/21',
			  headers:{"Content-Type":"application/json",
				  "X-HTTP-Method-Override": "POST"/* ���ݳ��������� ����Ÿ�� json�̴� */
			  },
			  data: JSON.stringify(obj),
			  success:function(result){
				  console.log(result);
				  console.log(result.reText);
			  }
		  });//end ajax
	  });
		
	
  
	  
	  
	  $('#delBtn').click(function (e) {   //delBtn �׽�Ʈ
		  
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
		  }; /* �ڹٽ�ũ��Ʈ ��ü�� �ѹ� �����ָ� �� */
		  
		  $.ajax({
			  type:'post',
			  url:'/replies/321',
			  headers:{"Content-Type":"application/json"},/* ���ݳ��������� ����Ÿ�� json�̴� */
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
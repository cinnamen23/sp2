package org.zerock.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.zerock.domain.MessageVO;

@RestController  //이걸로 바뀌면 모든게 리스폰스 뭐라고 하셨는데.... 
@RequestMapping("/s2")
public class Sample2Controller {

	@GetMapping("/doA")    //이거 하면 jsp로 간다 doA.jsp로 바뀐다 
	public String doA(){
		return "hello";
	}
	
	@GetMapping("doC/{cat}/{item}")
	public void doC(@PathVariable("cat") String cat,
			@PathVariable("item") String item){
		System.out.println("cat: "+cat);
		System.out.println("item: "+item);
		
	}
	
	@PostMapping("/msg")  //과거에는 폼태그로 데이타를 보내는게 중요했는데 이제는 폼태그는 영역을 구분하는정도밖에 안됨 
	public MessageVO doD(@RequestBody MessageVO vo){
		
		System.out.println(vo);
		return vo;
	}	
	
	@GetMapping("/doB")    //이거 하면 jsp로 간다 doA.jsp로 바뀐다 
	public Map<String,String> doB(){
		Map<String,String> map= new HashMap<>();
		map.put("uid", "AAAA");
		map.put("upw", "BBBB");
		return map;
	}
	
	
}

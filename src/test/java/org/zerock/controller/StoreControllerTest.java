package org.zerock.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
public class StoreControllerTest {

	WebApplicationContext ctx;

	MockMvc mockMvc;

	@Before // junit의 before 모든 테스트 시작하기 전에 가짜 리퀘스트를 만들것이다.
	public void setup() {

		mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();

	}

	@Test
	public void testList() throws Exception {

		Map<String, Object> map = mockMvc.perform(get("/store/list")).andReturn().getModelAndView().getModel();
		System.out.println(map.get("cri"));
		System.out.println(map.get("list"));
	}

}

package org.zerock.controller;

import java.sql.Connection;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.Criteria;
import org.zerock.domain.StoreVO;
import org.zerock.persistence.StoreDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class StoreDAOTest {
	
	private static Logger logger = Logger.getLogger(StoreDAOTest.class);
	
	@Inject
	StoreDAO dao;
	
	@Inject
	DataSource ds;
	
	
	@Test
	public void test1() throws Exception{
		logger.info(dao);
		logger.info(dao.getTime());
	}
	
	@Test
	public void testCreate() throws Exception{
		StoreVO vo = new StoreVO();
		vo.setSname("담소사골순대");
		vo.setLat(37.495582);
		vo.setLng(127.031328);
		vo.setInfo("순댓국 5200원!!!!");
		dao.create(vo);
	}
	
	@Test
	public void testList() throws Exception{
		Criteria cri = new Criteria();
//		cri.setType("n");
		cri.setTypes(new String[]{"n","c"});
		
		cri.setKeyword("33");
		dao.list(cri).forEach(store->logger.info(store)); 
	}
	
	@Test
	public void TestLoad(){
		
		try {
			Connection con= ds.getConnection();
			logger.info(con);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	
}

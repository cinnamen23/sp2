package org.zerock.service;

import java.util.List;

import org.zerock.domain.Criteria;
import org.zerock.domain.StoreVO;

public interface StoreService {
	
	public void register(StoreVO vo)throws Exception;
	
	public StoreVO findBySno(Integer sno)throws Exception;
	
	public void modify(StoreVO vo)throws Exception;
	
	public void remove(Integer sno)throws Exception;
	
	public List<StoreVO> getList(Criteria cri)throws Exception ;
	
	public int getCount(Criteria cri) throws Exception;

}

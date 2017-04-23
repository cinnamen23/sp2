package org.zerock.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.zerock.domain.Criteria;
import org.zerock.domain.StoreVO;
import org.zerock.persistence.StoreDAO;
@Service
public class StoreServiceImpl implements StoreService {

	@Inject
	private StoreDAO dao;
	
	@Override
	public void register(StoreVO vo) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public StoreVO findBySno(Integer sno) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void modify(StoreVO vo) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(Integer sno) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public List<StoreVO> getList(Criteria cri) throws Exception {
		return dao.list(cri);
	}

	@Override
	public int getCount(Criteria cri) throws Exception {
		return dao.listCount(cri);
	}

}

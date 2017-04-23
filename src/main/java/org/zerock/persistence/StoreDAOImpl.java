
package org.zerock.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.zerock.domain.Criteria;
import org.zerock.domain.StoreVO;
@Repository

public class StoreDAOImpl implements StoreDAO {
	
	
	

	static final String namespace="org.zerock.persistence.StoreDAO";
	
	@Inject
	SqlSession session;
	
	
	@Override
	public void create(StoreVO vo) {
		session.insert(namespace+".create",vo);
	}

	@Override
	public StoreVO read(Integer sno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(StoreVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer sno) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getTime() {
		
		return session.selectOne(namespace+".getTime");
	}

	@Override
	public List<StoreVO> list(Criteria cri)  {
		return session.selectList(namespace+".list",cri);
	}

	@Override
	public int listCount(Criteria cri) {
		return session.selectOne(namespace+".listCount",cri);
	}

}

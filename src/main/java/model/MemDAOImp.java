package model;

import org.mybatis.spring.SqlSessionTemplate;

public class MemDAOImp implements MemDAO{

	private SqlSessionTemplate sqlSession;
	
	public MemDAOImp() {
		// TODO Auto-generated constructor stub
	}
	
	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	@Override
	public void inserMethod(MemDTO dto) {
		sqlSession.insert("mem.ins", dto);
		
	}
}

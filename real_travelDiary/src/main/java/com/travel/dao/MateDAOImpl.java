package com.travel.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

public class MateDAOImpl implements MateDAO {
	
	@Autowired
	private SqlSession sqlSession;

}

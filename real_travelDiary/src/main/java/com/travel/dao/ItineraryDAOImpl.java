package com.travel.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

public class ItineraryDAOImpl implements ItineraryDAO {
	
	@Autowired
	private SqlSession sqlSession;

}

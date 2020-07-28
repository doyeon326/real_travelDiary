package com.travel.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.travel.vo.MeetUpVO;

public class MeetUpDAOImpl implements MeetUpDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<MeetUpVO> meetUpInfo() {
		List<MeetUpVO> vo = sqlSession.selectList("com.travel.mapper.MeetUpMapper.meetUpInfo");
		
		
		return vo;
	}
	@Override
	public MeetUpVO meetUpDetails(int meetupBoard_idx){
		return sqlSession.selectOne("com.travel.mapper.MeetUpMapper.meetUpDetails",meetupBoard_idx);
	}
	
	@Override
	public void insertMeetup(MeetUpVO vo) {
		
		sqlSession.insert("com.travel.mapper.MeetUpMapper.insertMeetup",vo);
		
	}
}

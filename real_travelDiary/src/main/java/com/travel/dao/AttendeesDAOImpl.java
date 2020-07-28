package com.travel.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.travel.vo.AttendeesVO;

public class AttendeesDAOImpl implements AttendeesDAO {
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<AttendeesVO> attendeesList(int meetupBoard_idx){
		return sqlSession.selectList("com.travel.mapper.AttendeesMapper.Attendees",meetupBoard_idx); 
	}
	
	@Override
	public int attendStatus(int user_idx , int meetupBoard_idx) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("user_idx", user_idx);
		map.put("meetupBoard_idx", meetupBoard_idx);
		
		int attendStatus = sqlSession.selectOne("com.travel.mapper.AttendeesMapper.attendStatus",map);
		return attendStatus;
	}
	
	@Override
	public void attendlistdelete(int user_idx , int meetupBoard_idx) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("user_idx", user_idx);
		map.put("meetupBoard_idx", meetupBoard_idx);
		sqlSession.delete("com.travel.mapper.AttendeesMapper.deleteattendlist",map);
	}
	
	@Override
	public void attendlistinsert(int user_idx , int meetupBoard_idx) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("user_idx", user_idx);
		map.put("meetupBoard_idx", meetupBoard_idx);
		sqlSession.insert("com.travel.mapper.AttendeesMapper.insertattendlist",map);
		
		
	}
}

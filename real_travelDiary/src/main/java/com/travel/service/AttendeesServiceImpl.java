package com.travel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.dao.AttendeesDAO;
import com.travel.vo.AttendeesVO;

@Service
public class AttendeesServiceImpl implements AttendeesService {

	@Autowired
	AttendeesDAO dao;
	
	@Override
	public List<AttendeesVO> attendeesList(int meetupBoard_idx){
		return dao.attendeesList(meetupBoard_idx);
	}
	@Override
	public int attendStatus(int user_idx , int meetupBoard_idx) {
		return dao.attendStatus(user_idx, meetupBoard_idx);
	}
	@Override
	public void attendlistdelete(int user_idx , int meetupBoard_idx) {
		dao.attendlistdelete(user_idx, meetupBoard_idx);
	}
	
	@Override
	public void attendlistinsert(int user_idx , int meetupBoard_idx) {
		dao.attendlistinsert(user_idx, meetupBoard_idx);
	}
}

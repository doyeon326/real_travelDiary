package com.travel.dao;

import java.util.List;

import com.travel.vo.MeetUpVO;

public interface MeetUpDAO {
	public List<MeetUpVO> meetUpInfo();
	public MeetUpVO meetUpDetails(int meetupBoard_idx);
	public void insertMeetup(MeetUpVO vo);
}

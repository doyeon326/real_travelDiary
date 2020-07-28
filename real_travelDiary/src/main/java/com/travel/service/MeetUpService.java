package com.travel.service;

import java.util.List;


import com.travel.vo.MeetUpVO;

public interface MeetUpService {
	
	public List<MeetUpVO> meetUpInfo();
	public MeetUpVO meetUpDetails(int meetupBoard_idx);
	public void insertMeetup(MeetUpVO vo);
}

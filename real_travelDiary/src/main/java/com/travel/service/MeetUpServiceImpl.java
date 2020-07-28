package com.travel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.dao.AttendeesDAO;
import com.travel.dao.MeetUpDAO;
import com.travel.vo.AttendeesVO;
import com.travel.vo.MeetUpVO;


@Service
public class MeetUpServiceImpl implements MeetUpService {
	@Autowired
	MeetUpDAO dao;
	@Autowired
	AttendeesDAO attendeeDAO;
	
	
	public List<MeetUpVO> meetUpInfo(){
		return dao.meetUpInfo();
	}
	
	public MeetUpVO meetUpDetails(int meetupBoard_idx){
		
		MeetUpVO boardDetails = dao.meetUpDetails(meetupBoard_idx);
		List<AttendeesVO> attendees = attendeeDAO.attendeesList(meetupBoard_idx);

		int myattendStatus = attendeeDAO.attendStatus(/*login user's index*/1, meetupBoard_idx); //checking user sstatus of attending this meetup
		boardDetails.setAttendStatus(myattendStatus);
		System.out.println("myattendstatus: "+myattendStatus +"current board status:" +meetupBoard_idx	);
		
		if(attendees!=null) {
			String names[]= new String[attendees.size()]; 
			System.out.println("사이즈: " + attendees.size());
			
			for(int i= 0; i <attendees.size() ; i++) {
			names[i] = attendees.get(i).getName();
			}
			boardDetails.setNames(names);
			System.out.println("successful!");
		}

		return boardDetails;
	}
	
	public void insertMeetup(MeetUpVO vo) {
		vo.setUser_idx(1); //현재로그인되어있는 유저 정보
		dao.insertMeetup(vo);
		
	}
}

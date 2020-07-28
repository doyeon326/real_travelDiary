package com.travel.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.travel.service.AttendeesService;
import com.travel.service.MeetUpService;
import com.travel.vo.AttendeesVO;
import com.travel.vo.MeetUpVO;

@Controller
public class HomeController {	
	@Autowired
	MeetUpService service_meetup;
	@Autowired
	AttendeesService service_attendees;
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "mainPage";
	}
	
	@RequestMapping(value = "/viewMeetup", method = RequestMethod.GET)
	public String viewMeetup(HttpServletRequest request) {
		List<MeetUpVO> listMeetup = service_meetup.meetUpInfo(); 
		List<AttendeesVO> listAttendees = service_attendees.attendeesList(1); //meetup board idx
		
		//check meetup attendant status of the user
		int attendStatus = service_attendees.attendStatus(1, 1); //user_idx , board_idx  
		System.out.println("attendStatus: " + attendStatus);
		request.setAttribute("attendStatus", attendStatus);
		

//		
		request.setAttribute("listAttendees",listAttendees);
		request.setAttribute("listMeetup",listMeetup);
		
		return "viewMeetup";
	}

	@RequestMapping(value = "/viewMeetupDetails", method = RequestMethod.POST)
	@ResponseBody
	public MeetUpVO viewMeetupDetails(HttpServletRequest request,@RequestParam(value = "meetupBoard_idx", required = false) Integer meetupBoard_idx) {
		MeetUpVO vo = service_meetup.meetUpDetails(meetupBoard_idx);
		return vo;
	}
	
	@RequestMapping(value = "/deletemeetupattend", method = RequestMethod.POST)
	@ResponseBody
	public String deletemeetupattend(HttpServletRequest request,@RequestParam(value = "meetupBoard_idx", required = false) Integer meetupBoard_idx) {
		System.out.println("딜릿들어옴" + meetupBoard_idx);
		
		service_attendees.attendlistdelete(1, meetupBoard_idx); //useridx , boardidx
		System.out.println("딜릿나감");
		return "success";
	}
	
	@RequestMapping(value = "/insertemeetupattend", method = RequestMethod.POST)
	@ResponseBody
	public String insertmeetupattend(HttpServletRequest request,@RequestParam(value = "meetupBoard_idx", required = false) Integer meetupBoard_idx) {
		System.out.println("인써트들어옴" + meetupBoard_idx);
		service_attendees.attendlistinsert(1, meetupBoard_idx); //useridx, boardidx
		System.out.println("인써트나옴");
		return "success";
	}
	
	@RequestMapping(value = "/createMeetup", method = RequestMethod.GET)
	public String createMeetup() {
		return "createMeetup";
	}
	
	@RequestMapping(value = "/insertMeetup", method = RequestMethod.POST)
	public String insertMeetup(MeetUpVO vo) {
		service_meetup.insertMeetup(vo);
		return "redirect:/viewMeetup";
	}
	
	@RequestMapping(value = "/viewGallery", method = RequestMethod.GET)
	public String viewGallery() {
		
		return "viewGallery";
	}
	
	
}

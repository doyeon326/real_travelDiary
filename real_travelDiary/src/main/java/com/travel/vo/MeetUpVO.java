package com.travel.vo;


public class MeetUpVO {
	
	private int idx;
	private int user_idx;
	private String date;
	private String destination;
	private String title;
	private int max_attendees;
	private String date_start;
	private String date_end;
	private int attendees_count;
	private String contents;
	private String name; //writer
	private String []names; //attendees
	private int attendStatus;
	
	
	public int getAttendStatus() {
		return attendStatus;
		
	}
	public void setAttendStatus(int attendStatus) {
		this.attendStatus = attendStatus;
	}
	public String[] getNames() {
		return names;
	}
	public void setNames(String[] names) {
		this.names = names;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public int getUser_idx() {
		return user_idx;
	}
	public void setUser_idx(int user_idx) {
		this.user_idx = user_idx;
	}

	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getMax_attendees() {
		return max_attendees;
	}
	public void setMax_attendees(int max_attendees) {
		this.max_attendees = max_attendees;
	}
	public String getDate_start() {
		return date_start;
	}
	public void setDate_start(String date_start) {
		this.date_start = date_start;
	}
	public String getDate_end() {
		return date_end;
	}
	public void setDate_end(String date_end) {
		this.date_end = date_end;
	}
	public int getAttendees_count() {
		return attendees_count;
	}
	public void setAttendees_count(int attendees_count) {
		this.attendees_count = attendees_count;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}

}

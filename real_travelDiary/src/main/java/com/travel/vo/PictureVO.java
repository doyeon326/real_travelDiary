package com.travel.vo;

import java.util.Date;

public class PictureVO {
	
	private int idx;
	private String file_name;
	private int user_idx;
	private Date date;
	private int total_likes;
	private String caption;
	
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getFile_name() {
		return file_name;
	}
	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}
	public int getUser_idx() {
		return user_idx;
	}
	public void setUser_idx(int user_idx) {
		this.user_idx = user_idx;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getTotal_likes() {
		return total_likes;
	}
	public void setTotal_likes(int total_likes) {
		this.total_likes = total_likes;
	}
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	
	
}

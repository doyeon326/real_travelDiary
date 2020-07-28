package com.travel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.dao.BoardReplyDAO;

@Service
public class BoardReplyServiceImpl implements BoardReplyService {

	@Autowired
	BoardReplyDAO dao;
}

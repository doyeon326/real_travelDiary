package com.travel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.dao.BoardLikeDAO;

@Service
public class BoardLikeServiceImpl implements BoardLikeService {
	
	@Autowired
	BoardLikeDAO dao;
}

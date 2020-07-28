package com.travel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.dao.PictureLikeDAO;

@Service
public class PictureLikeServiceImpl implements PictureLikeService {
	
	@Autowired
	PictureLikeDAO dao;
}

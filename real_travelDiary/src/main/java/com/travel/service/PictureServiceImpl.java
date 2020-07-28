package com.travel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.dao.PictureDAO;

@Service
public class PictureServiceImpl implements PictureService {

	@Autowired
	PictureDAO dao;
}

package com.travel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.dao.MateDAO;

@Service
public class MateServiceImpl implements MateService {
	
	@Autowired
	MateDAO dao;
}

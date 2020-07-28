package com.travel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.dao.BadgeDAO;

@Service
public class BadgeServiceImpl implements BadgeService {

	@Autowired
	BadgeDAO dao;
}

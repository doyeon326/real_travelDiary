package com.travel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.dao.ItineraryDAO;

@Service
public class ItineraryServiceImpl implements ItineraryService {

	@Autowired
	ItineraryDAO dao;
}

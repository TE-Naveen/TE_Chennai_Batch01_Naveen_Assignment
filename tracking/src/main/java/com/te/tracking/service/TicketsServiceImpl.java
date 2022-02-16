package com.te.tracking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.tracking.bean.Tickets;
import com.te.tracking.dao.TicketsDao;

@Service
public class TicketsServiceImpl implements TicketsService {

	@Autowired(required = false)
	private TicketsDao dao;

	@Override
	public Integer seatcheck(Tickets bean) {
		return dao.seatcheck(bean);
	}

	@Override
	public Integer book(Integer id,Integer no) {
		return dao.book(id,no);
		
	}

	@Override
	public Integer cancel(Integer id) {
		return dao.cancel(id);
		
	}

	

	
}
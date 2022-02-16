package com.te.tracking.dao;

import com.te.tracking.bean.Tickets;

public interface TicketsDao {

	public Integer seatcheck(Tickets bean);

	public Integer book(Integer id,Integer no);

	public Integer cancel(Integer id);
	
	
	
}

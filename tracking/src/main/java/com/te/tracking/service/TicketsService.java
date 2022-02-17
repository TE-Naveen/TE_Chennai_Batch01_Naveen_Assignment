package com.te.tracking.service;

import com.te.tracking.bean.Tickets;

public interface TicketsService {

	public Integer seatcheck(Tickets bean);

	public Integer book(Integer id, Integer no);

	public Integer cancel(Integer id);

}

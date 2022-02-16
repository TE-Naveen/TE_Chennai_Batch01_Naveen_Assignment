package com.te.tracking.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.te.tracking.bean.Tickets;

@Repository
public class TicketsDaoImpl implements TicketsDao {

	static Tickets beans;
	static Integer availableSeat;
	static Integer count = 0;

	@Override
	public Integer seatcheck(Tickets bean) {

		EntityManagerFactory factory = null;
		EntityManager manager = null;
		try {
			factory = Persistence.createEntityManagerFactory("tracking");
			manager = factory.createEntityManager();

			String query = "select count(*) from Tickets where" + " fromCity =: fc and toCity =: tc"
					+ " and travelDate =: td" + " and ticketStatus =:ts and fromState =:fs and toState =:tostate";

			Query query2 = manager.createQuery(query);

			query2.setParameter("fc", bean.getFromCity());
			query2.setParameter("tc", bean.getToCity());
			query2.setParameter("td", bean.getTravelDate());
			query2.setParameter("ts", "available");
			query2.setParameter("fs", bean.getFromState());
			query2.setParameter("tostate", bean.getToState());

			Object tickets = query2.getSingleResult();
			availableSeat = Integer.parseInt(tickets.toString());
			beans = bean;
			return availableSeat;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Integer book(Integer id, Integer no) {
		System.out.println(id);
		System.out.println(no);
		EntityManagerFactory factory = null;
		EntityManager manager = null;
		EntityTransaction transaction = null;
		try {
			factory = Persistence.createEntityManagerFactory("tracking");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();

			String query = "from Tickets where" + " fromCity =: fc and toCity =: tc" + " and travelDate =: td"
					+ " and ticketStatus =:ts and fromState =:fs and toState =:tostate";

			Query query2 = manager.createQuery(query);
			query2.setParameter("fc", beans.getFromCity());
			query2.setParameter("tc", beans.getToCity());
			query2.setParameter("td", beans.getTravelDate());
			query2.setParameter("ts", "available");
			query2.setParameter("fs", beans.getFromState());
			query2.setParameter("tostate", beans.getToState());

			List<Tickets> tickets = query2.getResultList();

			if (no <= availableSeat) {
				count = 0;
				for (int i = 0; i < no; i++) {

					if (!tickets.get(i).getTicketStatus().equals("booked")) {
						Tickets ticket = manager.find(Tickets.class, tickets.get(i).getTicketsId());
						ticket.setTicketStatus("booked");
						ticket.setId(id);
						transaction.begin();
						manager.persist(ticket);
						transaction.commit();
						++count;
						--availableSeat;
					}
				}
				return count;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Integer cancel(Integer id) {
		EntityManagerFactory factory = null;
		EntityManager manager = null;
		EntityTransaction transaction = null;
		try {
			factory = Persistence.createEntityManagerFactory("tracking");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();

			String query = "from Tickets where" + " fromCity =: fc and toCity =: tc" + " and travelDate =: td"
					+ " and ticketStatus =:ts and fromState =:fs and toState =:tostate and id =:us";

			Query query2 = manager.createQuery(query);
			query2.setParameter("fc", beans.getFromCity());
			query2.setParameter("tc", beans.getToCity());
			query2.setParameter("td", beans.getTravelDate());
			query2.setParameter("ts", "booked");
			query2.setParameter("fs", beans.getFromState());
			query2.setParameter("tostate", beans.getToState());
			query2.setParameter("us", id);

			List<Tickets> tickets = query2.getResultList();

			for (int i = 0; i < count; i++) {

				if (tickets.get(i).getTicketStatus().equals("booked")) {

					Tickets ticket = manager.find(Tickets.class, tickets.get(i).getTicketsId());
					ticket.setTicketStatus("available");
					ticket.setId(0);
					transaction.begin();
					manager.persist(ticket);
					transaction.commit();
				}
			}
			return count;

		} catch (Exception e) {
			e.printStackTrace();

		}
		return null;

	}
}

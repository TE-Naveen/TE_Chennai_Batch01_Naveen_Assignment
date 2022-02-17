package com.te.tracking.bean;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Tickets implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "Tickets_Id")
	private Integer ticketsId;

	@Column(name = "Seat_No")
	private Integer seatNo;

	@Column(name = "From_City")
	private String fromCity;

	@Column(name = "To_City")
	private String toCity;

	@Column(name = "From_State")
	private String fromState;

	@Column(name = "To_State")
	private String toState;

	@Column(name = "Price")
	private Double price;

	@Column(name = "Travel_Date")
	private Date travelDate;

	@Column(name = "Ticket_status")
	private String ticketStatus;

	@Column(name = "Id")
	private Integer id;

}

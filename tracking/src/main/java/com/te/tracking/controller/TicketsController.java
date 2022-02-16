package com.te.tracking.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.te.tracking.bean.Tickets;
import com.te.tracking.bean.UserInfo;
import com.te.tracking.service.TicketsService;

@Controller
public class TicketsController {

	@Autowired(required = false)
	private TicketsService service;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		CustomDateEditor dateEditor = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
		binder.registerCustomEditor(Date.class, dateEditor);
	}

	@PostMapping("/seatcheck")
	public String seatcheck(Tickets bean, ModelMap map, @SessionAttribute(name = "isLoggedIn") UserInfo info) {
		if (info != null) {
			Integer ticketCount = service.seatcheck(bean);
			if (ticketCount != null && ticketCount > 0) {
				map.addAttribute("data", ticketCount);
				return "booking";
			} else {
				map.addAttribute("err", "Ticket Not Avaiable");
				return "welcome";
			}
		} else {
			map.addAttribute("err", "please Login First");
			return "loginform";
		}
	}

	@GetMapping("/book")
	public String booking(HttpServletRequest req, ModelMap map) {
		HttpSession session = req.getSession(false);
		UserInfo info = (UserInfo) session.getAttribute("isLoggedIn");
		if (info != null) {
			Integer no = Integer.parseInt(req.getParameter("no"));

			Integer info1 = service.book(info.getId(), no);
			if (info1 != null && info1 > 0) {
				map.addAttribute("data", info1);
				return "ticketbooked";
			} else {
				map.addAttribute("err", "Seat Not Available");
				return "welcome";
			}
		}
		map.addAttribute("err", "please Login First");
		return "loginform";

	}

	@GetMapping("/cancel")
	public String cancel(ModelMap map, @SessionAttribute(name = "isLoggedIn") UserInfo info) {
		if (info != null) {
			Integer ticketCount = service.cancel(info.getId());
			if (ticketCount != null && ticketCount > 0) {
				map.addAttribute("data", ticketCount);
				map.addAttribute("err", "Ticket cancelled");
				return "welcome";
			}
		}
		map.addAttribute("err", "please Login First");
		return "loginform";

	}

	@GetMapping("/logout")
	public String logout(HttpServletRequest req, ModelMap map) {
		HttpSession session = req.getSession(false);
		if (session.getAttribute("isLoggedIn") != null) {
			session.invalidate();
			map.addAttribute("err", "logged out successfull");
			return "loginform";
		} else {
			map.addAttribute("err", "please login first");
			return "loginform";
		}

	}

}

package com.pluralsight.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.pluralsight.model.Attendee;

@Controller
public class AttendeeController {
	
	@GetMapping(value = "/attendee")
	public String displayAtendeePage(Model model) {
		Attendee attendee = new Attendee();
		model.addAttribute("attendee",attendee);
		return "attendee";
	}

	@PostMapping(value = "/attendee")
	public String processAttendee(@ModelAttribute("attendee") Attendee attendee) {
		System.out.println(attendee.getName());
		return "redirect:index.html";
	}
}

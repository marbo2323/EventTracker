package com.pluralsight.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
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
	public String processAttendee(@Valid Attendee attendee, BindingResult validation, Model model) {
		System.out.println(attendee.getName());
		
		if (validation.hasErrors()) {
			return "attendee";
		}
		
		return "redirect:index.html";
	}
}

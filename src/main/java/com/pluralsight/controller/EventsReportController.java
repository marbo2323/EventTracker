package com.pluralsight.controller;



import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pluralsight.model.Event;

@RestController
public class EventsReportController {
	
	@RequestMapping(value = "/events")
	public List<Event> getEvents(){
		List<Event> events = new ArrayList<>();
		
		Event ev1 = new Event();
		ev1.setName("Java User Group");
		events.add(ev1);
		
		Event ev2 = new Event();
		ev2.setName("Angular User Group");
		events.add(ev2);
		
		return events;
		
	}
	

}

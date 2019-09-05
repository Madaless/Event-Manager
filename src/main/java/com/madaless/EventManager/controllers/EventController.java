package com.madaless.EventManager.controllers;

import com.madaless.EventManager.entities.Event;
import com.madaless.EventManager.services.EventService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EventController {

  @Autowired
  EventService eventService;

  @RequestMapping("/events")
  public ModelAndView Eventlist(){
    ModelAndView mv = new ModelAndView("index");
    List<Event> events = eventService.findAll();
    mv.addObject("events", events);
    return mv;
  }

  @GetMapping("/eventdelete/{id}")
  public String deleteEvent(@PathVariable("id") long id) {
    eventService.delete(id);
    return "redirect:/events";
  }
}

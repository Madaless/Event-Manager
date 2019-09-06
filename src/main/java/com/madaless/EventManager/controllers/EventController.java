package com.madaless.EventManager.controllers;

import com.madaless.EventManager.entities.Event;
import com.madaless.EventManager.services.EventService;
import com.madaless.EventManager.services.TodoPredefListService;
import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/events")
public class EventController {

  @Autowired
  EventService eventService;
  @Autowired
  TodoPredefListService todoPredefListService;

  @RequestMapping("/all")
  public ModelAndView Eventlist(){
    ModelAndView mv = new ModelAndView("index");
    List<Event> events = eventService.findAll();
    mv.addObject("events", events);
    return mv;
  }

  @RequestMapping("/new")
  public String createEvent(Model model, Event event){
    model.addAttribute("todoPredefList", todoPredefListService.findAll());
    model.addAttribute("event", event);
    return "add-event";
  }

  @PostMapping("/add")
  public String addEvent(@Valid Event event, BindingResult result, Model model) {
    if (result.hasErrors()) {
      return "add-event";
    }
    //model.addAttribute("predef", todoPredefListService.findAll() );
    eventService.save(event);
    return "redirect:all";
  }

  @GetMapping("/delete/{id}")
  public String deleteEvent(@PathVariable("id") long id) {
    eventService.delete(id);
    return "redirect:/events/all";
  }

//  @RequestMapping(path = {"/edit", "/edit/{id}"})
//  public String editEvent(Model model, @PathVariable("id") Optional<Long> id)
//  {
//
//
//  }

  @RequestMapping("/edit/{id}")
  public ModelAndView editEvent(@PathVariable("id") long id) {
    ModelAndView mav = new ModelAndView("add_edit_event");
    Event event = eventService.getEvent(id);
    mav.addObject("event", event);
    return mav;
  }

  @PostMapping("/update/{id}")
  public String updateEvent(@PathVariable("id") long id, Model model, @Valid Event event, BindingResult result) {
    if(result.hasErrors()){
      event.setId(id);
      return "add_edit_event";
    }
    eventService.update(id,event);
    model.addAttribute("events", eventService.findAll());
    return "index";
  }

}

package com.madaless.EventManager.controllers;

import com.madaless.EventManager.entities.Event;
import com.madaless.EventManager.entities.TodoPredefList;
import com.madaless.EventManager.services.TodoPredefListService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/predefined/")
public class TodoPredefListController {

  @Autowired
  TodoPredefListService todoPredefListService;


  @RequestMapping("/all")
  public ModelAndView Eventlist(){
    ModelAndView mv = new ModelAndView("predef-list");
    List<TodoPredefList> predefLists = todoPredefListService.findAll();
    mv.addObject("predefLists", predefLists);
    return mv;
  }

  @RequestMapping("/new")
  public String createEvent(TodoPredefList todoPredefList){
    return "add-event";
  }
}

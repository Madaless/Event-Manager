package com.madaless.EventManager.controllers;

import com.madaless.EventManager.entities.Event;
import com.madaless.EventManager.entities.TodoItem;
import com.madaless.EventManager.entities.TodoItemPre;
import com.madaless.EventManager.services.TodoItemPreService;
import com.madaless.EventManager.services.TodoService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ToDoController {

  @Autowired
  private TodoService todoService;
  @Autowired
  private TodoItemPreService todoItemPreService;

  @RequestMapping("/all")
  public ModelAndView Eventlist(){
    ModelAndView mv = new ModelAndView("add-event");
    List<TodoItem>  todos = todoService.findAll();
    List<TodoItem>  predeftodos = new ArrayList<>();

    for(TodoItem todo : todos)
    {
      if(todo.getIs_predef() == true)
        predeftodos.add(todo);
    }
    mv.addObject("predeflist", predeftodos);
    return mv;
  }

}


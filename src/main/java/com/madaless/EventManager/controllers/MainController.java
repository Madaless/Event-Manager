package com.madaless.EventManager.controllers;


import com.madaless.EventManager.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//

@Controller
public class MainController {

  @Autowired
  private TodoService todoService;

  @RequestMapping("/")
    public String index() {
    return "index";
  }

}

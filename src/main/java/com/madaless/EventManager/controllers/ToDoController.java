package com.madaless.EventManager.controllers;

import com.madaless.EventManager.entities.TodoItem;
import com.madaless.EventManager.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToDoController {

  @Autowired
  private TodoService todoService;

  @GetMapping("/todo/{id}")
  public TodoItem getToDo(@PathVariable long id){
    return todoService.getTodoItem(id);
  }

  @PostMapping("/todo/{id}")
  public String addTodoItem(@RequestBody TodoItem todoItem){
    todoService.save(todoItem);
    return "ToDo added !";
  }
}

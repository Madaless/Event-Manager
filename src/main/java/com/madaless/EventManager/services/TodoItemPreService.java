package com.madaless.EventManager.services;

import com.madaless.EventManager.entities.TodoItem;
import com.madaless.EventManager.entities.TodoItemPre;
import com.madaless.EventManager.repsitories.TodoItemPreRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoItemPreService {

  @Autowired
  TodoItemPreRepository todoItemPreRepository;


  public TodoItemPre update(long todoItemId, TodoItemPre todoItemPre) {
    return todoItemPreRepository.save(todoItemPre);
  }


  public List<TodoItemPre> findAll() {
    return todoItemPreRepository.findAll();
  }


  public void delete(long todoItemId) {
    todoItemPreRepository.deleteById(todoItemId);
  }


//  public TodoItemPre save(TodoItem todoItemPre) {
//    return this.todoItemPreRepository.save(todoItemPre);
//  }


  public TodoItemPre getTodoItem(Long id) {
    return todoItemPreRepository.getOne(id);
  }
}

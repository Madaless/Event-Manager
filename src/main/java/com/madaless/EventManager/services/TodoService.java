package com.madaless.EventManager.services;

import com.madaless.EventManager.entities.TodoItem;
import com.madaless.EventManager.repsitories.TodoItemRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService{

  @Autowired
  TodoItemRepository todoItemRepository;


  public TodoItem update(long todoItemId, TodoItem todoItem) {
    return todoItemRepository.save(todoItem);
  }


  public List<TodoItem> findAll() {
    return todoItemRepository.findAll();
  }


  public void delete(long todoItemId) {
    todoItemRepository.deleteById(todoItemId);
  }


  public TodoItem save(TodoItem todoItem) {
    return this.todoItemRepository.save(todoItem);
  }


  public TodoItem getTodoItem(Long id) {
    return todoItemRepository.getOne(id);
  }
}

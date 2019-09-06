package com.madaless.EventManager.services;

import com.madaless.EventManager.entities.TodoPredefList;
import com.madaless.EventManager.repsitories.TodoPredefListRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoPredefListService {

  @Autowired
  TodoPredefListRepository todoPredefListRepository;

  public TodoPredefList update(long todoItemId, TodoPredefList  todoPredefList) {
    return todoPredefListRepository.save(todoPredefList);
  }

  public void delete(long id) {
    todoPredefListRepository.deleteById(id);
  }

  public TodoPredefList save(TodoPredefList  todoPredefList) {
    return todoPredefListRepository.save(todoPredefList);
  }

  public TodoPredefList  getToDoPredefListService (Long id) {
    return todoPredefListRepository.getOne(id);
  }

  public List<TodoPredefList> findAll() {
    return todoPredefListRepository.findAll();
  }
}

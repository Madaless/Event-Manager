package com.madaless.EventManager.entities;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class ToDoPredefList {
  @Id
  @GeneratedValue
  private long id;
  private String name;
  @OneToMany
  @JoinColumn(name = "to_do_item_id")
  private Set<TodoItem> todoItem;

  public ToDoPredefList() {
  }

  public ToDoPredefList(Set<TodoItem> todoItem) {
    this.todoItem = todoItem;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public Set<TodoItem> getTodoItem() {
    return todoItem;
  }

  public void setTodoItem(Set<TodoItem> todoItem) {
    this.todoItem = todoItem;
  }
}

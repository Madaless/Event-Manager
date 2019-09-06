package com.madaless.EventManager.entities;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class TodoPredefList {

  @Id
  @GeneratedValue
  private long id;
  private String name;

  public TodoPredefList() {
  }

  public TodoPredefList(String name) {
    this.name = name;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
//  @OneToMany
//  @JoinColumn(name = "todo_item_pre_id")
//  private Set<TodoItem> todoItem;

//  public TodoPredefList() {
//  }
//
//  public TodoPredefList(Set<TodoItem> todoItem) {
//    //this.todoItem = todoItem;
//  }
//
//  public long getId() {
//    return id;
//  }
//
//  public void setId(long id) {
//    this.id = id;
//  }

//  public Set<TodoItem> getTodoItem() {
//    return todoItem;
//  }

//  public void setTodoItem(Set<TodoItem> todoItem) {
//    this.todoItem = todoItem;
//  }
}

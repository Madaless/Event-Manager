package com.madaless.EventManager.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

// Item on to do list
@Entity
public class TodoItem {
  @Id
  @GeneratedValue
  private long id;
  private String content;
  private Boolean is_done;
  private String type;

  public TodoItem() {
  }

  public TodoItem(String content) {
    this.content = content;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }
}

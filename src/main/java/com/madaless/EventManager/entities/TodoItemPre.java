package com.madaless.EventManager.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TodoItemPre {
  @Id
  @GeneratedValue
  private long id;
  private String content;

  public TodoItemPre() {
  }

  public TodoItemPre(String content) {
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

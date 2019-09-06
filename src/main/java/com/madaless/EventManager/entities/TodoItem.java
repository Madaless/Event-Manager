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
  private Boolean is_predef;

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

  public Boolean getIs_done() {
    return is_done;
  }

  public void setIs_done(Boolean is_done) {
    this.is_done = is_done;
  }

  public Boolean getIs_predef() {
    return is_predef;
  }

  public void setIs_predef(Boolean is_predef) {
    this.is_predef = is_predef;
  }
}

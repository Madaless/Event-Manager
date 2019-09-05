package com.madaless.EventManager.entities;

import java.util.Date;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Event {
  @Id
  @GeneratedValue
  private long id;
  private String name;
  private String Location;
  private Date creationDate;
  private String stringDate;
  private String hour;
  private String description;

  @OneToMany
  @JoinColumn(name = "to_do_item_id")
  private Set<TodoItem> todoItem;

  public Event(String name, String location, Date creationDate, String stringDate,
      String hour, String description,
      Set<TodoItem> todoItem) {
    this.name = name;
    Location = location;
    this.creationDate = creationDate;
    this.stringDate = stringDate;
    this.hour = hour;
    this.description = description;
    this.todoItem = todoItem;
  }

  public Event() {
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

  public String getLocation() {
    return Location;
  }

  public void setLocation(String location) {
    Location = location;
  }

  public Date getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(Date creationDate) {
    this.creationDate = creationDate;
  }

  public String getStringDate() {
    return stringDate;
  }

  public void setStringDate(String stringDate) {
    this.stringDate = stringDate;
  }

  public String getHour() {
    return hour;
  }

  public void setHour(String hour) {
    this.hour = hour;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Set<TodoItem> getTodoItem() {
    return todoItem;
  }

  public void setTodoItem(Set<TodoItem> todoItem) {
    this.todoItem = todoItem;
  }

  @Override
  public String toString() {
    return "Event{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", Location='" + Location + '\'' +
        ", creationDate=" + creationDate +
        ", stringDate='" + stringDate + '\'' +
        ", hour='" + hour + '\'' +
        ", description='" + description + '\'' +
        ", todoItem=" + todoItem +
        '}';
  }
}

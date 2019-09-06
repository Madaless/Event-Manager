package com.madaless.EventManager.services;

import com.madaless.EventManager.entities.Event;
import com.madaless.EventManager.repsitories.EventRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {

  @Autowired
  EventRepository eventRepository;

  public Event update(long todoItemId, Event event) {
    return eventRepository.save(event);
  }

  public List<Event> findAll() {
    return eventRepository.findAll();
  }

  public void delete(long id) {
    eventRepository.deleteById(id);
  }

  public Event save(Event event) {
    return eventRepository.save(event);
  }

  public Event getEvent(Long id) {
    return eventRepository.getOne(id);
  }



}


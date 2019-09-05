package com.madaless.EventManager.repsitories;

import com.madaless.EventManager.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {

}

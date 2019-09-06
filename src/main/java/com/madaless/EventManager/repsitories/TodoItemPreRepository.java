package com.madaless.EventManager.repsitories;

import com.madaless.EventManager.entities.TodoItemPre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface TodoItemPreRepository extends JpaRepository<TodoItemPre, Long> {

}

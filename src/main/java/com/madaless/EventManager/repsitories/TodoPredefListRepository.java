package com.madaless.EventManager.repsitories;

import com.madaless.EventManager.entities.TodoPredefList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface TodoPredefListRepository extends JpaRepository<TodoPredefList,Long> {

}

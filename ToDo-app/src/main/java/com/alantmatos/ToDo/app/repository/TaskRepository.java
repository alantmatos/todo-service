package com.alantmatos.ToDo.app.repository;

import com.alantmatos.ToDo.app.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {


}

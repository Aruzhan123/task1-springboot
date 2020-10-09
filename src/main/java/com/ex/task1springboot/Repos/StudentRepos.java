package com.ex.task1springboot.Repos;

import com.ex.task1springboot.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepos extends CrudRepository<Student, Long> {
}

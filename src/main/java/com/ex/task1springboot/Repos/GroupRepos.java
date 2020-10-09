package com.ex.task1springboot.Repos;

import com.ex.task1springboot.model.Group;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepos extends CrudRepository<Group, Long> {
}

package com.enterprise.backend.repo;

import com.enterprise.backend.model.Idea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IdeaRepo extends JpaRepository<Idea, Long> {

}

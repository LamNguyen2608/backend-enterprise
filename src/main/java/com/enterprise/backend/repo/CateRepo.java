package com.enterprise.backend.repo;

import com.enterprise.backend.model.Category;
import com.enterprise.backend.model.Idea_cate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CateRepo extends JpaRepository<Category, Long> {


    @Query("select c.name from Category c where c.id = :id")
    String getCateName (@Param("id") Long id);
}

package com.blissway.blissway.repository;


import com.blissway.blissway.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends JpaRepository<Blog, String> {
    // JpaRepository provides basic CRUD methods, no need to redefine them.
}
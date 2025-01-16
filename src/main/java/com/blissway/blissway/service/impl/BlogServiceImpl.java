package com.blissway.blissway.service.impl;

import com.blissway.blissway.entity.Blog;
import com.blissway.blissway.repository.BlogRepository;
import com.blissway.blissway.service.BlogService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {

    private final BlogRepository blogRepository;

    @Autowired
    public BlogServiceImpl(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    @Override
    public Blog createBlog(Blog blog) {
        return blogRepository.save(blog); // Using JpaRepository's save method
    }

    @Override
    public Blog getBlogById(String id) {
        return blogRepository.findById(id) // Using JpaRepository's findById method
                .orElseThrow(() -> new RuntimeException("Blog not found with id: " + id));
    }

    @Override
    public List<Blog> getAllBlogs() {
        return blogRepository.findAll(); // Using JpaRepository's findAll method
    }

    @Override
    public void deleteBlog(String id) {
        blogRepository.deleteById(id); // Using JpaRepository's deleteById method
    }
}

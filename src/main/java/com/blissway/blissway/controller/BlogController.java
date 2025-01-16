package com.blissway.blissway.controller;

import com.blissway.blissway.entity.Blog;
import com.blissway.blissway.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/blogs")
public class BlogController {

    private final BlogService blogService;

    @Autowired
    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }

    // Create a new blog
    @PostMapping
    public ResponseEntity<Blog> createBlog(@RequestBody Blog blog) {
        Blog createdBlog = blogService.createBlog(blog);
        return new ResponseEntity<>(createdBlog, HttpStatus.CREATED);
    }

    // Get a blog by ID
    @GetMapping("/{id}")
    public ResponseEntity<Blog> getBlogById(@PathVariable String id) {
        Blog blog = blogService.getBlogById(id);
        return new ResponseEntity<>(blog, HttpStatus.OK);
    }

    // Get all blogs
    @GetMapping
    public ResponseEntity<List<Blog>> getAllBlogs() {
        List<Blog> blogs = blogService.getAllBlogs();
        return new ResponseEntity<>(blogs, HttpStatus.OK);
    }

    // Delete a blog by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBlog(@PathVariable String id) {
        blogService.deleteBlog(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

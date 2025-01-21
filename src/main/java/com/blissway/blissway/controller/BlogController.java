package com.blissway.blissway.controller;

import com.blissway.blissway.dto.BlogDto;
import com.blissway.blissway.service.BlogService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/blogs")
public class BlogController {

    private final BlogService blogService ;

    public  BlogController(BlogService blogService) {
        this.blogService = blogService;
    }


    //Add Blog REST API
    @PostMapping
    public ResponseEntity<BlogDto> addBlog(@RequestBody BlogDto blogDto){
        return  new ResponseEntity<>(blogService.createBlog(blogDto), HttpStatus.CREATED);
    }

    //Get Blog REST  API
    @GetMapping("/{id}")
    public ResponseEntity<BlogDto> getBlogById(@PathVariable long id){
        BlogDto blogDto= blogService.getBlogById(id);
        return ResponseEntity.ok(blogDto);
    }

    //Get All Blogs REST API
    @GetMapping
    public ResponseEntity<List<BlogDto>> getAllBlogs(){
        List<BlogDto> blogs = blogService.getAllBlogs();
        return ResponseEntity.ok(blogs);
    }

    //Delete Blog REST API
    @DeleteMapping("/{id}")
    public  ResponseEntity<String> deleteBlog(@PathVariable long id){
        blogService.deleteBlog(id);
        return ResponseEntity.ok("Blog is deleted successfully");
    }




}

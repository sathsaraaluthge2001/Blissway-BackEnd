package com.blissway.blissway.service;

import com.blissway.blissway.entity.Blog;
import java.util.List;

public interface BlogService {
    Blog createBlog(Blog blog);
    Blog getBlogById(String id);
    List<Blog> getAllBlogs();
    void deleteBlog(String id);
}
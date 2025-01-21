package com.blissway.blissway.service;

import com.blissway.blissway.dto.BlogDto;
import com.blissway.blissway.entity.Blog;

import java.util.List;

public interface BlogService {

    BlogDto createBlog(BlogDto blogDto);

    BlogDto getBlogById(Long id);

    List<BlogDto> getAllBlogs();

    void deleteBlog(Long id);


}

package com.blissway.blissway.service.impl;

import com.blissway.blissway.entity.Blog;
import com.blissway.blissway.repository.BlogRepository;
import com.blissway.blissway.service.BlogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class BlogServiceImpl implements BlogService {

    private static final Logger logger = LoggerFactory.getLogger(BlogServiceImpl.class);
    private final BlogRepository blogRepository;

    public BlogServiceImpl(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    @Override
    public List<Blog> getAllBlogs() {
        logger.info("Fetching all blogs");
        return blogRepository.findAll();
    }

    @Override
    public Blog getBlogById(String id) {
        logger.info("Fetching blog with id: {}", id);
        return blogRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Blog not found with id: " + id));
    }

    @Override
    public Blog createBlog(Blog blog) {
        logger.info("Creating new blog: {}", blog);
        return blogRepository.save(blog);
    }

    @Override
    public Blog updateBlog(Blog blog) {
//        logger.info("Updating blog with id: {}" , blog.getId());
        return blogRepository.save(blog);
    }

    @Override
    public void deleteBlog(String id) {
        logger.info("Deleting blog with id: {}", id);
        blogRepository.deleteById(id);
    }
}

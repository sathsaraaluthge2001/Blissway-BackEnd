package com.blissway.blissway.service.impl;

import com.blissway.blissway.dto.BlogDto;
import com.blissway.blissway.entity.Blog;
import com.blissway.blissway.mapper.BlogMapper;
import com.blissway.blissway.repository.BlogRepository;
import com.blissway.blissway.service.BlogService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BlogServiceImpl  implements BlogService {

    private BlogRepository blogRepository ;



    public BlogServiceImpl(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    @Override
    public BlogDto createBlog(BlogDto blogDto) {
        Blog blog = BlogMapper.mapToBlog(blogDto);
        Blog savedBlog = blogRepository.save(blog);
        return BlogMapper.mapToBlogDto(savedBlog);
    }

    @Override
    public BlogDto getBlogById(Long id) {

        Blog blog = blogRepository.findById(id).orElseThrow(() -> new RuntimeException("Account does not exists"));
        return BlogMapper.mapToBlogDto(blog);
    }

    @Override
    public List<BlogDto> getAllBlogs() {
        List<Blog> blogs = blogRepository.findAll();
        return blogs.stream().map((blog -> BlogMapper.mapToBlogDto(blog)))
                .collect(Collectors.toList());

    }

    @Override
    public void deleteBlog(Long id) {

        Blog blog = blogRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("Account does not exists"));

        blogRepository.deleteById(id);

    }
}

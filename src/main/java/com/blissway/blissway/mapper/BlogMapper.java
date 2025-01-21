package com.blissway.blissway.mapper;

import com.blissway.blissway.dto.BlogDto;
import com.blissway.blissway.entity.Blog;

public class BlogMapper {

    public static Blog mapToBlog(BlogDto blogDto) {
        Blog blog = new Blog(
                blogDto.getId(),
                blogDto.getTitle(),
                blogDto.getParagraph_1(),
                blogDto.getParagraph_2(),
                blogDto.getParagraph_3(),
                blogDto.getParagraph_4(),
                blogDto.getParagraph_5(),
                blogDto.getMiniTitle(),
                blogDto.getImage(),
                blogDto.getPublishDate()
        );
        return blog;
    }

    public static BlogDto mapToBlogDto(Blog blog) {
        BlogDto blogDto = new BlogDto(
                blog.getId(),
                blog.getTitle(),
                blog.getParagraph_1(),
                blog.getParagraph_2(),
                blog.getParagraph_3(),
                blog.getParagraph_4(),
                blog.getParagraph_5(),
                blog.getMiniTitle(),
                blog.getImage(),
                blog.getPublishDate()
        );
        return blogDto;
    }
}

package com.blissway.blissway.dto;

import lombok.*;

@Data
@NoArgsConstructor
//@AllArgsConstructor
public class BlogDto {
    private long id;
    private String title;
    private String paragraph_1;
    private String image;
    private String publishDate;
    private String paragraph_2;
    private String paragraph_3;
    private String miniTitle;
    private String paragraph_4;
    private String paragraph_5;

    public BlogDto(long id, String title, String image, String paragraph_1, String publishDate, String paragraph_2, String paragraph_3, String paragraph_4, String miniTitle, String paragraph_5) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.paragraph_1 = paragraph_1;
        this.publishDate = publishDate;
        this.paragraph_2 = paragraph_2;
        this.paragraph_3 = paragraph_3;
        this.paragraph_4 = paragraph_4;
        this.miniTitle = miniTitle;
        this.paragraph_5 = paragraph_5;
    }

    // Getters
    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getParagraph_1() {
        return paragraph_1;
    }

    public String getImage() {
        return image;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public String getParagraph_2() {
        return paragraph_2;
    }

    public String getParagraph_3() {
        return paragraph_3;
    }

    public String getMiniTitle() {
        return miniTitle;
    }

    public String getParagraph_4() {
        return paragraph_4;
    }

    public String getParagraph_5() {
        return paragraph_5;
    }
}

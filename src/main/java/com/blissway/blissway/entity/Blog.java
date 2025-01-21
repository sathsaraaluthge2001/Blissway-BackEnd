package com.blissway.blissway.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
//@NoArgsConstructor
//@AllArgsConstructor
@Entity
@Table(name = "blogs")
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;

    @Lob
    @Column(columnDefinition = "TEXT")
    private String paragraph_1;

    private String image;

    private String publishDate;

    @Lob
    @Column(columnDefinition = "TEXT")
    private String paragraph_2;

    @Lob
    @Column(columnDefinition = "TEXT")
    private String paragraph_3;

    private String miniTitle;

    @Lob
    @Column(columnDefinition = "TEXT")
    private String paragraph_4;

    @Lob
    @Column(columnDefinition = "TEXT")
    private String paragraph_5;

    public Blog(){

    }

    public Blog(long id, String paragraph_5, String paragraph_1, String title, String image, String publishDate, String paragraph_2, String paragraph_3, String miniTitle, String paragraph_4) {
        this.id = id;
        this.paragraph_5 = paragraph_5;
        this.paragraph_1 = paragraph_1;
        this.title = title;
        this.image = image;
        this.publishDate = publishDate;
        this.paragraph_2 = paragraph_2;
        this.paragraph_3 = paragraph_3;
        this.miniTitle = miniTitle;
        this.paragraph_4 = paragraph_4;
    }

    // Manually written getters
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

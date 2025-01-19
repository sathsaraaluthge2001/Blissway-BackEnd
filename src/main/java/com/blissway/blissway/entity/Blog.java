package com.blissway.blissway.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Blog {

 

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(length = 5000)
    private String paragraph1;

    private String image;

    @Embedded
    private Author author;

    @ElementCollection
    private List<String> tags;

    private String publishDate;

    @Column(length = 5000)
    private String paragraph2;

    @Column(length = 5000)
    private String paragraph3;

    @Embedded
    private MoreLink moreLink;

    private String miniTitle;

    @Column(length = 5000)
    private String paragraph4;

    @ElementCollection
    private List<String> listUl;

    @Column(length = 5000)
    private String paragraph5;
}

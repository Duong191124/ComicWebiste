package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;

@Entity
@Table(name = "stories")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class Stories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int storyId;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "author_id", referencedColumnName = "author_id")
    private Authors authorId;

    @ManyToOne
    @JoinColumn(name = "genre_id", referencedColumnName = "genre_id")
    private Genres genreId;

    @Column(name = "publish_date")
    private Timestamp publishDate;

    @Column(name = "status")
    private String status;

    @Column(name = "views")
    private Integer views;

    @Column(name = "chapter_count")
    private Integer chapterCount;

}

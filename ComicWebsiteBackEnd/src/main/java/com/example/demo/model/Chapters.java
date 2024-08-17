package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "chapters")
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@Data
public class Chapters {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int chapterId;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;

    @Column(name = "chapter_number")
    private int chapterNumber;

    @ManyToOne
    @JoinColumn(name = "story_id", referencedColumnName = "story_id")
    private Stories storyId;
}

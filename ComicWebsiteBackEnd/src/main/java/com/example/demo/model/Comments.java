package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;

@Entity
@Table(name = "comments")
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@Data
public class Comments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int commentId;

    @Column(name = "content")
    private String content;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private Users userId;

    @ManyToOne
    @JoinColumn(name = "story_id", referencedColumnName = "story_id")
    private Stories storyId;

    @ManyToOne
    @JoinColumn(name = "chapter_id", referencedColumnName = "chapter_id")
    private Chapters chapterId;

    @Column(name = "comment_date")
    private Timestamp commentDate;

}

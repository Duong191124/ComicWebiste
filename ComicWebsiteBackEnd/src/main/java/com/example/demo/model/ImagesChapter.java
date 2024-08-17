package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "images_chapter")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class ImagesChapter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int imageId;

    @Column(name = "image_url")
    private String imageUrl;

    @ManyToOne
    @JoinColumn(name = "chapter_id", referencedColumnName = "chapter_id")
    private Chapters chapterId;
}

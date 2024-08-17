package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "images_story")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class ImagesStory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int imageId;

    @Column(name = "image_url")
    private String imageUrl;

    @ManyToOne
    @JoinColumn(name = "story_id", referencedColumnName = "story_id")
    private Stories storyId;
}

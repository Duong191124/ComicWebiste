package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;

@Entity
@Table(name = "favorites")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class Favorites {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int favoriteId;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private Users userId;

    @ManyToOne
    @JoinColumn(name = "story_id", referencedColumnName = "story_id")
    private Stories storyId;

    private Timestamp favoriteDate;
}

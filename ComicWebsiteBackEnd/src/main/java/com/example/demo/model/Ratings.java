package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;

@Entity
@Table(name = "ratings")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class Ratings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ratingId;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private Users userId;

    @ManyToOne
    @JoinColumn(name = "story_id", referencedColumnName = "story_id")
    private Stories storyId;

    @Column(name = "rating")
    private int rating;

    @Column(name = "rating_date")
    private Timestamp ratingDate;
}

package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "genres")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class Genres {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int genreId;

    @Column(name = "genre_name")
    private String genreName;

    @Column(name = "description")
    private String description;
}

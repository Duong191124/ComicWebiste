package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "authors")
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@Data
public class Authors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int authorId;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private Users userId;
}

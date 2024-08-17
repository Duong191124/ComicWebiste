package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "tags")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class Tags {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tagId;

    @Column(name = "tag_name")
    private String tagName;

}

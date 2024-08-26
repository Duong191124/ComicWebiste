package com.example.demo.dto;

import com.example.demo.model.UserRoles;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UsersDTO {
    private String username;

    private String fullName;

    private String password;

    private String email;

    private Timestamp registrationDate;

    private Integer roleId;
}

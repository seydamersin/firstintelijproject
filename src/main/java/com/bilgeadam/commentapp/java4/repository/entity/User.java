package com.bilgeadam.commentapp.java4.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "tbl_user")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length = 50)
    private String name;
    @Column(length = 50)
    private String surName;
    @Column(length = 50)
    private String email;
    @Column(length = 32)
    private String password;
    @Column(length = 15)
    private String phone;
    @Builder.Default
    @Enumerated(EnumType.STRING)
    private EUserType userType = EUserType.USER;
}

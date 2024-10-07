package com.example.Capstone_M2M.models;


import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String password;
    private String email;
    private List<String> expertise; // List of areas of expertise
    private int yearsOfExperience; // Number of years of experience
    private String location; // Mentor's location
    private List<String> codingLanguages; // Languages the mentor knows
    private List<String> availability; // e.g., ["Monday", "Wednesday"]
    private String meetingType; // "virtual" or "in-person"
    @OneToMany(mappedBy = "mentors", fetch = FetchType.LAZY)
    private List<User> mentees;

    @ManyToMany(fetch = FetchType.LAZY)

    private List<User> mentors;
}

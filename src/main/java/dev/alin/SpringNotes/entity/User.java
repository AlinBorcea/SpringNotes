package dev.alin.SpringNotes.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id = null;

    private String name;

    public User() {}

}

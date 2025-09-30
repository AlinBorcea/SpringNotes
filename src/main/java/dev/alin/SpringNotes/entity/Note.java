package dev.alin.SpringNotes.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id = null;

    private String title;

    private String content;

    private long userId;

    public Note() {}

}

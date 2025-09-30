package dev.alin.SpringNotes.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String title;

    private String content;

    @OneToMany
    private long userId;

    public Note() {}

}

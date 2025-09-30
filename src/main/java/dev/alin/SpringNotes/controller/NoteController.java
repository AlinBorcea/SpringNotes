package dev.alin.SpringNotes.controller;

import dev.alin.SpringNotes.entity.Note;
import dev.alin.SpringNotes.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NoteController {
    @Autowired
    private NoteService service;

    @RequestMapping("notes")
    public List<Note> getAllNotes() {
        return service.getAllNotes();
    }

    @RequestMapping("notes/{id}")
    public Note getNote(@PathVariable Long id) {
        return service.getNote(id);
    }

    @PostMapping("notes")
    public void addNote(@RequestBody Note note) {
        service.addNote(note);
    }

    @PutMapping("notes/{id}")
    public void updateNote(@PathVariable Long id, @RequestBody Note note) {
        service.updateNote(id, note);
    }

    @DeleteMapping("notes/{id}")
    public void deleteNote(@PathVariable Long id) {
        service.deleteNote(id);
    }

}

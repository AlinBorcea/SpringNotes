package dev.alin.SpringNotes.service;

import dev.alin.SpringNotes.entity.Note;
import dev.alin.SpringNotes.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NoteService {
    @Autowired
    private NoteRepository repository;

    public List<Note> getAllNotes() {
        var list = new ArrayList<Note>();
        repository.findAll().forEach(list::add);
        return list;
    }

    public Note getNote(Long id) {
        return repository.findById(id).get();
    }

    public void addNote(Note note) {
        repository.save(note);
    }

    public void updateNote(Long id, Note note) {
        var tableNote = repository.findById(id).orElse(null);
        if (tableNote != null) {
            tableNote.setTitle(note.getTitle());
            tableNote.setContent(note.getContent());
            repository.save(tableNote);
        }
    }

    public void deleteNote(Long id) {
        repository.deleteById(id);
    }
}

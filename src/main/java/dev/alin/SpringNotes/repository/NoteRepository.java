package dev.alin.SpringNotes.repository;

import dev.alin.SpringNotes.entity.Note;
import lombok.NonNull;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface NoteRepository extends CrudRepository<@NonNull Note, @NonNull Long> {
    List<Note> findByUserId(long userId);
}

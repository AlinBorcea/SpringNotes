package dev.alin.SpringNotes.repository;

import dev.alin.SpringNotes.entity.User;
import lombok.NonNull;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<@NonNull User, @NonNull Long> {
    User findById(long id);
    User findByName(String name);
}

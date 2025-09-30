package dev.alin.SpringNotes.service;

import dev.alin.SpringNotes.entity.User;
import dev.alin.SpringNotes.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public List<User> getAllUsers() {
        var list = new ArrayList<User>();
        repository.findAll().forEach(list::add);
        return list;
    }

    public User getUserById(Long id) {
        return repository.findById(id).get();
    }

    public void addUser(User user) {
        repository.save(user);
    }

    public void updateUser(Long id, User user) {
        var tableUser = repository.findById(id);
        var realUser = tableUser.orElse(null);

        if (realUser != null) {
            realUser.setName(user.getName());
            repository.save(realUser);
        }
    }

    public void deleteUser(Long id) {
        repository.deleteById(id);
    }
}

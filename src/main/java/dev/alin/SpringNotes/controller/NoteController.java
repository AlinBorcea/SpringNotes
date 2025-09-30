package dev.alin.SpringNotes.controller;

import dev.alin.SpringNotes.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoteController {
    @Autowired
    private NoteService service;
}

package com.devsecops.securenotes.controller;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/notes")
public class NoteController {

    private List<String> notes = new ArrayList<>();

    @PostMapping
    public String addNote(@RequestBody String note) {
        notes.add(note);
        return "Note added";
    }

    @GetMapping
    public List<String> getNotes() {
        return notes;
    }
}

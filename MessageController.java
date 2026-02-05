package com.maeve.demo.controller;

import com.maeve.demo.model.Message;
import com.maeve.demo.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/messages")
public class MessageController {

    @Autowired
    private MessageRepository messageRepo;

    @PostMapping
    public Message save(@Valid @RequestBody Message msg) {
        return messageRepo.save(msg);
    }
}

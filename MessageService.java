package com.maeve.demo.service;

import com.maeve.demo.model.Message;
import com.maeve.demo.repository.MessageRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    private final MessageRepository repository;

    public MessageService(MessageRepository repository) {
        this.repository = repository;
    }

    public Message saveMessage(String user, String content) {
        Message message = new Message();
        message.setUser(user);
        message.setContent(content);
        return repository.save(message);
    }

    public List<Message> getAllMessages() {
        return repository.findAll();
    }
}

package com.chavakula.kotlindemo.service

import com.chavakula.kotlindemo.repository.MessageRepository
import com.chavakula.kotlindemo.entity.Message
import org.springframework.stereotype.Service

@Service
class MessageService(val db: MessageRepository) {
    fun findMessages(): List<Message> = db.findMessages()

    fun post(message: Message) {
        db.save(message)
    }
}
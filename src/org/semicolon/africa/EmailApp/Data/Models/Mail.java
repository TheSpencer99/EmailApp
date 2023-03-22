package org.semicolon.africa.EmailApp.Data.Models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document
public class Mail {
    @Id
    private String id;
    private String senderName;
    private String SenderEmail;
    private String RecipientEmail;
    private  String mailTitle;
    private String mailBody;
    private String authorId;
    private LocalDateTime timeCreated = LocalDateTime.now();

}

package com.jovs.joblisting.todo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Todo {
    @Id
    private String id;
    private String user;
    private String content;
}

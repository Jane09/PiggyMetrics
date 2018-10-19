package com.piggymetrics.jwt.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Getter
@Setter
public class Todo implements Serializable {
    @Id
    private String id;
    private String desc;
    private boolean completed;
    private User user;
}

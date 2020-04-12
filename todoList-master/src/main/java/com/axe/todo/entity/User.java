package com.axe.todo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import  java.util.*;
import java.text.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long username;
    private Long password;


    public User(Long username, Long password) {
        this.username = username;
        this.password = password;
    }
}
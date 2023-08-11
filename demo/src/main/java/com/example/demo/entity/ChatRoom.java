package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class ChatRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Member member;

    private String destination;
}

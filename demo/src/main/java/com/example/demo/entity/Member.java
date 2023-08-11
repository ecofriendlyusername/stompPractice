package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;

    @OneToMany(mappedBy = "member", fetch = FetchType.LAZY)
    private List<ChatRoom> chatRooms;

    @OneToMany(mappedBy = "member", fetch = FetchType.LAZY)
    private List<ChatLine> chatLines;

    private String name;

    @Builder
    Member(String email, String name) {
        this.email = email;
        this.name = name;
    }
}

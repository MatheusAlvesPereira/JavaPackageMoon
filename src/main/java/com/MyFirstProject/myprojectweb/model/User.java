package com.MyFirstProject.myprojectweb.model;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "username", schema = "public")
@Entity(name = "user")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "userID")
public class User {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String userID;

    private String userName;

    private String password;
}

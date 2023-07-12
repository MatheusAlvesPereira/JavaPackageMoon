package com.MyFirstProject.myprojectweb.model;

import com.MyFirstProject.myprojectweb.controller.RequestUser;
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

    public User(RequestUser requestUser) {
        this.userName = requestUser.username();
        this.password = requestUser.password();
    }
}

package com.MyFirstProject.myprojectweb.Model;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "username")
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

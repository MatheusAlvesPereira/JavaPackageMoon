package com.MyFirstProject.myprojectweb.model;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@ComponentScan("com.MyFirstProject.myprojectweb")
public interface UserRepository extends JpaRepository<User,String> {
}

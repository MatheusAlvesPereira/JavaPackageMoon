package com.MyFirstProject.myprojectweb.controller;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(controllers = UserController.class)
@ExtendWith(SpringExtension.class)
public class UserControllerTest {

    @Autowired
    MockMvc mockMvc;


    @Test
    void getAllUsersTest() throws Exception{
        mockMvc.perform(get())
    }
}

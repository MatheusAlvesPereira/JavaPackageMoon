package com.MyFirstProject.myprojectweb.controller;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(UserController.class)
@RunWith(SpringRunner.class)
public class userControllerTest {

    @Autowired
    private MockMvc mockMvc;
    @Test
    public void getUsersAPI() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders
                    .get("/user")
                    .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$[*].userID").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$[*].userName").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$[*].password").exists());
    }
}

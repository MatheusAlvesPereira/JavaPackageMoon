package com.MyFirstProject.myprojectweb.controller.controller;

import com.MyFirstProject.myprojectweb.controller.UserController;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(UserController.class)
@ContextConfiguration(classes = UserControllerTest.class)
public class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;
    @Test
    public void getUsersAPI() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders
                        .get("/user")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$[*].userName").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$[*].userName").isNotEmpty());
    }
}

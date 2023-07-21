package com.MyFirstProject.myprojectweb.controller;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(controllers = UserController.class)
@ExtendWith(SpringExtension.class)
@RunWith(SpringRunner.class)
public class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;


    @Test
    public void getAllUsersTest() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders
                .get("/user")
                .accept(MediaType.APPLICATION_JSON))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.userID").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$.userName").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$.password").exists());
    }
}

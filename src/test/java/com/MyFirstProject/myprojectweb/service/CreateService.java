package com.MyFirstProject.myprojectweb.service;

import org.junit.Test;

public class CreateService {
    @Test
    public void should_able_to_create_new_service() {

        User user = new User();
        user.setWorlkload(100);

        CreateUserService createUserService = new CreateUserService();
        User createUser = CreateUserService.execute(User);

        assertNotNull(createUser.getid());
    }
}

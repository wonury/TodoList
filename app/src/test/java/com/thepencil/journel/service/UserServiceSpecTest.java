package com.thepencil.journel.service;

import com.thepencil.journel.model.User;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UserServiceSpecTest {

    @Test
    public void createUserServiceTest() {
        UserServiceImpl userService = new UserServiceImpl();
        assertTrue(userService.count() == 0);
    }

    @Test
    public void addUserServiceTest() {
        UserServiceImpl userService = new UserServiceImpl();
        userService.add(new User("1", "A"));
        assertEquals(1, userService.count());
    }

    @Test
    public void meUserServiceTest() {
        UserServiceImpl userService = new UserServiceImpl();
        userService.add(new User("1", "A"));
        assertEquals("1", userService.me().getId());
        assertEquals("A", userService.me().getName());
    }
}

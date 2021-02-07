package com.thepencil.journel.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserSpecTest {
    @Test
    public void createUser() {
        User user = new User("1", "이원우");
        assertEquals(user.getId(), "1");
        assertEquals(user.getName(), "이원우");
    }
}

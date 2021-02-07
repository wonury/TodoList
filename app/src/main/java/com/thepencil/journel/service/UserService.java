package com.thepencil.journel.service;

import com.thepencil.journel.model.User;

public interface UserService {
    int count();
    void add(User user);
    User me();
}

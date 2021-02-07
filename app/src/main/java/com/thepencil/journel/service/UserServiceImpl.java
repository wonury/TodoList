package com.thepencil.journel.service;

import com.thepencil.journel.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {
    private List<User> items;

    public UserServiceImpl() {
        this.items = new ArrayList<>();
    }

    @Override
    public int count() {
        return items.size();
    }

    @Override
    public void add(User user) {
        items.add(user);
    }

    @Override
    public User me() {
        return items.get(0);
    }
}

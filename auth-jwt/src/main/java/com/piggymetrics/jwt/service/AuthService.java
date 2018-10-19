package com.piggymetrics.jwt.service;

import com.piggymetrics.jwt.entity.User;

public interface AuthService {

    User register(User user);

    String login(String username, String password);

    String refresh(String oldToken);
}

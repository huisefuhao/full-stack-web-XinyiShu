package edu.infsci2560.services;

import edu.infsci2560.models.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
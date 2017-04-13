package edu.infsci2560.services;

public interface SecurityService {
    String findLoggedInUsername();

    void autologin(String username, String password);
}
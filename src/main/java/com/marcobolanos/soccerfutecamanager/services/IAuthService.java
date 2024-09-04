package com.marcobolanos.soccerfutecamanager.services;
import com.marcobolanos.soccerfutecamanager.models.User;


public interface IAuthService {
    public User save(User user);
    public User login(String email);
}

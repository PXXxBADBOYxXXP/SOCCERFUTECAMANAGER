package com.marcobolanos.soccerfutecamanager.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcobolanos.soccerfutecamanager.models.User;
import com.marcobolanos.soccerfutecamanager.repository.AuthRepository;

@Service
public class AuthService implements IAuthService{
    @Autowired
    private AuthRepository authRepository;

    @Override
    public User save(User user){
        return authRepository.save(user); 
}

@Override 
public User login(String email){
    return authRepository.findByEmail(email);
    }
}

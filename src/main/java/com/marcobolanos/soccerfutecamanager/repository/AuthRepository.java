package com.marcobolanos.soccerfutecamanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.marcobolanos.soccerfutecamanager.models.User;

public interface AuthRepository extends  JpaRepository<User, String>{
    User findByEmail(String email);
}

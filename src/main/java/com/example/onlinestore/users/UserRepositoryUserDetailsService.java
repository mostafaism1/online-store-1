package com.example.onlinestore.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
<<<<<<< HEAD
@RequiredArgsConstructor
public class UserRepositoryUserDetailsService implements UserDetailsService {
=======
class UserRepositoryUserDetailsService implements UserDetailsService {
    
    private UserRepository userRepo;
>>>>>>> e169d33089ae43e229be7f274a194c90bf24e85a

    private final UserRepository userRepo;    

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepo.findByUserName(username);
    }
}

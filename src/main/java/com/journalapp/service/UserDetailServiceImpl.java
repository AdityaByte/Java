package com.journalapp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.journalapp.model.User;
import com.journalapp.repository.UserRepository;

@Component
public class UserDetailServiceImpl implements UserDetailsService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        
        System.out.println("Loaded username - " + username);
        Optional<User> user = userRepository.findByUserName(username);
        if(user.isPresent()){
            UserDetails userDetails = org.springframework.security.core.userdetails.User.builder()
            .username(user.get().getUserName())
            .password(user.get().getPassword())
            .roles(user.get().getRoles().toArray(new String[0]))
            .build();
            return userDetails;
        }
        throw new UsernameNotFoundException("Username not found" + username);
    }
}

package com.springadvanced.springsecurity.config.security;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.springadvanced.springsecurity.entity.User;
import com.springadvanced.springsecurity.repository.UserRepository;

@Service
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    public CustomUserDetailService() {
        super();
    }

    @Override
    public UserDetails loadUserByUsername(String username) {
        User userByEmail = userRepository.getUserByEmail(username);
        if(Objects.isNull(userByEmail)) {
            throw new UsernameNotFoundException(username);
        }
        List<GrantedAuthority> authorities = new ArrayList<>();
        String[] roles = userByEmail.getRoles().split(",");
        for (String role : roles) {
            authorities.add(new SimpleGrantedAuthority(role));
        }

        return new org.springframework.security.core.userdetails.User(userByEmail.getEmail(), userByEmail.getPassword(),
                authorities);
    }
}

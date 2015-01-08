package com.mycab.service;

import com.mycab.model.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class CustomSecureLoginService implements UserDetailsService{

    @Autowired
    LoginServiceImpl loginService;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        Login login = loginService.findLoginByEmail(email);

        return new SecureLoginService(login);
    }
}

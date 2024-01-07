package com.restApi.RestAPI.security;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authentificate(String name,String password){
        return  name.equals("yassine lamouadden") && password.equals("2023");
    }

    public String getLoggedinUsername(){
        return SecurityContextHolder.getContext().getAuthentication().getName();
    }
}

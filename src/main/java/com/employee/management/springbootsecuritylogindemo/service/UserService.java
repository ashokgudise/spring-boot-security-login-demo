package com.employee.management.springbootsecuritylogindemo.service;

import com.employee.management.springbootsecuritylogindemo.model.User;
import com.employee.management.springbootsecuritylogindemo.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;


public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}

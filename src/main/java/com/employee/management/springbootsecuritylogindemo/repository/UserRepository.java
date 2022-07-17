package com.employee.management.springbootsecuritylogindemo.repository;

import com.employee.management.springbootsecuritylogindemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	User findByEmail(String email);
}

package com.chatapp.repository;

import com.chatapp.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {

	Users findByUsername(String username);

	Users findByEmail(String email);
}

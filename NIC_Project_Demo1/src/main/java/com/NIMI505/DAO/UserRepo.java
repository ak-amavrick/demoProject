package com.NIMI505.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.NIMI505.Lead.User;

public interface UserRepo extends JpaRepository<User, Long> {

	User findByEmail(String emailId);

}

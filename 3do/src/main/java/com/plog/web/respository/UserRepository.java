package com.plog.web.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plog.web.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	//public User findByName(String name);
}

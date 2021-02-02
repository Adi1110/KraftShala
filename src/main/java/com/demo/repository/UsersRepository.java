package com.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.demo.entity.Users;

public interface UsersRepository extends JpaRepository<Users, Integer> {

	@Query("SELECT u FROM Users u join u.roles r WHERE u.username = :username and r.roleName='INSTRUCTOR'")
    public List<Users> findAdmin(@Param("username") String username);
	
	@Query("SELECT u FROM Users u join u.roles r WHERE u.username = :username and r.roleName='STUDENT'")
    public List<Users> findUser(@Param("username") String username);

    
}

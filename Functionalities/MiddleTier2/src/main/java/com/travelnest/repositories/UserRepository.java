package com.travelnest.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.travelnest.entities.Login;
import com.travelnest.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	/*@Query("select u from User u where email = :email")
	public User getUser(String email ); */
	
}

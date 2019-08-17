package com.cg.daos;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.bean.User1;

@Repository
public interface UserDAO extends JpaRepository<User1, Integer> {

	

	@Query("select u.password from User1 u where u.emailid=?1")
	public String getUserPassword(String emailId);

}

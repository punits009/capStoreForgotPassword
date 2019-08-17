package com.cg.daos;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.bean.Admin;
import com.cg.bean.User1;
@Repository
public interface AdminDAO extends JpaRepository<User1,Integer> {
	
	@Query("select a.password from Admin a where a.emailid=?1")
	public String getAdminPassword(String emailId);

}

package com.cg.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.bean.SecurityAns;


@Repository
public interface Security_AnsDAO extends JpaRepository<SecurityAns, String>{

	@Query("select p from SecurityAns p where p.emailId=?1")
	public List<String> getanswer(String email);
	
	

}


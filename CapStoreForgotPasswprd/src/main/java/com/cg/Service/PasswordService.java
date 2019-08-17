package com.cg.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.bean.SecurityAns;
import com.cg.daos.UserDAO;

public interface PasswordService {

	public String getPassword(String email, String category,String ans1,String ans2);
	
}

package com.cg.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.daos.UserDAO;
import com.cg.bean.SecurityAns;
import com.cg.daos.AdminDAO;
import com.cg.daos.MerchantDAO;
import com.cg.daos.Security_AnsDAO;

@Service
public class PasswordServiceImpl implements PasswordService {

	@Autowired
	private UserDAO udao;

	@Autowired
	private AdminDAO adao;

	@Autowired
	private MerchantDAO mdao;

	@Autowired
	private Security_AnsDAO sdao;


	@Override
	public String getPassword(String email, String category, String ans1, String ans2) {
		System.out.println(email);
		Optional<SecurityAns> box = sdao.findById(email);
        System.out.println(box);
		if (box.isPresent()) {
			SecurityAns s = box.get();
			String answer1 = s.getAnswer1();
			String answer2 = s.getAnswer2();

			if (ans1.equalsIgnoreCase(answer1) && ans2.equalsIgnoreCase(answer2)) {
				if (category.equalsIgnoreCase("user")) {
					return udao.getUserPassword(email);
					
				} else if (category.equalsIgnoreCase("merchant")) {
					return mdao.getMerchantPassword(email);
					
				} else if (category.equalsIgnoreCase("admin")) {
					return adao.getAdminPassword(email);
					
				}
			}
		}
	
           return null;

	}

	

	
}

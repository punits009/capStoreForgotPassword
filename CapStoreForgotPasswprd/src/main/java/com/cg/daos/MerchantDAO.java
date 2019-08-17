package com.cg.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.bean.Merchant;
@Repository
public interface MerchantDAO extends JpaRepository<Merchant, Integer> {
	
	@Query("select m.password from Merchant m where m.emailid=?1")
	public String getMerchantPassword(String emailId);

}

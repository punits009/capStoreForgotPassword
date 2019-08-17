package com.cg.controller;

import java.security.spec.KeySpec;
import java.util.Base64;
import java.util.List;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.Service.Cryptography;
import com.cg.Service.PasswordService;
import com.cg.bean.SecurityAns;
import com.cg.exception.ApplicationException;
import com.cg.inputFormats.PasswordEmail;
import com.cg.inputFormats.PasswordFormat;

@CrossOrigin("*")
@RestController
@RequestMapping("/forgot")
public class PasswordController {

	@Autowired
	private PasswordService service;
	private String secretKey="SomeSecretKey";
	@PostMapping(value = "/getPass", consumes = { "application/json" })
	public PasswordEmail getPassword(@RequestBody PasswordFormat input) {

		String password = service.getPassword(input.getEmail(), input.getCategory(), input.getAnswer1(),input.getAnswer2());
		
		if(password!=null)
		{
		PasswordEmail pe=new PasswordEmail();
		Cryptography c=new Cryptography();
		String decryptedPassword=c.decrypt(password,this.secretKey);
		pe.setEmailid(input.getEmail());
		pe.setPassword(decryptedPassword);
		return pe;
		}
		else
		{
			throw new ApplicationException("Email ID not exist or answers are wrong");
		}
		
	}
}

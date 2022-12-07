package com.tmdt.CourseOnline.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tmdt.CourseOnline.entity.AccountEntity;
import com.tmdt.CourseOnline.reponsitory.AccountRepository;

@Service
public class AccountServiceImpl {
	@Autowired
	private AccountRepository accountRepository;
	
	public List<AccountEntity> getAll() {
		return accountRepository.findAll();
	}
	
	public AccountEntity findById(String username) {
		return accountRepository.findById(username).get();
	}
}

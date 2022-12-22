package com.tmdt.CourseOnline.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tmdt.CourseOnline.dto.UserDto;
import com.tmdt.CourseOnline.entity.AccountEntity;
import com.tmdt.CourseOnline.entity.UserEntity;
import com.tmdt.CourseOnline.mapper.UserMapper;
import com.tmdt.CourseOnline.reponsitory.AccountRepository;
import com.tmdt.CourseOnline.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {
	@Autowired
	private AccountRepository accountRepository;

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public AccountEntity getAccountByUserName(String username) {
		try {
			return accountRepository.findById(username).get();
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public UserDto getUserByUserNamePassword(String username, String password) {
		try {
			return userMapper.mapEntityToDto(accountRepository.getUserByUserNamePassword(username, password));
		}catch(Exception e){
			return null;
		}
	}

	@Override
	public UserDto getAdminByUserNamePassword(String username, String password) {
		try {
			return userMapper.mapEntityToDto(accountRepository.getAdminByUserNamePassword(username, password));
		}catch(Exception e){
			return null;
		}
	}

	@Override
	public AccountEntity addAccount(AccountEntity accountEntity) {
		return accountRepository.save(accountEntity);
	}
}

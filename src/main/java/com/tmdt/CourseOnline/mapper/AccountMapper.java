package com.tmdt.CourseOnline.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tmdt.CourseOnline.dto.AccountDto;
import com.tmdt.CourseOnline.entity.AccountEntity;

public class AccountMapper {
	@Autowired
	private UserMapper userMapper;
	
//	public AccountDto mapEntityToDto(AccountEntity accountEntity) {
//		return new AccountDto(
//				userMapper.mapEntityToDto(accountEntity.getUser()), 
//				accountEntity.getUsername(), 
//				accountEntity.getPassword(), 
//				accountEntity.getRole());
//	}
//	
//	public List<AccountDto> mapListEntityToListDto(List<AccountEntity> accountEntities){
//		List<AccountDto> accountDtos = new ArrayList<>();
//		accountEntities.forEach(acc -> {
//			accountDtos.add(mapEntityToDto(acc));
//		});
//		return accountDtos;
//	}
}

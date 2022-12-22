package com.tmdt.CourseOnline.service;

import com.tmdt.CourseOnline.dto.UserDto;
import com.tmdt.CourseOnline.entity.AccountEntity;

public interface AccountService {

	UserDto getUserByUserNamePassword(String username, String password);

	UserDto getAdminByUserNamePassword(String username, String password);

	AccountEntity addAccount(AccountEntity accountEntity);

	AccountEntity getAccountByUserName(String username);

}

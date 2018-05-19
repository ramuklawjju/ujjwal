package com.ujjwal.service;

import java.util.List;

import com.ujjwal.dto.UserDto;


/**
 * @author ujjwal
 *
 */
public interface UserService {
    UserDto getUserById(Integer userId);
    void saveUser(UserDto userDto);
    List<UserDto> getAllUsers();
}

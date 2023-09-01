package com.childsafetymap.user.service;

import com.childsafetymap.user.dto.UserDto;
import com.childsafetymap.user.entity.User;
import com.childsafetymap.user.mapper.UserMapper;
import com.childsafetymap.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserDto.Response createUser(UserDto.Post userPostDto) {

        User user = userMapper.userPostToUser(userPostDto);

        User createdUser = userRepository.save(user);

        return userMapper.userToUserResponse(createdUser);
    }
}

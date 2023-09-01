package com.childsafetymap.user.mapper;

import com.childsafetymap.user.dto.UserDto;
import com.childsafetymap.user.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User userPostToUser(UserDto.Post userPostDto) {

        if(userPostDto == null) {
            return null;
        }

        User user = new User();

        user.setEmail(userPostDto.getEmail());
        user.setPassword(userPostDto.getPassword());
        user.setName(userPostDto.getName());
        user.setNickname(userPostDto.getNickName());
        user.setParents(userPostDto.isParents());

        return user;
    }

    public UserDto.Response userToUserResponse(User user){

        UserDto.Response response = new UserDto.Response();

        response.setUserId(user.getUserId());
        response.setName(user.getName());
        response.setNickname(user.getNickname());
        response.setProfileImageUrl(user.getProfileImageUrl());
        response.setParents(user.isParents());

        return response;
    }
}

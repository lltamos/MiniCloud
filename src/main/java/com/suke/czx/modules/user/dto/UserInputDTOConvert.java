package com.suke.czx.modules.user.dto;


import org.springframework.beans.BeanUtils;

public class UserInputDTOConvert implements DTOConvert<UserInputDTO, User> {
    @Override
    public User convert(UserInputDTO userInputDTO) {
        User user = new User();
        BeanUtils.copyProperties(userInputDTO, user);
        return user;
    }
}


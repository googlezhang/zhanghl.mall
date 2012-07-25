package com.zhanghl.mall.domain.member.logic;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

import com.zhanghl.mall.domain.member.Person;

public class PersonValidator {

    public boolean supports(Class<?> clazz) {
        return Person.class.isAssignableFrom(clazz);
    }

    public void validate(Object obj, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors,"username","USERNAME_REQUIRED","请输入用户名");
        ValidationUtils.rejectIfEmpty(errors, "password","PASSWORD_REQUIRED","请输入密码");
        ValidationUtils.rejectIfEmpty(errors, "email","EMAIL_REQUIRED","请输入电子邮箱");
    }
}

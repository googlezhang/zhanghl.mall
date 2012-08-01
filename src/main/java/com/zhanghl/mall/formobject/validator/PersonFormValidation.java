package com.zhanghl.mall.formobject.validator;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

import com.zhanghl.mall.formobject.PersonForm;

@Component("personFormValidation")
public class PersonFormValidation {

    private EmailValidator emailValidator = new EmailValidator();

    public boolean supports(Class<?> clazz) {
        return PersonForm.class.isAssignableFrom(clazz);
    }

    public void validate(Object target, Errors errors) {
        if (!this.supports(target.getClass())) {
            return;
        }
        PersonForm personForm = (PersonForm) target;
        // 开始校验personForm
        // 用户名
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username",
                                                  "com.zhanghl.mall.validation.username.NotEmpty.message");
        if (!errors.hasFieldErrors("username")) {
            if (4 > personForm.getUsername().length() || personForm.getUsername().length() > 20) {
                errors.rejectValue("username", "com.zhanghl.mall.validation.username.Size.message");
            }
        }
        // 密码
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password",
                                                  "com.zhanghl.mall.validation.password.NotEmpty.message");
        if (!errors.hasFieldErrors("password")) {
            if (6 > personForm.getPassword().length() || personForm.getPassword().length() > 16) {
                errors.rejectValue("password", "com.zhanghl.mall.validation.password.Size.message");
            }
        }
        // 重复密码
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "retypePassword",
                                                  "com.zhanghl.mall.validation.password.NotEmpty.message");
        if (!errors.hasFieldErrors("retypePassword")) {
            if (6 > personForm.getRetypePassword().length() || personForm.getRetypePassword().length() > 16) {
                errors.rejectValue("retypePassword", "com.zhanghl.mall.validation.password.Size.message");
            }
        }
        if (!errors.hasFieldErrors("retypePassword")) {
            if (!StringUtils.equals(personForm.getPassword(), personForm.getRetypePassword())) {
                errors.rejectValue("retypePassword", "com.zhanghl.mall.validation.password.NotEqual.message");
            }
        }
        // 邮箱
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "com.zhanghl.mall.validation.email.NotEmpty.message");
        if (!errors.hasFieldErrors("email")) {
            if (personForm.getEmail().length() > 50) {
                errors.rejectValue("email", "com.zhanghl.mall.validation.email.Size.message");
            }
        }
        if (!errors.hasFieldErrors("email")) {
            if (!emailValidator.isValid(personForm.getEmail())) {
                errors.rejectValue("email", "com.zhanghl.mall.validation.email.Format.message");
            }
        }
        // 推荐人
        if (StringUtils.isNotBlank(personForm.getRecommendedBy())) {
            if (4 > personForm.getRecommendedBy().length() || personForm.getRecommendedBy().length() > 20) {
                errors.rejectValue("recommendedBy", "com.zhanghl.mall.validation.recommendedBy.Size.message");
            }
        }
        // 验证码
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "captcha",
                                                  "com.zhanghl.mall.validation.captcha.NotEmpty.message");
    }
}

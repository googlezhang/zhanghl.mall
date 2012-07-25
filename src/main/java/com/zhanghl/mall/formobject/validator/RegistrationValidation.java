package com.zhanghl.mall.formobject.validator;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import com.zhanghl.mall.formobject.PersonForm;

@Component("registrationValidation")
public class RegistrationValidation {

    public boolean supports(Class<?> clazz) {
        return PersonForm.class.isAssignableFrom(clazz);
    }

    public void validate(Object target, Errors errors) {
        if (!this.supports(target.getClass())) {
            return;
        }
        PersonForm personForm = (PersonForm) target;
        if (StringUtils.isNotBlank(personForm.getPassword()) && StringUtils.isNotBlank(personForm.getRetypePassword())) {
            if (!StringUtils.equals(personForm.getPassword(), personForm.getRetypePassword())) {
                errors.rejectValue("retypePassword", "PASSWORD_NOT_MATCH");
            }
        }
    }
}

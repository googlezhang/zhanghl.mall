package com.zhanghl.mall.domain.member.logic;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

import com.zhanghl.mall.domain.member.Enterprise;

public class EnterpriseValidator {

    public boolean supports(Class<?> clazz) {
        return Enterprise.class.isAssignableFrom(clazz);
    }

    public void validate(Object obj, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors, "username", "USERNAME_REQUIRED", "请输入用户名");
        ValidationUtils.rejectIfEmpty(errors, "password", "PASSWORD_REQUIRED", "请输入密码");
        ValidationUtils.rejectIfEmpty(errors, "contactPersonName", "CONTACT_PERSON_NAME_REQUIRED", "请输入联系人姓名");
        ValidationUtils.rejectIfEmpty(errors, "department", "DEPARTMENT_REQUIRED", "请选择联系人所在部门");
        ValidationUtils.rejectIfEmpty(errors, "phoneNumber", "PHONE_NUMBER_REQUIRED", "请输入联系人固定电话");
        ValidationUtils.rejectIfEmpty(errors, "email", "EMAIL_REQUIRED", "请输入电子邮箱");
        ValidationUtils.rejectIfEmpty(errors, "companyName", "COMPANY_NAME_REQUIRED", "请输入公司名称");
        ValidationUtils.rejectIfEmpty(errors, "companyProvince", "COMPANY_PROVINCE_REQUIRED", "请选择公司所在地");
        ValidationUtils.rejectIfEmpty(errors, "companyCity", "COMPANY_CITY_REQUIRED", "请选择公司所在地");
        ValidationUtils.rejectIfEmpty(errors, "companyDistrict", "COMPANY_DISTRICT_REQUIRED", "请选择公司所在地");
        ValidationUtils.rejectIfEmpty(errors, "companyAddress", "COMPANY_ADDRESS_REQUIRED", "请输入公司地址");
        ValidationUtils.rejectIfEmpty(errors, "purchaseType", "PURCHASE_TYPE_REQUIRED", "请选择购买类型/用途");
    }
}

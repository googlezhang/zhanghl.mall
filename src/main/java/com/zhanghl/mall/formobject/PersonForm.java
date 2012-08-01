package com.zhanghl.mall.formobject;

import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;
import com.zhanghl.mall.domain.member.Person;

/**
 * 新创建用户的表单对象 类PersonForm.java的实现描述：TODO 类实现描述
 * 
 * @author hongliang.zhanghl 2012-7-25 上午12:04:20
 */
public class PersonForm extends Person {

    @NotEmpty(message = "{com.zhanghl.mall.validation.password.NotEmpty.message}")
    @Size(min = 6, max = 16, message = "{com.zhanghl.mall.validation.password.Size.message}")
    private String retypePassword;

    @NotEmpty(message = "{com.zhanghl.mall.validation.captcha.NotEmpty.message}")
    private String captcha;

    public String getRetypePassword() {
        return retypePassword;
    }

    public void setRetypePassword(String retypePassword) {
        this.retypePassword = retypePassword;
    }

    public String getCaptcha() {
        return captcha;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }

}

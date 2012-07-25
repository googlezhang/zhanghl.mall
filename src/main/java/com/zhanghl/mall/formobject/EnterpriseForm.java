package com.zhanghl.mall.formobject;

import com.zhanghl.mall.domain.member.Enterprise;

public class EnterpriseForm extends Enterprise {

    private String retypePassword;
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

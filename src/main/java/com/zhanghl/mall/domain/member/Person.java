package com.zhanghl.mall.domain.member;

import javax.validation.constraints.Size;
import org.apache.commons.lang.StringUtils;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import com.zhanghl.mall.domain.member.constants.AccountConstant;

/**
 * 类Person.java的实现描述：个人用户
 * 
 * @author hongliang.zhanghl 2012-7-11 下午10:12:28
 */
public class Person {
    
    /**
     * id主键
     */
    private Integer   id;
    /**
     * 用户名|必填
     */
    @NotEmpty(message="{com.zhanghl.mall.validation.username.NotEmpty.message}")
    @Size(min=4,max=20,message="{com.zhanghl.mall.validation.username.Size.message}")
    private String    username;
    /**
     * 密码|必填
     */
    @NotEmpty(message="{com.zhanghl.mall.validation.password.NotEmpty.message}")
    @Size(min=6,max=16,message="{com.zhanghl.mall.validation.password.Size.message}")
    private String    password;
    /**
     * 电子邮箱|必填
     */
    @NotEmpty(message="{com.zhanghl.mall.validation.email.NotEmpty.message}")
    @Email(message="{com.zhanghl.mall.validation.email.Format.message}")
    @Size(min=0,max=50,message="{com.zhanghl.mall.validation.email.Size.message}")
    private String    email;
    /**
     * 推荐人
     */
    @Size(min=0,max=20,message="{com.zhanghl.mall.validation.recommendedBy.Size.message}")
    private String    recommendedBy;
    /**
     * 是否订阅优惠信息 值为"Y"或者"N" 用于EDM
     */
    private Character subscribe;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRecommendedBy() {
        return recommendedBy;
    }

    public void setRecommendedBy(String recommendedBy) {
        this.recommendedBy = recommendedBy;
    }

    public Character getSubscribe() {
        return subscribe;
    }

    public void setSubscribe(Character subscribe) {
        this.subscribe = subscribe;
    }

    public boolean isSubscribe() {
        if (AccountConstant.YES.equals(subscribe)) {
            return true;
        }
        return false;
    }

    public boolean haveRecommendedBy() {
        if (StringUtils.isNotBlank(recommendedBy)) {
            return true;
        }
        return false;
    }
}

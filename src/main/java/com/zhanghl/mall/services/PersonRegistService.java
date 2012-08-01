package com.zhanghl.mall.services;

import com.zhanghl.mall.domain.member.Person;

public interface PersonRegistService {

    /**
     * 新增个人注册用户
     * 
     * @param person
     * @return
     */
    public Integer insertPerson(Person person);

    /**
     * 个人用户修改密码
     * 
     * @param userName
     * @param oldPassword
     * @param newPassword
     * @return
     */
    public Integer updatePersonPassword(String userName, String oldPassword, String newPassword);

    /**
     * 个人用户修改密码及其他信息
     * 
     * @param person
     * @param criteria
     * @return
     */
    public Integer updatePersonInfoByUserName(String userName, Person person);
}

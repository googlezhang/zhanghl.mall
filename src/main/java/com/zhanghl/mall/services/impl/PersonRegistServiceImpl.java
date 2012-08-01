package com.zhanghl.mall.services.impl;

import com.zhanghl.mall.dao.PersonDAO;
import com.zhanghl.mall.domain.member.Person;
import com.zhanghl.mall.services.PersonRegistService;

public class PersonRegistServiceImpl implements PersonRegistService {
    private PersonDAO personDAO;

    
    public void setPersonDAO(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    public Integer insertPerson(Person person) {
        if(person==null)
            return null;
        return personDAO.insert(person);
    }

    public Integer updatePersonPassword(String userName, String oldPassword, String newPassword) {
        // TODO Auto-generated method stub
        return null;
    }

    public Integer updatePersonInfoByUserName(String userName, Person person) {
        // TODO Auto-generated method stub
        return null;
    }

}

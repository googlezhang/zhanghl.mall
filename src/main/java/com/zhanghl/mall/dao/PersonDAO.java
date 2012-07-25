package com.zhanghl.mall.dao;

import com.zhanghl.mall.domain.member.Person;
import com.zhanghl.mall.domain.member.criteria.PersonCriteria;
import java.util.List;

public interface PersonDAO {
    Integer insert(Person record);

    int updateByPrimaryKey(Person record);

    int updateByPrimaryKeySelective(Person record);

    List<Person> selectByExample(PersonCriteria example);

    Person selectByPrimaryKey(Integer id);

    int deleteByExample(PersonCriteria example);

    int deleteByPrimaryKey(Integer id);

    int countByExample(PersonCriteria example);

    int updateByExampleSelective(Person record, PersonCriteria example);

    int updateByExample(Person record, PersonCriteria example);
}
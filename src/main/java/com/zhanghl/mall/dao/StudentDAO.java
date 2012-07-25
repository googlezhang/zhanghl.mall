package com.zhanghl.mall.dao;

import com.zhanghl.mall.domain.member.Student;
import com.zhanghl.mall.domain.member.criteria.StudentCriteria;
import java.util.List;

public interface StudentDAO {
    Integer insert(Student record);

    int updateByPrimaryKey(Student record);

    int updateByPrimaryKeySelective(Student record);

    List<Student> selectByExample(StudentCriteria example);

    Student selectByPrimaryKey(Integer id);

    int deleteByExample(StudentCriteria example);

    int deleteByPrimaryKey(Integer id);

    int countByExample(StudentCriteria example);

    int updateByExampleSelective(Student record, StudentCriteria example);

    int updateByExample(Student record, StudentCriteria example);
}
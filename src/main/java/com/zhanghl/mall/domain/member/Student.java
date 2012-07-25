package com.zhanghl.mall.domain.member;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * 类Student.java的实现描述：校园用户
 * 
 * @author hongliang.zhanghl 2012-7-11 下午10:12:08
 */
public class Student extends Person {

    /**
     * 所在学校|必填
     */
    @NotEmpty
    private String schoolId;

    public String getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
    }
}

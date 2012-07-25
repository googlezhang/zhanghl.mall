package com.zhanghl.mall.dao.ibatis;

import com.zhanghl.mall.dao.StudentDAO;
import com.zhanghl.mall.domain.member.Student;
import com.zhanghl.mall.domain.member.criteria.StudentCriteria;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class StudentDAOImpl extends SqlMapClientDaoSupport implements StudentDAO {

    public StudentDAOImpl() {
        super();
    }

    public Integer insert(Student record) {
        Object newKey = getSqlMapClientTemplate().insert("student.insert", record);
        return (Integer) newKey;
    }

    public int updateByPrimaryKey(Student record) {
        int rows = getSqlMapClientTemplate().update("student.updateByPrimaryKey", record);
        return rows;
    }

    public int updateByPrimaryKeySelective(Student record) {
        int rows = getSqlMapClientTemplate().update("student.updateByPrimaryKeySelective", record);
        return rows;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public List<Student> selectByExample(StudentCriteria example) {
        List list = getSqlMapClientTemplate().queryForList("student.selectByExample", example);
        return list;
    }

    public Student selectByPrimaryKey(Integer id) {
        Student key = new Student();
        key.setId(id);
        Student record = (Student) getSqlMapClientTemplate().queryForObject("student.selectByPrimaryKey", key);
        return record;
    }

    public int deleteByExample(StudentCriteria example) {
        int rows = getSqlMapClientTemplate().delete("student.deleteByExample", example);
        return rows;
    }

    public int deleteByPrimaryKey(Integer id) {
        Student key = new Student();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("student.deleteByPrimaryKey", key);
        return rows;
    }

    public int countByExample(StudentCriteria example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("student.countByExample", example);
        return count.intValue();
    }

    public int updateByExampleSelective(Student record, StudentCriteria example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("student.updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(Student record, StudentCriteria example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("student.updateByExample", parms);
        return rows;
    }

    private static class UpdateByExampleParms extends StudentCriteria {
        private Object record;

        public UpdateByExampleParms(Object record, StudentCriteria example) {
            super(example);
            this.record = record;
        }

        @SuppressWarnings("unused")
        public Object getRecord() {
            return record;
        }
    }
}
package com.zhanghl.mall.dao.ibatis;

import com.zhanghl.mall.dao.PersonDAO;
import com.zhanghl.mall.domain.member.Person;
import com.zhanghl.mall.domain.member.criteria.PersonCriteria;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class PersonDAOImpl extends SqlMapClientDaoSupport implements PersonDAO {

    public PersonDAOImpl() {
        super();
    }

    public Integer insert(Person record) {
        Object newKey = getSqlMapClientTemplate().insert("person.insert", record);
        return (Integer) newKey;
    }

    public int updateByPrimaryKey(Person record) {
        int rows = getSqlMapClientTemplate().update("person.updateByPrimaryKey", record);
        return rows;
    }

    public int updateByPrimaryKeySelective(Person record) {
        int rows = getSqlMapClientTemplate().update("person.updateByPrimaryKeySelective", record);
        return rows;
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public List<Person> selectByExample(PersonCriteria example) {
        List list = getSqlMapClientTemplate().queryForList("person.selectByExample", example);
        return list;
    }

    public Person selectByPrimaryKey(Integer id) {
        Person key = new Person();
        key.setId(id);
        Person record = (Person) getSqlMapClientTemplate().queryForObject("person.selectByPrimaryKey", key);
        return record;
    }

    public int deleteByExample(PersonCriteria example) {
        int rows = getSqlMapClientTemplate().delete("person.deleteByExample", example);
        return rows;
    }

    public int deleteByPrimaryKey(Integer id) {
        Person key = new Person();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("person.deleteByPrimaryKey", key);
        return rows;
    }

    public int countByExample(PersonCriteria example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("person.countByExample", example);
        return count.intValue();
    }

    public int updateByExampleSelective(Person record, PersonCriteria example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("person.updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(Person record, PersonCriteria example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("person.updateByExample", parms);
        return rows;
    }

    private static class UpdateByExampleParms extends PersonCriteria {
        private Object record;

        public UpdateByExampleParms(Object record, PersonCriteria example) {
            super(example);
            this.record = record;
        }

        @SuppressWarnings("unused")
        public Object getRecord() {
            return record;
        }
    }
}
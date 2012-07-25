package com.zhanghl.mall.dao.ibatis;

import com.zhanghl.mall.dao.EnterpriseDAO;
import com.zhanghl.mall.domain.member.Enterprise;
import com.zhanghl.mall.domain.member.criteria.EnterpriseCriteria;

import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class EnterpriseDAOImpl extends SqlMapClientDaoSupport implements EnterpriseDAO {

    public EnterpriseDAOImpl() {
        super();
    }

    public Integer insert(Enterprise record) {
        Object newKey = getSqlMapClientTemplate().insert("enterprise.insert", record);
        return (Integer) newKey;
    }

    public int updateByPrimaryKey(Enterprise record) {
        int rows = getSqlMapClientTemplate().update("enterprise.updateByPrimaryKey", record);
        return rows;
    }

    public int updateByPrimaryKeySelective(Enterprise record) {
        int rows = getSqlMapClientTemplate().update("enterprise.updateByPrimaryKeySelective", record);
        return rows;
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public List<Enterprise> selectByExample(EnterpriseCriteria example) {
        List list = getSqlMapClientTemplate().queryForList("enterprise.selectByExample", example);
        return list;
    }

    public Enterprise selectByPrimaryKey(Integer id) {
        Enterprise key = new Enterprise();
        key.setId(id);
        Enterprise record = (Enterprise) getSqlMapClientTemplate().queryForObject("enterprise.selectByPrimaryKey", key);
        return record;
    }

    public int deleteByExample(EnterpriseCriteria example) {
        int rows = getSqlMapClientTemplate().delete("enterprise.deleteByExample", example);
        return rows;
    }

    public int deleteByPrimaryKey(Integer id) {
        Enterprise key = new Enterprise();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("enterprise.deleteByPrimaryKey", key);
        return rows;
    }

    public int countByExample(EnterpriseCriteria example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("enterprise.countByExample", example);
        return count.intValue();
    }

    public int updateByExampleSelective(Enterprise record, EnterpriseCriteria example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("enterprise.updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(Enterprise record, EnterpriseCriteria example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("enterprise.updateByExample", parms);
        return rows;
    }

    private static class UpdateByExampleParms extends EnterpriseCriteria {
        private Object record;

        public UpdateByExampleParms(Object record, EnterpriseCriteria example) {
            super(example);
            this.record = record;
        }

        @SuppressWarnings("unused")
        public Object getRecord() {
            return record;
        }
    }
}
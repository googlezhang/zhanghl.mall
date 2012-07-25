package com.zhanghl.mall.dao;

import com.zhanghl.mall.domain.member.Enterprise;
import com.zhanghl.mall.domain.member.criteria.EnterpriseCriteria;
import java.util.List;

public interface EnterpriseDAO {
    Integer insert(Enterprise record);

    int updateByPrimaryKey(Enterprise record);

    int updateByPrimaryKeySelective(Enterprise record);

    List<Enterprise> selectByExample(EnterpriseCriteria example);

    Enterprise selectByPrimaryKey(Integer id);

    int deleteByExample(EnterpriseCriteria example);

    int deleteByPrimaryKey(Integer id);

    int countByExample(EnterpriseCriteria example);

    int updateByExampleSelective(Enterprise record, EnterpriseCriteria example);

    int updateByExample(Enterprise record, EnterpriseCriteria example);
}
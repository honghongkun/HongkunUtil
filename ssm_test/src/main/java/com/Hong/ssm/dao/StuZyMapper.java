package com.Hong.ssm.dao;

import com.Hong.ssm.bean.StuZy;
import com.Hong.ssm.bean.StuZyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StuZyMapper {
    int countByExample(StuZyExample example);

    int deleteByExample(StuZyExample example);

    int deleteByPrimaryKey(Integer zyId);

    int insert(StuZy record);

    int insertSelective(StuZy record);

    List<StuZy> selectByExample(StuZyExample example);

    StuZy selectByPrimaryKey(Integer zyId);

    int updateByExampleSelective(@Param("record") StuZy record, @Param("example") StuZyExample example);

    int updateByExample(@Param("record") StuZy record, @Param("example") StuZyExample example);

    int updateByPrimaryKeySelective(StuZy record);

    int updateByPrimaryKey(StuZy record);
}
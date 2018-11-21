package com.Hong.ssm.dao;

import com.Hong.ssm.bean.StuMdoy;
import com.Hong.ssm.bean.StuMdoyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StuMdoyMapper {
    int countByExample(StuMdoyExample example);

    int deleteByExample(StuMdoyExample example);

    int deleteByPrimaryKey(Integer mdoyId);

    int insert(StuMdoy record);

    int insertSelective(StuMdoy record);

    List<StuMdoy> selectByExample(StuMdoyExample example);

    StuMdoy selectByPrimaryKey(Integer mdoyId);

    int updateByExampleSelective(@Param("record") StuMdoy record, @Param("example") StuMdoyExample example);

    int updateByExample(@Param("record") StuMdoy record, @Param("example") StuMdoyExample example);

    int updateByPrimaryKeySelective(StuMdoy record);

    int updateByPrimaryKey(StuMdoy record);
}
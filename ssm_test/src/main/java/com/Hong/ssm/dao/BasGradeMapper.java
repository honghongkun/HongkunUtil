package com.Hong.ssm.dao;

import com.Hong.ssm.bean.BasGrade;
import com.Hong.ssm.bean.BasGradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasGradeMapper {
    int countByExample(BasGradeExample example);

    int deleteByExample(BasGradeExample example);

    int deleteByPrimaryKey(Integer basId);

    int insert(BasGrade record);

    int insertSelective(BasGrade record);

    List<BasGrade> selectByExample(BasGradeExample example);

    BasGrade selectByPrimaryKey(Integer basId);

    int updateByExampleSelective(@Param("record") BasGrade record, @Param("example") BasGradeExample example);

    int updateByExample(@Param("record") BasGrade record, @Param("example") BasGradeExample example);

    int updateByPrimaryKeySelective(BasGrade record);

    int updateByPrimaryKey(BasGrade record);
    /**
     * 查询StuGrade为1的年级
     * @param basGrade
     * @return
     */
    List<BasGrade> selbasStuGradeBy1(BasGrade basGrade);
    /**
     * 查询StuGrade为2的年级
     * @param basGrade
     * @return
     */
    List<BasGrade> selbasStuGradeBy2(BasGrade basGrade);
    /**
     * 查询StuGrade的所有年级
     * @param basGrade
     * @return
     */
    List<BasGrade> selbasStuGrade(BasGrade basGrade);
}
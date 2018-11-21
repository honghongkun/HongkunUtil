package com.Hong.ssm.service;

import java.util.List;

import com.Hong.ssm.bean.BasGrade;

public interface BasGradeService {

	 /**
     * 查询StuGrade的所有年级
     * @param basGrade
     * @return
     */
    List<BasGrade> selbasStuGrade(BasGrade basGrade);
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
}

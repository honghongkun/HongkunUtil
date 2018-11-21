package com.Hong.ssm.service;

import java.util.List;

import com.Hong.ssm.bean.BasGrade;

public interface BasGradeService {

	 /**
     * ��ѯStuGrade�������꼶
     * @param basGrade
     * @return
     */
    List<BasGrade> selbasStuGrade(BasGrade basGrade);
	 /**
     * ��ѯStuGradeΪ1���꼶
     * @param basGrade
     * @return
     */
    List<BasGrade> selbasStuGradeBy1(BasGrade basGrade);
    /**
     * ��ѯStuGradeΪ2���꼶
     * @param basGrade
     * @return
     */
    List<BasGrade> selbasStuGradeBy2(BasGrade basGrade);
}

package com.Hong.ssm.bean;

import java.util.ArrayList;
import java.util.List;

public class BasStuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BasStuExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andStuIdIsNull() {
            addCriterion("stu_id is null");
            return (Criteria) this;
        }

        public Criteria andStuIdIsNotNull() {
            addCriterion("stu_id is not null");
            return (Criteria) this;
        }

        public Criteria andStuIdEqualTo(Integer value) {
            addCriterion("stu_id =", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotEqualTo(Integer value) {
            addCriterion("stu_id <>", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThan(Integer value) {
            addCriterion("stu_id >", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stu_id >=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThan(Integer value) {
            addCriterion("stu_id <", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThanOrEqualTo(Integer value) {
            addCriterion("stu_id <=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdIn(List<Integer> values) {
            addCriterion("stu_id in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotIn(List<Integer> values) {
            addCriterion("stu_id not in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdBetween(Integer value1, Integer value2) {
            addCriterion("stu_id between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stu_id not between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIsNull() {
            addCriterion("org_code is null");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIsNotNull() {
            addCriterion("org_code is not null");
            return (Criteria) this;
        }

        public Criteria andOrgCodeEqualTo(Integer value) {
            addCriterion("org_code =", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotEqualTo(Integer value) {
            addCriterion("org_code <>", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeGreaterThan(Integer value) {
            addCriterion("org_code >", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("org_code >=", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLessThan(Integer value) {
            addCriterion("org_code <", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLessThanOrEqualTo(Integer value) {
            addCriterion("org_code <=", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIn(List<Integer> values) {
            addCriterion("org_code in", values, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotIn(List<Integer> values) {
            addCriterion("org_code not in", values, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeBetween(Integer value1, Integer value2) {
            addCriterion("org_code between", value1, value2, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("org_code not between", value1, value2, "orgCode");
            return (Criteria) this;
        }

        public Criteria andStuNameIsNull() {
            addCriterion("stu_name is null");
            return (Criteria) this;
        }

        public Criteria andStuNameIsNotNull() {
            addCriterion("stu_name is not null");
            return (Criteria) this;
        }

        public Criteria andStuNameEqualTo(String value) {
            addCriterion("stu_name =", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotEqualTo(String value) {
            addCriterion("stu_name <>", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameGreaterThan(String value) {
            addCriterion("stu_name >", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameGreaterThanOrEqualTo(String value) {
            addCriterion("stu_name >=", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLessThan(String value) {
            addCriterion("stu_name <", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLessThanOrEqualTo(String value) {
            addCriterion("stu_name <=", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLike(String value) {
            addCriterion("stu_name like", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotLike(String value) {
            addCriterion("stu_name not like", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameIn(List<String> values) {
            addCriterion("stu_name in", values, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotIn(List<String> values) {
            addCriterion("stu_name not in", values, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameBetween(String value1, String value2) {
            addCriterion("stu_name between", value1, value2, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotBetween(String value1, String value2) {
            addCriterion("stu_name not between", value1, value2, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuIdcaedIsNull() {
            addCriterion("stu_idcaed is null");
            return (Criteria) this;
        }

        public Criteria andStuIdcaedIsNotNull() {
            addCriterion("stu_idcaed is not null");
            return (Criteria) this;
        }

        public Criteria andStuIdcaedEqualTo(String value) {
            addCriterion("stu_idcaed =", value, "stuIdcaed");
            return (Criteria) this;
        }

        public Criteria andStuIdcaedNotEqualTo(String value) {
            addCriterion("stu_idcaed <>", value, "stuIdcaed");
            return (Criteria) this;
        }

        public Criteria andStuIdcaedGreaterThan(String value) {
            addCriterion("stu_idcaed >", value, "stuIdcaed");
            return (Criteria) this;
        }

        public Criteria andStuIdcaedGreaterThanOrEqualTo(String value) {
            addCriterion("stu_idcaed >=", value, "stuIdcaed");
            return (Criteria) this;
        }

        public Criteria andStuIdcaedLessThan(String value) {
            addCriterion("stu_idcaed <", value, "stuIdcaed");
            return (Criteria) this;
        }

        public Criteria andStuIdcaedLessThanOrEqualTo(String value) {
            addCriterion("stu_idcaed <=", value, "stuIdcaed");
            return (Criteria) this;
        }

        public Criteria andStuIdcaedLike(String value) {
            addCriterion("stu_idcaed like", value, "stuIdcaed");
            return (Criteria) this;
        }

        public Criteria andStuIdcaedNotLike(String value) {
            addCriterion("stu_idcaed not like", value, "stuIdcaed");
            return (Criteria) this;
        }

        public Criteria andStuIdcaedIn(List<String> values) {
            addCriterion("stu_idcaed in", values, "stuIdcaed");
            return (Criteria) this;
        }

        public Criteria andStuIdcaedNotIn(List<String> values) {
            addCriterion("stu_idcaed not in", values, "stuIdcaed");
            return (Criteria) this;
        }

        public Criteria andStuIdcaedBetween(String value1, String value2) {
            addCriterion("stu_idcaed between", value1, value2, "stuIdcaed");
            return (Criteria) this;
        }

        public Criteria andStuIdcaedNotBetween(String value1, String value2) {
            addCriterion("stu_idcaed not between", value1, value2, "stuIdcaed");
            return (Criteria) this;
        }

        public Criteria andStuCodeIsNull() {
            addCriterion("stu_code is null");
            return (Criteria) this;
        }

        public Criteria andStuCodeIsNotNull() {
            addCriterion("stu_code is not null");
            return (Criteria) this;
        }

        public Criteria andStuCodeEqualTo(Integer value) {
            addCriterion("stu_code =", value, "stuCode");
            return (Criteria) this;
        }

        public Criteria andStuCodeNotEqualTo(Integer value) {
            addCriterion("stu_code <>", value, "stuCode");
            return (Criteria) this;
        }

        public Criteria andStuCodeGreaterThan(Integer value) {
            addCriterion("stu_code >", value, "stuCode");
            return (Criteria) this;
        }

        public Criteria andStuCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("stu_code >=", value, "stuCode");
            return (Criteria) this;
        }

        public Criteria andStuCodeLessThan(Integer value) {
            addCriterion("stu_code <", value, "stuCode");
            return (Criteria) this;
        }

        public Criteria andStuCodeLessThanOrEqualTo(Integer value) {
            addCriterion("stu_code <=", value, "stuCode");
            return (Criteria) this;
        }

        public Criteria andStuCodeIn(List<Integer> values) {
            addCriterion("stu_code in", values, "stuCode");
            return (Criteria) this;
        }

        public Criteria andStuCodeNotIn(List<Integer> values) {
            addCriterion("stu_code not in", values, "stuCode");
            return (Criteria) this;
        }

        public Criteria andStuCodeBetween(Integer value1, Integer value2) {
            addCriterion("stu_code between", value1, value2, "stuCode");
            return (Criteria) this;
        }

        public Criteria andStuCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("stu_code not between", value1, value2, "stuCode");
            return (Criteria) this;
        }

        public Criteria andStuTempCodeIsNull() {
            addCriterion("stu_temp_code is null");
            return (Criteria) this;
        }

        public Criteria andStuTempCodeIsNotNull() {
            addCriterion("stu_temp_code is not null");
            return (Criteria) this;
        }

        public Criteria andStuTempCodeEqualTo(Integer value) {
            addCriterion("stu_temp_code =", value, "stuTempCode");
            return (Criteria) this;
        }

        public Criteria andStuTempCodeNotEqualTo(Integer value) {
            addCriterion("stu_temp_code <>", value, "stuTempCode");
            return (Criteria) this;
        }

        public Criteria andStuTempCodeGreaterThan(Integer value) {
            addCriterion("stu_temp_code >", value, "stuTempCode");
            return (Criteria) this;
        }

        public Criteria andStuTempCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("stu_temp_code >=", value, "stuTempCode");
            return (Criteria) this;
        }

        public Criteria andStuTempCodeLessThan(Integer value) {
            addCriterion("stu_temp_code <", value, "stuTempCode");
            return (Criteria) this;
        }

        public Criteria andStuTempCodeLessThanOrEqualTo(Integer value) {
            addCriterion("stu_temp_code <=", value, "stuTempCode");
            return (Criteria) this;
        }

        public Criteria andStuTempCodeIn(List<Integer> values) {
            addCriterion("stu_temp_code in", values, "stuTempCode");
            return (Criteria) this;
        }

        public Criteria andStuTempCodeNotIn(List<Integer> values) {
            addCriterion("stu_temp_code not in", values, "stuTempCode");
            return (Criteria) this;
        }

        public Criteria andStuTempCodeBetween(Integer value1, Integer value2) {
            addCriterion("stu_temp_code between", value1, value2, "stuTempCode");
            return (Criteria) this;
        }

        public Criteria andStuTempCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("stu_temp_code not between", value1, value2, "stuTempCode");
            return (Criteria) this;
        }

        public Criteria andStuSexIsNull() {
            addCriterion("stu_sex is null");
            return (Criteria) this;
        }

        public Criteria andStuSexIsNotNull() {
            addCriterion("stu_sex is not null");
            return (Criteria) this;
        }

        public Criteria andStuSexEqualTo(String value) {
            addCriterion("stu_sex =", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotEqualTo(String value) {
            addCriterion("stu_sex <>", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexGreaterThan(String value) {
            addCriterion("stu_sex >", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexGreaterThanOrEqualTo(String value) {
            addCriterion("stu_sex >=", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexLessThan(String value) {
            addCriterion("stu_sex <", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexLessThanOrEqualTo(String value) {
            addCriterion("stu_sex <=", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexLike(String value) {
            addCriterion("stu_sex like", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotLike(String value) {
            addCriterion("stu_sex not like", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexIn(List<String> values) {
            addCriterion("stu_sex in", values, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotIn(List<String> values) {
            addCriterion("stu_sex not in", values, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexBetween(String value1, String value2) {
            addCriterion("stu_sex between", value1, value2, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotBetween(String value1, String value2) {
            addCriterion("stu_sex not between", value1, value2, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuNationIsNull() {
            addCriterion("stu_nation is null");
            return (Criteria) this;
        }

        public Criteria andStuNationIsNotNull() {
            addCriterion("stu_nation is not null");
            return (Criteria) this;
        }

        public Criteria andStuNationEqualTo(String value) {
            addCriterion("stu_nation =", value, "stuNation");
            return (Criteria) this;
        }

        public Criteria andStuNationNotEqualTo(String value) {
            addCriterion("stu_nation <>", value, "stuNation");
            return (Criteria) this;
        }

        public Criteria andStuNationGreaterThan(String value) {
            addCriterion("stu_nation >", value, "stuNation");
            return (Criteria) this;
        }

        public Criteria andStuNationGreaterThanOrEqualTo(String value) {
            addCriterion("stu_nation >=", value, "stuNation");
            return (Criteria) this;
        }

        public Criteria andStuNationLessThan(String value) {
            addCriterion("stu_nation <", value, "stuNation");
            return (Criteria) this;
        }

        public Criteria andStuNationLessThanOrEqualTo(String value) {
            addCriterion("stu_nation <=", value, "stuNation");
            return (Criteria) this;
        }

        public Criteria andStuNationLike(String value) {
            addCriterion("stu_nation like", value, "stuNation");
            return (Criteria) this;
        }

        public Criteria andStuNationNotLike(String value) {
            addCriterion("stu_nation not like", value, "stuNation");
            return (Criteria) this;
        }

        public Criteria andStuNationIn(List<String> values) {
            addCriterion("stu_nation in", values, "stuNation");
            return (Criteria) this;
        }

        public Criteria andStuNationNotIn(List<String> values) {
            addCriterion("stu_nation not in", values, "stuNation");
            return (Criteria) this;
        }

        public Criteria andStuNationBetween(String value1, String value2) {
            addCriterion("stu_nation between", value1, value2, "stuNation");
            return (Criteria) this;
        }

        public Criteria andStuNationNotBetween(String value1, String value2) {
            addCriterion("stu_nation not between", value1, value2, "stuNation");
            return (Criteria) this;
        }

        public Criteria andStuProvinceIsNull() {
            addCriterion("stu_province is null");
            return (Criteria) this;
        }

        public Criteria andStuProvinceIsNotNull() {
            addCriterion("stu_province is not null");
            return (Criteria) this;
        }

        public Criteria andStuProvinceEqualTo(String value) {
            addCriterion("stu_province =", value, "stuProvince");
            return (Criteria) this;
        }

        public Criteria andStuProvinceNotEqualTo(String value) {
            addCriterion("stu_province <>", value, "stuProvince");
            return (Criteria) this;
        }

        public Criteria andStuProvinceGreaterThan(String value) {
            addCriterion("stu_province >", value, "stuProvince");
            return (Criteria) this;
        }

        public Criteria andStuProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("stu_province >=", value, "stuProvince");
            return (Criteria) this;
        }

        public Criteria andStuProvinceLessThan(String value) {
            addCriterion("stu_province <", value, "stuProvince");
            return (Criteria) this;
        }

        public Criteria andStuProvinceLessThanOrEqualTo(String value) {
            addCriterion("stu_province <=", value, "stuProvince");
            return (Criteria) this;
        }

        public Criteria andStuProvinceLike(String value) {
            addCriterion("stu_province like", value, "stuProvince");
            return (Criteria) this;
        }

        public Criteria andStuProvinceNotLike(String value) {
            addCriterion("stu_province not like", value, "stuProvince");
            return (Criteria) this;
        }

        public Criteria andStuProvinceIn(List<String> values) {
            addCriterion("stu_province in", values, "stuProvince");
            return (Criteria) this;
        }

        public Criteria andStuProvinceNotIn(List<String> values) {
            addCriterion("stu_province not in", values, "stuProvince");
            return (Criteria) this;
        }

        public Criteria andStuProvinceBetween(String value1, String value2) {
            addCriterion("stu_province between", value1, value2, "stuProvince");
            return (Criteria) this;
        }

        public Criteria andStuProvinceNotBetween(String value1, String value2) {
            addCriterion("stu_province not between", value1, value2, "stuProvince");
            return (Criteria) this;
        }

        public Criteria andStuAddressIsNull() {
            addCriterion("stu_address is null");
            return (Criteria) this;
        }

        public Criteria andStuAddressIsNotNull() {
            addCriterion("stu_address is not null");
            return (Criteria) this;
        }

        public Criteria andStuAddressEqualTo(String value) {
            addCriterion("stu_address =", value, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressNotEqualTo(String value) {
            addCriterion("stu_address <>", value, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressGreaterThan(String value) {
            addCriterion("stu_address >", value, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressGreaterThanOrEqualTo(String value) {
            addCriterion("stu_address >=", value, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressLessThan(String value) {
            addCriterion("stu_address <", value, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressLessThanOrEqualTo(String value) {
            addCriterion("stu_address <=", value, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressLike(String value) {
            addCriterion("stu_address like", value, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressNotLike(String value) {
            addCriterion("stu_address not like", value, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressIn(List<String> values) {
            addCriterion("stu_address in", values, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressNotIn(List<String> values) {
            addCriterion("stu_address not in", values, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressBetween(String value1, String value2) {
            addCriterion("stu_address between", value1, value2, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressNotBetween(String value1, String value2) {
            addCriterion("stu_address not between", value1, value2, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuGradeIsNull() {
            addCriterion("stu_grade is null");
            return (Criteria) this;
        }

        public Criteria andStuGradeIsNotNull() {
            addCriterion("stu_grade is not null");
            return (Criteria) this;
        }

        public Criteria andStuGradeEqualTo(String value) {
            addCriterion("stu_grade =", value, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuGradeNotEqualTo(String value) {
            addCriterion("stu_grade <>", value, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuGradeGreaterThan(String value) {
            addCriterion("stu_grade >", value, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuGradeGreaterThanOrEqualTo(String value) {
            addCriterion("stu_grade >=", value, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuGradeLessThan(String value) {
            addCriterion("stu_grade <", value, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuGradeLessThanOrEqualTo(String value) {
            addCriterion("stu_grade <=", value, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuGradeLike(String value) {
            addCriterion("stu_grade like", value, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuGradeNotLike(String value) {
            addCriterion("stu_grade not like", value, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuGradeIn(List<String> values) {
            addCriterion("stu_grade in", values, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuGradeNotIn(List<String> values) {
            addCriterion("stu_grade not in", values, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuGradeBetween(String value1, String value2) {
            addCriterion("stu_grade between", value1, value2, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuGradeNotBetween(String value1, String value2) {
            addCriterion("stu_grade not between", value1, value2, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuTypeIsNull() {
            addCriterion("stu_type is null");
            return (Criteria) this;
        }

        public Criteria andStuTypeIsNotNull() {
            addCriterion("stu_type is not null");
            return (Criteria) this;
        }

        public Criteria andStuTypeEqualTo(Integer value) {
            addCriterion("stu_type =", value, "stuType");
            return (Criteria) this;
        }

        public Criteria andStuTypeNotEqualTo(Integer value) {
            addCriterion("stu_type <>", value, "stuType");
            return (Criteria) this;
        }

        public Criteria andStuTypeGreaterThan(Integer value) {
            addCriterion("stu_type >", value, "stuType");
            return (Criteria) this;
        }

        public Criteria andStuTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("stu_type >=", value, "stuType");
            return (Criteria) this;
        }

        public Criteria andStuTypeLessThan(Integer value) {
            addCriterion("stu_type <", value, "stuType");
            return (Criteria) this;
        }

        public Criteria andStuTypeLessThanOrEqualTo(Integer value) {
            addCriterion("stu_type <=", value, "stuType");
            return (Criteria) this;
        }

        public Criteria andStuTypeIn(List<Integer> values) {
            addCriterion("stu_type in", values, "stuType");
            return (Criteria) this;
        }

        public Criteria andStuTypeNotIn(List<Integer> values) {
            addCriterion("stu_type not in", values, "stuType");
            return (Criteria) this;
        }

        public Criteria andStuTypeBetween(Integer value1, Integer value2) {
            addCriterion("stu_type between", value1, value2, "stuType");
            return (Criteria) this;
        }

        public Criteria andStuTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("stu_type not between", value1, value2, "stuType");
            return (Criteria) this;
        }

        public Criteria andStuStatusIsNull() {
            addCriterion("stu_status is null");
            return (Criteria) this;
        }

        public Criteria andStuStatusIsNotNull() {
            addCriterion("stu_status is not null");
            return (Criteria) this;
        }

        public Criteria andStuStatusEqualTo(Integer value) {
            addCriterion("stu_status =", value, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusNotEqualTo(Integer value) {
            addCriterion("stu_status <>", value, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusGreaterThan(Integer value) {
            addCriterion("stu_status >", value, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("stu_status >=", value, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusLessThan(Integer value) {
            addCriterion("stu_status <", value, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusLessThanOrEqualTo(Integer value) {
            addCriterion("stu_status <=", value, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusIn(List<Integer> values) {
            addCriterion("stu_status in", values, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusNotIn(List<Integer> values) {
            addCriterion("stu_status not in", values, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusBetween(Integer value1, Integer value2) {
            addCriterion("stu_status between", value1, value2, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("stu_status not between", value1, value2, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusTypeIsNull() {
            addCriterion("stu_status_type is null");
            return (Criteria) this;
        }

        public Criteria andStuStatusTypeIsNotNull() {
            addCriterion("stu_status_type is not null");
            return (Criteria) this;
        }

        public Criteria andStuStatusTypeEqualTo(String value) {
            addCriterion("stu_status_type =", value, "stuStatusType");
            return (Criteria) this;
        }

        public Criteria andStuStatusTypeNotEqualTo(String value) {
            addCriterion("stu_status_type <>", value, "stuStatusType");
            return (Criteria) this;
        }

        public Criteria andStuStatusTypeGreaterThan(String value) {
            addCriterion("stu_status_type >", value, "stuStatusType");
            return (Criteria) this;
        }

        public Criteria andStuStatusTypeGreaterThanOrEqualTo(String value) {
            addCriterion("stu_status_type >=", value, "stuStatusType");
            return (Criteria) this;
        }

        public Criteria andStuStatusTypeLessThan(String value) {
            addCriterion("stu_status_type <", value, "stuStatusType");
            return (Criteria) this;
        }

        public Criteria andStuStatusTypeLessThanOrEqualTo(String value) {
            addCriterion("stu_status_type <=", value, "stuStatusType");
            return (Criteria) this;
        }

        public Criteria andStuStatusTypeLike(String value) {
            addCriterion("stu_status_type like", value, "stuStatusType");
            return (Criteria) this;
        }

        public Criteria andStuStatusTypeNotLike(String value) {
            addCriterion("stu_status_type not like", value, "stuStatusType");
            return (Criteria) this;
        }

        public Criteria andStuStatusTypeIn(List<String> values) {
            addCriterion("stu_status_type in", values, "stuStatusType");
            return (Criteria) this;
        }

        public Criteria andStuStatusTypeNotIn(List<String> values) {
            addCriterion("stu_status_type not in", values, "stuStatusType");
            return (Criteria) this;
        }

        public Criteria andStuStatusTypeBetween(String value1, String value2) {
            addCriterion("stu_status_type between", value1, value2, "stuStatusType");
            return (Criteria) this;
        }

        public Criteria andStuStatusTypeNotBetween(String value1, String value2) {
            addCriterion("stu_status_type not between", value1, value2, "stuStatusType");
            return (Criteria) this;
        }

        public Criteria andStuEmailIsNull() {
            addCriterion("stu_email is null");
            return (Criteria) this;
        }

        public Criteria andStuEmailIsNotNull() {
            addCriterion("stu_email is not null");
            return (Criteria) this;
        }

        public Criteria andStuEmailEqualTo(String value) {
            addCriterion("stu_email =", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailNotEqualTo(String value) {
            addCriterion("stu_email <>", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailGreaterThan(String value) {
            addCriterion("stu_email >", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailGreaterThanOrEqualTo(String value) {
            addCriterion("stu_email >=", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailLessThan(String value) {
            addCriterion("stu_email <", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailLessThanOrEqualTo(String value) {
            addCriterion("stu_email <=", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailLike(String value) {
            addCriterion("stu_email like", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailNotLike(String value) {
            addCriterion("stu_email not like", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailIn(List<String> values) {
            addCriterion("stu_email in", values, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailNotIn(List<String> values) {
            addCriterion("stu_email not in", values, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailBetween(String value1, String value2) {
            addCriterion("stu_email between", value1, value2, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailNotBetween(String value1, String value2) {
            addCriterion("stu_email not between", value1, value2, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuPynameIsNull() {
            addCriterion("stu_pyname is null");
            return (Criteria) this;
        }

        public Criteria andStuPynameIsNotNull() {
            addCriterion("stu_pyname is not null");
            return (Criteria) this;
        }

        public Criteria andStuPynameEqualTo(String value) {
            addCriterion("stu_pyname =", value, "stuPyname");
            return (Criteria) this;
        }

        public Criteria andStuPynameNotEqualTo(String value) {
            addCriterion("stu_pyname <>", value, "stuPyname");
            return (Criteria) this;
        }

        public Criteria andStuPynameGreaterThan(String value) {
            addCriterion("stu_pyname >", value, "stuPyname");
            return (Criteria) this;
        }

        public Criteria andStuPynameGreaterThanOrEqualTo(String value) {
            addCriterion("stu_pyname >=", value, "stuPyname");
            return (Criteria) this;
        }

        public Criteria andStuPynameLessThan(String value) {
            addCriterion("stu_pyname <", value, "stuPyname");
            return (Criteria) this;
        }

        public Criteria andStuPynameLessThanOrEqualTo(String value) {
            addCriterion("stu_pyname <=", value, "stuPyname");
            return (Criteria) this;
        }

        public Criteria andStuPynameLike(String value) {
            addCriterion("stu_pyname like", value, "stuPyname");
            return (Criteria) this;
        }

        public Criteria andStuPynameNotLike(String value) {
            addCriterion("stu_pyname not like", value, "stuPyname");
            return (Criteria) this;
        }

        public Criteria andStuPynameIn(List<String> values) {
            addCriterion("stu_pyname in", values, "stuPyname");
            return (Criteria) this;
        }

        public Criteria andStuPynameNotIn(List<String> values) {
            addCriterion("stu_pyname not in", values, "stuPyname");
            return (Criteria) this;
        }

        public Criteria andStuPynameBetween(String value1, String value2) {
            addCriterion("stu_pyname between", value1, value2, "stuPyname");
            return (Criteria) this;
        }

        public Criteria andStuPynameNotBetween(String value1, String value2) {
            addCriterion("stu_pyname not between", value1, value2, "stuPyname");
            return (Criteria) this;
        }

        public Criteria andStuBirthdayIsNull() {
            addCriterion("stu_birthday is null");
            return (Criteria) this;
        }

        public Criteria andStuBirthdayIsNotNull() {
            addCriterion("stu_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andStuBirthdayEqualTo(String value) {
            addCriterion("stu_birthday =", value, "stuBirthday");
            return (Criteria) this;
        }

        public Criteria andStuBirthdayNotEqualTo(String value) {
            addCriterion("stu_birthday <>", value, "stuBirthday");
            return (Criteria) this;
        }

        public Criteria andStuBirthdayGreaterThan(String value) {
            addCriterion("stu_birthday >", value, "stuBirthday");
            return (Criteria) this;
        }

        public Criteria andStuBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("stu_birthday >=", value, "stuBirthday");
            return (Criteria) this;
        }

        public Criteria andStuBirthdayLessThan(String value) {
            addCriterion("stu_birthday <", value, "stuBirthday");
            return (Criteria) this;
        }

        public Criteria andStuBirthdayLessThanOrEqualTo(String value) {
            addCriterion("stu_birthday <=", value, "stuBirthday");
            return (Criteria) this;
        }

        public Criteria andStuBirthdayLike(String value) {
            addCriterion("stu_birthday like", value, "stuBirthday");
            return (Criteria) this;
        }

        public Criteria andStuBirthdayNotLike(String value) {
            addCriterion("stu_birthday not like", value, "stuBirthday");
            return (Criteria) this;
        }

        public Criteria andStuBirthdayIn(List<String> values) {
            addCriterion("stu_birthday in", values, "stuBirthday");
            return (Criteria) this;
        }

        public Criteria andStuBirthdayNotIn(List<String> values) {
            addCriterion("stu_birthday not in", values, "stuBirthday");
            return (Criteria) this;
        }

        public Criteria andStuBirthdayBetween(String value1, String value2) {
            addCriterion("stu_birthday between", value1, value2, "stuBirthday");
            return (Criteria) this;
        }

        public Criteria andStuBirthdayNotBetween(String value1, String value2) {
            addCriterion("stu_birthday not between", value1, value2, "stuBirthday");
            return (Criteria) this;
        }

        public Criteria andTuidIsNull() {
            addCriterion("tuid is null");
            return (Criteria) this;
        }

        public Criteria andTuidIsNotNull() {
            addCriterion("tuid is not null");
            return (Criteria) this;
        }

        public Criteria andTuidEqualTo(String value) {
            addCriterion("tuid =", value, "tuid");
            return (Criteria) this;
        }

        public Criteria andTuidNotEqualTo(String value) {
            addCriterion("tuid <>", value, "tuid");
            return (Criteria) this;
        }

        public Criteria andTuidGreaterThan(String value) {
            addCriterion("tuid >", value, "tuid");
            return (Criteria) this;
        }

        public Criteria andTuidGreaterThanOrEqualTo(String value) {
            addCriterion("tuid >=", value, "tuid");
            return (Criteria) this;
        }

        public Criteria andTuidLessThan(String value) {
            addCriterion("tuid <", value, "tuid");
            return (Criteria) this;
        }

        public Criteria andTuidLessThanOrEqualTo(String value) {
            addCriterion("tuid <=", value, "tuid");
            return (Criteria) this;
        }

        public Criteria andTuidLike(String value) {
            addCriterion("tuid like", value, "tuid");
            return (Criteria) this;
        }

        public Criteria andTuidNotLike(String value) {
            addCriterion("tuid not like", value, "tuid");
            return (Criteria) this;
        }

        public Criteria andTuidIn(List<String> values) {
            addCriterion("tuid in", values, "tuid");
            return (Criteria) this;
        }

        public Criteria andTuidNotIn(List<String> values) {
            addCriterion("tuid not in", values, "tuid");
            return (Criteria) this;
        }

        public Criteria andTuidBetween(String value1, String value2) {
            addCriterion("tuid between", value1, value2, "tuid");
            return (Criteria) this;
        }

        public Criteria andTuidNotBetween(String value1, String value2) {
            addCriterion("tuid not between", value1, value2, "tuid");
            return (Criteria) this;
        }

        public Criteria andTudateIsNull() {
            addCriterion("tudate is null");
            return (Criteria) this;
        }

        public Criteria andTudateIsNotNull() {
            addCriterion("tudate is not null");
            return (Criteria) this;
        }

        public Criteria andTudateEqualTo(String value) {
            addCriterion("tudate =", value, "tudate");
            return (Criteria) this;
        }

        public Criteria andTudateNotEqualTo(String value) {
            addCriterion("tudate <>", value, "tudate");
            return (Criteria) this;
        }

        public Criteria andTudateGreaterThan(String value) {
            addCriterion("tudate >", value, "tudate");
            return (Criteria) this;
        }

        public Criteria andTudateGreaterThanOrEqualTo(String value) {
            addCriterion("tudate >=", value, "tudate");
            return (Criteria) this;
        }

        public Criteria andTudateLessThan(String value) {
            addCriterion("tudate <", value, "tudate");
            return (Criteria) this;
        }

        public Criteria andTudateLessThanOrEqualTo(String value) {
            addCriterion("tudate <=", value, "tudate");
            return (Criteria) this;
        }

        public Criteria andTudateLike(String value) {
            addCriterion("tudate like", value, "tudate");
            return (Criteria) this;
        }

        public Criteria andTudateNotLike(String value) {
            addCriterion("tudate not like", value, "tudate");
            return (Criteria) this;
        }

        public Criteria andTudateIn(List<String> values) {
            addCriterion("tudate in", values, "tudate");
            return (Criteria) this;
        }

        public Criteria andTudateNotIn(List<String> values) {
            addCriterion("tudate not in", values, "tudate");
            return (Criteria) this;
        }

        public Criteria andTudateBetween(String value1, String value2) {
            addCriterion("tudate between", value1, value2, "tudate");
            return (Criteria) this;
        }

        public Criteria andTudateNotBetween(String value1, String value2) {
            addCriterion("tudate not between", value1, value2, "tudate");
            return (Criteria) this;
        }

        public Criteria andXuidIsNull() {
            addCriterion("xuid is null");
            return (Criteria) this;
        }

        public Criteria andXuidIsNotNull() {
            addCriterion("xuid is not null");
            return (Criteria) this;
        }

        public Criteria andXuidEqualTo(String value) {
            addCriterion("xuid =", value, "xuid");
            return (Criteria) this;
        }

        public Criteria andXuidNotEqualTo(String value) {
            addCriterion("xuid <>", value, "xuid");
            return (Criteria) this;
        }

        public Criteria andXuidGreaterThan(String value) {
            addCriterion("xuid >", value, "xuid");
            return (Criteria) this;
        }

        public Criteria andXuidGreaterThanOrEqualTo(String value) {
            addCriterion("xuid >=", value, "xuid");
            return (Criteria) this;
        }

        public Criteria andXuidLessThan(String value) {
            addCriterion("xuid <", value, "xuid");
            return (Criteria) this;
        }

        public Criteria andXuidLessThanOrEqualTo(String value) {
            addCriterion("xuid <=", value, "xuid");
            return (Criteria) this;
        }

        public Criteria andXuidLike(String value) {
            addCriterion("xuid like", value, "xuid");
            return (Criteria) this;
        }

        public Criteria andXuidNotLike(String value) {
            addCriterion("xuid not like", value, "xuid");
            return (Criteria) this;
        }

        public Criteria andXuidIn(List<String> values) {
            addCriterion("xuid in", values, "xuid");
            return (Criteria) this;
        }

        public Criteria andXuidNotIn(List<String> values) {
            addCriterion("xuid not in", values, "xuid");
            return (Criteria) this;
        }

        public Criteria andXuidBetween(String value1, String value2) {
            addCriterion("xuid between", value1, value2, "xuid");
            return (Criteria) this;
        }

        public Criteria andXuidNotBetween(String value1, String value2) {
            addCriterion("xuid not between", value1, value2, "xuid");
            return (Criteria) this;
        }

        public Criteria andXudateIsNull() {
            addCriterion("xudate is null");
            return (Criteria) this;
        }

        public Criteria andXudateIsNotNull() {
            addCriterion("xudate is not null");
            return (Criteria) this;
        }

        public Criteria andXudateEqualTo(String value) {
            addCriterion("xudate =", value, "xudate");
            return (Criteria) this;
        }

        public Criteria andXudateNotEqualTo(String value) {
            addCriterion("xudate <>", value, "xudate");
            return (Criteria) this;
        }

        public Criteria andXudateGreaterThan(String value) {
            addCriterion("xudate >", value, "xudate");
            return (Criteria) this;
        }

        public Criteria andXudateGreaterThanOrEqualTo(String value) {
            addCriterion("xudate >=", value, "xudate");
            return (Criteria) this;
        }

        public Criteria andXudateLessThan(String value) {
            addCriterion("xudate <", value, "xudate");
            return (Criteria) this;
        }

        public Criteria andXudateLessThanOrEqualTo(String value) {
            addCriterion("xudate <=", value, "xudate");
            return (Criteria) this;
        }

        public Criteria andXudateLike(String value) {
            addCriterion("xudate like", value, "xudate");
            return (Criteria) this;
        }

        public Criteria andXudateNotLike(String value) {
            addCriterion("xudate not like", value, "xudate");
            return (Criteria) this;
        }

        public Criteria andXudateIn(List<String> values) {
            addCriterion("xudate in", values, "xudate");
            return (Criteria) this;
        }

        public Criteria andXudateNotIn(List<String> values) {
            addCriterion("xudate not in", values, "xudate");
            return (Criteria) this;
        }

        public Criteria andXudateBetween(String value1, String value2) {
            addCriterion("xudate between", value1, value2, "xudate");
            return (Criteria) this;
        }

        public Criteria andXudateNotBetween(String value1, String value2) {
            addCriterion("xudate not between", value1, value2, "xudate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
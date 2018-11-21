package com.Hong.ssm.bean;

import java.util.ArrayList;
import java.util.List;

public class BasGradeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BasGradeExample() {
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

        public Criteria andBasIdIsNull() {
            addCriterion("bas_id is null");
            return (Criteria) this;
        }

        public Criteria andBasIdIsNotNull() {
            addCriterion("bas_id is not null");
            return (Criteria) this;
        }

        public Criteria andBasIdEqualTo(Integer value) {
            addCriterion("bas_id =", value, "basId");
            return (Criteria) this;
        }

        public Criteria andBasIdNotEqualTo(Integer value) {
            addCriterion("bas_id <>", value, "basId");
            return (Criteria) this;
        }

        public Criteria andBasIdGreaterThan(Integer value) {
            addCriterion("bas_id >", value, "basId");
            return (Criteria) this;
        }

        public Criteria andBasIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bas_id >=", value, "basId");
            return (Criteria) this;
        }

        public Criteria andBasIdLessThan(Integer value) {
            addCriterion("bas_id <", value, "basId");
            return (Criteria) this;
        }

        public Criteria andBasIdLessThanOrEqualTo(Integer value) {
            addCriterion("bas_id <=", value, "basId");
            return (Criteria) this;
        }

        public Criteria andBasIdIn(List<Integer> values) {
            addCriterion("bas_id in", values, "basId");
            return (Criteria) this;
        }

        public Criteria andBasIdNotIn(List<Integer> values) {
            addCriterion("bas_id not in", values, "basId");
            return (Criteria) this;
        }

        public Criteria andBasIdBetween(Integer value1, Integer value2) {
            addCriterion("bas_id between", value1, value2, "basId");
            return (Criteria) this;
        }

        public Criteria andBasIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bas_id not between", value1, value2, "basId");
            return (Criteria) this;
        }

        public Criteria andBasStuGradeIsNull() {
            addCriterion("bas_stu_grade is null");
            return (Criteria) this;
        }

        public Criteria andBasStuGradeIsNotNull() {
            addCriterion("bas_stu_grade is not null");
            return (Criteria) this;
        }

        public Criteria andBasStuGradeEqualTo(Integer value) {
            addCriterion("bas_stu_grade =", value, "basStuGrade");
            return (Criteria) this;
        }

        public Criteria andBasStuGradeNotEqualTo(Integer value) {
            addCriterion("bas_stu_grade <>", value, "basStuGrade");
            return (Criteria) this;
        }

        public Criteria andBasStuGradeGreaterThan(Integer value) {
            addCriterion("bas_stu_grade >", value, "basStuGrade");
            return (Criteria) this;
        }

        public Criteria andBasStuGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("bas_stu_grade >=", value, "basStuGrade");
            return (Criteria) this;
        }

        public Criteria andBasStuGradeLessThan(Integer value) {
            addCriterion("bas_stu_grade <", value, "basStuGrade");
            return (Criteria) this;
        }

        public Criteria andBasStuGradeLessThanOrEqualTo(Integer value) {
            addCriterion("bas_stu_grade <=", value, "basStuGrade");
            return (Criteria) this;
        }

        public Criteria andBasStuGradeIn(List<Integer> values) {
            addCriterion("bas_stu_grade in", values, "basStuGrade");
            return (Criteria) this;
        }

        public Criteria andBasStuGradeNotIn(List<Integer> values) {
            addCriterion("bas_stu_grade not in", values, "basStuGrade");
            return (Criteria) this;
        }

        public Criteria andBasStuGradeBetween(Integer value1, Integer value2) {
            addCriterion("bas_stu_grade between", value1, value2, "basStuGrade");
            return (Criteria) this;
        }

        public Criteria andBasStuGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("bas_stu_grade not between", value1, value2, "basStuGrade");
            return (Criteria) this;
        }

        public Criteria andBasNameIsNull() {
            addCriterion("bas_name is null");
            return (Criteria) this;
        }

        public Criteria andBasNameIsNotNull() {
            addCriterion("bas_name is not null");
            return (Criteria) this;
        }

        public Criteria andBasNameEqualTo(String value) {
            addCriterion("bas_name =", value, "basName");
            return (Criteria) this;
        }

        public Criteria andBasNameNotEqualTo(String value) {
            addCriterion("bas_name <>", value, "basName");
            return (Criteria) this;
        }

        public Criteria andBasNameGreaterThan(String value) {
            addCriterion("bas_name >", value, "basName");
            return (Criteria) this;
        }

        public Criteria andBasNameGreaterThanOrEqualTo(String value) {
            addCriterion("bas_name >=", value, "basName");
            return (Criteria) this;
        }

        public Criteria andBasNameLessThan(String value) {
            addCriterion("bas_name <", value, "basName");
            return (Criteria) this;
        }

        public Criteria andBasNameLessThanOrEqualTo(String value) {
            addCriterion("bas_name <=", value, "basName");
            return (Criteria) this;
        }

        public Criteria andBasNameLike(String value) {
            addCriterion("bas_name like", value, "basName");
            return (Criteria) this;
        }

        public Criteria andBasNameNotLike(String value) {
            addCriterion("bas_name not like", value, "basName");
            return (Criteria) this;
        }

        public Criteria andBasNameIn(List<String> values) {
            addCriterion("bas_name in", values, "basName");
            return (Criteria) this;
        }

        public Criteria andBasNameNotIn(List<String> values) {
            addCriterion("bas_name not in", values, "basName");
            return (Criteria) this;
        }

        public Criteria andBasNameBetween(String value1, String value2) {
            addCriterion("bas_name between", value1, value2, "basName");
            return (Criteria) this;
        }

        public Criteria andBasNameNotBetween(String value1, String value2) {
            addCriterion("bas_name not between", value1, value2, "basName");
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
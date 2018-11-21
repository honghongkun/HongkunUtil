package com.Hong.ssm.bean;

import java.util.ArrayList;
import java.util.List;

public class StuDoyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StuDoyExample() {
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

        public Criteria andDoyIdIsNull() {
            addCriterion("doy_id is null");
            return (Criteria) this;
        }

        public Criteria andDoyIdIsNotNull() {
            addCriterion("doy_id is not null");
            return (Criteria) this;
        }

        public Criteria andDoyIdEqualTo(Integer value) {
            addCriterion("doy_id =", value, "doyId");
            return (Criteria) this;
        }

        public Criteria andDoyIdNotEqualTo(Integer value) {
            addCriterion("doy_id <>", value, "doyId");
            return (Criteria) this;
        }

        public Criteria andDoyIdGreaterThan(Integer value) {
            addCriterion("doy_id >", value, "doyId");
            return (Criteria) this;
        }

        public Criteria andDoyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("doy_id >=", value, "doyId");
            return (Criteria) this;
        }

        public Criteria andDoyIdLessThan(Integer value) {
            addCriterion("doy_id <", value, "doyId");
            return (Criteria) this;
        }

        public Criteria andDoyIdLessThanOrEqualTo(Integer value) {
            addCriterion("doy_id <=", value, "doyId");
            return (Criteria) this;
        }

        public Criteria andDoyIdIn(List<Integer> values) {
            addCriterion("doy_id in", values, "doyId");
            return (Criteria) this;
        }

        public Criteria andDoyIdNotIn(List<Integer> values) {
            addCriterion("doy_id not in", values, "doyId");
            return (Criteria) this;
        }

        public Criteria andDoyIdBetween(Integer value1, Integer value2) {
            addCriterion("doy_id between", value1, value2, "doyId");
            return (Criteria) this;
        }

        public Criteria andDoyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("doy_id not between", value1, value2, "doyId");
            return (Criteria) this;
        }

        public Criteria andDoyNameIsNull() {
            addCriterion("doy_name is null");
            return (Criteria) this;
        }

        public Criteria andDoyNameIsNotNull() {
            addCriterion("doy_name is not null");
            return (Criteria) this;
        }

        public Criteria andDoyNameEqualTo(String value) {
            addCriterion("doy_name =", value, "doyName");
            return (Criteria) this;
        }

        public Criteria andDoyNameNotEqualTo(String value) {
            addCriterion("doy_name <>", value, "doyName");
            return (Criteria) this;
        }

        public Criteria andDoyNameGreaterThan(String value) {
            addCriterion("doy_name >", value, "doyName");
            return (Criteria) this;
        }

        public Criteria andDoyNameGreaterThanOrEqualTo(String value) {
            addCriterion("doy_name >=", value, "doyName");
            return (Criteria) this;
        }

        public Criteria andDoyNameLessThan(String value) {
            addCriterion("doy_name <", value, "doyName");
            return (Criteria) this;
        }

        public Criteria andDoyNameLessThanOrEqualTo(String value) {
            addCriterion("doy_name <=", value, "doyName");
            return (Criteria) this;
        }

        public Criteria andDoyNameLike(String value) {
            addCriterion("doy_name like", value, "doyName");
            return (Criteria) this;
        }

        public Criteria andDoyNameNotLike(String value) {
            addCriterion("doy_name not like", value, "doyName");
            return (Criteria) this;
        }

        public Criteria andDoyNameIn(List<String> values) {
            addCriterion("doy_name in", values, "doyName");
            return (Criteria) this;
        }

        public Criteria andDoyNameNotIn(List<String> values) {
            addCriterion("doy_name not in", values, "doyName");
            return (Criteria) this;
        }

        public Criteria andDoyNameBetween(String value1, String value2) {
            addCriterion("doy_name between", value1, value2, "doyName");
            return (Criteria) this;
        }

        public Criteria andDoyNameNotBetween(String value1, String value2) {
            addCriterion("doy_name not between", value1, value2, "doyName");
            return (Criteria) this;
        }

        public Criteria andDoyRemarkIsNull() {
            addCriterion("doy_remark is null");
            return (Criteria) this;
        }

        public Criteria andDoyRemarkIsNotNull() {
            addCriterion("doy_remark is not null");
            return (Criteria) this;
        }

        public Criteria andDoyRemarkEqualTo(String value) {
            addCriterion("doy_remark =", value, "doyRemark");
            return (Criteria) this;
        }

        public Criteria andDoyRemarkNotEqualTo(String value) {
            addCriterion("doy_remark <>", value, "doyRemark");
            return (Criteria) this;
        }

        public Criteria andDoyRemarkGreaterThan(String value) {
            addCriterion("doy_remark >", value, "doyRemark");
            return (Criteria) this;
        }

        public Criteria andDoyRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("doy_remark >=", value, "doyRemark");
            return (Criteria) this;
        }

        public Criteria andDoyRemarkLessThan(String value) {
            addCriterion("doy_remark <", value, "doyRemark");
            return (Criteria) this;
        }

        public Criteria andDoyRemarkLessThanOrEqualTo(String value) {
            addCriterion("doy_remark <=", value, "doyRemark");
            return (Criteria) this;
        }

        public Criteria andDoyRemarkLike(String value) {
            addCriterion("doy_remark like", value, "doyRemark");
            return (Criteria) this;
        }

        public Criteria andDoyRemarkNotLike(String value) {
            addCriterion("doy_remark not like", value, "doyRemark");
            return (Criteria) this;
        }

        public Criteria andDoyRemarkIn(List<String> values) {
            addCriterion("doy_remark in", values, "doyRemark");
            return (Criteria) this;
        }

        public Criteria andDoyRemarkNotIn(List<String> values) {
            addCriterion("doy_remark not in", values, "doyRemark");
            return (Criteria) this;
        }

        public Criteria andDoyRemarkBetween(String value1, String value2) {
            addCriterion("doy_remark between", value1, value2, "doyRemark");
            return (Criteria) this;
        }

        public Criteria andDoyRemarkNotBetween(String value1, String value2) {
            addCriterion("doy_remark not between", value1, value2, "doyRemark");
            return (Criteria) this;
        }

        public Criteria andDoyPidIsNull() {
            addCriterion("doy_pid is null");
            return (Criteria) this;
        }

        public Criteria andDoyPidIsNotNull() {
            addCriterion("doy_pid is not null");
            return (Criteria) this;
        }

        public Criteria andDoyPidEqualTo(Integer value) {
            addCriterion("doy_pid =", value, "doyPid");
            return (Criteria) this;
        }

        public Criteria andDoyPidNotEqualTo(Integer value) {
            addCriterion("doy_pid <>", value, "doyPid");
            return (Criteria) this;
        }

        public Criteria andDoyPidGreaterThan(Integer value) {
            addCriterion("doy_pid >", value, "doyPid");
            return (Criteria) this;
        }

        public Criteria andDoyPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("doy_pid >=", value, "doyPid");
            return (Criteria) this;
        }

        public Criteria andDoyPidLessThan(Integer value) {
            addCriterion("doy_pid <", value, "doyPid");
            return (Criteria) this;
        }

        public Criteria andDoyPidLessThanOrEqualTo(Integer value) {
            addCriterion("doy_pid <=", value, "doyPid");
            return (Criteria) this;
        }

        public Criteria andDoyPidIn(List<Integer> values) {
            addCriterion("doy_pid in", values, "doyPid");
            return (Criteria) this;
        }

        public Criteria andDoyPidNotIn(List<Integer> values) {
            addCriterion("doy_pid not in", values, "doyPid");
            return (Criteria) this;
        }

        public Criteria andDoyPidBetween(Integer value1, Integer value2) {
            addCriterion("doy_pid between", value1, value2, "doyPid");
            return (Criteria) this;
        }

        public Criteria andDoyPidNotBetween(Integer value1, Integer value2) {
            addCriterion("doy_pid not between", value1, value2, "doyPid");
            return (Criteria) this;
        }

        public Criteria andDoyUsersIsNull() {
            addCriterion("doy_users is null");
            return (Criteria) this;
        }

        public Criteria andDoyUsersIsNotNull() {
            addCriterion("doy_users is not null");
            return (Criteria) this;
        }

        public Criteria andDoyUsersEqualTo(String value) {
            addCriterion("doy_users =", value, "doyUsers");
            return (Criteria) this;
        }

        public Criteria andDoyUsersNotEqualTo(String value) {
            addCriterion("doy_users <>", value, "doyUsers");
            return (Criteria) this;
        }

        public Criteria andDoyUsersGreaterThan(String value) {
            addCriterion("doy_users >", value, "doyUsers");
            return (Criteria) this;
        }

        public Criteria andDoyUsersGreaterThanOrEqualTo(String value) {
            addCriterion("doy_users >=", value, "doyUsers");
            return (Criteria) this;
        }

        public Criteria andDoyUsersLessThan(String value) {
            addCriterion("doy_users <", value, "doyUsers");
            return (Criteria) this;
        }

        public Criteria andDoyUsersLessThanOrEqualTo(String value) {
            addCriterion("doy_users <=", value, "doyUsers");
            return (Criteria) this;
        }

        public Criteria andDoyUsersLike(String value) {
            addCriterion("doy_users like", value, "doyUsers");
            return (Criteria) this;
        }

        public Criteria andDoyUsersNotLike(String value) {
            addCriterion("doy_users not like", value, "doyUsers");
            return (Criteria) this;
        }

        public Criteria andDoyUsersIn(List<String> values) {
            addCriterion("doy_users in", values, "doyUsers");
            return (Criteria) this;
        }

        public Criteria andDoyUsersNotIn(List<String> values) {
            addCriterion("doy_users not in", values, "doyUsers");
            return (Criteria) this;
        }

        public Criteria andDoyUsersBetween(String value1, String value2) {
            addCriterion("doy_users between", value1, value2, "doyUsers");
            return (Criteria) this;
        }

        public Criteria andDoyUsersNotBetween(String value1, String value2) {
            addCriterion("doy_users not between", value1, value2, "doyUsers");
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
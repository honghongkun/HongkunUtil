package com.Hong.ssm.bean;

import java.util.ArrayList;
import java.util.List;

public class RegistrationStuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RegistrationStuExample() {
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

        public Criteria andRegistrationIdIsNull() {
            addCriterion("registration_id is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationIdIsNotNull() {
            addCriterion("registration_id is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationIdEqualTo(Integer value) {
            addCriterion("registration_id =", value, "registrationId");
            return (Criteria) this;
        }

        public Criteria andRegistrationIdNotEqualTo(Integer value) {
            addCriterion("registration_id <>", value, "registrationId");
            return (Criteria) this;
        }

        public Criteria andRegistrationIdGreaterThan(Integer value) {
            addCriterion("registration_id >", value, "registrationId");
            return (Criteria) this;
        }

        public Criteria andRegistrationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("registration_id >=", value, "registrationId");
            return (Criteria) this;
        }

        public Criteria andRegistrationIdLessThan(Integer value) {
            addCriterion("registration_id <", value, "registrationId");
            return (Criteria) this;
        }

        public Criteria andRegistrationIdLessThanOrEqualTo(Integer value) {
            addCriterion("registration_id <=", value, "registrationId");
            return (Criteria) this;
        }

        public Criteria andRegistrationIdIn(List<Integer> values) {
            addCriterion("registration_id in", values, "registrationId");
            return (Criteria) this;
        }

        public Criteria andRegistrationIdNotIn(List<Integer> values) {
            addCriterion("registration_id not in", values, "registrationId");
            return (Criteria) this;
        }

        public Criteria andRegistrationIdBetween(Integer value1, Integer value2) {
            addCriterion("registration_id between", value1, value2, "registrationId");
            return (Criteria) this;
        }

        public Criteria andRegistrationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("registration_id not between", value1, value2, "registrationId");
            return (Criteria) this;
        }

        public Criteria andRegistrationPidIsNull() {
            addCriterion("registration_pid is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationPidIsNotNull() {
            addCriterion("registration_pid is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationPidEqualTo(Integer value) {
            addCriterion("registration_pid =", value, "registrationPid");
            return (Criteria) this;
        }

        public Criteria andRegistrationPidNotEqualTo(Integer value) {
            addCriterion("registration_pid <>", value, "registrationPid");
            return (Criteria) this;
        }

        public Criteria andRegistrationPidGreaterThan(Integer value) {
            addCriterion("registration_pid >", value, "registrationPid");
            return (Criteria) this;
        }

        public Criteria andRegistrationPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("registration_pid >=", value, "registrationPid");
            return (Criteria) this;
        }

        public Criteria andRegistrationPidLessThan(Integer value) {
            addCriterion("registration_pid <", value, "registrationPid");
            return (Criteria) this;
        }

        public Criteria andRegistrationPidLessThanOrEqualTo(Integer value) {
            addCriterion("registration_pid <=", value, "registrationPid");
            return (Criteria) this;
        }

        public Criteria andRegistrationPidIn(List<Integer> values) {
            addCriterion("registration_pid in", values, "registrationPid");
            return (Criteria) this;
        }

        public Criteria andRegistrationPidNotIn(List<Integer> values) {
            addCriterion("registration_pid not in", values, "registrationPid");
            return (Criteria) this;
        }

        public Criteria andRegistrationPidBetween(Integer value1, Integer value2) {
            addCriterion("registration_pid between", value1, value2, "registrationPid");
            return (Criteria) this;
        }

        public Criteria andRegistrationPidNotBetween(Integer value1, Integer value2) {
            addCriterion("registration_pid not between", value1, value2, "registrationPid");
            return (Criteria) this;
        }

        public Criteria andRegistrationStuNameIsNull() {
            addCriterion("registration_stu_name is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationStuNameIsNotNull() {
            addCriterion("registration_stu_name is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationStuNameEqualTo(String value) {
            addCriterion("registration_stu_name =", value, "registrationStuName");
            return (Criteria) this;
        }

        public Criteria andRegistrationStuNameNotEqualTo(String value) {
            addCriterion("registration_stu_name <>", value, "registrationStuName");
            return (Criteria) this;
        }

        public Criteria andRegistrationStuNameGreaterThan(String value) {
            addCriterion("registration_stu_name >", value, "registrationStuName");
            return (Criteria) this;
        }

        public Criteria andRegistrationStuNameGreaterThanOrEqualTo(String value) {
            addCriterion("registration_stu_name >=", value, "registrationStuName");
            return (Criteria) this;
        }

        public Criteria andRegistrationStuNameLessThan(String value) {
            addCriterion("registration_stu_name <", value, "registrationStuName");
            return (Criteria) this;
        }

        public Criteria andRegistrationStuNameLessThanOrEqualTo(String value) {
            addCriterion("registration_stu_name <=", value, "registrationStuName");
            return (Criteria) this;
        }

        public Criteria andRegistrationStuNameLike(String value) {
            addCriterion("registration_stu_name like", value, "registrationStuName");
            return (Criteria) this;
        }

        public Criteria andRegistrationStuNameNotLike(String value) {
            addCriterion("registration_stu_name not like", value, "registrationStuName");
            return (Criteria) this;
        }

        public Criteria andRegistrationStuNameIn(List<String> values) {
            addCriterion("registration_stu_name in", values, "registrationStuName");
            return (Criteria) this;
        }

        public Criteria andRegistrationStuNameNotIn(List<String> values) {
            addCriterion("registration_stu_name not in", values, "registrationStuName");
            return (Criteria) this;
        }

        public Criteria andRegistrationStuNameBetween(String value1, String value2) {
            addCriterion("registration_stu_name between", value1, value2, "registrationStuName");
            return (Criteria) this;
        }

        public Criteria andRegistrationStuNameNotBetween(String value1, String value2) {
            addCriterion("registration_stu_name not between", value1, value2, "registrationStuName");
            return (Criteria) this;
        }

        public Criteria andRegistrationStuSexIsNull() {
            addCriterion("registration_stu_sex is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationStuSexIsNotNull() {
            addCriterion("registration_stu_sex is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationStuSexEqualTo(String value) {
            addCriterion("registration_stu_sex =", value, "registrationStuSex");
            return (Criteria) this;
        }

        public Criteria andRegistrationStuSexNotEqualTo(String value) {
            addCriterion("registration_stu_sex <>", value, "registrationStuSex");
            return (Criteria) this;
        }

        public Criteria andRegistrationStuSexGreaterThan(String value) {
            addCriterion("registration_stu_sex >", value, "registrationStuSex");
            return (Criteria) this;
        }

        public Criteria andRegistrationStuSexGreaterThanOrEqualTo(String value) {
            addCriterion("registration_stu_sex >=", value, "registrationStuSex");
            return (Criteria) this;
        }

        public Criteria andRegistrationStuSexLessThan(String value) {
            addCriterion("registration_stu_sex <", value, "registrationStuSex");
            return (Criteria) this;
        }

        public Criteria andRegistrationStuSexLessThanOrEqualTo(String value) {
            addCriterion("registration_stu_sex <=", value, "registrationStuSex");
            return (Criteria) this;
        }

        public Criteria andRegistrationStuSexLike(String value) {
            addCriterion("registration_stu_sex like", value, "registrationStuSex");
            return (Criteria) this;
        }

        public Criteria andRegistrationStuSexNotLike(String value) {
            addCriterion("registration_stu_sex not like", value, "registrationStuSex");
            return (Criteria) this;
        }

        public Criteria andRegistrationStuSexIn(List<String> values) {
            addCriterion("registration_stu_sex in", values, "registrationStuSex");
            return (Criteria) this;
        }

        public Criteria andRegistrationStuSexNotIn(List<String> values) {
            addCriterion("registration_stu_sex not in", values, "registrationStuSex");
            return (Criteria) this;
        }

        public Criteria andRegistrationStuSexBetween(String value1, String value2) {
            addCriterion("registration_stu_sex between", value1, value2, "registrationStuSex");
            return (Criteria) this;
        }

        public Criteria andRegistrationStuSexNotBetween(String value1, String value2) {
            addCriterion("registration_stu_sex not between", value1, value2, "registrationStuSex");
            return (Criteria) this;
        }

        public Criteria andRegistrationDoyNameIsNull() {
            addCriterion("registration_doy_name is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationDoyNameIsNotNull() {
            addCriterion("registration_doy_name is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationDoyNameEqualTo(String value) {
            addCriterion("registration_doy_name =", value, "registrationDoyName");
            return (Criteria) this;
        }

        public Criteria andRegistrationDoyNameNotEqualTo(String value) {
            addCriterion("registration_doy_name <>", value, "registrationDoyName");
            return (Criteria) this;
        }

        public Criteria andRegistrationDoyNameGreaterThan(String value) {
            addCriterion("registration_doy_name >", value, "registrationDoyName");
            return (Criteria) this;
        }

        public Criteria andRegistrationDoyNameGreaterThanOrEqualTo(String value) {
            addCriterion("registration_doy_name >=", value, "registrationDoyName");
            return (Criteria) this;
        }

        public Criteria andRegistrationDoyNameLessThan(String value) {
            addCriterion("registration_doy_name <", value, "registrationDoyName");
            return (Criteria) this;
        }

        public Criteria andRegistrationDoyNameLessThanOrEqualTo(String value) {
            addCriterion("registration_doy_name <=", value, "registrationDoyName");
            return (Criteria) this;
        }

        public Criteria andRegistrationDoyNameLike(String value) {
            addCriterion("registration_doy_name like", value, "registrationDoyName");
            return (Criteria) this;
        }

        public Criteria andRegistrationDoyNameNotLike(String value) {
            addCriterion("registration_doy_name not like", value, "registrationDoyName");
            return (Criteria) this;
        }

        public Criteria andRegistrationDoyNameIn(List<String> values) {
            addCriterion("registration_doy_name in", values, "registrationDoyName");
            return (Criteria) this;
        }

        public Criteria andRegistrationDoyNameNotIn(List<String> values) {
            addCriterion("registration_doy_name not in", values, "registrationDoyName");
            return (Criteria) this;
        }

        public Criteria andRegistrationDoyNameBetween(String value1, String value2) {
            addCriterion("registration_doy_name between", value1, value2, "registrationDoyName");
            return (Criteria) this;
        }

        public Criteria andRegistrationDoyNameNotBetween(String value1, String value2) {
            addCriterion("registration_doy_name not between", value1, value2, "registrationDoyName");
            return (Criteria) this;
        }

        public Criteria andRegistrationRoomIsNull() {
            addCriterion("registration_room is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationRoomIsNotNull() {
            addCriterion("registration_room is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationRoomEqualTo(String value) {
            addCriterion("registration_room =", value, "registrationRoom");
            return (Criteria) this;
        }

        public Criteria andRegistrationRoomNotEqualTo(String value) {
            addCriterion("registration_room <>", value, "registrationRoom");
            return (Criteria) this;
        }

        public Criteria andRegistrationRoomGreaterThan(String value) {
            addCriterion("registration_room >", value, "registrationRoom");
            return (Criteria) this;
        }

        public Criteria andRegistrationRoomGreaterThanOrEqualTo(String value) {
            addCriterion("registration_room >=", value, "registrationRoom");
            return (Criteria) this;
        }

        public Criteria andRegistrationRoomLessThan(String value) {
            addCriterion("registration_room <", value, "registrationRoom");
            return (Criteria) this;
        }

        public Criteria andRegistrationRoomLessThanOrEqualTo(String value) {
            addCriterion("registration_room <=", value, "registrationRoom");
            return (Criteria) this;
        }

        public Criteria andRegistrationRoomLike(String value) {
            addCriterion("registration_room like", value, "registrationRoom");
            return (Criteria) this;
        }

        public Criteria andRegistrationRoomNotLike(String value) {
            addCriterion("registration_room not like", value, "registrationRoom");
            return (Criteria) this;
        }

        public Criteria andRegistrationRoomIn(List<String> values) {
            addCriterion("registration_room in", values, "registrationRoom");
            return (Criteria) this;
        }

        public Criteria andRegistrationRoomNotIn(List<String> values) {
            addCriterion("registration_room not in", values, "registrationRoom");
            return (Criteria) this;
        }

        public Criteria andRegistrationRoomBetween(String value1, String value2) {
            addCriterion("registration_room between", value1, value2, "registrationRoom");
            return (Criteria) this;
        }

        public Criteria andRegistrationRoomNotBetween(String value1, String value2) {
            addCriterion("registration_room not between", value1, value2, "registrationRoom");
            return (Criteria) this;
        }

        public Criteria andRegistrationPhoneIsNull() {
            addCriterion("registration_phone is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationPhoneIsNotNull() {
            addCriterion("registration_phone is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationPhoneEqualTo(String value) {
            addCriterion("registration_phone =", value, "registrationPhone");
            return (Criteria) this;
        }

        public Criteria andRegistrationPhoneNotEqualTo(String value) {
            addCriterion("registration_phone <>", value, "registrationPhone");
            return (Criteria) this;
        }

        public Criteria andRegistrationPhoneGreaterThan(String value) {
            addCriterion("registration_phone >", value, "registrationPhone");
            return (Criteria) this;
        }

        public Criteria andRegistrationPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("registration_phone >=", value, "registrationPhone");
            return (Criteria) this;
        }

        public Criteria andRegistrationPhoneLessThan(String value) {
            addCriterion("registration_phone <", value, "registrationPhone");
            return (Criteria) this;
        }

        public Criteria andRegistrationPhoneLessThanOrEqualTo(String value) {
            addCriterion("registration_phone <=", value, "registrationPhone");
            return (Criteria) this;
        }

        public Criteria andRegistrationPhoneLike(String value) {
            addCriterion("registration_phone like", value, "registrationPhone");
            return (Criteria) this;
        }

        public Criteria andRegistrationPhoneNotLike(String value) {
            addCriterion("registration_phone not like", value, "registrationPhone");
            return (Criteria) this;
        }

        public Criteria andRegistrationPhoneIn(List<String> values) {
            addCriterion("registration_phone in", values, "registrationPhone");
            return (Criteria) this;
        }

        public Criteria andRegistrationPhoneNotIn(List<String> values) {
            addCriterion("registration_phone not in", values, "registrationPhone");
            return (Criteria) this;
        }

        public Criteria andRegistrationPhoneBetween(String value1, String value2) {
            addCriterion("registration_phone between", value1, value2, "registrationPhone");
            return (Criteria) this;
        }

        public Criteria andRegistrationPhoneNotBetween(String value1, String value2) {
            addCriterion("registration_phone not between", value1, value2, "registrationPhone");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateIsNull() {
            addCriterion("registration_date is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateIsNotNull() {
            addCriterion("registration_date is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateEqualTo(String value) {
            addCriterion("registration_date =", value, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateNotEqualTo(String value) {
            addCriterion("registration_date <>", value, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateGreaterThan(String value) {
            addCriterion("registration_date >", value, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateGreaterThanOrEqualTo(String value) {
            addCriterion("registration_date >=", value, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateLessThan(String value) {
            addCriterion("registration_date <", value, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateLessThanOrEqualTo(String value) {
            addCriterion("registration_date <=", value, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateLike(String value) {
            addCriterion("registration_date like", value, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateNotLike(String value) {
            addCriterion("registration_date not like", value, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateIn(List<String> values) {
            addCriterion("registration_date in", values, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateNotIn(List<String> values) {
            addCriterion("registration_date not in", values, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateBetween(String value1, String value2) {
            addCriterion("registration_date between", value1, value2, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateNotBetween(String value1, String value2) {
            addCriterion("registration_date not between", value1, value2, "registrationDate");
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
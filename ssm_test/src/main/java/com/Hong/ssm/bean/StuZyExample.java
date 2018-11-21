package com.Hong.ssm.bean;

import java.util.ArrayList;
import java.util.List;

public class StuZyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StuZyExample() {
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

        public Criteria andZyIdIsNull() {
            addCriterion("Zy_id is null");
            return (Criteria) this;
        }

        public Criteria andZyIdIsNotNull() {
            addCriterion("Zy_id is not null");
            return (Criteria) this;
        }

        public Criteria andZyIdEqualTo(Integer value) {
            addCriterion("Zy_id =", value, "zyId");
            return (Criteria) this;
        }

        public Criteria andZyIdNotEqualTo(Integer value) {
            addCriterion("Zy_id <>", value, "zyId");
            return (Criteria) this;
        }

        public Criteria andZyIdGreaterThan(Integer value) {
            addCriterion("Zy_id >", value, "zyId");
            return (Criteria) this;
        }

        public Criteria andZyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Zy_id >=", value, "zyId");
            return (Criteria) this;
        }

        public Criteria andZyIdLessThan(Integer value) {
            addCriterion("Zy_id <", value, "zyId");
            return (Criteria) this;
        }

        public Criteria andZyIdLessThanOrEqualTo(Integer value) {
            addCriterion("Zy_id <=", value, "zyId");
            return (Criteria) this;
        }

        public Criteria andZyIdIn(List<Integer> values) {
            addCriterion("Zy_id in", values, "zyId");
            return (Criteria) this;
        }

        public Criteria andZyIdNotIn(List<Integer> values) {
            addCriterion("Zy_id not in", values, "zyId");
            return (Criteria) this;
        }

        public Criteria andZyIdBetween(Integer value1, Integer value2) {
            addCriterion("Zy_id between", value1, value2, "zyId");
            return (Criteria) this;
        }

        public Criteria andZyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Zy_id not between", value1, value2, "zyId");
            return (Criteria) this;
        }

        public Criteria andZyPidIsNull() {
            addCriterion("Zy_pid is null");
            return (Criteria) this;
        }

        public Criteria andZyPidIsNotNull() {
            addCriterion("Zy_pid is not null");
            return (Criteria) this;
        }

        public Criteria andZyPidEqualTo(Integer value) {
            addCriterion("Zy_pid =", value, "zyPid");
            return (Criteria) this;
        }

        public Criteria andZyPidNotEqualTo(Integer value) {
            addCriterion("Zy_pid <>", value, "zyPid");
            return (Criteria) this;
        }

        public Criteria andZyPidGreaterThan(Integer value) {
            addCriterion("Zy_pid >", value, "zyPid");
            return (Criteria) this;
        }

        public Criteria andZyPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("Zy_pid >=", value, "zyPid");
            return (Criteria) this;
        }

        public Criteria andZyPidLessThan(Integer value) {
            addCriterion("Zy_pid <", value, "zyPid");
            return (Criteria) this;
        }

        public Criteria andZyPidLessThanOrEqualTo(Integer value) {
            addCriterion("Zy_pid <=", value, "zyPid");
            return (Criteria) this;
        }

        public Criteria andZyPidIn(List<Integer> values) {
            addCriterion("Zy_pid in", values, "zyPid");
            return (Criteria) this;
        }

        public Criteria andZyPidNotIn(List<Integer> values) {
            addCriterion("Zy_pid not in", values, "zyPid");
            return (Criteria) this;
        }

        public Criteria andZyPidBetween(Integer value1, Integer value2) {
            addCriterion("Zy_pid between", value1, value2, "zyPid");
            return (Criteria) this;
        }

        public Criteria andZyPidNotBetween(Integer value1, Integer value2) {
            addCriterion("Zy_pid not between", value1, value2, "zyPid");
            return (Criteria) this;
        }

        public Criteria andZyNameIsNull() {
            addCriterion("Zy_name is null");
            return (Criteria) this;
        }

        public Criteria andZyNameIsNotNull() {
            addCriterion("Zy_name is not null");
            return (Criteria) this;
        }

        public Criteria andZyNameEqualTo(String value) {
            addCriterion("Zy_name =", value, "zyName");
            return (Criteria) this;
        }

        public Criteria andZyNameNotEqualTo(String value) {
            addCriterion("Zy_name <>", value, "zyName");
            return (Criteria) this;
        }

        public Criteria andZyNameGreaterThan(String value) {
            addCriterion("Zy_name >", value, "zyName");
            return (Criteria) this;
        }

        public Criteria andZyNameGreaterThanOrEqualTo(String value) {
            addCriterion("Zy_name >=", value, "zyName");
            return (Criteria) this;
        }

        public Criteria andZyNameLessThan(String value) {
            addCriterion("Zy_name <", value, "zyName");
            return (Criteria) this;
        }

        public Criteria andZyNameLessThanOrEqualTo(String value) {
            addCriterion("Zy_name <=", value, "zyName");
            return (Criteria) this;
        }

        public Criteria andZyNameLike(String value) {
            addCriterion("Zy_name like", value, "zyName");
            return (Criteria) this;
        }

        public Criteria andZyNameNotLike(String value) {
            addCriterion("Zy_name not like", value, "zyName");
            return (Criteria) this;
        }

        public Criteria andZyNameIn(List<String> values) {
            addCriterion("Zy_name in", values, "zyName");
            return (Criteria) this;
        }

        public Criteria andZyNameNotIn(List<String> values) {
            addCriterion("Zy_name not in", values, "zyName");
            return (Criteria) this;
        }

        public Criteria andZyNameBetween(String value1, String value2) {
            addCriterion("Zy_name between", value1, value2, "zyName");
            return (Criteria) this;
        }

        public Criteria andZyNameNotBetween(String value1, String value2) {
            addCriterion("Zy_name not between", value1, value2, "zyName");
            return (Criteria) this;
        }

        public Criteria andZyOrderIsNull() {
            addCriterion("Zy_order is null");
            return (Criteria) this;
        }

        public Criteria andZyOrderIsNotNull() {
            addCriterion("Zy_order is not null");
            return (Criteria) this;
        }

        public Criteria andZyOrderEqualTo(Integer value) {
            addCriterion("Zy_order =", value, "zyOrder");
            return (Criteria) this;
        }

        public Criteria andZyOrderNotEqualTo(Integer value) {
            addCriterion("Zy_order <>", value, "zyOrder");
            return (Criteria) this;
        }

        public Criteria andZyOrderGreaterThan(Integer value) {
            addCriterion("Zy_order >", value, "zyOrder");
            return (Criteria) this;
        }

        public Criteria andZyOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("Zy_order >=", value, "zyOrder");
            return (Criteria) this;
        }

        public Criteria andZyOrderLessThan(Integer value) {
            addCriterion("Zy_order <", value, "zyOrder");
            return (Criteria) this;
        }

        public Criteria andZyOrderLessThanOrEqualTo(Integer value) {
            addCriterion("Zy_order <=", value, "zyOrder");
            return (Criteria) this;
        }

        public Criteria andZyOrderIn(List<Integer> values) {
            addCriterion("Zy_order in", values, "zyOrder");
            return (Criteria) this;
        }

        public Criteria andZyOrderNotIn(List<Integer> values) {
            addCriterion("Zy_order not in", values, "zyOrder");
            return (Criteria) this;
        }

        public Criteria andZyOrderBetween(Integer value1, Integer value2) {
            addCriterion("Zy_order between", value1, value2, "zyOrder");
            return (Criteria) this;
        }

        public Criteria andZyOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("Zy_order not between", value1, value2, "zyOrder");
            return (Criteria) this;
        }

        public Criteria andZyUrlIsNull() {
            addCriterion("Zy_url is null");
            return (Criteria) this;
        }

        public Criteria andZyUrlIsNotNull() {
            addCriterion("Zy_url is not null");
            return (Criteria) this;
        }

        public Criteria andZyUrlEqualTo(String value) {
            addCriterion("Zy_url =", value, "zyUrl");
            return (Criteria) this;
        }

        public Criteria andZyUrlNotEqualTo(String value) {
            addCriterion("Zy_url <>", value, "zyUrl");
            return (Criteria) this;
        }

        public Criteria andZyUrlGreaterThan(String value) {
            addCriterion("Zy_url >", value, "zyUrl");
            return (Criteria) this;
        }

        public Criteria andZyUrlGreaterThanOrEqualTo(String value) {
            addCriterion("Zy_url >=", value, "zyUrl");
            return (Criteria) this;
        }

        public Criteria andZyUrlLessThan(String value) {
            addCriterion("Zy_url <", value, "zyUrl");
            return (Criteria) this;
        }

        public Criteria andZyUrlLessThanOrEqualTo(String value) {
            addCriterion("Zy_url <=", value, "zyUrl");
            return (Criteria) this;
        }

        public Criteria andZyUrlLike(String value) {
            addCriterion("Zy_url like", value, "zyUrl");
            return (Criteria) this;
        }

        public Criteria andZyUrlNotLike(String value) {
            addCriterion("Zy_url not like", value, "zyUrl");
            return (Criteria) this;
        }

        public Criteria andZyUrlIn(List<String> values) {
            addCriterion("Zy_url in", values, "zyUrl");
            return (Criteria) this;
        }

        public Criteria andZyUrlNotIn(List<String> values) {
            addCriterion("Zy_url not in", values, "zyUrl");
            return (Criteria) this;
        }

        public Criteria andZyUrlBetween(String value1, String value2) {
            addCriterion("Zy_url between", value1, value2, "zyUrl");
            return (Criteria) this;
        }

        public Criteria andZyUrlNotBetween(String value1, String value2) {
            addCriterion("Zy_url not between", value1, value2, "zyUrl");
            return (Criteria) this;
        }

        public Criteria andZyShowIsNull() {
            addCriterion("Zy_show is null");
            return (Criteria) this;
        }

        public Criteria andZyShowIsNotNull() {
            addCriterion("Zy_show is not null");
            return (Criteria) this;
        }

        public Criteria andZyShowEqualTo(Integer value) {
            addCriterion("Zy_show =", value, "zyShow");
            return (Criteria) this;
        }

        public Criteria andZyShowNotEqualTo(Integer value) {
            addCriterion("Zy_show <>", value, "zyShow");
            return (Criteria) this;
        }

        public Criteria andZyShowGreaterThan(Integer value) {
            addCriterion("Zy_show >", value, "zyShow");
            return (Criteria) this;
        }

        public Criteria andZyShowGreaterThanOrEqualTo(Integer value) {
            addCriterion("Zy_show >=", value, "zyShow");
            return (Criteria) this;
        }

        public Criteria andZyShowLessThan(Integer value) {
            addCriterion("Zy_show <", value, "zyShow");
            return (Criteria) this;
        }

        public Criteria andZyShowLessThanOrEqualTo(Integer value) {
            addCriterion("Zy_show <=", value, "zyShow");
            return (Criteria) this;
        }

        public Criteria andZyShowIn(List<Integer> values) {
            addCriterion("Zy_show in", values, "zyShow");
            return (Criteria) this;
        }

        public Criteria andZyShowNotIn(List<Integer> values) {
            addCriterion("Zy_show not in", values, "zyShow");
            return (Criteria) this;
        }

        public Criteria andZyShowBetween(Integer value1, Integer value2) {
            addCriterion("Zy_show between", value1, value2, "zyShow");
            return (Criteria) this;
        }

        public Criteria andZyShowNotBetween(Integer value1, Integer value2) {
            addCriterion("Zy_show not between", value1, value2, "zyShow");
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
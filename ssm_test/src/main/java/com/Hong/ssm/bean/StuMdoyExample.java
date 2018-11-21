package com.Hong.ssm.bean;

import java.util.ArrayList;
import java.util.List;

public class StuMdoyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StuMdoyExample() {
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

        public Criteria andMdoyIdIsNull() {
            addCriterion("mdoy_id is null");
            return (Criteria) this;
        }

        public Criteria andMdoyIdIsNotNull() {
            addCriterion("mdoy_id is not null");
            return (Criteria) this;
        }

        public Criteria andMdoyIdEqualTo(Integer value) {
            addCriterion("mdoy_id =", value, "mdoyId");
            return (Criteria) this;
        }

        public Criteria andMdoyIdNotEqualTo(Integer value) {
            addCriterion("mdoy_id <>", value, "mdoyId");
            return (Criteria) this;
        }

        public Criteria andMdoyIdGreaterThan(Integer value) {
            addCriterion("mdoy_id >", value, "mdoyId");
            return (Criteria) this;
        }

        public Criteria andMdoyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mdoy_id >=", value, "mdoyId");
            return (Criteria) this;
        }

        public Criteria andMdoyIdLessThan(Integer value) {
            addCriterion("mdoy_id <", value, "mdoyId");
            return (Criteria) this;
        }

        public Criteria andMdoyIdLessThanOrEqualTo(Integer value) {
            addCriterion("mdoy_id <=", value, "mdoyId");
            return (Criteria) this;
        }

        public Criteria andMdoyIdIn(List<Integer> values) {
            addCriterion("mdoy_id in", values, "mdoyId");
            return (Criteria) this;
        }

        public Criteria andMdoyIdNotIn(List<Integer> values) {
            addCriterion("mdoy_id not in", values, "mdoyId");
            return (Criteria) this;
        }

        public Criteria andMdoyIdBetween(Integer value1, Integer value2) {
            addCriterion("mdoy_id between", value1, value2, "mdoyId");
            return (Criteria) this;
        }

        public Criteria andMdoyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mdoy_id not between", value1, value2, "mdoyId");
            return (Criteria) this;
        }

        public Criteria andMdoyPidIsNull() {
            addCriterion("mdoy_pid is null");
            return (Criteria) this;
        }

        public Criteria andMdoyPidIsNotNull() {
            addCriterion("mdoy_pid is not null");
            return (Criteria) this;
        }

        public Criteria andMdoyPidEqualTo(Integer value) {
            addCriterion("mdoy_pid =", value, "mdoyPid");
            return (Criteria) this;
        }

        public Criteria andMdoyPidNotEqualTo(Integer value) {
            addCriterion("mdoy_pid <>", value, "mdoyPid");
            return (Criteria) this;
        }

        public Criteria andMdoyPidGreaterThan(Integer value) {
            addCriterion("mdoy_pid >", value, "mdoyPid");
            return (Criteria) this;
        }

        public Criteria andMdoyPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mdoy_pid >=", value, "mdoyPid");
            return (Criteria) this;
        }

        public Criteria andMdoyPidLessThan(Integer value) {
            addCriterion("mdoy_pid <", value, "mdoyPid");
            return (Criteria) this;
        }

        public Criteria andMdoyPidLessThanOrEqualTo(Integer value) {
            addCriterion("mdoy_pid <=", value, "mdoyPid");
            return (Criteria) this;
        }

        public Criteria andMdoyPidIn(List<Integer> values) {
            addCriterion("mdoy_pid in", values, "mdoyPid");
            return (Criteria) this;
        }

        public Criteria andMdoyPidNotIn(List<Integer> values) {
            addCriterion("mdoy_pid not in", values, "mdoyPid");
            return (Criteria) this;
        }

        public Criteria andMdoyPidBetween(Integer value1, Integer value2) {
            addCriterion("mdoy_pid between", value1, value2, "mdoyPid");
            return (Criteria) this;
        }

        public Criteria andMdoyPidNotBetween(Integer value1, Integer value2) {
            addCriterion("mdoy_pid not between", value1, value2, "mdoyPid");
            return (Criteria) this;
        }

        public Criteria andMdoyNameIsNull() {
            addCriterion("mdoy_name is null");
            return (Criteria) this;
        }

        public Criteria andMdoyNameIsNotNull() {
            addCriterion("mdoy_name is not null");
            return (Criteria) this;
        }

        public Criteria andMdoyNameEqualTo(String value) {
            addCriterion("mdoy_name =", value, "mdoyName");
            return (Criteria) this;
        }

        public Criteria andMdoyNameNotEqualTo(String value) {
            addCriterion("mdoy_name <>", value, "mdoyName");
            return (Criteria) this;
        }

        public Criteria andMdoyNameGreaterThan(String value) {
            addCriterion("mdoy_name >", value, "mdoyName");
            return (Criteria) this;
        }

        public Criteria andMdoyNameGreaterThanOrEqualTo(String value) {
            addCriterion("mdoy_name >=", value, "mdoyName");
            return (Criteria) this;
        }

        public Criteria andMdoyNameLessThan(String value) {
            addCriterion("mdoy_name <", value, "mdoyName");
            return (Criteria) this;
        }

        public Criteria andMdoyNameLessThanOrEqualTo(String value) {
            addCriterion("mdoy_name <=", value, "mdoyName");
            return (Criteria) this;
        }

        public Criteria andMdoyNameLike(String value) {
            addCriterion("mdoy_name like", value, "mdoyName");
            return (Criteria) this;
        }

        public Criteria andMdoyNameNotLike(String value) {
            addCriterion("mdoy_name not like", value, "mdoyName");
            return (Criteria) this;
        }

        public Criteria andMdoyNameIn(List<String> values) {
            addCriterion("mdoy_name in", values, "mdoyName");
            return (Criteria) this;
        }

        public Criteria andMdoyNameNotIn(List<String> values) {
            addCriterion("mdoy_name not in", values, "mdoyName");
            return (Criteria) this;
        }

        public Criteria andMdoyNameBetween(String value1, String value2) {
            addCriterion("mdoy_name between", value1, value2, "mdoyName");
            return (Criteria) this;
        }

        public Criteria andMdoyNameNotBetween(String value1, String value2) {
            addCriterion("mdoy_name not between", value1, value2, "mdoyName");
            return (Criteria) this;
        }

        public Criteria andMdoyOrderIsNull() {
            addCriterion("mdoy_order is null");
            return (Criteria) this;
        }

        public Criteria andMdoyOrderIsNotNull() {
            addCriterion("mdoy_order is not null");
            return (Criteria) this;
        }

        public Criteria andMdoyOrderEqualTo(Integer value) {
            addCriterion("mdoy_order =", value, "mdoyOrder");
            return (Criteria) this;
        }

        public Criteria andMdoyOrderNotEqualTo(Integer value) {
            addCriterion("mdoy_order <>", value, "mdoyOrder");
            return (Criteria) this;
        }

        public Criteria andMdoyOrderGreaterThan(Integer value) {
            addCriterion("mdoy_order >", value, "mdoyOrder");
            return (Criteria) this;
        }

        public Criteria andMdoyOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("mdoy_order >=", value, "mdoyOrder");
            return (Criteria) this;
        }

        public Criteria andMdoyOrderLessThan(Integer value) {
            addCriterion("mdoy_order <", value, "mdoyOrder");
            return (Criteria) this;
        }

        public Criteria andMdoyOrderLessThanOrEqualTo(Integer value) {
            addCriterion("mdoy_order <=", value, "mdoyOrder");
            return (Criteria) this;
        }

        public Criteria andMdoyOrderIn(List<Integer> values) {
            addCriterion("mdoy_order in", values, "mdoyOrder");
            return (Criteria) this;
        }

        public Criteria andMdoyOrderNotIn(List<Integer> values) {
            addCriterion("mdoy_order not in", values, "mdoyOrder");
            return (Criteria) this;
        }

        public Criteria andMdoyOrderBetween(Integer value1, Integer value2) {
            addCriterion("mdoy_order between", value1, value2, "mdoyOrder");
            return (Criteria) this;
        }

        public Criteria andMdoyOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("mdoy_order not between", value1, value2, "mdoyOrder");
            return (Criteria) this;
        }

        public Criteria andMdoyUrlIsNull() {
            addCriterion("mdoy_url is null");
            return (Criteria) this;
        }

        public Criteria andMdoyUrlIsNotNull() {
            addCriterion("mdoy_url is not null");
            return (Criteria) this;
        }

        public Criteria andMdoyUrlEqualTo(String value) {
            addCriterion("mdoy_url =", value, "mdoyUrl");
            return (Criteria) this;
        }

        public Criteria andMdoyUrlNotEqualTo(String value) {
            addCriterion("mdoy_url <>", value, "mdoyUrl");
            return (Criteria) this;
        }

        public Criteria andMdoyUrlGreaterThan(String value) {
            addCriterion("mdoy_url >", value, "mdoyUrl");
            return (Criteria) this;
        }

        public Criteria andMdoyUrlGreaterThanOrEqualTo(String value) {
            addCriterion("mdoy_url >=", value, "mdoyUrl");
            return (Criteria) this;
        }

        public Criteria andMdoyUrlLessThan(String value) {
            addCriterion("mdoy_url <", value, "mdoyUrl");
            return (Criteria) this;
        }

        public Criteria andMdoyUrlLessThanOrEqualTo(String value) {
            addCriterion("mdoy_url <=", value, "mdoyUrl");
            return (Criteria) this;
        }

        public Criteria andMdoyUrlLike(String value) {
            addCriterion("mdoy_url like", value, "mdoyUrl");
            return (Criteria) this;
        }

        public Criteria andMdoyUrlNotLike(String value) {
            addCriterion("mdoy_url not like", value, "mdoyUrl");
            return (Criteria) this;
        }

        public Criteria andMdoyUrlIn(List<String> values) {
            addCriterion("mdoy_url in", values, "mdoyUrl");
            return (Criteria) this;
        }

        public Criteria andMdoyUrlNotIn(List<String> values) {
            addCriterion("mdoy_url not in", values, "mdoyUrl");
            return (Criteria) this;
        }

        public Criteria andMdoyUrlBetween(String value1, String value2) {
            addCriterion("mdoy_url between", value1, value2, "mdoyUrl");
            return (Criteria) this;
        }

        public Criteria andMdoyUrlNotBetween(String value1, String value2) {
            addCriterion("mdoy_url not between", value1, value2, "mdoyUrl");
            return (Criteria) this;
        }

        public Criteria andMdoyShowIsNull() {
            addCriterion("mdoy_show is null");
            return (Criteria) this;
        }

        public Criteria andMdoyShowIsNotNull() {
            addCriterion("mdoy_show is not null");
            return (Criteria) this;
        }

        public Criteria andMdoyShowEqualTo(Integer value) {
            addCriterion("mdoy_show =", value, "mdoyShow");
            return (Criteria) this;
        }

        public Criteria andMdoyShowNotEqualTo(Integer value) {
            addCriterion("mdoy_show <>", value, "mdoyShow");
            return (Criteria) this;
        }

        public Criteria andMdoyShowGreaterThan(Integer value) {
            addCriterion("mdoy_show >", value, "mdoyShow");
            return (Criteria) this;
        }

        public Criteria andMdoyShowGreaterThanOrEqualTo(Integer value) {
            addCriterion("mdoy_show >=", value, "mdoyShow");
            return (Criteria) this;
        }

        public Criteria andMdoyShowLessThan(Integer value) {
            addCriterion("mdoy_show <", value, "mdoyShow");
            return (Criteria) this;
        }

        public Criteria andMdoyShowLessThanOrEqualTo(Integer value) {
            addCriterion("mdoy_show <=", value, "mdoyShow");
            return (Criteria) this;
        }

        public Criteria andMdoyShowIn(List<Integer> values) {
            addCriterion("mdoy_show in", values, "mdoyShow");
            return (Criteria) this;
        }

        public Criteria andMdoyShowNotIn(List<Integer> values) {
            addCriterion("mdoy_show not in", values, "mdoyShow");
            return (Criteria) this;
        }

        public Criteria andMdoyShowBetween(Integer value1, Integer value2) {
            addCriterion("mdoy_show between", value1, value2, "mdoyShow");
            return (Criteria) this;
        }

        public Criteria andMdoyShowNotBetween(Integer value1, Integer value2) {
            addCriterion("mdoy_show not between", value1, value2, "mdoyShow");
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
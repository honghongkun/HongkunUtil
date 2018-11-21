package com.Hong.ssm.bean;

import java.util.ArrayList;
import java.util.List;

public class BasOrgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BasOrgExample() {
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

        public Criteria andOrgIdIsNull() {
            addCriterion("org_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNotNull() {
            addCriterion("org_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdEqualTo(Integer value) {
            addCriterion("org_id =", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotEqualTo(Integer value) {
            addCriterion("org_id <>", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThan(Integer value) {
            addCriterion("org_id >", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("org_id >=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThan(Integer value) {
            addCriterion("org_id <", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThanOrEqualTo(Integer value) {
            addCriterion("org_id <=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIn(List<Integer> values) {
            addCriterion("org_id in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotIn(List<Integer> values) {
            addCriterion("org_id not in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdBetween(Integer value1, Integer value2) {
            addCriterion("org_id between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("org_id not between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgPidIsNull() {
            addCriterion("org_pid is null");
            return (Criteria) this;
        }

        public Criteria andOrgPidIsNotNull() {
            addCriterion("org_pid is not null");
            return (Criteria) this;
        }

        public Criteria andOrgPidEqualTo(Integer value) {
            addCriterion("org_pid =", value, "orgPid");
            return (Criteria) this;
        }

        public Criteria andOrgPidNotEqualTo(Integer value) {
            addCriterion("org_pid <>", value, "orgPid");
            return (Criteria) this;
        }

        public Criteria andOrgPidGreaterThan(Integer value) {
            addCriterion("org_pid >", value, "orgPid");
            return (Criteria) this;
        }

        public Criteria andOrgPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("org_pid >=", value, "orgPid");
            return (Criteria) this;
        }

        public Criteria andOrgPidLessThan(Integer value) {
            addCriterion("org_pid <", value, "orgPid");
            return (Criteria) this;
        }

        public Criteria andOrgPidLessThanOrEqualTo(Integer value) {
            addCriterion("org_pid <=", value, "orgPid");
            return (Criteria) this;
        }

        public Criteria andOrgPidIn(List<Integer> values) {
            addCriterion("org_pid in", values, "orgPid");
            return (Criteria) this;
        }

        public Criteria andOrgPidNotIn(List<Integer> values) {
            addCriterion("org_pid not in", values, "orgPid");
            return (Criteria) this;
        }

        public Criteria andOrgPidBetween(Integer value1, Integer value2) {
            addCriterion("org_pid between", value1, value2, "orgPid");
            return (Criteria) this;
        }

        public Criteria andOrgPidNotBetween(Integer value1, Integer value2) {
            addCriterion("org_pid not between", value1, value2, "orgPid");
            return (Criteria) this;
        }

        public Criteria andOrgLevelIsNull() {
            addCriterion("org_level is null");
            return (Criteria) this;
        }

        public Criteria andOrgLevelIsNotNull() {
            addCriterion("org_level is not null");
            return (Criteria) this;
        }

        public Criteria andOrgLevelEqualTo(String value) {
            addCriterion("org_level =", value, "orgLevel");
            return (Criteria) this;
        }

        public Criteria andOrgLevelNotEqualTo(String value) {
            addCriterion("org_level <>", value, "orgLevel");
            return (Criteria) this;
        }

        public Criteria andOrgLevelGreaterThan(String value) {
            addCriterion("org_level >", value, "orgLevel");
            return (Criteria) this;
        }

        public Criteria andOrgLevelGreaterThanOrEqualTo(String value) {
            addCriterion("org_level >=", value, "orgLevel");
            return (Criteria) this;
        }

        public Criteria andOrgLevelLessThan(String value) {
            addCriterion("org_level <", value, "orgLevel");
            return (Criteria) this;
        }

        public Criteria andOrgLevelLessThanOrEqualTo(String value) {
            addCriterion("org_level <=", value, "orgLevel");
            return (Criteria) this;
        }

        public Criteria andOrgLevelLike(String value) {
            addCriterion("org_level like", value, "orgLevel");
            return (Criteria) this;
        }

        public Criteria andOrgLevelNotLike(String value) {
            addCriterion("org_level not like", value, "orgLevel");
            return (Criteria) this;
        }

        public Criteria andOrgLevelIn(List<String> values) {
            addCriterion("org_level in", values, "orgLevel");
            return (Criteria) this;
        }

        public Criteria andOrgLevelNotIn(List<String> values) {
            addCriterion("org_level not in", values, "orgLevel");
            return (Criteria) this;
        }

        public Criteria andOrgLevelBetween(String value1, String value2) {
            addCriterion("org_level between", value1, value2, "orgLevel");
            return (Criteria) this;
        }

        public Criteria andOrgLevelNotBetween(String value1, String value2) {
            addCriterion("org_level not between", value1, value2, "orgLevel");
            return (Criteria) this;
        }

        public Criteria andOrgNameIsNull() {
            addCriterion("org_name is null");
            return (Criteria) this;
        }

        public Criteria andOrgNameIsNotNull() {
            addCriterion("org_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrgNameEqualTo(String value) {
            addCriterion("org_name =", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotEqualTo(String value) {
            addCriterion("org_name <>", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThan(String value) {
            addCriterion("org_name >", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThanOrEqualTo(String value) {
            addCriterion("org_name >=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThan(String value) {
            addCriterion("org_name <", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThanOrEqualTo(String value) {
            addCriterion("org_name <=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLike(String value) {
            addCriterion("org_name like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotLike(String value) {
            addCriterion("org_name not like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameIn(List<String> values) {
            addCriterion("org_name in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotIn(List<String> values) {
            addCriterion("org_name not in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameBetween(String value1, String value2) {
            addCriterion("org_name between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotBetween(String value1, String value2) {
            addCriterion("org_name not between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgCodebystuIsNull() {
            addCriterion("org_codeBystu is null");
            return (Criteria) this;
        }

        public Criteria andOrgCodebystuIsNotNull() {
            addCriterion("org_codeBystu is not null");
            return (Criteria) this;
        }

        public Criteria andOrgCodebystuEqualTo(Integer value) {
            addCriterion("org_codeBystu =", value, "orgCodebystu");
            return (Criteria) this;
        }

        public Criteria andOrgCodebystuNotEqualTo(Integer value) {
            addCriterion("org_codeBystu <>", value, "orgCodebystu");
            return (Criteria) this;
        }

        public Criteria andOrgCodebystuGreaterThan(Integer value) {
            addCriterion("org_codeBystu >", value, "orgCodebystu");
            return (Criteria) this;
        }

        public Criteria andOrgCodebystuGreaterThanOrEqualTo(Integer value) {
            addCriterion("org_codeBystu >=", value, "orgCodebystu");
            return (Criteria) this;
        }

        public Criteria andOrgCodebystuLessThan(Integer value) {
            addCriterion("org_codeBystu <", value, "orgCodebystu");
            return (Criteria) this;
        }

        public Criteria andOrgCodebystuLessThanOrEqualTo(Integer value) {
            addCriterion("org_codeBystu <=", value, "orgCodebystu");
            return (Criteria) this;
        }

        public Criteria andOrgCodebystuIn(List<Integer> values) {
            addCriterion("org_codeBystu in", values, "orgCodebystu");
            return (Criteria) this;
        }

        public Criteria andOrgCodebystuNotIn(List<Integer> values) {
            addCriterion("org_codeBystu not in", values, "orgCodebystu");
            return (Criteria) this;
        }

        public Criteria andOrgCodebystuBetween(Integer value1, Integer value2) {
            addCriterion("org_codeBystu between", value1, value2, "orgCodebystu");
            return (Criteria) this;
        }

        public Criteria andOrgCodebystuNotBetween(Integer value1, Integer value2) {
            addCriterion("org_codeBystu not between", value1, value2, "orgCodebystu");
            return (Criteria) this;
        }

        public Criteria andOrgStatusIsNull() {
            addCriterion("org_status is null");
            return (Criteria) this;
        }

        public Criteria andOrgStatusIsNotNull() {
            addCriterion("org_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrgStatusEqualTo(Integer value) {
            addCriterion("org_status =", value, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgStatusNotEqualTo(Integer value) {
            addCriterion("org_status <>", value, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgStatusGreaterThan(Integer value) {
            addCriterion("org_status >", value, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("org_status >=", value, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgStatusLessThan(Integer value) {
            addCriterion("org_status <", value, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgStatusLessThanOrEqualTo(Integer value) {
            addCriterion("org_status <=", value, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgStatusIn(List<Integer> values) {
            addCriterion("org_status in", values, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgStatusNotIn(List<Integer> values) {
            addCriterion("org_status not in", values, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgStatusBetween(Integer value1, Integer value2) {
            addCriterion("org_status between", value1, value2, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("org_status not between", value1, value2, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andDelflagIsNull() {
            addCriterion("delflag is null");
            return (Criteria) this;
        }

        public Criteria andDelflagIsNotNull() {
            addCriterion("delflag is not null");
            return (Criteria) this;
        }

        public Criteria andDelflagEqualTo(Integer value) {
            addCriterion("delflag =", value, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagNotEqualTo(Integer value) {
            addCriterion("delflag <>", value, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagGreaterThan(Integer value) {
            addCriterion("delflag >", value, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagGreaterThanOrEqualTo(Integer value) {
            addCriterion("delflag >=", value, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagLessThan(Integer value) {
            addCriterion("delflag <", value, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagLessThanOrEqualTo(Integer value) {
            addCriterion("delflag <=", value, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagIn(List<Integer> values) {
            addCriterion("delflag in", values, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagNotIn(List<Integer> values) {
            addCriterion("delflag not in", values, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagBetween(Integer value1, Integer value2) {
            addCriterion("delflag between", value1, value2, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagNotBetween(Integer value1, Integer value2) {
            addCriterion("delflag not between", value1, value2, "delflag");
            return (Criteria) this;
        }

        public Criteria andOrgInfoIsNull() {
            addCriterion("org_info is null");
            return (Criteria) this;
        }

        public Criteria andOrgInfoIsNotNull() {
            addCriterion("org_info is not null");
            return (Criteria) this;
        }

        public Criteria andOrgInfoEqualTo(String value) {
            addCriterion("org_info =", value, "orgInfo");
            return (Criteria) this;
        }

        public Criteria andOrgInfoNotEqualTo(String value) {
            addCriterion("org_info <>", value, "orgInfo");
            return (Criteria) this;
        }

        public Criteria andOrgInfoGreaterThan(String value) {
            addCriterion("org_info >", value, "orgInfo");
            return (Criteria) this;
        }

        public Criteria andOrgInfoGreaterThanOrEqualTo(String value) {
            addCriterion("org_info >=", value, "orgInfo");
            return (Criteria) this;
        }

        public Criteria andOrgInfoLessThan(String value) {
            addCriterion("org_info <", value, "orgInfo");
            return (Criteria) this;
        }

        public Criteria andOrgInfoLessThanOrEqualTo(String value) {
            addCriterion("org_info <=", value, "orgInfo");
            return (Criteria) this;
        }

        public Criteria andOrgInfoLike(String value) {
            addCriterion("org_info like", value, "orgInfo");
            return (Criteria) this;
        }

        public Criteria andOrgInfoNotLike(String value) {
            addCriterion("org_info not like", value, "orgInfo");
            return (Criteria) this;
        }

        public Criteria andOrgInfoIn(List<String> values) {
            addCriterion("org_info in", values, "orgInfo");
            return (Criteria) this;
        }

        public Criteria andOrgInfoNotIn(List<String> values) {
            addCriterion("org_info not in", values, "orgInfo");
            return (Criteria) this;
        }

        public Criteria andOrgInfoBetween(String value1, String value2) {
            addCriterion("org_info between", value1, value2, "orgInfo");
            return (Criteria) this;
        }

        public Criteria andOrgInfoNotBetween(String value1, String value2) {
            addCriterion("org_info not between", value1, value2, "orgInfo");
            return (Criteria) this;
        }

        public Criteria andCuidIsNull() {
            addCriterion("cuid is null");
            return (Criteria) this;
        }

        public Criteria andCuidIsNotNull() {
            addCriterion("cuid is not null");
            return (Criteria) this;
        }

        public Criteria andCuidEqualTo(String value) {
            addCriterion("cuid =", value, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidNotEqualTo(String value) {
            addCriterion("cuid <>", value, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidGreaterThan(String value) {
            addCriterion("cuid >", value, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidGreaterThanOrEqualTo(String value) {
            addCriterion("cuid >=", value, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidLessThan(String value) {
            addCriterion("cuid <", value, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidLessThanOrEqualTo(String value) {
            addCriterion("cuid <=", value, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidLike(String value) {
            addCriterion("cuid like", value, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidNotLike(String value) {
            addCriterion("cuid not like", value, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidIn(List<String> values) {
            addCriterion("cuid in", values, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidNotIn(List<String> values) {
            addCriterion("cuid not in", values, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidBetween(String value1, String value2) {
            addCriterion("cuid between", value1, value2, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidNotBetween(String value1, String value2) {
            addCriterion("cuid not between", value1, value2, "cuid");
            return (Criteria) this;
        }

        public Criteria andCudateIsNull() {
            addCriterion("cudate is null");
            return (Criteria) this;
        }

        public Criteria andCudateIsNotNull() {
            addCriterion("cudate is not null");
            return (Criteria) this;
        }

        public Criteria andCudateEqualTo(String value) {
            addCriterion("cudate =", value, "cudate");
            return (Criteria) this;
        }

        public Criteria andCudateNotEqualTo(String value) {
            addCriterion("cudate <>", value, "cudate");
            return (Criteria) this;
        }

        public Criteria andCudateGreaterThan(String value) {
            addCriterion("cudate >", value, "cudate");
            return (Criteria) this;
        }

        public Criteria andCudateGreaterThanOrEqualTo(String value) {
            addCriterion("cudate >=", value, "cudate");
            return (Criteria) this;
        }

        public Criteria andCudateLessThan(String value) {
            addCriterion("cudate <", value, "cudate");
            return (Criteria) this;
        }

        public Criteria andCudateLessThanOrEqualTo(String value) {
            addCriterion("cudate <=", value, "cudate");
            return (Criteria) this;
        }

        public Criteria andCudateLike(String value) {
            addCriterion("cudate like", value, "cudate");
            return (Criteria) this;
        }

        public Criteria andCudateNotLike(String value) {
            addCriterion("cudate not like", value, "cudate");
            return (Criteria) this;
        }

        public Criteria andCudateIn(List<String> values) {
            addCriterion("cudate in", values, "cudate");
            return (Criteria) this;
        }

        public Criteria andCudateNotIn(List<String> values) {
            addCriterion("cudate not in", values, "cudate");
            return (Criteria) this;
        }

        public Criteria andCudateBetween(String value1, String value2) {
            addCriterion("cudate between", value1, value2, "cudate");
            return (Criteria) this;
        }

        public Criteria andCudateNotBetween(String value1, String value2) {
            addCriterion("cudate not between", value1, value2, "cudate");
            return (Criteria) this;
        }

        public Criteria andEuidIsNull() {
            addCriterion("euid is null");
            return (Criteria) this;
        }

        public Criteria andEuidIsNotNull() {
            addCriterion("euid is not null");
            return (Criteria) this;
        }

        public Criteria andEuidEqualTo(String value) {
            addCriterion("euid =", value, "euid");
            return (Criteria) this;
        }

        public Criteria andEuidNotEqualTo(String value) {
            addCriterion("euid <>", value, "euid");
            return (Criteria) this;
        }

        public Criteria andEuidGreaterThan(String value) {
            addCriterion("euid >", value, "euid");
            return (Criteria) this;
        }

        public Criteria andEuidGreaterThanOrEqualTo(String value) {
            addCriterion("euid >=", value, "euid");
            return (Criteria) this;
        }

        public Criteria andEuidLessThan(String value) {
            addCriterion("euid <", value, "euid");
            return (Criteria) this;
        }

        public Criteria andEuidLessThanOrEqualTo(String value) {
            addCriterion("euid <=", value, "euid");
            return (Criteria) this;
        }

        public Criteria andEuidLike(String value) {
            addCriterion("euid like", value, "euid");
            return (Criteria) this;
        }

        public Criteria andEuidNotLike(String value) {
            addCriterion("euid not like", value, "euid");
            return (Criteria) this;
        }

        public Criteria andEuidIn(List<String> values) {
            addCriterion("euid in", values, "euid");
            return (Criteria) this;
        }

        public Criteria andEuidNotIn(List<String> values) {
            addCriterion("euid not in", values, "euid");
            return (Criteria) this;
        }

        public Criteria andEuidBetween(String value1, String value2) {
            addCriterion("euid between", value1, value2, "euid");
            return (Criteria) this;
        }

        public Criteria andEuidNotBetween(String value1, String value2) {
            addCriterion("euid not between", value1, value2, "euid");
            return (Criteria) this;
        }

        public Criteria andEudateIsNull() {
            addCriterion("eudate is null");
            return (Criteria) this;
        }

        public Criteria andEudateIsNotNull() {
            addCriterion("eudate is not null");
            return (Criteria) this;
        }

        public Criteria andEudateEqualTo(String value) {
            addCriterion("eudate =", value, "eudate");
            return (Criteria) this;
        }

        public Criteria andEudateNotEqualTo(String value) {
            addCriterion("eudate <>", value, "eudate");
            return (Criteria) this;
        }

        public Criteria andEudateGreaterThan(String value) {
            addCriterion("eudate >", value, "eudate");
            return (Criteria) this;
        }

        public Criteria andEudateGreaterThanOrEqualTo(String value) {
            addCriterion("eudate >=", value, "eudate");
            return (Criteria) this;
        }

        public Criteria andEudateLessThan(String value) {
            addCriterion("eudate <", value, "eudate");
            return (Criteria) this;
        }

        public Criteria andEudateLessThanOrEqualTo(String value) {
            addCriterion("eudate <=", value, "eudate");
            return (Criteria) this;
        }

        public Criteria andEudateLike(String value) {
            addCriterion("eudate like", value, "eudate");
            return (Criteria) this;
        }

        public Criteria andEudateNotLike(String value) {
            addCriterion("eudate not like", value, "eudate");
            return (Criteria) this;
        }

        public Criteria andEudateIn(List<String> values) {
            addCriterion("eudate in", values, "eudate");
            return (Criteria) this;
        }

        public Criteria andEudateNotIn(List<String> values) {
            addCriterion("eudate not in", values, "eudate");
            return (Criteria) this;
        }

        public Criteria andEudateBetween(String value1, String value2) {
            addCriterion("eudate between", value1, value2, "eudate");
            return (Criteria) this;
        }

        public Criteria andEudateNotBetween(String value1, String value2) {
            addCriterion("eudate not between", value1, value2, "eudate");
            return (Criteria) this;
        }

        public Criteria andOrgDepartmentIsNull() {
            addCriterion("org_department is null");
            return (Criteria) this;
        }

        public Criteria andOrgDepartmentIsNotNull() {
            addCriterion("org_department is not null");
            return (Criteria) this;
        }

        public Criteria andOrgDepartmentEqualTo(String value) {
            addCriterion("org_department =", value, "orgDepartment");
            return (Criteria) this;
        }

        public Criteria andOrgDepartmentNotEqualTo(String value) {
            addCriterion("org_department <>", value, "orgDepartment");
            return (Criteria) this;
        }

        public Criteria andOrgDepartmentGreaterThan(String value) {
            addCriterion("org_department >", value, "orgDepartment");
            return (Criteria) this;
        }

        public Criteria andOrgDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("org_department >=", value, "orgDepartment");
            return (Criteria) this;
        }

        public Criteria andOrgDepartmentLessThan(String value) {
            addCriterion("org_department <", value, "orgDepartment");
            return (Criteria) this;
        }

        public Criteria andOrgDepartmentLessThanOrEqualTo(String value) {
            addCriterion("org_department <=", value, "orgDepartment");
            return (Criteria) this;
        }

        public Criteria andOrgDepartmentLike(String value) {
            addCriterion("org_department like", value, "orgDepartment");
            return (Criteria) this;
        }

        public Criteria andOrgDepartmentNotLike(String value) {
            addCriterion("org_department not like", value, "orgDepartment");
            return (Criteria) this;
        }

        public Criteria andOrgDepartmentIn(List<String> values) {
            addCriterion("org_department in", values, "orgDepartment");
            return (Criteria) this;
        }

        public Criteria andOrgDepartmentNotIn(List<String> values) {
            addCriterion("org_department not in", values, "orgDepartment");
            return (Criteria) this;
        }

        public Criteria andOrgDepartmentBetween(String value1, String value2) {
            addCriterion("org_department between", value1, value2, "orgDepartment");
            return (Criteria) this;
        }

        public Criteria andOrgDepartmentNotBetween(String value1, String value2) {
            addCriterion("org_department not between", value1, value2, "orgDepartment");
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
package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class StaffExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StaffExample() {
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

        public Criteria andStaffidIsNull() {
            addCriterion("staffId is null");
            return (Criteria) this;
        }

        public Criteria andStaffidIsNotNull() {
            addCriterion("staffId is not null");
            return (Criteria) this;
        }

        public Criteria andStaffidEqualTo(String value) {
            addCriterion("staffId =", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidNotEqualTo(String value) {
            addCriterion("staffId <>", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidGreaterThan(String value) {
            addCriterion("staffId >", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidGreaterThanOrEqualTo(String value) {
            addCriterion("staffId >=", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidLessThan(String value) {
            addCriterion("staffId <", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidLessThanOrEqualTo(String value) {
            addCriterion("staffId <=", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidLike(String value) {
            addCriterion("staffId like", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidNotLike(String value) {
            addCriterion("staffId not like", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidIn(List<String> values) {
            addCriterion("staffId in", values, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidNotIn(List<String> values) {
            addCriterion("staffId not in", values, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidBetween(String value1, String value2) {
            addCriterion("staffId between", value1, value2, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidNotBetween(String value1, String value2) {
            addCriterion("staffId not between", value1, value2, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffnameIsNull() {
            addCriterion("staffName is null");
            return (Criteria) this;
        }

        public Criteria andStaffnameIsNotNull() {
            addCriterion("staffName is not null");
            return (Criteria) this;
        }

        public Criteria andStaffnameEqualTo(String value) {
            addCriterion("staffName =", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameNotEqualTo(String value) {
            addCriterion("staffName <>", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameGreaterThan(String value) {
            addCriterion("staffName >", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameGreaterThanOrEqualTo(String value) {
            addCriterion("staffName >=", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameLessThan(String value) {
            addCriterion("staffName <", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameLessThanOrEqualTo(String value) {
            addCriterion("staffName <=", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameLike(String value) {
            addCriterion("staffName like", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameNotLike(String value) {
            addCriterion("staffName not like", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameIn(List<String> values) {
            addCriterion("staffName in", values, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameNotIn(List<String> values) {
            addCriterion("staffName not in", values, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameBetween(String value1, String value2) {
            addCriterion("staffName between", value1, value2, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameNotBetween(String value1, String value2) {
            addCriterion("staffName not between", value1, value2, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffpwdIsNull() {
            addCriterion("staffpwd is null");
            return (Criteria) this;
        }

        public Criteria andStaffpwdIsNotNull() {
            addCriterion("staffpwd is not null");
            return (Criteria) this;
        }

        public Criteria andStaffpwdEqualTo(String value) {
            addCriterion("staffpwd =", value, "staffpwd");
            return (Criteria) this;
        }

        public Criteria andStaffpwdNotEqualTo(String value) {
            addCriterion("staffpwd <>", value, "staffpwd");
            return (Criteria) this;
        }

        public Criteria andStaffpwdGreaterThan(String value) {
            addCriterion("staffpwd >", value, "staffpwd");
            return (Criteria) this;
        }

        public Criteria andStaffpwdGreaterThanOrEqualTo(String value) {
            addCriterion("staffpwd >=", value, "staffpwd");
            return (Criteria) this;
        }

        public Criteria andStaffpwdLessThan(String value) {
            addCriterion("staffpwd <", value, "staffpwd");
            return (Criteria) this;
        }

        public Criteria andStaffpwdLessThanOrEqualTo(String value) {
            addCriterion("staffpwd <=", value, "staffpwd");
            return (Criteria) this;
        }

        public Criteria andStaffpwdLike(String value) {
            addCriterion("staffpwd like", value, "staffpwd");
            return (Criteria) this;
        }

        public Criteria andStaffpwdNotLike(String value) {
            addCriterion("staffpwd not like", value, "staffpwd");
            return (Criteria) this;
        }

        public Criteria andStaffpwdIn(List<String> values) {
            addCriterion("staffpwd in", values, "staffpwd");
            return (Criteria) this;
        }

        public Criteria andStaffpwdNotIn(List<String> values) {
            addCriterion("staffpwd not in", values, "staffpwd");
            return (Criteria) this;
        }

        public Criteria andStaffpwdBetween(String value1, String value2) {
            addCriterion("staffpwd between", value1, value2, "staffpwd");
            return (Criteria) this;
        }

        public Criteria andStaffpwdNotBetween(String value1, String value2) {
            addCriterion("staffpwd not between", value1, value2, "staffpwd");
            return (Criteria) this;
        }

        public Criteria andStaffphoneIsNull() {
            addCriterion("staffPhone is null");
            return (Criteria) this;
        }

        public Criteria andStaffphoneIsNotNull() {
            addCriterion("staffPhone is not null");
            return (Criteria) this;
        }

        public Criteria andStaffphoneEqualTo(String value) {
            addCriterion("staffPhone =", value, "staffphone");
            return (Criteria) this;
        }

        public Criteria andStaffphoneNotEqualTo(String value) {
            addCriterion("staffPhone <>", value, "staffphone");
            return (Criteria) this;
        }

        public Criteria andStaffphoneGreaterThan(String value) {
            addCriterion("staffPhone >", value, "staffphone");
            return (Criteria) this;
        }

        public Criteria andStaffphoneGreaterThanOrEqualTo(String value) {
            addCriterion("staffPhone >=", value, "staffphone");
            return (Criteria) this;
        }

        public Criteria andStaffphoneLessThan(String value) {
            addCriterion("staffPhone <", value, "staffphone");
            return (Criteria) this;
        }

        public Criteria andStaffphoneLessThanOrEqualTo(String value) {
            addCriterion("staffPhone <=", value, "staffphone");
            return (Criteria) this;
        }

        public Criteria andStaffphoneLike(String value) {
            addCriterion("staffPhone like", value, "staffphone");
            return (Criteria) this;
        }

        public Criteria andStaffphoneNotLike(String value) {
            addCriterion("staffPhone not like", value, "staffphone");
            return (Criteria) this;
        }

        public Criteria andStaffphoneIn(List<String> values) {
            addCriterion("staffPhone in", values, "staffphone");
            return (Criteria) this;
        }

        public Criteria andStaffphoneNotIn(List<String> values) {
            addCriterion("staffPhone not in", values, "staffphone");
            return (Criteria) this;
        }

        public Criteria andStaffphoneBetween(String value1, String value2) {
            addCriterion("staffPhone between", value1, value2, "staffphone");
            return (Criteria) this;
        }

        public Criteria andStaffphoneNotBetween(String value1, String value2) {
            addCriterion("staffPhone not between", value1, value2, "staffphone");
            return (Criteria) this;
        }

        public Criteria andStafftimeIsNull() {
            addCriterion("staffTime is null");
            return (Criteria) this;
        }

        public Criteria andStafftimeIsNotNull() {
            addCriterion("staffTime is not null");
            return (Criteria) this;
        }

        public Criteria andStafftimeEqualTo(String value) {
            addCriterion("staffTime =", value, "stafftime");
            return (Criteria) this;
        }

        public Criteria andStafftimeNotEqualTo(String value) {
            addCriterion("staffTime <>", value, "stafftime");
            return (Criteria) this;
        }

        public Criteria andStafftimeGreaterThan(String value) {
            addCriterion("staffTime >", value, "stafftime");
            return (Criteria) this;
        }

        public Criteria andStafftimeGreaterThanOrEqualTo(String value) {
            addCriterion("staffTime >=", value, "stafftime");
            return (Criteria) this;
        }

        public Criteria andStafftimeLessThan(String value) {
            addCriterion("staffTime <", value, "stafftime");
            return (Criteria) this;
        }

        public Criteria andStafftimeLessThanOrEqualTo(String value) {
            addCriterion("staffTime <=", value, "stafftime");
            return (Criteria) this;
        }

        public Criteria andStafftimeLike(String value) {
            addCriterion("staffTime like", value, "stafftime");
            return (Criteria) this;
        }

        public Criteria andStafftimeNotLike(String value) {
            addCriterion("staffTime not like", value, "stafftime");
            return (Criteria) this;
        }

        public Criteria andStafftimeIn(List<String> values) {
            addCriterion("staffTime in", values, "stafftime");
            return (Criteria) this;
        }

        public Criteria andStafftimeNotIn(List<String> values) {
            addCriterion("staffTime not in", values, "stafftime");
            return (Criteria) this;
        }

        public Criteria andStafftimeBetween(String value1, String value2) {
            addCriterion("staffTime between", value1, value2, "stafftime");
            return (Criteria) this;
        }

        public Criteria andStafftimeNotBetween(String value1, String value2) {
            addCriterion("staffTime not between", value1, value2, "stafftime");
            return (Criteria) this;
        }

        public Criteria andHeadportraitIsNull() {
            addCriterion("headPortrait is null");
            return (Criteria) this;
        }

        public Criteria andHeadportraitIsNotNull() {
            addCriterion("headPortrait is not null");
            return (Criteria) this;
        }

        public Criteria andHeadportraitEqualTo(String value) {
            addCriterion("headPortrait =", value, "headportrait");
            return (Criteria) this;
        }

        public Criteria andHeadportraitNotEqualTo(String value) {
            addCriterion("headPortrait <>", value, "headportrait");
            return (Criteria) this;
        }

        public Criteria andHeadportraitGreaterThan(String value) {
            addCriterion("headPortrait >", value, "headportrait");
            return (Criteria) this;
        }

        public Criteria andHeadportraitGreaterThanOrEqualTo(String value) {
            addCriterion("headPortrait >=", value, "headportrait");
            return (Criteria) this;
        }

        public Criteria andHeadportraitLessThan(String value) {
            addCriterion("headPortrait <", value, "headportrait");
            return (Criteria) this;
        }

        public Criteria andHeadportraitLessThanOrEqualTo(String value) {
            addCriterion("headPortrait <=", value, "headportrait");
            return (Criteria) this;
        }

        public Criteria andHeadportraitLike(String value) {
            addCriterion("headPortrait like", value, "headportrait");
            return (Criteria) this;
        }

        public Criteria andHeadportraitNotLike(String value) {
            addCriterion("headPortrait not like", value, "headportrait");
            return (Criteria) this;
        }

        public Criteria andHeadportraitIn(List<String> values) {
            addCriterion("headPortrait in", values, "headportrait");
            return (Criteria) this;
        }

        public Criteria andHeadportraitNotIn(List<String> values) {
            addCriterion("headPortrait not in", values, "headportrait");
            return (Criteria) this;
        }

        public Criteria andHeadportraitBetween(String value1, String value2) {
            addCriterion("headPortrait between", value1, value2, "headportrait");
            return (Criteria) this;
        }

        public Criteria andHeadportraitNotBetween(String value1, String value2) {
            addCriterion("headPortrait not between", value1, value2, "headportrait");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNull() {
            addCriterion("industry is null");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNotNull() {
            addCriterion("industry is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryEqualTo(String value) {
            addCriterion("industry =", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotEqualTo(String value) {
            addCriterion("industry <>", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThan(String value) {
            addCriterion("industry >", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThanOrEqualTo(String value) {
            addCriterion("industry >=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThan(String value) {
            addCriterion("industry <", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThanOrEqualTo(String value) {
            addCriterion("industry <=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLike(String value) {
            addCriterion("industry like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotLike(String value) {
            addCriterion("industry not like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryIn(List<String> values) {
            addCriterion("industry in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotIn(List<String> values) {
            addCriterion("industry not in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryBetween(String value1, String value2) {
            addCriterion("industry between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotBetween(String value1, String value2) {
            addCriterion("industry not between", value1, value2, "industry");
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
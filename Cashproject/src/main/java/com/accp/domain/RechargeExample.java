package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RechargeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RechargeExample() {
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

        public Criteria andRechargeidIsNull() {
            addCriterion("rechargeID is null");
            return (Criteria) this;
        }

        public Criteria andRechargeidIsNotNull() {
            addCriterion("rechargeID is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeidEqualTo(Integer value) {
            addCriterion("rechargeID =", value, "rechargeid");
            return (Criteria) this;
        }

        public Criteria andRechargeidNotEqualTo(Integer value) {
            addCriterion("rechargeID <>", value, "rechargeid");
            return (Criteria) this;
        }

        public Criteria andRechargeidGreaterThan(Integer value) {
            addCriterion("rechargeID >", value, "rechargeid");
            return (Criteria) this;
        }

        public Criteria andRechargeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rechargeID >=", value, "rechargeid");
            return (Criteria) this;
        }

        public Criteria andRechargeidLessThan(Integer value) {
            addCriterion("rechargeID <", value, "rechargeid");
            return (Criteria) this;
        }

        public Criteria andRechargeidLessThanOrEqualTo(Integer value) {
            addCriterion("rechargeID <=", value, "rechargeid");
            return (Criteria) this;
        }

        public Criteria andRechargeidIn(List<Integer> values) {
            addCriterion("rechargeID in", values, "rechargeid");
            return (Criteria) this;
        }

        public Criteria andRechargeidNotIn(List<Integer> values) {
            addCriterion("rechargeID not in", values, "rechargeid");
            return (Criteria) this;
        }

        public Criteria andRechargeidBetween(Integer value1, Integer value2) {
            addCriterion("rechargeID between", value1, value2, "rechargeid");
            return (Criteria) this;
        }

        public Criteria andRechargeidNotBetween(Integer value1, Integer value2) {
            addCriterion("rechargeID not between", value1, value2, "rechargeid");
            return (Criteria) this;
        }

        public Criteria andRechargedateIsNull() {
            addCriterion("rechargeDate is null");
            return (Criteria) this;
        }

        public Criteria andRechargedateIsNotNull() {
            addCriterion("rechargeDate is not null");
            return (Criteria) this;
        }

        public Criteria andRechargedateEqualTo(Date value) {
            addCriterion("rechargeDate =", value, "rechargedate");
            return (Criteria) this;
        }

        public Criteria andRechargedateNotEqualTo(Date value) {
            addCriterion("rechargeDate <>", value, "rechargedate");
            return (Criteria) this;
        }

        public Criteria andRechargedateGreaterThan(Date value) {
            addCriterion("rechargeDate >", value, "rechargedate");
            return (Criteria) this;
        }

        public Criteria andRechargedateGreaterThanOrEqualTo(Date value) {
            addCriterion("rechargeDate >=", value, "rechargedate");
            return (Criteria) this;
        }

        public Criteria andRechargedateLessThan(Date value) {
            addCriterion("rechargeDate <", value, "rechargedate");
            return (Criteria) this;
        }

        public Criteria andRechargedateLessThanOrEqualTo(Date value) {
            addCriterion("rechargeDate <=", value, "rechargedate");
            return (Criteria) this;
        }

        public Criteria andRechargedateIn(List<Date> values) {
            addCriterion("rechargeDate in", values, "rechargedate");
            return (Criteria) this;
        }

        public Criteria andRechargedateNotIn(List<Date> values) {
            addCriterion("rechargeDate not in", values, "rechargedate");
            return (Criteria) this;
        }

        public Criteria andRechargedateBetween(Date value1, Date value2) {
            addCriterion("rechargeDate between", value1, value2, "rechargedate");
            return (Criteria) this;
        }

        public Criteria andRechargedateNotBetween(Date value1, Date value2) {
            addCriterion("rechargeDate not between", value1, value2, "rechargedate");
            return (Criteria) this;
        }

        public Criteria andWechatnumberIsNull() {
            addCriterion("weChatNumber is null");
            return (Criteria) this;
        }

        public Criteria andWechatnumberIsNotNull() {
            addCriterion("weChatNumber is not null");
            return (Criteria) this;
        }

        public Criteria andWechatnumberEqualTo(String value) {
            addCriterion("weChatNumber =", value, "wechatnumber");
            return (Criteria) this;
        }

        public Criteria andWechatnumberNotEqualTo(String value) {
            addCriterion("weChatNumber <>", value, "wechatnumber");
            return (Criteria) this;
        }

        public Criteria andWechatnumberGreaterThan(String value) {
            addCriterion("weChatNumber >", value, "wechatnumber");
            return (Criteria) this;
        }

        public Criteria andWechatnumberGreaterThanOrEqualTo(String value) {
            addCriterion("weChatNumber >=", value, "wechatnumber");
            return (Criteria) this;
        }

        public Criteria andWechatnumberLessThan(String value) {
            addCriterion("weChatNumber <", value, "wechatnumber");
            return (Criteria) this;
        }

        public Criteria andWechatnumberLessThanOrEqualTo(String value) {
            addCriterion("weChatNumber <=", value, "wechatnumber");
            return (Criteria) this;
        }

        public Criteria andWechatnumberLike(String value) {
            addCriterion("weChatNumber like", value, "wechatnumber");
            return (Criteria) this;
        }

        public Criteria andWechatnumberNotLike(String value) {
            addCriterion("weChatNumber not like", value, "wechatnumber");
            return (Criteria) this;
        }

        public Criteria andWechatnumberIn(List<String> values) {
            addCriterion("weChatNumber in", values, "wechatnumber");
            return (Criteria) this;
        }

        public Criteria andWechatnumberNotIn(List<String> values) {
            addCriterion("weChatNumber not in", values, "wechatnumber");
            return (Criteria) this;
        }

        public Criteria andWechatnumberBetween(String value1, String value2) {
            addCriterion("weChatNumber between", value1, value2, "wechatnumber");
            return (Criteria) this;
        }

        public Criteria andWechatnumberNotBetween(String value1, String value2) {
            addCriterion("weChatNumber not between", value1, value2, "wechatnumber");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("Phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("Phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("Phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("Phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("Phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("Phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("Phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("Phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("Phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("Phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("Phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("Phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("Phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("Phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andRechargeIsNull() {
            addCriterion("recharge is null");
            return (Criteria) this;
        }

        public Criteria andRechargeIsNotNull() {
            addCriterion("recharge is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeEqualTo(Float value) {
            addCriterion("recharge =", value, "recharge");
            return (Criteria) this;
        }

        public Criteria andRechargeNotEqualTo(Float value) {
            addCriterion("recharge <>", value, "recharge");
            return (Criteria) this;
        }

        public Criteria andRechargeGreaterThan(Float value) {
            addCriterion("recharge >", value, "recharge");
            return (Criteria) this;
        }

        public Criteria andRechargeGreaterThanOrEqualTo(Float value) {
            addCriterion("recharge >=", value, "recharge");
            return (Criteria) this;
        }

        public Criteria andRechargeLessThan(Float value) {
            addCriterion("recharge <", value, "recharge");
            return (Criteria) this;
        }

        public Criteria andRechargeLessThanOrEqualTo(Float value) {
            addCriterion("recharge <=", value, "recharge");
            return (Criteria) this;
        }

        public Criteria andRechargeIn(List<Float> values) {
            addCriterion("recharge in", values, "recharge");
            return (Criteria) this;
        }

        public Criteria andRechargeNotIn(List<Float> values) {
            addCriterion("recharge not in", values, "recharge");
            return (Criteria) this;
        }

        public Criteria andRechargeBetween(Float value1, Float value2) {
            addCriterion("recharge between", value1, value2, "recharge");
            return (Criteria) this;
        }

        public Criteria andRechargeNotBetween(Float value1, Float value2) {
            addCriterion("recharge not between", value1, value2, "recharge");
            return (Criteria) this;
        }

        public Criteria andGiveIsNull() {
            addCriterion("give is null");
            return (Criteria) this;
        }

        public Criteria andGiveIsNotNull() {
            addCriterion("give is not null");
            return (Criteria) this;
        }

        public Criteria andGiveEqualTo(Float value) {
            addCriterion("give =", value, "give");
            return (Criteria) this;
        }

        public Criteria andGiveNotEqualTo(Float value) {
            addCriterion("give <>", value, "give");
            return (Criteria) this;
        }

        public Criteria andGiveGreaterThan(Float value) {
            addCriterion("give >", value, "give");
            return (Criteria) this;
        }

        public Criteria andGiveGreaterThanOrEqualTo(Float value) {
            addCriterion("give >=", value, "give");
            return (Criteria) this;
        }

        public Criteria andGiveLessThan(Float value) {
            addCriterion("give <", value, "give");
            return (Criteria) this;
        }

        public Criteria andGiveLessThanOrEqualTo(Float value) {
            addCriterion("give <=", value, "give");
            return (Criteria) this;
        }

        public Criteria andGiveIn(List<Float> values) {
            addCriterion("give in", values, "give");
            return (Criteria) this;
        }

        public Criteria andGiveNotIn(List<Float> values) {
            addCriterion("give not in", values, "give");
            return (Criteria) this;
        }

        public Criteria andGiveBetween(Float value1, Float value2) {
            addCriterion("give between", value1, value2, "give");
            return (Criteria) this;
        }

        public Criteria andGiveNotBetween(Float value1, Float value2) {
            addCriterion("give not between", value1, value2, "give");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNull() {
            addCriterion("balance is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("balance is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(Float value) {
            addCriterion("balance =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(Float value) {
            addCriterion("balance <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(Float value) {
            addCriterion("balance >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(Float value) {
            addCriterion("balance >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(Float value) {
            addCriterion("balance <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(Float value) {
            addCriterion("balance <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<Float> values) {
            addCriterion("balance in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<Float> values) {
            addCriterion("balance not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(Float value1, Float value2) {
            addCriterion("balance between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(Float value1, Float value2) {
            addCriterion("balance not between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andVidIsNull() {
            addCriterion("vid is null");
            return (Criteria) this;
        }

        public Criteria andVidIsNotNull() {
            addCriterion("vid is not null");
            return (Criteria) this;
        }

        public Criteria andVidEqualTo(Integer value) {
            addCriterion("vid =", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotEqualTo(Integer value) {
            addCriterion("vid <>", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidGreaterThan(Integer value) {
            addCriterion("vid >", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidGreaterThanOrEqualTo(Integer value) {
            addCriterion("vid >=", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidLessThan(Integer value) {
            addCriterion("vid <", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidLessThanOrEqualTo(Integer value) {
            addCriterion("vid <=", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidIn(List<Integer> values) {
            addCriterion("vid in", values, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotIn(List<Integer> values) {
            addCriterion("vid not in", values, "vid");
            return (Criteria) this;
        }

        public Criteria andVidBetween(Integer value1, Integer value2) {
            addCriterion("vid between", value1, value2, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotBetween(Integer value1, Integer value2) {
            addCriterion("vid not between", value1, value2, "vid");
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
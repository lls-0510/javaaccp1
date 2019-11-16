package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class ProductinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductinfoExample() {
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

        public Criteria andProidIsNull() {
            addCriterion("proid is null");
            return (Criteria) this;
        }

        public Criteria andProidIsNotNull() {
            addCriterion("proid is not null");
            return (Criteria) this;
        }

        public Criteria andProidEqualTo(Integer value) {
            addCriterion("proid =", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidNotEqualTo(Integer value) {
            addCriterion("proid <>", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidGreaterThan(Integer value) {
            addCriterion("proid >", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidGreaterThanOrEqualTo(Integer value) {
            addCriterion("proid >=", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidLessThan(Integer value) {
            addCriterion("proid <", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidLessThanOrEqualTo(Integer value) {
            addCriterion("proid <=", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidIn(List<Integer> values) {
            addCriterion("proid in", values, "proid");
            return (Criteria) this;
        }

        public Criteria andProidNotIn(List<Integer> values) {
            addCriterion("proid not in", values, "proid");
            return (Criteria) this;
        }

        public Criteria andProidBetween(Integer value1, Integer value2) {
            addCriterion("proid between", value1, value2, "proid");
            return (Criteria) this;
        }

        public Criteria andProidNotBetween(Integer value1, Integer value2) {
            addCriterion("proid not between", value1, value2, "proid");
            return (Criteria) this;
        }

        public Criteria andPronameIsNull() {
            addCriterion("proName is null");
            return (Criteria) this;
        }

        public Criteria andPronameIsNotNull() {
            addCriterion("proName is not null");
            return (Criteria) this;
        }

        public Criteria andPronameEqualTo(String value) {
            addCriterion("proName =", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotEqualTo(String value) {
            addCriterion("proName <>", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameGreaterThan(String value) {
            addCriterion("proName >", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameGreaterThanOrEqualTo(String value) {
            addCriterion("proName >=", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameLessThan(String value) {
            addCriterion("proName <", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameLessThanOrEqualTo(String value) {
            addCriterion("proName <=", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameLike(String value) {
            addCriterion("proName like", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotLike(String value) {
            addCriterion("proName not like", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameIn(List<String> values) {
            addCriterion("proName in", values, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotIn(List<String> values) {
            addCriterion("proName not in", values, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameBetween(String value1, String value2) {
            addCriterion("proName between", value1, value2, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotBetween(String value1, String value2) {
            addCriterion("proName not between", value1, value2, "proname");
            return (Criteria) this;
        }

        public Criteria andPropriceIsNull() {
            addCriterion("ProPrice is null");
            return (Criteria) this;
        }

        public Criteria andPropriceIsNotNull() {
            addCriterion("ProPrice is not null");
            return (Criteria) this;
        }

        public Criteria andPropriceEqualTo(Float value) {
            addCriterion("ProPrice =", value, "proprice");
            return (Criteria) this;
        }

        public Criteria andPropriceNotEqualTo(Float value) {
            addCriterion("ProPrice <>", value, "proprice");
            return (Criteria) this;
        }

        public Criteria andPropriceGreaterThan(Float value) {
            addCriterion("ProPrice >", value, "proprice");
            return (Criteria) this;
        }

        public Criteria andPropriceGreaterThanOrEqualTo(Float value) {
            addCriterion("ProPrice >=", value, "proprice");
            return (Criteria) this;
        }

        public Criteria andPropriceLessThan(Float value) {
            addCriterion("ProPrice <", value, "proprice");
            return (Criteria) this;
        }

        public Criteria andPropriceLessThanOrEqualTo(Float value) {
            addCriterion("ProPrice <=", value, "proprice");
            return (Criteria) this;
        }

        public Criteria andPropriceIn(List<Float> values) {
            addCriterion("ProPrice in", values, "proprice");
            return (Criteria) this;
        }

        public Criteria andPropriceNotIn(List<Float> values) {
            addCriterion("ProPrice not in", values, "proprice");
            return (Criteria) this;
        }

        public Criteria andPropriceBetween(Float value1, Float value2) {
            addCriterion("ProPrice between", value1, value2, "proprice");
            return (Criteria) this;
        }

        public Criteria andPropriceNotBetween(Float value1, Float value2) {
            addCriterion("ProPrice not between", value1, value2, "proprice");
            return (Criteria) this;
        }

        public Criteria andProsaletypeIsNull() {
            addCriterion("prosaleType is null");
            return (Criteria) this;
        }

        public Criteria andProsaletypeIsNotNull() {
            addCriterion("prosaleType is not null");
            return (Criteria) this;
        }

        public Criteria andProsaletypeEqualTo(Integer value) {
            addCriterion("prosaleType =", value, "prosaletype");
            return (Criteria) this;
        }

        public Criteria andProsaletypeNotEqualTo(Integer value) {
            addCriterion("prosaleType <>", value, "prosaletype");
            return (Criteria) this;
        }

        public Criteria andProsaletypeGreaterThan(Integer value) {
            addCriterion("prosaleType >", value, "prosaletype");
            return (Criteria) this;
        }

        public Criteria andProsaletypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("prosaleType >=", value, "prosaletype");
            return (Criteria) this;
        }

        public Criteria andProsaletypeLessThan(Integer value) {
            addCriterion("prosaleType <", value, "prosaletype");
            return (Criteria) this;
        }

        public Criteria andProsaletypeLessThanOrEqualTo(Integer value) {
            addCriterion("prosaleType <=", value, "prosaletype");
            return (Criteria) this;
        }

        public Criteria andProsaletypeIn(List<Integer> values) {
            addCriterion("prosaleType in", values, "prosaletype");
            return (Criteria) this;
        }

        public Criteria andProsaletypeNotIn(List<Integer> values) {
            addCriterion("prosaleType not in", values, "prosaletype");
            return (Criteria) this;
        }

        public Criteria andProsaletypeBetween(Integer value1, Integer value2) {
            addCriterion("prosaleType between", value1, value2, "prosaletype");
            return (Criteria) this;
        }

        public Criteria andProsaletypeNotBetween(Integer value1, Integer value2) {
            addCriterion("prosaleType not between", value1, value2, "prosaletype");
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
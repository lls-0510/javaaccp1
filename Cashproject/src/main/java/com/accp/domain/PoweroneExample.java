package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class PoweroneExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PoweroneExample() {
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

        public Criteria andJidIsNull() {
            addCriterion("Jid is null");
            return (Criteria) this;
        }

        public Criteria andJidIsNotNull() {
            addCriterion("Jid is not null");
            return (Criteria) this;
        }

        public Criteria andJidEqualTo(Integer value) {
            addCriterion("Jid =", value, "jid");
            return (Criteria) this;
        }

        public Criteria andJidNotEqualTo(Integer value) {
            addCriterion("Jid <>", value, "jid");
            return (Criteria) this;
        }

        public Criteria andJidGreaterThan(Integer value) {
            addCriterion("Jid >", value, "jid");
            return (Criteria) this;
        }

        public Criteria andJidGreaterThanOrEqualTo(Integer value) {
            addCriterion("Jid >=", value, "jid");
            return (Criteria) this;
        }

        public Criteria andJidLessThan(Integer value) {
            addCriterion("Jid <", value, "jid");
            return (Criteria) this;
        }

        public Criteria andJidLessThanOrEqualTo(Integer value) {
            addCriterion("Jid <=", value, "jid");
            return (Criteria) this;
        }

        public Criteria andJidIn(List<Integer> values) {
            addCriterion("Jid in", values, "jid");
            return (Criteria) this;
        }

        public Criteria andJidNotIn(List<Integer> values) {
            addCriterion("Jid not in", values, "jid");
            return (Criteria) this;
        }

        public Criteria andJidBetween(Integer value1, Integer value2) {
            addCriterion("Jid between", value1, value2, "jid");
            return (Criteria) this;
        }

        public Criteria andJidNotBetween(Integer value1, Integer value2) {
            addCriterion("Jid not between", value1, value2, "jid");
            return (Criteria) this;
        }

        public Criteria andJurisdictionnameIsNull() {
            addCriterion("JurisdictionName is null");
            return (Criteria) this;
        }

        public Criteria andJurisdictionnameIsNotNull() {
            addCriterion("JurisdictionName is not null");
            return (Criteria) this;
        }

        public Criteria andJurisdictionnameEqualTo(String value) {
            addCriterion("JurisdictionName =", value, "jurisdictionname");
            return (Criteria) this;
        }

        public Criteria andJurisdictionnameNotEqualTo(String value) {
            addCriterion("JurisdictionName <>", value, "jurisdictionname");
            return (Criteria) this;
        }

        public Criteria andJurisdictionnameGreaterThan(String value) {
            addCriterion("JurisdictionName >", value, "jurisdictionname");
            return (Criteria) this;
        }

        public Criteria andJurisdictionnameGreaterThanOrEqualTo(String value) {
            addCriterion("JurisdictionName >=", value, "jurisdictionname");
            return (Criteria) this;
        }

        public Criteria andJurisdictionnameLessThan(String value) {
            addCriterion("JurisdictionName <", value, "jurisdictionname");
            return (Criteria) this;
        }

        public Criteria andJurisdictionnameLessThanOrEqualTo(String value) {
            addCriterion("JurisdictionName <=", value, "jurisdictionname");
            return (Criteria) this;
        }

        public Criteria andJurisdictionnameLike(String value) {
            addCriterion("JurisdictionName like", value, "jurisdictionname");
            return (Criteria) this;
        }

        public Criteria andJurisdictionnameNotLike(String value) {
            addCriterion("JurisdictionName not like", value, "jurisdictionname");
            return (Criteria) this;
        }

        public Criteria andJurisdictionnameIn(List<String> values) {
            addCriterion("JurisdictionName in", values, "jurisdictionname");
            return (Criteria) this;
        }

        public Criteria andJurisdictionnameNotIn(List<String> values) {
            addCriterion("JurisdictionName not in", values, "jurisdictionname");
            return (Criteria) this;
        }

        public Criteria andJurisdictionnameBetween(String value1, String value2) {
            addCriterion("JurisdictionName between", value1, value2, "jurisdictionname");
            return (Criteria) this;
        }

        public Criteria andJurisdictionnameNotBetween(String value1, String value2) {
            addCriterion("JurisdictionName not between", value1, value2, "jurisdictionname");
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
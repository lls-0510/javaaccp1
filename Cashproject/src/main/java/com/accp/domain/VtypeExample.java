package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class VtypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VtypeExample() {
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

        public Criteria andVtidIsNull() {
            addCriterion("VTid is null");
            return (Criteria) this;
        }

        public Criteria andVtidIsNotNull() {
            addCriterion("VTid is not null");
            return (Criteria) this;
        }

        public Criteria andVtidEqualTo(Integer value) {
            addCriterion("VTid =", value, "vtid");
            return (Criteria) this;
        }

        public Criteria andVtidNotEqualTo(Integer value) {
            addCriterion("VTid <>", value, "vtid");
            return (Criteria) this;
        }

        public Criteria andVtidGreaterThan(Integer value) {
            addCriterion("VTid >", value, "vtid");
            return (Criteria) this;
        }

        public Criteria andVtidGreaterThanOrEqualTo(Integer value) {
            addCriterion("VTid >=", value, "vtid");
            return (Criteria) this;
        }

        public Criteria andVtidLessThan(Integer value) {
            addCriterion("VTid <", value, "vtid");
            return (Criteria) this;
        }

        public Criteria andVtidLessThanOrEqualTo(Integer value) {
            addCriterion("VTid <=", value, "vtid");
            return (Criteria) this;
        }

        public Criteria andVtidIn(List<Integer> values) {
            addCriterion("VTid in", values, "vtid");
            return (Criteria) this;
        }

        public Criteria andVtidNotIn(List<Integer> values) {
            addCriterion("VTid not in", values, "vtid");
            return (Criteria) this;
        }

        public Criteria andVtidBetween(Integer value1, Integer value2) {
            addCriterion("VTid between", value1, value2, "vtid");
            return (Criteria) this;
        }

        public Criteria andVtidNotBetween(Integer value1, Integer value2) {
            addCriterion("VTid not between", value1, value2, "vtid");
            return (Criteria) this;
        }

        public Criteria andVtnameIsNull() {
            addCriterion("VTname is null");
            return (Criteria) this;
        }

        public Criteria andVtnameIsNotNull() {
            addCriterion("VTname is not null");
            return (Criteria) this;
        }

        public Criteria andVtnameEqualTo(String value) {
            addCriterion("VTname =", value, "vtname");
            return (Criteria) this;
        }

        public Criteria andVtnameNotEqualTo(String value) {
            addCriterion("VTname <>", value, "vtname");
            return (Criteria) this;
        }

        public Criteria andVtnameGreaterThan(String value) {
            addCriterion("VTname >", value, "vtname");
            return (Criteria) this;
        }

        public Criteria andVtnameGreaterThanOrEqualTo(String value) {
            addCriterion("VTname >=", value, "vtname");
            return (Criteria) this;
        }

        public Criteria andVtnameLessThan(String value) {
            addCriterion("VTname <", value, "vtname");
            return (Criteria) this;
        }

        public Criteria andVtnameLessThanOrEqualTo(String value) {
            addCriterion("VTname <=", value, "vtname");
            return (Criteria) this;
        }

        public Criteria andVtnameLike(String value) {
            addCriterion("VTname like", value, "vtname");
            return (Criteria) this;
        }

        public Criteria andVtnameNotLike(String value) {
            addCriterion("VTname not like", value, "vtname");
            return (Criteria) this;
        }

        public Criteria andVtnameIn(List<String> values) {
            addCriterion("VTname in", values, "vtname");
            return (Criteria) this;
        }

        public Criteria andVtnameNotIn(List<String> values) {
            addCriterion("VTname not in", values, "vtname");
            return (Criteria) this;
        }

        public Criteria andVtnameBetween(String value1, String value2) {
            addCriterion("VTname between", value1, value2, "vtname");
            return (Criteria) this;
        }

        public Criteria andVtnameNotBetween(String value1, String value2) {
            addCriterion("VTname not between", value1, value2, "vtname");
            return (Criteria) this;
        }

        public Criteria andVtdiscountIsNull() {
            addCriterion("VtDiscount is null");
            return (Criteria) this;
        }

        public Criteria andVtdiscountIsNotNull() {
            addCriterion("VtDiscount is not null");
            return (Criteria) this;
        }

        public Criteria andVtdiscountEqualTo(Float value) {
            addCriterion("VtDiscount =", value, "vtdiscount");
            return (Criteria) this;
        }

        public Criteria andVtdiscountNotEqualTo(Float value) {
            addCriterion("VtDiscount <>", value, "vtdiscount");
            return (Criteria) this;
        }

        public Criteria andVtdiscountGreaterThan(Float value) {
            addCriterion("VtDiscount >", value, "vtdiscount");
            return (Criteria) this;
        }

        public Criteria andVtdiscountGreaterThanOrEqualTo(Float value) {
            addCriterion("VtDiscount >=", value, "vtdiscount");
            return (Criteria) this;
        }

        public Criteria andVtdiscountLessThan(Float value) {
            addCriterion("VtDiscount <", value, "vtdiscount");
            return (Criteria) this;
        }

        public Criteria andVtdiscountLessThanOrEqualTo(Float value) {
            addCriterion("VtDiscount <=", value, "vtdiscount");
            return (Criteria) this;
        }

        public Criteria andVtdiscountIn(List<Float> values) {
            addCriterion("VtDiscount in", values, "vtdiscount");
            return (Criteria) this;
        }

        public Criteria andVtdiscountNotIn(List<Float> values) {
            addCriterion("VtDiscount not in", values, "vtdiscount");
            return (Criteria) this;
        }

        public Criteria andVtdiscountBetween(Float value1, Float value2) {
            addCriterion("VtDiscount between", value1, value2, "vtdiscount");
            return (Criteria) this;
        }

        public Criteria andVtdiscountNotBetween(Float value1, Float value2) {
            addCriterion("VtDiscount not between", value1, value2, "vtdiscount");
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
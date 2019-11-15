package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class CarsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarsExample() {
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

        public Criteria andCarsidIsNull() {
            addCriterion("carsid is null");
            return (Criteria) this;
        }

        public Criteria andCarsidIsNotNull() {
            addCriterion("carsid is not null");
            return (Criteria) this;
        }

        public Criteria andCarsidEqualTo(Integer value) {
            addCriterion("carsid =", value, "carsid");
            return (Criteria) this;
        }

        public Criteria andCarsidNotEqualTo(Integer value) {
            addCriterion("carsid <>", value, "carsid");
            return (Criteria) this;
        }

        public Criteria andCarsidGreaterThan(Integer value) {
            addCriterion("carsid >", value, "carsid");
            return (Criteria) this;
        }

        public Criteria andCarsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("carsid >=", value, "carsid");
            return (Criteria) this;
        }

        public Criteria andCarsidLessThan(Integer value) {
            addCriterion("carsid <", value, "carsid");
            return (Criteria) this;
        }

        public Criteria andCarsidLessThanOrEqualTo(Integer value) {
            addCriterion("carsid <=", value, "carsid");
            return (Criteria) this;
        }

        public Criteria andCarsidIn(List<Integer> values) {
            addCriterion("carsid in", values, "carsid");
            return (Criteria) this;
        }

        public Criteria andCarsidNotIn(List<Integer> values) {
            addCriterion("carsid not in", values, "carsid");
            return (Criteria) this;
        }

        public Criteria andCarsidBetween(Integer value1, Integer value2) {
            addCriterion("carsid between", value1, value2, "carsid");
            return (Criteria) this;
        }

        public Criteria andCarsidNotBetween(Integer value1, Integer value2) {
            addCriterion("carsid not between", value1, value2, "carsid");
            return (Criteria) this;
        }

        public Criteria andCaridIsNull() {
            addCriterion("carid is null");
            return (Criteria) this;
        }

        public Criteria andCaridIsNotNull() {
            addCriterion("carid is not null");
            return (Criteria) this;
        }

        public Criteria andCaridEqualTo(Integer value) {
            addCriterion("carid =", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotEqualTo(Integer value) {
            addCriterion("carid <>", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridGreaterThan(Integer value) {
            addCriterion("carid >", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridGreaterThanOrEqualTo(Integer value) {
            addCriterion("carid >=", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridLessThan(Integer value) {
            addCriterion("carid <", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridLessThanOrEqualTo(Integer value) {
            addCriterion("carid <=", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridIn(List<Integer> values) {
            addCriterion("carid in", values, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotIn(List<Integer> values) {
            addCriterion("carid not in", values, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridBetween(Integer value1, Integer value2) {
            addCriterion("carid between", value1, value2, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotBetween(Integer value1, Integer value2) {
            addCriterion("carid not between", value1, value2, "carid");
            return (Criteria) this;
        }

        public Criteria andGoodnumIsNull() {
            addCriterion("goodnum is null");
            return (Criteria) this;
        }

        public Criteria andGoodnumIsNotNull() {
            addCriterion("goodnum is not null");
            return (Criteria) this;
        }

        public Criteria andGoodnumEqualTo(Integer value) {
            addCriterion("goodnum =", value, "goodnum");
            return (Criteria) this;
        }

        public Criteria andGoodnumNotEqualTo(Integer value) {
            addCriterion("goodnum <>", value, "goodnum");
            return (Criteria) this;
        }

        public Criteria andGoodnumGreaterThan(Integer value) {
            addCriterion("goodnum >", value, "goodnum");
            return (Criteria) this;
        }

        public Criteria andGoodnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodnum >=", value, "goodnum");
            return (Criteria) this;
        }

        public Criteria andGoodnumLessThan(Integer value) {
            addCriterion("goodnum <", value, "goodnum");
            return (Criteria) this;
        }

        public Criteria andGoodnumLessThanOrEqualTo(Integer value) {
            addCriterion("goodnum <=", value, "goodnum");
            return (Criteria) this;
        }

        public Criteria andGoodnumIn(List<Integer> values) {
            addCriterion("goodnum in", values, "goodnum");
            return (Criteria) this;
        }

        public Criteria andGoodnumNotIn(List<Integer> values) {
            addCriterion("goodnum not in", values, "goodnum");
            return (Criteria) this;
        }

        public Criteria andGoodnumBetween(Integer value1, Integer value2) {
            addCriterion("goodnum between", value1, value2, "goodnum");
            return (Criteria) this;
        }

        public Criteria andGoodnumNotBetween(Integer value1, Integer value2) {
            addCriterion("goodnum not between", value1, value2, "goodnum");
            return (Criteria) this;
        }

        public Criteria andGoodnameIsNull() {
            addCriterion("goodname is null");
            return (Criteria) this;
        }

        public Criteria andGoodnameIsNotNull() {
            addCriterion("goodname is not null");
            return (Criteria) this;
        }

        public Criteria andGoodnameEqualTo(String value) {
            addCriterion("goodname =", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameNotEqualTo(String value) {
            addCriterion("goodname <>", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameGreaterThan(String value) {
            addCriterion("goodname >", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameGreaterThanOrEqualTo(String value) {
            addCriterion("goodname >=", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameLessThan(String value) {
            addCriterion("goodname <", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameLessThanOrEqualTo(String value) {
            addCriterion("goodname <=", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameLike(String value) {
            addCriterion("goodname like", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameNotLike(String value) {
            addCriterion("goodname not like", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameIn(List<String> values) {
            addCriterion("goodname in", values, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameNotIn(List<String> values) {
            addCriterion("goodname not in", values, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameBetween(String value1, String value2) {
            addCriterion("goodname between", value1, value2, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameNotBetween(String value1, String value2) {
            addCriterion("goodname not between", value1, value2, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodpriceIsNull() {
            addCriterion("goodprice is null");
            return (Criteria) this;
        }

        public Criteria andGoodpriceIsNotNull() {
            addCriterion("goodprice is not null");
            return (Criteria) this;
        }

        public Criteria andGoodpriceEqualTo(Double value) {
            addCriterion("goodprice =", value, "goodprice");
            return (Criteria) this;
        }

        public Criteria andGoodpriceNotEqualTo(Double value) {
            addCriterion("goodprice <>", value, "goodprice");
            return (Criteria) this;
        }

        public Criteria andGoodpriceGreaterThan(Double value) {
            addCriterion("goodprice >", value, "goodprice");
            return (Criteria) this;
        }

        public Criteria andGoodpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("goodprice >=", value, "goodprice");
            return (Criteria) this;
        }

        public Criteria andGoodpriceLessThan(Double value) {
            addCriterion("goodprice <", value, "goodprice");
            return (Criteria) this;
        }

        public Criteria andGoodpriceLessThanOrEqualTo(Double value) {
            addCriterion("goodprice <=", value, "goodprice");
            return (Criteria) this;
        }

        public Criteria andGoodpriceIn(List<Double> values) {
            addCriterion("goodprice in", values, "goodprice");
            return (Criteria) this;
        }

        public Criteria andGoodpriceNotIn(List<Double> values) {
            addCriterion("goodprice not in", values, "goodprice");
            return (Criteria) this;
        }

        public Criteria andGoodpriceBetween(Double value1, Double value2) {
            addCriterion("goodprice between", value1, value2, "goodprice");
            return (Criteria) this;
        }

        public Criteria andGoodpriceNotBetween(Double value1, Double value2) {
            addCriterion("goodprice not between", value1, value2, "goodprice");
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
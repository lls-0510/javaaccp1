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

        public Criteria andVruleIsNull() {
            addCriterion("vrule is null");
            return (Criteria) this;
        }

        public Criteria andVruleIsNotNull() {
            addCriterion("vrule is not null");
            return (Criteria) this;
        }

        public Criteria andVruleEqualTo(Integer value) {
            addCriterion("vrule =", value, "vrule");
            return (Criteria) this;
        }

        public Criteria andVruleNotEqualTo(Integer value) {
            addCriterion("vrule <>", value, "vrule");
            return (Criteria) this;
        }

        public Criteria andVruleGreaterThan(Integer value) {
            addCriterion("vrule >", value, "vrule");
            return (Criteria) this;
        }

        public Criteria andVruleGreaterThanOrEqualTo(Integer value) {
            addCriterion("vrule >=", value, "vrule");
            return (Criteria) this;
        }

        public Criteria andVruleLessThan(Integer value) {
            addCriterion("vrule <", value, "vrule");
            return (Criteria) this;
        }

        public Criteria andVruleLessThanOrEqualTo(Integer value) {
            addCriterion("vrule <=", value, "vrule");
            return (Criteria) this;
        }

        public Criteria andVruleIn(List<Integer> values) {
            addCriterion("vrule in", values, "vrule");
            return (Criteria) this;
        }

        public Criteria andVruleNotIn(List<Integer> values) {
            addCriterion("vrule not in", values, "vrule");
            return (Criteria) this;
        }

        public Criteria andVruleBetween(Integer value1, Integer value2) {
            addCriterion("vrule between", value1, value2, "vrule");
            return (Criteria) this;
        }

        public Criteria andVruleNotBetween(Integer value1, Integer value2) {
            addCriterion("vrule not between", value1, value2, "vrule");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyIsNull() {
            addCriterion("maxmoney is null");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyIsNotNull() {
            addCriterion("maxmoney is not null");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyEqualTo(Double value) {
            addCriterion("maxmoney =", value, "maxmoney");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyNotEqualTo(Double value) {
            addCriterion("maxmoney <>", value, "maxmoney");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyGreaterThan(Double value) {
            addCriterion("maxmoney >", value, "maxmoney");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("maxmoney >=", value, "maxmoney");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyLessThan(Double value) {
            addCriterion("maxmoney <", value, "maxmoney");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyLessThanOrEqualTo(Double value) {
            addCriterion("maxmoney <=", value, "maxmoney");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyIn(List<Double> values) {
            addCriterion("maxmoney in", values, "maxmoney");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyNotIn(List<Double> values) {
            addCriterion("maxmoney not in", values, "maxmoney");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyBetween(Double value1, Double value2) {
            addCriterion("maxmoney between", value1, value2, "maxmoney");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyNotBetween(Double value1, Double value2) {
            addCriterion("maxmoney not between", value1, value2, "maxmoney");
            return (Criteria) this;
        }

        public Criteria andValiditydataIsNull() {
            addCriterion("validityData is null");
            return (Criteria) this;
        }

        public Criteria andValiditydataIsNotNull() {
            addCriterion("validityData is not null");
            return (Criteria) this;
        }

        public Criteria andValiditydataEqualTo(Integer value) {
            addCriterion("validityData =", value, "validitydata");
            return (Criteria) this;
        }

        public Criteria andValiditydataNotEqualTo(Integer value) {
            addCriterion("validityData <>", value, "validitydata");
            return (Criteria) this;
        }

        public Criteria andValiditydataGreaterThan(Integer value) {
            addCriterion("validityData >", value, "validitydata");
            return (Criteria) this;
        }

        public Criteria andValiditydataGreaterThanOrEqualTo(Integer value) {
            addCriterion("validityData >=", value, "validitydata");
            return (Criteria) this;
        }

        public Criteria andValiditydataLessThan(Integer value) {
            addCriterion("validityData <", value, "validitydata");
            return (Criteria) this;
        }

        public Criteria andValiditydataLessThanOrEqualTo(Integer value) {
            addCriterion("validityData <=", value, "validitydata");
            return (Criteria) this;
        }

        public Criteria andValiditydataIn(List<Integer> values) {
            addCriterion("validityData in", values, "validitydata");
            return (Criteria) this;
        }

        public Criteria andValiditydataNotIn(List<Integer> values) {
            addCriterion("validityData not in", values, "validitydata");
            return (Criteria) this;
        }

        public Criteria andValiditydataBetween(Integer value1, Integer value2) {
            addCriterion("validityData between", value1, value2, "validitydata");
            return (Criteria) this;
        }

        public Criteria andValiditydataNotBetween(Integer value1, Integer value2) {
            addCriterion("validityData not between", value1, value2, "validitydata");
            return (Criteria) this;
        }

        public Criteria andBz1IsNull() {
            addCriterion("bz1 is null");
            return (Criteria) this;
        }

        public Criteria andBz1IsNotNull() {
            addCriterion("bz1 is not null");
            return (Criteria) this;
        }

        public Criteria andBz1EqualTo(String value) {
            addCriterion("bz1 =", value, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1NotEqualTo(String value) {
            addCriterion("bz1 <>", value, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1GreaterThan(String value) {
            addCriterion("bz1 >", value, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1GreaterThanOrEqualTo(String value) {
            addCriterion("bz1 >=", value, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1LessThan(String value) {
            addCriterion("bz1 <", value, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1LessThanOrEqualTo(String value) {
            addCriterion("bz1 <=", value, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1Like(String value) {
            addCriterion("bz1 like", value, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1NotLike(String value) {
            addCriterion("bz1 not like", value, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1In(List<String> values) {
            addCriterion("bz1 in", values, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1NotIn(List<String> values) {
            addCriterion("bz1 not in", values, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1Between(String value1, String value2) {
            addCriterion("bz1 between", value1, value2, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1NotBetween(String value1, String value2) {
            addCriterion("bz1 not between", value1, value2, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz2IsNull() {
            addCriterion("bz2 is null");
            return (Criteria) this;
        }

        public Criteria andBz2IsNotNull() {
            addCriterion("bz2 is not null");
            return (Criteria) this;
        }

        public Criteria andBz2EqualTo(String value) {
            addCriterion("bz2 =", value, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz2NotEqualTo(String value) {
            addCriterion("bz2 <>", value, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz2GreaterThan(String value) {
            addCriterion("bz2 >", value, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz2GreaterThanOrEqualTo(String value) {
            addCriterion("bz2 >=", value, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz2LessThan(String value) {
            addCriterion("bz2 <", value, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz2LessThanOrEqualTo(String value) {
            addCriterion("bz2 <=", value, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz2Like(String value) {
            addCriterion("bz2 like", value, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz2NotLike(String value) {
            addCriterion("bz2 not like", value, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz2In(List<String> values) {
            addCriterion("bz2 in", values, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz2NotIn(List<String> values) {
            addCriterion("bz2 not in", values, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz2Between(String value1, String value2) {
            addCriterion("bz2 between", value1, value2, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz2NotBetween(String value1, String value2) {
            addCriterion("bz2 not between", value1, value2, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz3IsNull() {
            addCriterion("bz3 is null");
            return (Criteria) this;
        }

        public Criteria andBz3IsNotNull() {
            addCriterion("bz3 is not null");
            return (Criteria) this;
        }

        public Criteria andBz3EqualTo(String value) {
            addCriterion("bz3 =", value, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz3NotEqualTo(String value) {
            addCriterion("bz3 <>", value, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz3GreaterThan(String value) {
            addCriterion("bz3 >", value, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz3GreaterThanOrEqualTo(String value) {
            addCriterion("bz3 >=", value, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz3LessThan(String value) {
            addCriterion("bz3 <", value, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz3LessThanOrEqualTo(String value) {
            addCriterion("bz3 <=", value, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz3Like(String value) {
            addCriterion("bz3 like", value, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz3NotLike(String value) {
            addCriterion("bz3 not like", value, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz3In(List<String> values) {
            addCriterion("bz3 in", values, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz3NotIn(List<String> values) {
            addCriterion("bz3 not in", values, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz3Between(String value1, String value2) {
            addCriterion("bz3 between", value1, value2, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz3NotBetween(String value1, String value2) {
            addCriterion("bz3 not between", value1, value2, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz4IsNull() {
            addCriterion("bz4 is null");
            return (Criteria) this;
        }

        public Criteria andBz4IsNotNull() {
            addCriterion("bz4 is not null");
            return (Criteria) this;
        }

        public Criteria andBz4EqualTo(String value) {
            addCriterion("bz4 =", value, "bz4");
            return (Criteria) this;
        }

        public Criteria andBz4NotEqualTo(String value) {
            addCriterion("bz4 <>", value, "bz4");
            return (Criteria) this;
        }

        public Criteria andBz4GreaterThan(String value) {
            addCriterion("bz4 >", value, "bz4");
            return (Criteria) this;
        }

        public Criteria andBz4GreaterThanOrEqualTo(String value) {
            addCriterion("bz4 >=", value, "bz4");
            return (Criteria) this;
        }

        public Criteria andBz4LessThan(String value) {
            addCriterion("bz4 <", value, "bz4");
            return (Criteria) this;
        }

        public Criteria andBz4LessThanOrEqualTo(String value) {
            addCriterion("bz4 <=", value, "bz4");
            return (Criteria) this;
        }

        public Criteria andBz4Like(String value) {
            addCriterion("bz4 like", value, "bz4");
            return (Criteria) this;
        }

        public Criteria andBz4NotLike(String value) {
            addCriterion("bz4 not like", value, "bz4");
            return (Criteria) this;
        }

        public Criteria andBz4In(List<String> values) {
            addCriterion("bz4 in", values, "bz4");
            return (Criteria) this;
        }

        public Criteria andBz4NotIn(List<String> values) {
            addCriterion("bz4 not in", values, "bz4");
            return (Criteria) this;
        }

        public Criteria andBz4Between(String value1, String value2) {
            addCriterion("bz4 between", value1, value2, "bz4");
            return (Criteria) this;
        }

        public Criteria andBz4NotBetween(String value1, String value2) {
            addCriterion("bz4 not between", value1, value2, "bz4");
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
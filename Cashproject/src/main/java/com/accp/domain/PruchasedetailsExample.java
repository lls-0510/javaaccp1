package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class PruchasedetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PruchasedetailsExample() {
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

        public Criteria andPrdidIsNull() {
            addCriterion("prdid is null");
            return (Criteria) this;
        }

        public Criteria andPrdidIsNotNull() {
            addCriterion("prdid is not null");
            return (Criteria) this;
        }

        public Criteria andPrdidEqualTo(Integer value) {
            addCriterion("prdid =", value, "prdid");
            return (Criteria) this;
        }

        public Criteria andPrdidNotEqualTo(Integer value) {
            addCriterion("prdid <>", value, "prdid");
            return (Criteria) this;
        }

        public Criteria andPrdidGreaterThan(Integer value) {
            addCriterion("prdid >", value, "prdid");
            return (Criteria) this;
        }

        public Criteria andPrdidGreaterThanOrEqualTo(Integer value) {
            addCriterion("prdid >=", value, "prdid");
            return (Criteria) this;
        }

        public Criteria andPrdidLessThan(Integer value) {
            addCriterion("prdid <", value, "prdid");
            return (Criteria) this;
        }

        public Criteria andPrdidLessThanOrEqualTo(Integer value) {
            addCriterion("prdid <=", value, "prdid");
            return (Criteria) this;
        }

        public Criteria andPrdidIn(List<Integer> values) {
            addCriterion("prdid in", values, "prdid");
            return (Criteria) this;
        }

        public Criteria andPrdidNotIn(List<Integer> values) {
            addCriterion("prdid not in", values, "prdid");
            return (Criteria) this;
        }

        public Criteria andPrdidBetween(Integer value1, Integer value2) {
            addCriterion("prdid between", value1, value2, "prdid");
            return (Criteria) this;
        }

        public Criteria andPrdidNotBetween(Integer value1, Integer value2) {
            addCriterion("prdid not between", value1, value2, "prdid");
            return (Criteria) this;
        }

        public Criteria andShhIsNull() {
            addCriterion("shh is null");
            return (Criteria) this;
        }

        public Criteria andShhIsNotNull() {
            addCriterion("shh is not null");
            return (Criteria) this;
        }

        public Criteria andShhEqualTo(String value) {
            addCriterion("shh =", value, "shh");
            return (Criteria) this;
        }

        public Criteria andShhNotEqualTo(String value) {
            addCriterion("shh <>", value, "shh");
            return (Criteria) this;
        }

        public Criteria andShhGreaterThan(String value) {
            addCriterion("shh >", value, "shh");
            return (Criteria) this;
        }

        public Criteria andShhGreaterThanOrEqualTo(String value) {
            addCriterion("shh >=", value, "shh");
            return (Criteria) this;
        }

        public Criteria andShhLessThan(String value) {
            addCriterion("shh <", value, "shh");
            return (Criteria) this;
        }

        public Criteria andShhLessThanOrEqualTo(String value) {
            addCriterion("shh <=", value, "shh");
            return (Criteria) this;
        }

        public Criteria andShhLike(String value) {
            addCriterion("shh like", value, "shh");
            return (Criteria) this;
        }

        public Criteria andShhNotLike(String value) {
            addCriterion("shh not like", value, "shh");
            return (Criteria) this;
        }

        public Criteria andShhIn(List<String> values) {
            addCriterion("shh in", values, "shh");
            return (Criteria) this;
        }

        public Criteria andShhNotIn(List<String> values) {
            addCriterion("shh not in", values, "shh");
            return (Criteria) this;
        }

        public Criteria andShhBetween(String value1, String value2) {
            addCriterion("shh between", value1, value2, "shh");
            return (Criteria) this;
        }

        public Criteria andShhNotBetween(String value1, String value2) {
            addCriterion("shh not between", value1, value2, "shh");
            return (Criteria) this;
        }

        public Criteria andSnumbeIsNull() {
            addCriterion("snumbe is null");
            return (Criteria) this;
        }

        public Criteria andSnumbeIsNotNull() {
            addCriterion("snumbe is not null");
            return (Criteria) this;
        }

        public Criteria andSnumbeEqualTo(String value) {
            addCriterion("snumbe =", value, "snumbe");
            return (Criteria) this;
        }

        public Criteria andSnumbeNotEqualTo(String value) {
            addCriterion("snumbe <>", value, "snumbe");
            return (Criteria) this;
        }

        public Criteria andSnumbeGreaterThan(String value) {
            addCriterion("snumbe >", value, "snumbe");
            return (Criteria) this;
        }

        public Criteria andSnumbeGreaterThanOrEqualTo(String value) {
            addCriterion("snumbe >=", value, "snumbe");
            return (Criteria) this;
        }

        public Criteria andSnumbeLessThan(String value) {
            addCriterion("snumbe <", value, "snumbe");
            return (Criteria) this;
        }

        public Criteria andSnumbeLessThanOrEqualTo(String value) {
            addCriterion("snumbe <=", value, "snumbe");
            return (Criteria) this;
        }

        public Criteria andSnumbeLike(String value) {
            addCriterion("snumbe like", value, "snumbe");
            return (Criteria) this;
        }

        public Criteria andSnumbeNotLike(String value) {
            addCriterion("snumbe not like", value, "snumbe");
            return (Criteria) this;
        }

        public Criteria andSnumbeIn(List<String> values) {
            addCriterion("snumbe in", values, "snumbe");
            return (Criteria) this;
        }

        public Criteria andSnumbeNotIn(List<String> values) {
            addCriterion("snumbe not in", values, "snumbe");
            return (Criteria) this;
        }

        public Criteria andSnumbeBetween(String value1, String value2) {
            addCriterion("snumbe between", value1, value2, "snumbe");
            return (Criteria) this;
        }

        public Criteria andSnumbeNotBetween(String value1, String value2) {
            addCriterion("snumbe not between", value1, value2, "snumbe");
            return (Criteria) this;
        }

        public Criteria andSnameIsNull() {
            addCriterion("sname is null");
            return (Criteria) this;
        }

        public Criteria andSnameIsNotNull() {
            addCriterion("sname is not null");
            return (Criteria) this;
        }

        public Criteria andSnameEqualTo(String value) {
            addCriterion("sname =", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotEqualTo(String value) {
            addCriterion("sname <>", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThan(String value) {
            addCriterion("sname >", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThanOrEqualTo(String value) {
            addCriterion("sname >=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThan(String value) {
            addCriterion("sname <", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThanOrEqualTo(String value) {
            addCriterion("sname <=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLike(String value) {
            addCriterion("sname like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotLike(String value) {
            addCriterion("sname not like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameIn(List<String> values) {
            addCriterion("sname in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotIn(List<String> values) {
            addCriterion("sname not in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameBetween(String value1, String value2) {
            addCriterion("sname between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotBetween(String value1, String value2) {
            addCriterion("sname not between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSggIsNull() {
            addCriterion("sgg is null");
            return (Criteria) this;
        }

        public Criteria andSggIsNotNull() {
            addCriterion("sgg is not null");
            return (Criteria) this;
        }

        public Criteria andSggEqualTo(String value) {
            addCriterion("sgg =", value, "sgg");
            return (Criteria) this;
        }

        public Criteria andSggNotEqualTo(String value) {
            addCriterion("sgg <>", value, "sgg");
            return (Criteria) this;
        }

        public Criteria andSggGreaterThan(String value) {
            addCriterion("sgg >", value, "sgg");
            return (Criteria) this;
        }

        public Criteria andSggGreaterThanOrEqualTo(String value) {
            addCriterion("sgg >=", value, "sgg");
            return (Criteria) this;
        }

        public Criteria andSggLessThan(String value) {
            addCriterion("sgg <", value, "sgg");
            return (Criteria) this;
        }

        public Criteria andSggLessThanOrEqualTo(String value) {
            addCriterion("sgg <=", value, "sgg");
            return (Criteria) this;
        }

        public Criteria andSggLike(String value) {
            addCriterion("sgg like", value, "sgg");
            return (Criteria) this;
        }

        public Criteria andSggNotLike(String value) {
            addCriterion("sgg not like", value, "sgg");
            return (Criteria) this;
        }

        public Criteria andSggIn(List<String> values) {
            addCriterion("sgg in", values, "sgg");
            return (Criteria) this;
        }

        public Criteria andSggNotIn(List<String> values) {
            addCriterion("sgg not in", values, "sgg");
            return (Criteria) this;
        }

        public Criteria andSggBetween(String value1, String value2) {
            addCriterion("sgg between", value1, value2, "sgg");
            return (Criteria) this;
        }

        public Criteria andSggNotBetween(String value1, String value2) {
            addCriterion("sgg not between", value1, value2, "sgg");
            return (Criteria) this;
        }

        public Criteria andScbpriceIsNull() {
            addCriterion("scbprice is null");
            return (Criteria) this;
        }

        public Criteria andScbpriceIsNotNull() {
            addCriterion("scbprice is not null");
            return (Criteria) this;
        }

        public Criteria andScbpriceEqualTo(Float value) {
            addCriterion("scbprice =", value, "scbprice");
            return (Criteria) this;
        }

        public Criteria andScbpriceNotEqualTo(Float value) {
            addCriterion("scbprice <>", value, "scbprice");
            return (Criteria) this;
        }

        public Criteria andScbpriceGreaterThan(Float value) {
            addCriterion("scbprice >", value, "scbprice");
            return (Criteria) this;
        }

        public Criteria andScbpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("scbprice >=", value, "scbprice");
            return (Criteria) this;
        }

        public Criteria andScbpriceLessThan(Float value) {
            addCriterion("scbprice <", value, "scbprice");
            return (Criteria) this;
        }

        public Criteria andScbpriceLessThanOrEqualTo(Float value) {
            addCriterion("scbprice <=", value, "scbprice");
            return (Criteria) this;
        }

        public Criteria andScbpriceIn(List<Float> values) {
            addCriterion("scbprice in", values, "scbprice");
            return (Criteria) this;
        }

        public Criteria andScbpriceNotIn(List<Float> values) {
            addCriterion("scbprice not in", values, "scbprice");
            return (Criteria) this;
        }

        public Criteria andScbpriceBetween(Float value1, Float value2) {
            addCriterion("scbprice between", value1, value2, "scbprice");
            return (Criteria) this;
        }

        public Criteria andScbpriceNotBetween(Float value1, Float value2) {
            addCriterion("scbprice not between", value1, value2, "scbprice");
            return (Criteria) this;
        }

        public Criteria andSnumIsNull() {
            addCriterion("snum is null");
            return (Criteria) this;
        }

        public Criteria andSnumIsNotNull() {
            addCriterion("snum is not null");
            return (Criteria) this;
        }

        public Criteria andSnumEqualTo(Integer value) {
            addCriterion("snum =", value, "snum");
            return (Criteria) this;
        }

        public Criteria andSnumNotEqualTo(Integer value) {
            addCriterion("snum <>", value, "snum");
            return (Criteria) this;
        }

        public Criteria andSnumGreaterThan(Integer value) {
            addCriterion("snum >", value, "snum");
            return (Criteria) this;
        }

        public Criteria andSnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("snum >=", value, "snum");
            return (Criteria) this;
        }

        public Criteria andSnumLessThan(Integer value) {
            addCriterion("snum <", value, "snum");
            return (Criteria) this;
        }

        public Criteria andSnumLessThanOrEqualTo(Integer value) {
            addCriterion("snum <=", value, "snum");
            return (Criteria) this;
        }

        public Criteria andSnumIn(List<Integer> values) {
            addCriterion("snum in", values, "snum");
            return (Criteria) this;
        }

        public Criteria andSnumNotIn(List<Integer> values) {
            addCriterion("snum not in", values, "snum");
            return (Criteria) this;
        }

        public Criteria andSnumBetween(Integer value1, Integer value2) {
            addCriterion("snum between", value1, value2, "snum");
            return (Criteria) this;
        }

        public Criteria andSnumNotBetween(Integer value1, Integer value2) {
            addCriterion("snum not between", value1, value2, "snum");
            return (Criteria) this;
        }

        public Criteria andSpriceIsNull() {
            addCriterion("sprice is null");
            return (Criteria) this;
        }

        public Criteria andSpriceIsNotNull() {
            addCriterion("sprice is not null");
            return (Criteria) this;
        }

        public Criteria andSpriceEqualTo(Float value) {
            addCriterion("sprice =", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceNotEqualTo(Float value) {
            addCriterion("sprice <>", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceGreaterThan(Float value) {
            addCriterion("sprice >", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("sprice >=", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceLessThan(Float value) {
            addCriterion("sprice <", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceLessThanOrEqualTo(Float value) {
            addCriterion("sprice <=", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceIn(List<Float> values) {
            addCriterion("sprice in", values, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceNotIn(List<Float> values) {
            addCriterion("sprice not in", values, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceBetween(Float value1, Float value2) {
            addCriterion("sprice between", value1, value2, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceNotBetween(Float value1, Float value2) {
            addCriterion("sprice not between", value1, value2, "sprice");
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

        public Criteria andBz1EqualTo(Integer value) {
            addCriterion("bz1 =", value, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1NotEqualTo(Integer value) {
            addCriterion("bz1 <>", value, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1GreaterThan(Integer value) {
            addCriterion("bz1 >", value, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1GreaterThanOrEqualTo(Integer value) {
            addCriterion("bz1 >=", value, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1LessThan(Integer value) {
            addCriterion("bz1 <", value, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1LessThanOrEqualTo(Integer value) {
            addCriterion("bz1 <=", value, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1In(List<Integer> values) {
            addCriterion("bz1 in", values, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1NotIn(List<Integer> values) {
            addCriterion("bz1 not in", values, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1Between(Integer value1, Integer value2) {
            addCriterion("bz1 between", value1, value2, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1NotBetween(Integer value1, Integer value2) {
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
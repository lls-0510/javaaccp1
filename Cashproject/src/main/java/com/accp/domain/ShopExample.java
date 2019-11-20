package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class ShopExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopExample() {
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

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(Integer value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(Integer value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(Integer value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(Integer value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(Integer value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<Integer> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<Integer> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(Integer value1, Integer value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(Integer value1, Integer value2) {
            addCriterion("sid not between", value1, value2, "sid");
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

        public Criteria andSdppriceIsNull() {
            addCriterion("sdpprice is null");
            return (Criteria) this;
        }

        public Criteria andSdppriceIsNotNull() {
            addCriterion("sdpprice is not null");
            return (Criteria) this;
        }

        public Criteria andSdppriceEqualTo(Double value) {
            addCriterion("sdpprice =", value, "sdpprice");
            return (Criteria) this;
        }

        public Criteria andSdppriceNotEqualTo(Double value) {
            addCriterion("sdpprice <>", value, "sdpprice");
            return (Criteria) this;
        }

        public Criteria andSdppriceGreaterThan(Double value) {
            addCriterion("sdpprice >", value, "sdpprice");
            return (Criteria) this;
        }

        public Criteria andSdppriceGreaterThanOrEqualTo(Double value) {
            addCriterion("sdpprice >=", value, "sdpprice");
            return (Criteria) this;
        }

        public Criteria andSdppriceLessThan(Double value) {
            addCriterion("sdpprice <", value, "sdpprice");
            return (Criteria) this;
        }

        public Criteria andSdppriceLessThanOrEqualTo(Double value) {
            addCriterion("sdpprice <=", value, "sdpprice");
            return (Criteria) this;
        }

        public Criteria andSdppriceIn(List<Double> values) {
            addCriterion("sdpprice in", values, "sdpprice");
            return (Criteria) this;
        }

        public Criteria andSdppriceNotIn(List<Double> values) {
            addCriterion("sdpprice not in", values, "sdpprice");
            return (Criteria) this;
        }

        public Criteria andSdppriceBetween(Double value1, Double value2) {
            addCriterion("sdpprice between", value1, value2, "sdpprice");
            return (Criteria) this;
        }

        public Criteria andSdppriceNotBetween(Double value1, Double value2) {
            addCriterion("sdpprice not between", value1, value2, "sdpprice");
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

        public Criteria andScbpriceEqualTo(Double value) {
            addCriterion("scbprice =", value, "scbprice");
            return (Criteria) this;
        }

        public Criteria andScbpriceNotEqualTo(Double value) {
            addCriterion("scbprice <>", value, "scbprice");
            return (Criteria) this;
        }

        public Criteria andScbpriceGreaterThan(Double value) {
            addCriterion("scbprice >", value, "scbprice");
            return (Criteria) this;
        }

        public Criteria andScbpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("scbprice >=", value, "scbprice");
            return (Criteria) this;
        }

        public Criteria andScbpriceLessThan(Double value) {
            addCriterion("scbprice <", value, "scbprice");
            return (Criteria) this;
        }

        public Criteria andScbpriceLessThanOrEqualTo(Double value) {
            addCriterion("scbprice <=", value, "scbprice");
            return (Criteria) this;
        }

        public Criteria andScbpriceIn(List<Double> values) {
            addCriterion("scbprice in", values, "scbprice");
            return (Criteria) this;
        }

        public Criteria andScbpriceNotIn(List<Double> values) {
            addCriterion("scbprice not in", values, "scbprice");
            return (Criteria) this;
        }

        public Criteria andScbpriceBetween(Double value1, Double value2) {
            addCriterion("scbprice between", value1, value2, "scbprice");
            return (Criteria) this;
        }

        public Criteria andScbpriceNotBetween(Double value1, Double value2) {
            addCriterion("scbprice not between", value1, value2, "scbprice");
            return (Criteria) this;
        }

        public Criteria andGoodidIsNull() {
            addCriterion("goodid is null");
            return (Criteria) this;
        }

        public Criteria andGoodidIsNotNull() {
            addCriterion("goodid is not null");
            return (Criteria) this;
        }

        public Criteria andGoodidEqualTo(Integer value) {
            addCriterion("goodid =", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidNotEqualTo(Integer value) {
            addCriterion("goodid <>", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidGreaterThan(Integer value) {
            addCriterion("goodid >", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodid >=", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidLessThan(Integer value) {
            addCriterion("goodid <", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidLessThanOrEqualTo(Integer value) {
            addCriterion("goodid <=", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidIn(List<Integer> values) {
            addCriterion("goodid in", values, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidNotIn(List<Integer> values) {
            addCriterion("goodid not in", values, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidBetween(Integer value1, Integer value2) {
            addCriterion("goodid between", value1, value2, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidNotBetween(Integer value1, Integer value2) {
            addCriterion("goodid not between", value1, value2, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodimgIsNull() {
            addCriterion("goodimg is null");
            return (Criteria) this;
        }

        public Criteria andGoodimgIsNotNull() {
            addCriterion("goodimg is not null");
            return (Criteria) this;
        }

        public Criteria andGoodimgEqualTo(String value) {
            addCriterion("goodimg =", value, "goodimg");
            return (Criteria) this;
        }

        public Criteria andGoodimgNotEqualTo(String value) {
            addCriterion("goodimg <>", value, "goodimg");
            return (Criteria) this;
        }

        public Criteria andGoodimgGreaterThan(String value) {
            addCriterion("goodimg >", value, "goodimg");
            return (Criteria) this;
        }

        public Criteria andGoodimgGreaterThanOrEqualTo(String value) {
            addCriterion("goodimg >=", value, "goodimg");
            return (Criteria) this;
        }

        public Criteria andGoodimgLessThan(String value) {
            addCriterion("goodimg <", value, "goodimg");
            return (Criteria) this;
        }

        public Criteria andGoodimgLessThanOrEqualTo(String value) {
            addCriterion("goodimg <=", value, "goodimg");
            return (Criteria) this;
        }

        public Criteria andGoodimgLike(String value) {
            addCriterion("goodimg like", value, "goodimg");
            return (Criteria) this;
        }

        public Criteria andGoodimgNotLike(String value) {
            addCriterion("goodimg not like", value, "goodimg");
            return (Criteria) this;
        }

        public Criteria andGoodimgIn(List<String> values) {
            addCriterion("goodimg in", values, "goodimg");
            return (Criteria) this;
        }

        public Criteria andGoodimgNotIn(List<String> values) {
            addCriterion("goodimg not in", values, "goodimg");
            return (Criteria) this;
        }

        public Criteria andGoodimgBetween(String value1, String value2) {
            addCriterion("goodimg between", value1, value2, "goodimg");
            return (Criteria) this;
        }

        public Criteria andGoodimgNotBetween(String value1, String value2) {
            addCriterion("goodimg not between", value1, value2, "goodimg");
            return (Criteria) this;
        }

        public Criteria andGoodtextIsNull() {
            addCriterion("goodText is null");
            return (Criteria) this;
        }

        public Criteria andGoodtextIsNotNull() {
            addCriterion("goodText is not null");
            return (Criteria) this;
        }

        public Criteria andGoodtextEqualTo(String value) {
            addCriterion("goodText =", value, "goodtext");
            return (Criteria) this;
        }

        public Criteria andGoodtextNotEqualTo(String value) {
            addCriterion("goodText <>", value, "goodtext");
            return (Criteria) this;
        }

        public Criteria andGoodtextGreaterThan(String value) {
            addCriterion("goodText >", value, "goodtext");
            return (Criteria) this;
        }

        public Criteria andGoodtextGreaterThanOrEqualTo(String value) {
            addCriterion("goodText >=", value, "goodtext");
            return (Criteria) this;
        }

        public Criteria andGoodtextLessThan(String value) {
            addCriterion("goodText <", value, "goodtext");
            return (Criteria) this;
        }

        public Criteria andGoodtextLessThanOrEqualTo(String value) {
            addCriterion("goodText <=", value, "goodtext");
            return (Criteria) this;
        }

        public Criteria andGoodtextLike(String value) {
            addCriterion("goodText like", value, "goodtext");
            return (Criteria) this;
        }

        public Criteria andGoodtextNotLike(String value) {
            addCriterion("goodText not like", value, "goodtext");
            return (Criteria) this;
        }

        public Criteria andGoodtextIn(List<String> values) {
            addCriterion("goodText in", values, "goodtext");
            return (Criteria) this;
        }

        public Criteria andGoodtextNotIn(List<String> values) {
            addCriterion("goodText not in", values, "goodtext");
            return (Criteria) this;
        }

        public Criteria andGoodtextBetween(String value1, String value2) {
            addCriterion("goodText between", value1, value2, "goodtext");
            return (Criteria) this;
        }

        public Criteria andGoodtextNotBetween(String value1, String value2) {
            addCriterion("goodText not between", value1, value2, "goodtext");
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
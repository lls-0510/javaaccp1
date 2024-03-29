package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class PostExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PostExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andJurisdictionidIsNull() {
            addCriterion("JurisdictionId is null");
            return (Criteria) this;
        }

        public Criteria andJurisdictionidIsNotNull() {
            addCriterion("JurisdictionId is not null");
            return (Criteria) this;
        }

        public Criteria andJurisdictionidEqualTo(Integer value) {
            addCriterion("JurisdictionId =", value, "jurisdictionid");
            return (Criteria) this;
        }

        public Criteria andJurisdictionidNotEqualTo(Integer value) {
            addCriterion("JurisdictionId <>", value, "jurisdictionid");
            return (Criteria) this;
        }

        public Criteria andJurisdictionidGreaterThan(Integer value) {
            addCriterion("JurisdictionId >", value, "jurisdictionid");
            return (Criteria) this;
        }

        public Criteria andJurisdictionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("JurisdictionId >=", value, "jurisdictionid");
            return (Criteria) this;
        }

        public Criteria andJurisdictionidLessThan(Integer value) {
            addCriterion("JurisdictionId <", value, "jurisdictionid");
            return (Criteria) this;
        }

        public Criteria andJurisdictionidLessThanOrEqualTo(Integer value) {
            addCriterion("JurisdictionId <=", value, "jurisdictionid");
            return (Criteria) this;
        }

        public Criteria andJurisdictionidIn(List<Integer> values) {
            addCriterion("JurisdictionId in", values, "jurisdictionid");
            return (Criteria) this;
        }

        public Criteria andJurisdictionidNotIn(List<Integer> values) {
            addCriterion("JurisdictionId not in", values, "jurisdictionid");
            return (Criteria) this;
        }

        public Criteria andJurisdictionidBetween(Integer value1, Integer value2) {
            addCriterion("JurisdictionId between", value1, value2, "jurisdictionid");
            return (Criteria) this;
        }

        public Criteria andJurisdictionidNotBetween(Integer value1, Integer value2) {
            addCriterion("JurisdictionId not between", value1, value2, "jurisdictionid");
            return (Criteria) this;
        }

        public Criteria andCoummt1IsNull() {
            addCriterion("coummt1 is null");
            return (Criteria) this;
        }

        public Criteria andCoummt1IsNotNull() {
            addCriterion("coummt1 is not null");
            return (Criteria) this;
        }

        public Criteria andCoummt1EqualTo(String value) {
            addCriterion("coummt1 =", value, "coummt1");
            return (Criteria) this;
        }

        public Criteria andCoummt1NotEqualTo(String value) {
            addCriterion("coummt1 <>", value, "coummt1");
            return (Criteria) this;
        }

        public Criteria andCoummt1GreaterThan(String value) {
            addCriterion("coummt1 >", value, "coummt1");
            return (Criteria) this;
        }

        public Criteria andCoummt1GreaterThanOrEqualTo(String value) {
            addCriterion("coummt1 >=", value, "coummt1");
            return (Criteria) this;
        }

        public Criteria andCoummt1LessThan(String value) {
            addCriterion("coummt1 <", value, "coummt1");
            return (Criteria) this;
        }

        public Criteria andCoummt1LessThanOrEqualTo(String value) {
            addCriterion("coummt1 <=", value, "coummt1");
            return (Criteria) this;
        }

        public Criteria andCoummt1Like(String value) {
            addCriterion("coummt1 like", value, "coummt1");
            return (Criteria) this;
        }

        public Criteria andCoummt1NotLike(String value) {
            addCriterion("coummt1 not like", value, "coummt1");
            return (Criteria) this;
        }

        public Criteria andCoummt1In(List<String> values) {
            addCriterion("coummt1 in", values, "coummt1");
            return (Criteria) this;
        }

        public Criteria andCoummt1NotIn(List<String> values) {
            addCriterion("coummt1 not in", values, "coummt1");
            return (Criteria) this;
        }

        public Criteria andCoummt1Between(String value1, String value2) {
            addCriterion("coummt1 between", value1, value2, "coummt1");
            return (Criteria) this;
        }

        public Criteria andCoummt1NotBetween(String value1, String value2) {
            addCriterion("coummt1 not between", value1, value2, "coummt1");
            return (Criteria) this;
        }

        public Criteria andCoummt2IsNull() {
            addCriterion("coummt2 is null");
            return (Criteria) this;
        }

        public Criteria andCoummt2IsNotNull() {
            addCriterion("coummt2 is not null");
            return (Criteria) this;
        }

        public Criteria andCoummt2EqualTo(String value) {
            addCriterion("coummt2 =", value, "coummt2");
            return (Criteria) this;
        }

        public Criteria andCoummt2NotEqualTo(String value) {
            addCriterion("coummt2 <>", value, "coummt2");
            return (Criteria) this;
        }

        public Criteria andCoummt2GreaterThan(String value) {
            addCriterion("coummt2 >", value, "coummt2");
            return (Criteria) this;
        }

        public Criteria andCoummt2GreaterThanOrEqualTo(String value) {
            addCriterion("coummt2 >=", value, "coummt2");
            return (Criteria) this;
        }

        public Criteria andCoummt2LessThan(String value) {
            addCriterion("coummt2 <", value, "coummt2");
            return (Criteria) this;
        }

        public Criteria andCoummt2LessThanOrEqualTo(String value) {
            addCriterion("coummt2 <=", value, "coummt2");
            return (Criteria) this;
        }

        public Criteria andCoummt2Like(String value) {
            addCriterion("coummt2 like", value, "coummt2");
            return (Criteria) this;
        }

        public Criteria andCoummt2NotLike(String value) {
            addCriterion("coummt2 not like", value, "coummt2");
            return (Criteria) this;
        }

        public Criteria andCoummt2In(List<String> values) {
            addCriterion("coummt2 in", values, "coummt2");
            return (Criteria) this;
        }

        public Criteria andCoummt2NotIn(List<String> values) {
            addCriterion("coummt2 not in", values, "coummt2");
            return (Criteria) this;
        }

        public Criteria andCoummt2Between(String value1, String value2) {
            addCriterion("coummt2 between", value1, value2, "coummt2");
            return (Criteria) this;
        }

        public Criteria andCoummt2NotBetween(String value1, String value2) {
            addCriterion("coummt2 not between", value1, value2, "coummt2");
            return (Criteria) this;
        }

        public Criteria andCoummt3IsNull() {
            addCriterion("coummt3 is null");
            return (Criteria) this;
        }

        public Criteria andCoummt3IsNotNull() {
            addCriterion("coummt3 is not null");
            return (Criteria) this;
        }

        public Criteria andCoummt3EqualTo(String value) {
            addCriterion("coummt3 =", value, "coummt3");
            return (Criteria) this;
        }

        public Criteria andCoummt3NotEqualTo(String value) {
            addCriterion("coummt3 <>", value, "coummt3");
            return (Criteria) this;
        }

        public Criteria andCoummt3GreaterThan(String value) {
            addCriterion("coummt3 >", value, "coummt3");
            return (Criteria) this;
        }

        public Criteria andCoummt3GreaterThanOrEqualTo(String value) {
            addCriterion("coummt3 >=", value, "coummt3");
            return (Criteria) this;
        }

        public Criteria andCoummt3LessThan(String value) {
            addCriterion("coummt3 <", value, "coummt3");
            return (Criteria) this;
        }

        public Criteria andCoummt3LessThanOrEqualTo(String value) {
            addCriterion("coummt3 <=", value, "coummt3");
            return (Criteria) this;
        }

        public Criteria andCoummt3Like(String value) {
            addCriterion("coummt3 like", value, "coummt3");
            return (Criteria) this;
        }

        public Criteria andCoummt3NotLike(String value) {
            addCriterion("coummt3 not like", value, "coummt3");
            return (Criteria) this;
        }

        public Criteria andCoummt3In(List<String> values) {
            addCriterion("coummt3 in", values, "coummt3");
            return (Criteria) this;
        }

        public Criteria andCoummt3NotIn(List<String> values) {
            addCriterion("coummt3 not in", values, "coummt3");
            return (Criteria) this;
        }

        public Criteria andCoummt3Between(String value1, String value2) {
            addCriterion("coummt3 between", value1, value2, "coummt3");
            return (Criteria) this;
        }

        public Criteria andCoummt3NotBetween(String value1, String value2) {
            addCriterion("coummt3 not between", value1, value2, "coummt3");
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
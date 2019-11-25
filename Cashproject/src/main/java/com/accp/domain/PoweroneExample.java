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

        public Criteria andFatheridIsNull() {
            addCriterion("fatherid is null");
            return (Criteria) this;
        }

        public Criteria andFatheridIsNotNull() {
            addCriterion("fatherid is not null");
            return (Criteria) this;
        }

        public Criteria andFatheridEqualTo(Integer value) {
            addCriterion("fatherid =", value, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridNotEqualTo(Integer value) {
            addCriterion("fatherid <>", value, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridGreaterThan(Integer value) {
            addCriterion("fatherid >", value, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridGreaterThanOrEqualTo(Integer value) {
            addCriterion("fatherid >=", value, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridLessThan(Integer value) {
            addCriterion("fatherid <", value, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridLessThanOrEqualTo(Integer value) {
            addCriterion("fatherid <=", value, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridIn(List<Integer> values) {
            addCriterion("fatherid in", values, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridNotIn(List<Integer> values) {
            addCriterion("fatherid not in", values, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridBetween(Integer value1, Integer value2) {
            addCriterion("fatherid between", value1, value2, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridNotBetween(Integer value1, Integer value2) {
            addCriterion("fatherid not between", value1, value2, "fatherid");
            return (Criteria) this;
        }

        public Criteria andMenuidIsNull() {
            addCriterion("menuid is null");
            return (Criteria) this;
        }

        public Criteria andMenuidIsNotNull() {
            addCriterion("menuid is not null");
            return (Criteria) this;
        }

        public Criteria andMenuidEqualTo(Integer value) {
            addCriterion("menuid =", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidNotEqualTo(Integer value) {
            addCriterion("menuid <>", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidGreaterThan(Integer value) {
            addCriterion("menuid >", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("menuid >=", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidLessThan(Integer value) {
            addCriterion("menuid <", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidLessThanOrEqualTo(Integer value) {
            addCriterion("menuid <=", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidIn(List<Integer> values) {
            addCriterion("menuid in", values, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidNotIn(List<Integer> values) {
            addCriterion("menuid not in", values, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidBetween(Integer value1, Integer value2) {
            addCriterion("menuid between", value1, value2, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidNotBetween(Integer value1, Integer value2) {
            addCriterion("menuid not between", value1, value2, "menuid");
            return (Criteria) this;
        }

        public Criteria andPathIsNull() {
            addCriterion("path is null");
            return (Criteria) this;
        }

        public Criteria andPathIsNotNull() {
            addCriterion("path is not null");
            return (Criteria) this;
        }

        public Criteria andPathEqualTo(String value) {
            addCriterion("path =", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotEqualTo(String value) {
            addCriterion("path <>", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThan(String value) {
            addCriterion("path >", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThanOrEqualTo(String value) {
            addCriterion("path >=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThan(String value) {
            addCriterion("path <", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThanOrEqualTo(String value) {
            addCriterion("path <=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLike(String value) {
            addCriterion("path like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotLike(String value) {
            addCriterion("path not like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathIn(List<String> values) {
            addCriterion("path in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotIn(List<String> values) {
            addCriterion("path not in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathBetween(String value1, String value2) {
            addCriterion("path between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotBetween(String value1, String value2) {
            addCriterion("path not between", value1, value2, "path");
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
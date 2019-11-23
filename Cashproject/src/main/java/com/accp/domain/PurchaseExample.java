package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PurchaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PurchaseExample() {
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

        protected void addCriterionForJDBCDate(String condition, String value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, value, property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andPuridIsNull() {
            addCriterion("purid is null");
            return (Criteria) this;
        }

        public Criteria andPuridIsNotNull() {
            addCriterion("purid is not null");
            return (Criteria) this;
        }

        public Criteria andPuridEqualTo(Integer value) {
            addCriterion("purid =", value, "purid");
            return (Criteria) this;
        }

        public Criteria andPuridNotEqualTo(Integer value) {
            addCriterion("purid <>", value, "purid");
            return (Criteria) this;
        }

        public Criteria andPuridGreaterThan(Integer value) {
            addCriterion("purid >", value, "purid");
            return (Criteria) this;
        }

        public Criteria andPuridGreaterThanOrEqualTo(Integer value) {
            addCriterion("purid >=", value, "purid");
            return (Criteria) this;
        }

        public Criteria andPuridLessThan(Integer value) {
            addCriterion("purid <", value, "purid");
            return (Criteria) this;
        }

        public Criteria andPuridLessThanOrEqualTo(Integer value) {
            addCriterion("purid <=", value, "purid");
            return (Criteria) this;
        }

        public Criteria andPuridIn(List<Integer> values) {
            addCriterion("purid in", values, "purid");
            return (Criteria) this;
        }

        public Criteria andPuridNotIn(List<Integer> values) {
            addCriterion("purid not in", values, "purid");
            return (Criteria) this;
        }

        public Criteria andPuridBetween(Integer value1, Integer value2) {
            addCriterion("purid between", value1, value2, "purid");
            return (Criteria) this;
        }

        public Criteria andPuridNotBetween(Integer value1, Integer value2) {
            addCriterion("purid not between", value1, value2, "purid");
            return (Criteria) this;
        }

        public Criteria andPurnoIsNull() {
            addCriterion("purno is null");
            return (Criteria) this;
        }

        public Criteria andPurnoIsNotNull() {
            addCriterion("purno is not null");
            return (Criteria) this;
        }

        public Criteria andPurnoEqualTo(String value) {
            addCriterion("purno =", value, "purno");
            return (Criteria) this;
        }

        public Criteria andPurnoNotEqualTo(String value) {
            addCriterion("purno <>", value, "purno");
            return (Criteria) this;
        }

        public Criteria andPurnoGreaterThan(String value) {
            addCriterion("purno >", value, "purno");
            return (Criteria) this;
        }

        public Criteria andPurnoGreaterThanOrEqualTo(String value) {
            addCriterion("purno >=", value, "purno");
            return (Criteria) this;
        }

        public Criteria andPurnoLessThan(String value) {
            addCriterion("purno <", value, "purno");
            return (Criteria) this;
        }

        public Criteria andPurnoLessThanOrEqualTo(String value) {
            addCriterion("purno <=", value, "purno");
            return (Criteria) this;
        }

        public Criteria andPurnoLike(String value) {
            addCriterion("purno like", value, "purno");
            return (Criteria) this;
        }

        public Criteria andPurnoNotLike(String value) {
            addCriterion("purno not like", value, "purno");
            return (Criteria) this;
        }

        public Criteria andPurnoIn(List<String> values) {
            addCriterion("purno in", values, "purno");
            return (Criteria) this;
        }

        public Criteria andPurnoNotIn(List<String> values) {
            addCriterion("purno not in", values, "purno");
            return (Criteria) this;
        }

        public Criteria andPurnoBetween(String value1, String value2) {
            addCriterion("purno between", value1, value2, "purno");
            return (Criteria) this;
        }

        public Criteria andPurnoNotBetween(String value1, String value2) {
            addCriterion("purno not between", value1, value2, "purno");
            return (Criteria) this;
        }

        public Criteria andPurdataIsNull() {
            addCriterion("purdata is null");
            return (Criteria) this;
        }

        public Criteria andPurdataIsNotNull() {
            addCriterion("purdata is not null");
            return (Criteria) this;
        }

        public Criteria andPurdataEqualTo(String value) {
            addCriterionForJDBCDate("purdata =", value, "purdata");
            return (Criteria) this;
        }

        public Criteria andPurdataNotEqualTo(String value) {
            addCriterionForJDBCDate("purdata <>", value, "purdata");
            return (Criteria) this;
        }

        public Criteria andPurdataGreaterThan(String value) {
            addCriterionForJDBCDate("purdata >", value, "purdata");
            return (Criteria) this;
        }

        public Criteria andPurdataGreaterThanOrEqualTo(String value) {
            addCriterionForJDBCDate("purdata >=", value, "purdata");
            return (Criteria) this;
        }

        public Criteria andPurdataLessThan(String value) {
            addCriterionForJDBCDate("purdata <", value, "purdata");
            return (Criteria) this;
        }

        public Criteria andPurdataLessThanOrEqualTo(String value) {
            addCriterionForJDBCDate("purdata <=", value, "purdata");
            return (Criteria) this;
        }

        public Criteria andPurdataIn(List<Date> values) {
            addCriterionForJDBCDate("purdata in", values, "purdata");
            return (Criteria) this;
        }

        public Criteria andPurdataNotIn(List<Date> values) {
            addCriterionForJDBCDate("purdata not in", values, "purdata");
            return (Criteria) this;
        }
 
        public Criteria andPurdataBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("purdata between", value1, value2, "purdata");
            return (Criteria) this;
        }

        public Criteria andPurdataNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("purdata not between", value1, value2, "purdata");
            return (Criteria) this;
        }

        public Criteria andGysidIsNull() {
            addCriterion("gysid is null");
            return (Criteria) this;
        }

        public Criteria andGysidIsNotNull() {
            addCriterion("gysid is not null");
            return (Criteria) this;
        }

        public Criteria andGysidEqualTo(Integer value) {
            addCriterion("gysid =", value, "gysid");
            return (Criteria) this;
        }

        public Criteria andGysidNotEqualTo(Integer value) {
            addCriterion("gysid <>", value, "gysid");
            return (Criteria) this;
        }

        public Criteria andGysidGreaterThan(Integer value) {
            addCriterion("gysid >", value, "gysid");
            return (Criteria) this;
        }

        public Criteria andGysidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gysid >=", value, "gysid");
            return (Criteria) this;
        }

        public Criteria andGysidLessThan(Integer value) {
            addCriterion("gysid <", value, "gysid");
            return (Criteria) this;
        }

        public Criteria andGysidLessThanOrEqualTo(Integer value) {
            addCriterion("gysid <=", value, "gysid");
            return (Criteria) this;
        }

        public Criteria andGysidIn(List<Integer> values) {
            addCriterion("gysid in", values, "gysid");
            return (Criteria) this;
        }

        public Criteria andGysidNotIn(List<Integer> values) {
            addCriterion("gysid not in", values, "gysid");
            return (Criteria) this;
        }

        public Criteria andGysidBetween(Integer value1, Integer value2) {
            addCriterion("gysid between", value1, value2, "gysid");
            return (Criteria) this;
        }

        public Criteria andGysidNotBetween(Integer value1, Integer value2) {
            addCriterion("gysid not between", value1, value2, "gysid");
            return (Criteria) this;
        }

        public Criteria andStaffidIsNull() {
            addCriterion("staffid is null");
            return (Criteria) this;
        }

        public Criteria andStaffidIsNotNull() {
            addCriterion("staffid is not null");
            return (Criteria) this;
        }

        public Criteria andStaffidEqualTo(Integer value) {
            addCriterion("staffid =", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidNotEqualTo(Integer value) {
            addCriterion("staffid <>", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidGreaterThan(Integer value) {
            addCriterion("staffid >", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidGreaterThanOrEqualTo(Integer value) {
            addCriterion("staffid >=", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidLessThan(Integer value) {
            addCriterion("staffid <", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidLessThanOrEqualTo(Integer value) {
            addCriterion("staffid <=", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidIn(List<Integer> values) {
            addCriterion("staffid in", values, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidNotIn(List<Integer> values) {
            addCriterion("staffid not in", values, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidBetween(Integer value1, Integer value2) {
            addCriterion("staffid between", value1, value2, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidNotBetween(Integer value1, Integer value2) {
            addCriterion("staffid not between", value1, value2, "staffid");
            return (Criteria) this;
        }

        public Criteria andPurtextIsNull() {
            addCriterion("purtext is null");
            return (Criteria) this;
        }

        public Criteria andPurtextIsNotNull() {
            addCriterion("purtext is not null");
            return (Criteria) this;
        }

        public Criteria andPurtextEqualTo(String value) {
            addCriterion("purtext =", value, "purtext");
            return (Criteria) this;
        }

        public Criteria andPurtextNotEqualTo(String value) {
            addCriterion("purtext <>", value, "purtext");
            return (Criteria) this;
        }

        public Criteria andPurtextGreaterThan(String value) {
            addCriterion("purtext >", value, "purtext");
            return (Criteria) this;
        }

        public Criteria andPurtextGreaterThanOrEqualTo(String value) {
            addCriterion("purtext >=", value, "purtext");
            return (Criteria) this;
        }

        public Criteria andPurtextLessThan(String value) {
            addCriterion("purtext <", value, "purtext");
            return (Criteria) this;
        }

        public Criteria andPurtextLessThanOrEqualTo(String value) {
            addCriterion("purtext <=", value, "purtext");
            return (Criteria) this;
        }

        public Criteria andPurtextLike(String value) {
            addCriterion("purtext like", value, "purtext");
            return (Criteria) this;
        }

        public Criteria andPurtextNotLike(String value) {
            addCriterion("purtext not like", value, "purtext");
            return (Criteria) this;
        }

        public Criteria andPurtextIn(List<String> values) {
            addCriterion("purtext in", values, "purtext");
            return (Criteria) this;
        }

        public Criteria andPurtextNotIn(List<String> values) {
            addCriterion("purtext not in", values, "purtext");
            return (Criteria) this;
        }

        public Criteria andPurtextBetween(String value1, String value2) {
            addCriterion("purtext between", value1, value2, "purtext");
            return (Criteria) this;
        }

        public Criteria andPurtextNotBetween(String value1, String value2) {
            addCriterion("purtext not between", value1, value2, "purtext");
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
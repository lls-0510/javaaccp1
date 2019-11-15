package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class VipExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VipExample() {
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

        public Criteria andVidIsNull() {
            addCriterion("VID is null");
            return (Criteria) this;
        }

        public Criteria andVidIsNotNull() {
            addCriterion("VID is not null");
            return (Criteria) this;
        }

        public Criteria andVidEqualTo(Integer value) {
            addCriterion("VID =", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotEqualTo(Integer value) {
            addCriterion("VID <>", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidGreaterThan(Integer value) {
            addCriterion("VID >", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidGreaterThanOrEqualTo(Integer value) {
            addCriterion("VID >=", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidLessThan(Integer value) {
            addCriterion("VID <", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidLessThanOrEqualTo(Integer value) {
            addCriterion("VID <=", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidIn(List<Integer> values) {
            addCriterion("VID in", values, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotIn(List<Integer> values) {
            addCriterion("VID not in", values, "vid");
            return (Criteria) this;
        }

        public Criteria andVidBetween(Integer value1, Integer value2) {
            addCriterion("VID between", value1, value2, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotBetween(Integer value1, Integer value2) {
            addCriterion("VID not between", value1, value2, "vid");
            return (Criteria) this;
        }

        public Criteria andVtypeidIsNull() {
            addCriterion("Vtypeid is null");
            return (Criteria) this;
        }

        public Criteria andVtypeidIsNotNull() {
            addCriterion("Vtypeid is not null");
            return (Criteria) this;
        }

        public Criteria andVtypeidEqualTo(Integer value) {
            addCriterion("Vtypeid =", value, "vtypeid");
            return (Criteria) this;
        }

        public Criteria andVtypeidNotEqualTo(Integer value) {
            addCriterion("Vtypeid <>", value, "vtypeid");
            return (Criteria) this;
        }

        public Criteria andVtypeidGreaterThan(Integer value) {
            addCriterion("Vtypeid >", value, "vtypeid");
            return (Criteria) this;
        }

        public Criteria andVtypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("Vtypeid >=", value, "vtypeid");
            return (Criteria) this;
        }

        public Criteria andVtypeidLessThan(Integer value) {
            addCriterion("Vtypeid <", value, "vtypeid");
            return (Criteria) this;
        }

        public Criteria andVtypeidLessThanOrEqualTo(Integer value) {
            addCriterion("Vtypeid <=", value, "vtypeid");
            return (Criteria) this;
        }

        public Criteria andVtypeidIn(List<Integer> values) {
            addCriterion("Vtypeid in", values, "vtypeid");
            return (Criteria) this;
        }

        public Criteria andVtypeidNotIn(List<Integer> values) {
            addCriterion("Vtypeid not in", values, "vtypeid");
            return (Criteria) this;
        }

        public Criteria andVtypeidBetween(Integer value1, Integer value2) {
            addCriterion("Vtypeid between", value1, value2, "vtypeid");
            return (Criteria) this;
        }

        public Criteria andVtypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("Vtypeid not between", value1, value2, "vtypeid");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("Userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("Userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("Userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("Userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("Userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("Userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("Userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("Userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("Userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("Userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("Userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("Userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andIntegralIsNull() {
            addCriterion("Integral is null");
            return (Criteria) this;
        }

        public Criteria andIntegralIsNotNull() {
            addCriterion("Integral is not null");
            return (Criteria) this;
        }

        public Criteria andIntegralEqualTo(String value) {
            addCriterion("Integral =", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotEqualTo(String value) {
            addCriterion("Integral <>", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralGreaterThan(String value) {
            addCriterion("Integral >", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralGreaterThanOrEqualTo(String value) {
            addCriterion("Integral >=", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralLessThan(String value) {
            addCriterion("Integral <", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralLessThanOrEqualTo(String value) {
            addCriterion("Integral <=", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralLike(String value) {
            addCriterion("Integral like", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotLike(String value) {
            addCriterion("Integral not like", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralIn(List<String> values) {
            addCriterion("Integral in", values, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotIn(List<String> values) {
            addCriterion("Integral not in", values, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralBetween(String value1, String value2) {
            addCriterion("Integral between", value1, value2, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotBetween(String value1, String value2) {
            addCriterion("Integral not between", value1, value2, "integral");
            return (Criteria) this;
        }

        public Criteria andTransactionIsNull() {
            addCriterion("Transaction is null");
            return (Criteria) this;
        }

        public Criteria andTransactionIsNotNull() {
            addCriterion("Transaction is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionEqualTo(Integer value) {
            addCriterion("Transaction =", value, "transaction");
            return (Criteria) this;
        }

        public Criteria andTransactionNotEqualTo(Integer value) {
            addCriterion("Transaction <>", value, "transaction");
            return (Criteria) this;
        }

        public Criteria andTransactionGreaterThan(Integer value) {
            addCriterion("Transaction >", value, "transaction");
            return (Criteria) this;
        }

        public Criteria andTransactionGreaterThanOrEqualTo(Integer value) {
            addCriterion("Transaction >=", value, "transaction");
            return (Criteria) this;
        }

        public Criteria andTransactionLessThan(Integer value) {
            addCriterion("Transaction <", value, "transaction");
            return (Criteria) this;
        }

        public Criteria andTransactionLessThanOrEqualTo(Integer value) {
            addCriterion("Transaction <=", value, "transaction");
            return (Criteria) this;
        }

        public Criteria andTransactionIn(List<Integer> values) {
            addCriterion("Transaction in", values, "transaction");
            return (Criteria) this;
        }

        public Criteria andTransactionNotIn(List<Integer> values) {
            addCriterion("Transaction not in", values, "transaction");
            return (Criteria) this;
        }

        public Criteria andTransactionBetween(Integer value1, Integer value2) {
            addCriterion("Transaction between", value1, value2, "transaction");
            return (Criteria) this;
        }

        public Criteria andTransactionNotBetween(Integer value1, Integer value2) {
            addCriterion("Transaction not between", value1, value2, "transaction");
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
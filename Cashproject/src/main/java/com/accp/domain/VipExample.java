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

        public Criteria andVnameIsNull() {
            addCriterion("vname is null");
            return (Criteria) this;
        }

        public Criteria andVnameIsNotNull() {
            addCriterion("vname is not null");
            return (Criteria) this;
        }

        public Criteria andVnameEqualTo(String value) {
            addCriterion("vname =", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameNotEqualTo(String value) {
            addCriterion("vname <>", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameGreaterThan(String value) {
            addCriterion("vname >", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameGreaterThanOrEqualTo(String value) {
            addCriterion("vname >=", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameLessThan(String value) {
            addCriterion("vname <", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameLessThanOrEqualTo(String value) {
            addCriterion("vname <=", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameLike(String value) {
            addCriterion("vname like", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameNotLike(String value) {
            addCriterion("vname not like", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameIn(List<String> values) {
            addCriterion("vname in", values, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameNotIn(List<String> values) {
            addCriterion("vname not in", values, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameBetween(String value1, String value2) {
            addCriterion("vname between", value1, value2, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameNotBetween(String value1, String value2) {
            addCriterion("vname not between", value1, value2, "vname");
            return (Criteria) this;
        }

        public Criteria andVphoneIsNull() {
            addCriterion("vphone is null");
            return (Criteria) this;
        }

        public Criteria andVphoneIsNotNull() {
            addCriterion("vphone is not null");
            return (Criteria) this;
        }

        public Criteria andVphoneEqualTo(String value) {
            addCriterion("vphone =", value, "vphone");
            return (Criteria) this;
        }

        public Criteria andVphoneNotEqualTo(String value) {
            addCriterion("vphone <>", value, "vphone");
            return (Criteria) this;
        }

        public Criteria andVphoneGreaterThan(String value) {
            addCriterion("vphone >", value, "vphone");
            return (Criteria) this;
        }

        public Criteria andVphoneGreaterThanOrEqualTo(String value) {
            addCriterion("vphone >=", value, "vphone");
            return (Criteria) this;
        }

        public Criteria andVphoneLessThan(String value) {
            addCriterion("vphone <", value, "vphone");
            return (Criteria) this;
        }

        public Criteria andVphoneLessThanOrEqualTo(String value) {
            addCriterion("vphone <=", value, "vphone");
            return (Criteria) this;
        }

        public Criteria andVphoneLike(String value) {
            addCriterion("vphone like", value, "vphone");
            return (Criteria) this;
        }

        public Criteria andVphoneNotLike(String value) {
            addCriterion("vphone not like", value, "vphone");
            return (Criteria) this;
        }

        public Criteria andVphoneIn(List<String> values) {
            addCriterion("vphone in", values, "vphone");
            return (Criteria) this;
        }

        public Criteria andVphoneNotIn(List<String> values) {
            addCriterion("vphone not in", values, "vphone");
            return (Criteria) this;
        }

        public Criteria andVphoneBetween(String value1, String value2) {
            addCriterion("vphone between", value1, value2, "vphone");
            return (Criteria) this;
        }

        public Criteria andVphoneNotBetween(String value1, String value2) {
            addCriterion("vphone not between", value1, value2, "vphone");
            return (Criteria) this;
        }

        public Criteria andVpriceIsNull() {
            addCriterion("vprice is null");
            return (Criteria) this;
        }

        public Criteria andVpriceIsNotNull() {
            addCriterion("vprice is not null");
            return (Criteria) this;
        }

        public Criteria andVpriceEqualTo(String value) {
            addCriterion("vprice =", value, "vprice");
            return (Criteria) this;
        }

        public Criteria andVpriceNotEqualTo(String value) {
            addCriterion("vprice <>", value, "vprice");
            return (Criteria) this;
        }

        public Criteria andVpriceGreaterThan(String value) {
            addCriterion("vprice >", value, "vprice");
            return (Criteria) this;
        }

        public Criteria andVpriceGreaterThanOrEqualTo(String value) {
            addCriterion("vprice >=", value, "vprice");
            return (Criteria) this;
        }

        public Criteria andVpriceLessThan(String value) {
            addCriterion("vprice <", value, "vprice");
            return (Criteria) this;
        }

        public Criteria andVpriceLessThanOrEqualTo(String value) {
            addCriterion("vprice <=", value, "vprice");
            return (Criteria) this;
        }

        public Criteria andVpriceLike(String value) {
            addCriterion("vprice like", value, "vprice");
            return (Criteria) this;
        }

        public Criteria andVpriceNotLike(String value) {
            addCriterion("vprice not like", value, "vprice");
            return (Criteria) this;
        }

        public Criteria andVpriceIn(List<String> values) {
            addCriterion("vprice in", values, "vprice");
            return (Criteria) this;
        }

        public Criteria andVpriceNotIn(List<String> values) {
            addCriterion("vprice not in", values, "vprice");
            return (Criteria) this;
        }

        public Criteria andVpriceBetween(String value1, String value2) {
            addCriterion("vprice between", value1, value2, "vprice");
            return (Criteria) this;
        }

        public Criteria andVpriceNotBetween(String value1, String value2) {
            addCriterion("vprice not between", value1, value2, "vprice");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andCommt1IsNull() {
            addCriterion("commt1 is null");
            return (Criteria) this;
        }

        public Criteria andCommt1IsNotNull() {
            addCriterion("commt1 is not null");
            return (Criteria) this;
        }

        public Criteria andCommt1EqualTo(String value) {
            addCriterion("commt1 =", value, "commt1");
            return (Criteria) this;
        }

        public Criteria andCommt1NotEqualTo(String value) {
            addCriterion("commt1 <>", value, "commt1");
            return (Criteria) this;
        }

        public Criteria andCommt1GreaterThan(String value) {
            addCriterion("commt1 >", value, "commt1");
            return (Criteria) this;
        }

        public Criteria andCommt1GreaterThanOrEqualTo(String value) {
            addCriterion("commt1 >=", value, "commt1");
            return (Criteria) this;
        }

        public Criteria andCommt1LessThan(String value) {
            addCriterion("commt1 <", value, "commt1");
            return (Criteria) this;
        }

        public Criteria andCommt1LessThanOrEqualTo(String value) {
            addCriterion("commt1 <=", value, "commt1");
            return (Criteria) this;
        }

        public Criteria andCommt1Like(String value) {
            addCriterion("commt1 like", value, "commt1");
            return (Criteria) this;
        }

        public Criteria andCommt1NotLike(String value) {
            addCriterion("commt1 not like", value, "commt1");
            return (Criteria) this;
        }

        public Criteria andCommt1In(List<String> values) {
            addCriterion("commt1 in", values, "commt1");
            return (Criteria) this;
        }

        public Criteria andCommt1NotIn(List<String> values) {
            addCriterion("commt1 not in", values, "commt1");
            return (Criteria) this;
        }

        public Criteria andCommt1Between(String value1, String value2) {
            addCriterion("commt1 between", value1, value2, "commt1");
            return (Criteria) this;
        }

        public Criteria andCommt1NotBetween(String value1, String value2) {
            addCriterion("commt1 not between", value1, value2, "commt1");
            return (Criteria) this;
        }

        public Criteria andCommt2IsNull() {
            addCriterion("commt2 is null");
            return (Criteria) this;
        }

        public Criteria andCommt2IsNotNull() {
            addCriterion("commt2 is not null");
            return (Criteria) this;
        }

        public Criteria andCommt2EqualTo(String value) {
            addCriterion("commt2 =", value, "commt2");
            return (Criteria) this;
        }

        public Criteria andCommt2NotEqualTo(String value) {
            addCriterion("commt2 <>", value, "commt2");
            return (Criteria) this;
        }

        public Criteria andCommt2GreaterThan(String value) {
            addCriterion("commt2 >", value, "commt2");
            return (Criteria) this;
        }

        public Criteria andCommt2GreaterThanOrEqualTo(String value) {
            addCriterion("commt2 >=", value, "commt2");
            return (Criteria) this;
        }

        public Criteria andCommt2LessThan(String value) {
            addCriterion("commt2 <", value, "commt2");
            return (Criteria) this;
        }

        public Criteria andCommt2LessThanOrEqualTo(String value) {
            addCriterion("commt2 <=", value, "commt2");
            return (Criteria) this;
        }

        public Criteria andCommt2Like(String value) {
            addCriterion("commt2 like", value, "commt2");
            return (Criteria) this;
        }

        public Criteria andCommt2NotLike(String value) {
            addCriterion("commt2 not like", value, "commt2");
            return (Criteria) this;
        }

        public Criteria andCommt2In(List<String> values) {
            addCriterion("commt2 in", values, "commt2");
            return (Criteria) this;
        }

        public Criteria andCommt2NotIn(List<String> values) {
            addCriterion("commt2 not in", values, "commt2");
            return (Criteria) this;
        }

        public Criteria andCommt2Between(String value1, String value2) {
            addCriterion("commt2 between", value1, value2, "commt2");
            return (Criteria) this;
        }

        public Criteria andCommt2NotBetween(String value1, String value2) {
            addCriterion("commt2 not between", value1, value2, "commt2");
            return (Criteria) this;
        }

        public Criteria andCommt3IsNull() {
            addCriterion("commt3 is null");
            return (Criteria) this;
        }

        public Criteria andCommt3IsNotNull() {
            addCriterion("commt3 is not null");
            return (Criteria) this;
        }

        public Criteria andCommt3EqualTo(String value) {
            addCriterion("commt3 =", value, "commt3");
            return (Criteria) this;
        }

        public Criteria andCommt3NotEqualTo(String value) {
            addCriterion("commt3 <>", value, "commt3");
            return (Criteria) this;
        }

        public Criteria andCommt3GreaterThan(String value) {
            addCriterion("commt3 >", value, "commt3");
            return (Criteria) this;
        }

        public Criteria andCommt3GreaterThanOrEqualTo(String value) {
            addCriterion("commt3 >=", value, "commt3");
            return (Criteria) this;
        }

        public Criteria andCommt3LessThan(String value) {
            addCriterion("commt3 <", value, "commt3");
            return (Criteria) this;
        }

        public Criteria andCommt3LessThanOrEqualTo(String value) {
            addCriterion("commt3 <=", value, "commt3");
            return (Criteria) this;
        }

        public Criteria andCommt3Like(String value) {
            addCriterion("commt3 like", value, "commt3");
            return (Criteria) this;
        }

        public Criteria andCommt3NotLike(String value) {
            addCriterion("commt3 not like", value, "commt3");
            return (Criteria) this;
        }

        public Criteria andCommt3In(List<String> values) {
            addCriterion("commt3 in", values, "commt3");
            return (Criteria) this;
        }

        public Criteria andCommt3NotIn(List<String> values) {
            addCriterion("commt3 not in", values, "commt3");
            return (Criteria) this;
        }

        public Criteria andCommt3Between(String value1, String value2) {
            addCriterion("commt3 between", value1, value2, "commt3");
            return (Criteria) this;
        }

        public Criteria andCommt3NotBetween(String value1, String value2) {
            addCriterion("commt3 not between", value1, value2, "commt3");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andStreetIsNull() {
            addCriterion("street is null");
            return (Criteria) this;
        }

        public Criteria andStreetIsNotNull() {
            addCriterion("street is not null");
            return (Criteria) this;
        }

        public Criteria andStreetEqualTo(String value) {
            addCriterion("street =", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotEqualTo(String value) {
            addCriterion("street <>", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetGreaterThan(String value) {
            addCriterion("street >", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetGreaterThanOrEqualTo(String value) {
            addCriterion("street >=", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLessThan(String value) {
            addCriterion("street <", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLessThanOrEqualTo(String value) {
            addCriterion("street <=", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLike(String value) {
            addCriterion("street like", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotLike(String value) {
            addCriterion("street not like", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetIn(List<String> values) {
            addCriterion("street in", values, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotIn(List<String> values) {
            addCriterion("street not in", values, "street");
            return (Criteria) this;
        }

        public Criteria andStreetBetween(String value1, String value2) {
            addCriterion("street between", value1, value2, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotBetween(String value1, String value2) {
            addCriterion("street not between", value1, value2, "street");
            return (Criteria) this;
        }

        public Criteria andVpwdIsNull() {
            addCriterion("vpwd is null");
            return (Criteria) this;
        }

        public Criteria andVpwdIsNotNull() {
            addCriterion("vpwd is not null");
            return (Criteria) this;
        }

        public Criteria andVpwdEqualTo(String value) {
            addCriterion("vpwd =", value, "vpwd");
            return (Criteria) this;
        }

        public Criteria andVpwdNotEqualTo(String value) {
            addCriterion("vpwd <>", value, "vpwd");
            return (Criteria) this;
        }

        public Criteria andVpwdGreaterThan(String value) {
            addCriterion("vpwd >", value, "vpwd");
            return (Criteria) this;
        }

        public Criteria andVpwdGreaterThanOrEqualTo(String value) {
            addCriterion("vpwd >=", value, "vpwd");
            return (Criteria) this;
        }

        public Criteria andVpwdLessThan(String value) {
            addCriterion("vpwd <", value, "vpwd");
            return (Criteria) this;
        }

        public Criteria andVpwdLessThanOrEqualTo(String value) {
            addCriterion("vpwd <=", value, "vpwd");
            return (Criteria) this;
        }

        public Criteria andVpwdLike(String value) {
            addCriterion("vpwd like", value, "vpwd");
            return (Criteria) this;
        }

        public Criteria andVpwdNotLike(String value) {
            addCriterion("vpwd not like", value, "vpwd");
            return (Criteria) this;
        }

        public Criteria andVpwdIn(List<String> values) {
            addCriterion("vpwd in", values, "vpwd");
            return (Criteria) this;
        }

        public Criteria andVpwdNotIn(List<String> values) {
            addCriterion("vpwd not in", values, "vpwd");
            return (Criteria) this;
        }

        public Criteria andVpwdBetween(String value1, String value2) {
            addCriterion("vpwd between", value1, value2, "vpwd");
            return (Criteria) this;
        }

        public Criteria andVpwdNotBetween(String value1, String value2) {
            addCriterion("vpwd not between", value1, value2, "vpwd");
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
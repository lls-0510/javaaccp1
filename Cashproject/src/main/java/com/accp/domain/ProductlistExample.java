package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class ProductlistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductlistExample() {
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

        public Criteria andPridIsNull() {
            addCriterion("prid is null");
            return (Criteria) this;
        }

        public Criteria andPridIsNotNull() {
            addCriterion("prid is not null");
            return (Criteria) this;
        }

        public Criteria andPridEqualTo(Integer value) {
            addCriterion("prid =", value, "prid");
            return (Criteria) this;
        }

        public Criteria andPridNotEqualTo(Integer value) {
            addCriterion("prid <>", value, "prid");
            return (Criteria) this;
        }

        public Criteria andPridGreaterThan(Integer value) {
            addCriterion("prid >", value, "prid");
            return (Criteria) this;
        }

        public Criteria andPridGreaterThanOrEqualTo(Integer value) {
            addCriterion("prid >=", value, "prid");
            return (Criteria) this;
        }

        public Criteria andPridLessThan(Integer value) {
            addCriterion("prid <", value, "prid");
            return (Criteria) this;
        }

        public Criteria andPridLessThanOrEqualTo(Integer value) {
            addCriterion("prid <=", value, "prid");
            return (Criteria) this;
        }

        public Criteria andPridIn(List<Integer> values) {
            addCriterion("prid in", values, "prid");
            return (Criteria) this;
        }

        public Criteria andPridNotIn(List<Integer> values) {
            addCriterion("prid not in", values, "prid");
            return (Criteria) this;
        }

        public Criteria andPridBetween(Integer value1, Integer value2) {
            addCriterion("prid between", value1, value2, "prid");
            return (Criteria) this;
        }

        public Criteria andPridNotBetween(Integer value1, Integer value2) {
            addCriterion("prid not between", value1, value2, "prid");
            return (Criteria) this;
        }

        public Criteria andProidIsNull() {
            addCriterion("proid is null");
            return (Criteria) this;
        }

        public Criteria andProidIsNotNull() {
            addCriterion("proid is not null");
            return (Criteria) this;
        }

        public Criteria andProidEqualTo(Integer value) {
            addCriterion("proid =", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidNotEqualTo(Integer value) {
            addCriterion("proid <>", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidGreaterThan(Integer value) {
            addCriterion("proid >", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidGreaterThanOrEqualTo(Integer value) {
            addCriterion("proid >=", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidLessThan(Integer value) {
            addCriterion("proid <", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidLessThanOrEqualTo(Integer value) {
            addCriterion("proid <=", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidIn(List<Integer> values) {
            addCriterion("proid in", values, "proid");
            return (Criteria) this;
        }

        public Criteria andProidNotIn(List<Integer> values) {
            addCriterion("proid not in", values, "proid");
            return (Criteria) this;
        }

        public Criteria andProidBetween(Integer value1, Integer value2) {
            addCriterion("proid between", value1, value2, "proid");
            return (Criteria) this;
        }

        public Criteria andProidNotBetween(Integer value1, Integer value2) {
            addCriterion("proid not between", value1, value2, "proid");
            return (Criteria) this;
        }

        public Criteria andPronameIsNull() {
            addCriterion("ProName is null");
            return (Criteria) this;
        }

        public Criteria andPronameIsNotNull() {
            addCriterion("ProName is not null");
            return (Criteria) this;
        }

        public Criteria andPronameEqualTo(String value) {
            addCriterion("ProName =", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotEqualTo(String value) {
            addCriterion("ProName <>", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameGreaterThan(String value) {
            addCriterion("ProName >", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameGreaterThanOrEqualTo(String value) {
            addCriterion("ProName >=", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameLessThan(String value) {
            addCriterion("ProName <", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameLessThanOrEqualTo(String value) {
            addCriterion("ProName <=", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameLike(String value) {
            addCriterion("ProName like", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotLike(String value) {
            addCriterion("ProName not like", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameIn(List<String> values) {
            addCriterion("ProName in", values, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotIn(List<String> values) {
            addCriterion("ProName not in", values, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameBetween(String value1, String value2) {
            addCriterion("ProName between", value1, value2, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotBetween(String value1, String value2) {
            addCriterion("ProName not between", value1, value2, "proname");
            return (Criteria) this;
        }

        public Criteria andPronumberIsNull() {
            addCriterion("Pronumber is null");
            return (Criteria) this;
        }

        public Criteria andPronumberIsNotNull() {
            addCriterion("Pronumber is not null");
            return (Criteria) this;
        }

        public Criteria andPronumberEqualTo(String value) {
            addCriterion("Pronumber =", value, "pronumber");
            return (Criteria) this;
        }

        public Criteria andPronumberNotEqualTo(String value) {
            addCriterion("Pronumber <>", value, "pronumber");
            return (Criteria) this;
        }

        public Criteria andPronumberGreaterThan(String value) {
            addCriterion("Pronumber >", value, "pronumber");
            return (Criteria) this;
        }

        public Criteria andPronumberGreaterThanOrEqualTo(String value) {
            addCriterion("Pronumber >=", value, "pronumber");
            return (Criteria) this;
        }

        public Criteria andPronumberLessThan(String value) {
            addCriterion("Pronumber <", value, "pronumber");
            return (Criteria) this;
        }

        public Criteria andPronumberLessThanOrEqualTo(String value) {
            addCriterion("Pronumber <=", value, "pronumber");
            return (Criteria) this;
        }

        public Criteria andPronumberLike(String value) {
            addCriterion("Pronumber like", value, "pronumber");
            return (Criteria) this;
        }

        public Criteria andPronumberNotLike(String value) {
            addCriterion("Pronumber not like", value, "pronumber");
            return (Criteria) this;
        }

        public Criteria andPronumberIn(List<String> values) {
            addCriterion("Pronumber in", values, "pronumber");
            return (Criteria) this;
        }

        public Criteria andPronumberNotIn(List<String> values) {
            addCriterion("Pronumber not in", values, "pronumber");
            return (Criteria) this;
        }

        public Criteria andPronumberBetween(String value1, String value2) {
            addCriterion("Pronumber between", value1, value2, "pronumber");
            return (Criteria) this;
        }

        public Criteria andPronumberNotBetween(String value1, String value2) {
            addCriterion("Pronumber not between", value1, value2, "pronumber");
            return (Criteria) this;
        }

        public Criteria andSpecificationsIsNull() {
            addCriterion("Specifications is null");
            return (Criteria) this;
        }

        public Criteria andSpecificationsIsNotNull() {
            addCriterion("Specifications is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificationsEqualTo(String value) {
            addCriterion("Specifications =", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsNotEqualTo(String value) {
            addCriterion("Specifications <>", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsGreaterThan(String value) {
            addCriterion("Specifications >", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsGreaterThanOrEqualTo(String value) {
            addCriterion("Specifications >=", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsLessThan(String value) {
            addCriterion("Specifications <", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsLessThanOrEqualTo(String value) {
            addCriterion("Specifications <=", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsLike(String value) {
            addCriterion("Specifications like", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsNotLike(String value) {
            addCriterion("Specifications not like", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsIn(List<String> values) {
            addCriterion("Specifications in", values, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsNotIn(List<String> values) {
            addCriterion("Specifications not in", values, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsBetween(String value1, String value2) {
            addCriterion("Specifications between", value1, value2, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsNotBetween(String value1, String value2) {
            addCriterion("Specifications not between", value1, value2, "specifications");
            return (Criteria) this;
        }

        public Criteria andProstockIsNull() {
            addCriterion("ProStock is null");
            return (Criteria) this;
        }

        public Criteria andProstockIsNotNull() {
            addCriterion("ProStock is not null");
            return (Criteria) this;
        }

        public Criteria andProstockEqualTo(String value) {
            addCriterion("ProStock =", value, "prostock");
            return (Criteria) this;
        }

        public Criteria andProstockNotEqualTo(String value) {
            addCriterion("ProStock <>", value, "prostock");
            return (Criteria) this;
        }

        public Criteria andProstockGreaterThan(String value) {
            addCriterion("ProStock >", value, "prostock");
            return (Criteria) this;
        }

        public Criteria andProstockGreaterThanOrEqualTo(String value) {
            addCriterion("ProStock >=", value, "prostock");
            return (Criteria) this;
        }

        public Criteria andProstockLessThan(String value) {
            addCriterion("ProStock <", value, "prostock");
            return (Criteria) this;
        }

        public Criteria andProstockLessThanOrEqualTo(String value) {
            addCriterion("ProStock <=", value, "prostock");
            return (Criteria) this;
        }

        public Criteria andProstockLike(String value) {
            addCriterion("ProStock like", value, "prostock");
            return (Criteria) this;
        }

        public Criteria andProstockNotLike(String value) {
            addCriterion("ProStock not like", value, "prostock");
            return (Criteria) this;
        }

        public Criteria andProstockIn(List<String> values) {
            addCriterion("ProStock in", values, "prostock");
            return (Criteria) this;
        }

        public Criteria andProstockNotIn(List<String> values) {
            addCriterion("ProStock not in", values, "prostock");
            return (Criteria) this;
        }

        public Criteria andProstockBetween(String value1, String value2) {
            addCriterion("ProStock between", value1, value2, "prostock");
            return (Criteria) this;
        }

        public Criteria andProstockNotBetween(String value1, String value2) {
            addCriterion("ProStock not between", value1, value2, "prostock");
            return (Criteria) this;
        }

        public Criteria andSellingpriceIsNull() {
            addCriterion("Sellingprice is null");
            return (Criteria) this;
        }

        public Criteria andSellingpriceIsNotNull() {
            addCriterion("Sellingprice is not null");
            return (Criteria) this;
        }

        public Criteria andSellingpriceEqualTo(Float value) {
            addCriterion("Sellingprice =", value, "sellingprice");
            return (Criteria) this;
        }

        public Criteria andSellingpriceNotEqualTo(Float value) {
            addCriterion("Sellingprice <>", value, "sellingprice");
            return (Criteria) this;
        }

        public Criteria andSellingpriceGreaterThan(Float value) {
            addCriterion("Sellingprice >", value, "sellingprice");
            return (Criteria) this;
        }

        public Criteria andSellingpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("Sellingprice >=", value, "sellingprice");
            return (Criteria) this;
        }

        public Criteria andSellingpriceLessThan(Float value) {
            addCriterion("Sellingprice <", value, "sellingprice");
            return (Criteria) this;
        }

        public Criteria andSellingpriceLessThanOrEqualTo(Float value) {
            addCriterion("Sellingprice <=", value, "sellingprice");
            return (Criteria) this;
        }

        public Criteria andSellingpriceIn(List<Float> values) {
            addCriterion("Sellingprice in", values, "sellingprice");
            return (Criteria) this;
        }

        public Criteria andSellingpriceNotIn(List<Float> values) {
            addCriterion("Sellingprice not in", values, "sellingprice");
            return (Criteria) this;
        }

        public Criteria andSellingpriceBetween(Float value1, Float value2) {
            addCriterion("Sellingprice between", value1, value2, "sellingprice");
            return (Criteria) this;
        }

        public Criteria andSellingpriceNotBetween(Float value1, Float value2) {
            addCriterion("Sellingprice not between", value1, value2, "sellingprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceIsNull() {
            addCriterion("Costprice is null");
            return (Criteria) this;
        }

        public Criteria andCostpriceIsNotNull() {
            addCriterion("Costprice is not null");
            return (Criteria) this;
        }

        public Criteria andCostpriceEqualTo(Float value) {
            addCriterion("Costprice =", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceNotEqualTo(Float value) {
            addCriterion("Costprice <>", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceGreaterThan(Float value) {
            addCriterion("Costprice >", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("Costprice >=", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceLessThan(Float value) {
            addCriterion("Costprice <", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceLessThanOrEqualTo(Float value) {
            addCriterion("Costprice <=", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceIn(List<Float> values) {
            addCriterion("Costprice in", values, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceNotIn(List<Float> values) {
            addCriterion("Costprice not in", values, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceBetween(Float value1, Float value2) {
            addCriterion("Costprice between", value1, value2, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceNotBetween(Float value1, Float value2) {
            addCriterion("Costprice not between", value1, value2, "costprice");
            return (Criteria) this;
        }

        public Criteria andImgIsNull() {
            addCriterion("Img is null");
            return (Criteria) this;
        }

        public Criteria andImgIsNotNull() {
            addCriterion("Img is not null");
            return (Criteria) this;
        }

        public Criteria andImgEqualTo(String value) {
            addCriterion("Img =", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotEqualTo(String value) {
            addCriterion("Img <>", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThan(String value) {
            addCriterion("Img >", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThanOrEqualTo(String value) {
            addCriterion("Img >=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThan(String value) {
            addCriterion("Img <", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThanOrEqualTo(String value) {
            addCriterion("Img <=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLike(String value) {
            addCriterion("Img like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotLike(String value) {
            addCriterion("Img not like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgIn(List<String> values) {
            addCriterion("Img in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotIn(List<String> values) {
            addCriterion("Img not in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgBetween(String value1, String value2) {
            addCriterion("Img between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotBetween(String value1, String value2) {
            addCriterion("Img not between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("Number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("Number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Integer value) {
            addCriterion("Number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Integer value) {
            addCriterion("Number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Integer value) {
            addCriterion("Number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("Number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Integer value) {
            addCriterion("Number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Integer value) {
            addCriterion("Number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Integer> values) {
            addCriterion("Number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Integer> values) {
            addCriterion("Number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Integer value1, Integer value2) {
            addCriterion("Number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("Number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andProitemIsNull() {
            addCriterion("Proitem is null");
            return (Criteria) this;
        }

        public Criteria andProitemIsNotNull() {
            addCriterion("Proitem is not null");
            return (Criteria) this;
        }

        public Criteria andProitemEqualTo(String value) {
            addCriterion("Proitem =", value, "proitem");
            return (Criteria) this;
        }

        public Criteria andProitemNotEqualTo(String value) {
            addCriterion("Proitem <>", value, "proitem");
            return (Criteria) this;
        }

        public Criteria andProitemGreaterThan(String value) {
            addCriterion("Proitem >", value, "proitem");
            return (Criteria) this;
        }

        public Criteria andProitemGreaterThanOrEqualTo(String value) {
            addCriterion("Proitem >=", value, "proitem");
            return (Criteria) this;
        }

        public Criteria andProitemLessThan(String value) {
            addCriterion("Proitem <", value, "proitem");
            return (Criteria) this;
        }

        public Criteria andProitemLessThanOrEqualTo(String value) {
            addCriterion("Proitem <=", value, "proitem");
            return (Criteria) this;
        }

        public Criteria andProitemLike(String value) {
            addCriterion("Proitem like", value, "proitem");
            return (Criteria) this;
        }

        public Criteria andProitemNotLike(String value) {
            addCriterion("Proitem not like", value, "proitem");
            return (Criteria) this;
        }

        public Criteria andProitemIn(List<String> values) {
            addCriterion("Proitem in", values, "proitem");
            return (Criteria) this;
        }

        public Criteria andProitemNotIn(List<String> values) {
            addCriterion("Proitem not in", values, "proitem");
            return (Criteria) this;
        }

        public Criteria andProitemBetween(String value1, String value2) {
            addCriterion("Proitem between", value1, value2, "proitem");
            return (Criteria) this;
        }

        public Criteria andProitemNotBetween(String value1, String value2) {
            addCriterion("Proitem not between", value1, value2, "proitem");
            return (Criteria) this;
        }

        public Criteria andProcargoIsNull() {
            addCriterion("ProCargo is null");
            return (Criteria) this;
        }

        public Criteria andProcargoIsNotNull() {
            addCriterion("ProCargo is not null");
            return (Criteria) this;
        }

        public Criteria andProcargoEqualTo(String value) {
            addCriterion("ProCargo =", value, "procargo");
            return (Criteria) this;
        }

        public Criteria andProcargoNotEqualTo(String value) {
            addCriterion("ProCargo <>", value, "procargo");
            return (Criteria) this;
        }

        public Criteria andProcargoGreaterThan(String value) {
            addCriterion("ProCargo >", value, "procargo");
            return (Criteria) this;
        }

        public Criteria andProcargoGreaterThanOrEqualTo(String value) {
            addCriterion("ProCargo >=", value, "procargo");
            return (Criteria) this;
        }

        public Criteria andProcargoLessThan(String value) {
            addCriterion("ProCargo <", value, "procargo");
            return (Criteria) this;
        }

        public Criteria andProcargoLessThanOrEqualTo(String value) {
            addCriterion("ProCargo <=", value, "procargo");
            return (Criteria) this;
        }

        public Criteria andProcargoLike(String value) {
            addCriterion("ProCargo like", value, "procargo");
            return (Criteria) this;
        }

        public Criteria andProcargoNotLike(String value) {
            addCriterion("ProCargo not like", value, "procargo");
            return (Criteria) this;
        }

        public Criteria andProcargoIn(List<String> values) {
            addCriterion("ProCargo in", values, "procargo");
            return (Criteria) this;
        }

        public Criteria andProcargoNotIn(List<String> values) {
            addCriterion("ProCargo not in", values, "procargo");
            return (Criteria) this;
        }

        public Criteria andProcargoBetween(String value1, String value2) {
            addCriterion("ProCargo between", value1, value2, "procargo");
            return (Criteria) this;
        }

        public Criteria andProcargoNotBetween(String value1, String value2) {
            addCriterion("ProCargo not between", value1, value2, "procargo");
            return (Criteria) this;
        }

        public Criteria andColorIsNull() {
            addCriterion("Color is null");
            return (Criteria) this;
        }

        public Criteria andColorIsNotNull() {
            addCriterion("Color is not null");
            return (Criteria) this;
        }

        public Criteria andColorEqualTo(String value) {
            addCriterion("Color =", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotEqualTo(String value) {
            addCriterion("Color <>", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThan(String value) {
            addCriterion("Color >", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThanOrEqualTo(String value) {
            addCriterion("Color >=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThan(String value) {
            addCriterion("Color <", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThanOrEqualTo(String value) {
            addCriterion("Color <=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLike(String value) {
            addCriterion("Color like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotLike(String value) {
            addCriterion("Color not like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorIn(List<String> values) {
            addCriterion("Color in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotIn(List<String> values) {
            addCriterion("Color not in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorBetween(String value1, String value2) {
            addCriterion("Color between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotBetween(String value1, String value2) {
            addCriterion("Color not between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andSizeIsNull() {
            addCriterion("size is null");
            return (Criteria) this;
        }

        public Criteria andSizeIsNotNull() {
            addCriterion("size is not null");
            return (Criteria) this;
        }

        public Criteria andSizeEqualTo(String value) {
            addCriterion("size =", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotEqualTo(String value) {
            addCriterion("size <>", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThan(String value) {
            addCriterion("size >", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThanOrEqualTo(String value) {
            addCriterion("size >=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThan(String value) {
            addCriterion("size <", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThanOrEqualTo(String value) {
            addCriterion("size <=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLike(String value) {
            addCriterion("size like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotLike(String value) {
            addCriterion("size not like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeIn(List<String> values) {
            addCriterion("size in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotIn(List<String> values) {
            addCriterion("size not in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeBetween(String value1, String value2) {
            addCriterion("size between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotBetween(String value1, String value2) {
            addCriterion("size not between", value1, value2, "size");
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
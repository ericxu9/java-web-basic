package org.xumiao.domain;

import java.util.ArrayList;
import java.util.List;

public class TaobaoOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TaobaoOrderExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andOrderidIsNull() {
            addCriterion("orderId is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("orderId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(String value) {
            addCriterion("orderId =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(String value) {
            addCriterion("orderId <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(String value) {
            addCriterion("orderId >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(String value) {
            addCriterion("orderId >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(String value) {
            addCriterion("orderId <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(String value) {
            addCriterion("orderId <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLike(String value) {
            addCriterion("orderId like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotLike(String value) {
            addCriterion("orderId not like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<String> values) {
            addCriterion("orderId in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<String> values) {
            addCriterion("orderId not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(String value1, String value2) {
            addCriterion("orderId between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(String value1, String value2) {
            addCriterion("orderId not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(String value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(String value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(String value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(String value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLike(String value) {
            addCriterion("createTime like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotLike(String value) {
            addCriterion("createTime not like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<String> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<String> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(String value1, String value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(String value1, String value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andActualfeeIsNull() {
            addCriterion("actualFee is null");
            return (Criteria) this;
        }

        public Criteria andActualfeeIsNotNull() {
            addCriterion("actualFee is not null");
            return (Criteria) this;
        }

        public Criteria andActualfeeEqualTo(String value) {
            addCriterion("actualFee =", value, "actualfee");
            return (Criteria) this;
        }

        public Criteria andActualfeeNotEqualTo(String value) {
            addCriterion("actualFee <>", value, "actualfee");
            return (Criteria) this;
        }

        public Criteria andActualfeeGreaterThan(String value) {
            addCriterion("actualFee >", value, "actualfee");
            return (Criteria) this;
        }

        public Criteria andActualfeeGreaterThanOrEqualTo(String value) {
            addCriterion("actualFee >=", value, "actualfee");
            return (Criteria) this;
        }

        public Criteria andActualfeeLessThan(String value) {
            addCriterion("actualFee <", value, "actualfee");
            return (Criteria) this;
        }

        public Criteria andActualfeeLessThanOrEqualTo(String value) {
            addCriterion("actualFee <=", value, "actualfee");
            return (Criteria) this;
        }

        public Criteria andActualfeeLike(String value) {
            addCriterion("actualFee like", value, "actualfee");
            return (Criteria) this;
        }

        public Criteria andActualfeeNotLike(String value) {
            addCriterion("actualFee not like", value, "actualfee");
            return (Criteria) this;
        }

        public Criteria andActualfeeIn(List<String> values) {
            addCriterion("actualFee in", values, "actualfee");
            return (Criteria) this;
        }

        public Criteria andActualfeeNotIn(List<String> values) {
            addCriterion("actualFee not in", values, "actualfee");
            return (Criteria) this;
        }

        public Criteria andActualfeeBetween(String value1, String value2) {
            addCriterion("actualFee between", value1, value2, "actualfee");
            return (Criteria) this;
        }

        public Criteria andActualfeeNotBetween(String value1, String value2) {
            addCriterion("actualFee not between", value1, value2, "actualfee");
            return (Criteria) this;
        }

        public Criteria andShopnameIsNull() {
            addCriterion("shopName is null");
            return (Criteria) this;
        }

        public Criteria andShopnameIsNotNull() {
            addCriterion("shopName is not null");
            return (Criteria) this;
        }

        public Criteria andShopnameEqualTo(String value) {
            addCriterion("shopName =", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameNotEqualTo(String value) {
            addCriterion("shopName <>", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameGreaterThan(String value) {
            addCriterion("shopName >", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameGreaterThanOrEqualTo(String value) {
            addCriterion("shopName >=", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameLessThan(String value) {
            addCriterion("shopName <", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameLessThanOrEqualTo(String value) {
            addCriterion("shopName <=", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameLike(String value) {
            addCriterion("shopName like", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameNotLike(String value) {
            addCriterion("shopName not like", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameIn(List<String> values) {
            addCriterion("shopName in", values, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameNotIn(List<String> values) {
            addCriterion("shopName not in", values, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameBetween(String value1, String value2) {
            addCriterion("shopName between", value1, value2, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameNotBetween(String value1, String value2) {
            addCriterion("shopName not between", value1, value2, "shopname");
            return (Criteria) this;
        }

        public Criteria andViewlogisticurlIsNull() {
            addCriterion("viewLogisticUrl is null");
            return (Criteria) this;
        }

        public Criteria andViewlogisticurlIsNotNull() {
            addCriterion("viewLogisticUrl is not null");
            return (Criteria) this;
        }

        public Criteria andViewlogisticurlEqualTo(String value) {
            addCriterion("viewLogisticUrl =", value, "viewlogisticurl");
            return (Criteria) this;
        }

        public Criteria andViewlogisticurlNotEqualTo(String value) {
            addCriterion("viewLogisticUrl <>", value, "viewlogisticurl");
            return (Criteria) this;
        }

        public Criteria andViewlogisticurlGreaterThan(String value) {
            addCriterion("viewLogisticUrl >", value, "viewlogisticurl");
            return (Criteria) this;
        }

        public Criteria andViewlogisticurlGreaterThanOrEqualTo(String value) {
            addCriterion("viewLogisticUrl >=", value, "viewlogisticurl");
            return (Criteria) this;
        }

        public Criteria andViewlogisticurlLessThan(String value) {
            addCriterion("viewLogisticUrl <", value, "viewlogisticurl");
            return (Criteria) this;
        }

        public Criteria andViewlogisticurlLessThanOrEqualTo(String value) {
            addCriterion("viewLogisticUrl <=", value, "viewlogisticurl");
            return (Criteria) this;
        }

        public Criteria andViewlogisticurlLike(String value) {
            addCriterion("viewLogisticUrl like", value, "viewlogisticurl");
            return (Criteria) this;
        }

        public Criteria andViewlogisticurlNotLike(String value) {
            addCriterion("viewLogisticUrl not like", value, "viewlogisticurl");
            return (Criteria) this;
        }

        public Criteria andViewlogisticurlIn(List<String> values) {
            addCriterion("viewLogisticUrl in", values, "viewlogisticurl");
            return (Criteria) this;
        }

        public Criteria andViewlogisticurlNotIn(List<String> values) {
            addCriterion("viewLogisticUrl not in", values, "viewlogisticurl");
            return (Criteria) this;
        }

        public Criteria andViewlogisticurlBetween(String value1, String value2) {
            addCriterion("viewLogisticUrl between", value1, value2, "viewlogisticurl");
            return (Criteria) this;
        }

        public Criteria andViewlogisticurlNotBetween(String value1, String value2) {
            addCriterion("viewLogisticUrl not between", value1, value2, "viewlogisticurl");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(Integer value) {
            addCriterion("quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Integer value) {
            addCriterion("quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Integer value) {
            addCriterion("quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Integer value) {
            addCriterion("quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Integer> values) {
            addCriterion("quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Integer> values) {
            addCriterion("quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Integer value1, Integer value2) {
            addCriterion("quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("quantity not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andPicIsNull() {
            addCriterion("pic is null");
            return (Criteria) this;
        }

        public Criteria andPicIsNotNull() {
            addCriterion("pic is not null");
            return (Criteria) this;
        }

        public Criteria andPicEqualTo(String value) {
            addCriterion("pic =", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotEqualTo(String value) {
            addCriterion("pic <>", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicGreaterThan(String value) {
            addCriterion("pic >", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicGreaterThanOrEqualTo(String value) {
            addCriterion("pic >=", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLessThan(String value) {
            addCriterion("pic <", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLessThanOrEqualTo(String value) {
            addCriterion("pic <=", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLike(String value) {
            addCriterion("pic like", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotLike(String value) {
            addCriterion("pic not like", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicIn(List<String> values) {
            addCriterion("pic in", values, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotIn(List<String> values) {
            addCriterion("pic not in", values, "pic");
            return (Criteria) this;
        }

        public Criteria andPicBetween(String value1, String value2) {
            addCriterion("pic between", value1, value2, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotBetween(String value1, String value2) {
            addCriterion("pic not between", value1, value2, "pic");
            return (Criteria) this;
        }

        public Criteria andViewdetailurlIsNull() {
            addCriterion("viewDetailUrl is null");
            return (Criteria) this;
        }

        public Criteria andViewdetailurlIsNotNull() {
            addCriterion("viewDetailUrl is not null");
            return (Criteria) this;
        }

        public Criteria andViewdetailurlEqualTo(String value) {
            addCriterion("viewDetailUrl =", value, "viewdetailurl");
            return (Criteria) this;
        }

        public Criteria andViewdetailurlNotEqualTo(String value) {
            addCriterion("viewDetailUrl <>", value, "viewdetailurl");
            return (Criteria) this;
        }

        public Criteria andViewdetailurlGreaterThan(String value) {
            addCriterion("viewDetailUrl >", value, "viewdetailurl");
            return (Criteria) this;
        }

        public Criteria andViewdetailurlGreaterThanOrEqualTo(String value) {
            addCriterion("viewDetailUrl >=", value, "viewdetailurl");
            return (Criteria) this;
        }

        public Criteria andViewdetailurlLessThan(String value) {
            addCriterion("viewDetailUrl <", value, "viewdetailurl");
            return (Criteria) this;
        }

        public Criteria andViewdetailurlLessThanOrEqualTo(String value) {
            addCriterion("viewDetailUrl <=", value, "viewdetailurl");
            return (Criteria) this;
        }

        public Criteria andViewdetailurlLike(String value) {
            addCriterion("viewDetailUrl like", value, "viewdetailurl");
            return (Criteria) this;
        }

        public Criteria andViewdetailurlNotLike(String value) {
            addCriterion("viewDetailUrl not like", value, "viewdetailurl");
            return (Criteria) this;
        }

        public Criteria andViewdetailurlIn(List<String> values) {
            addCriterion("viewDetailUrl in", values, "viewdetailurl");
            return (Criteria) this;
        }

        public Criteria andViewdetailurlNotIn(List<String> values) {
            addCriterion("viewDetailUrl not in", values, "viewdetailurl");
            return (Criteria) this;
        }

        public Criteria andViewdetailurlBetween(String value1, String value2) {
            addCriterion("viewDetailUrl between", value1, value2, "viewdetailurl");
            return (Criteria) this;
        }

        public Criteria andViewdetailurlNotBetween(String value1, String value2) {
            addCriterion("viewDetailUrl not between", value1, value2, "viewdetailurl");
            return (Criteria) this;
        }
    }

    /**
     */
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
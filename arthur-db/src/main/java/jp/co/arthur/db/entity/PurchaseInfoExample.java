package jp.co.arthur.db.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PurchaseInfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table purchase_info
     *
     * @mbg.generated Sun Oct 07 01:53:51 JST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table purchase_info
     *
     * @mbg.generated Sun Oct 07 01:53:51 JST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table purchase_info
     *
     * @mbg.generated Sun Oct 07 01:53:51 JST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_info
     *
     * @mbg.generated Sun Oct 07 01:53:51 JST 2018
     */
    public PurchaseInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_info
     *
     * @mbg.generated Sun Oct 07 01:53:51 JST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_info
     *
     * @mbg.generated Sun Oct 07 01:53:51 JST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_info
     *
     * @mbg.generated Sun Oct 07 01:53:51 JST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_info
     *
     * @mbg.generated Sun Oct 07 01:53:51 JST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_info
     *
     * @mbg.generated Sun Oct 07 01:53:51 JST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_info
     *
     * @mbg.generated Sun Oct 07 01:53:51 JST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_info
     *
     * @mbg.generated Sun Oct 07 01:53:51 JST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_info
     *
     * @mbg.generated Sun Oct 07 01:53:51 JST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_info
     *
     * @mbg.generated Sun Oct 07 01:53:51 JST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_info
     *
     * @mbg.generated Sun Oct 07 01:53:51 JST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table purchase_info
     *
     * @mbg.generated Sun Oct 07 01:53:51 JST 2018
     */
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

        public Criteria andPurchaseInfoIdIsNull() {
            addCriterion("PURCHASE_INFO_ID is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseInfoIdIsNotNull() {
            addCriterion("PURCHASE_INFO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseInfoIdEqualTo(Integer value) {
            addCriterion("PURCHASE_INFO_ID =", value, "purchaseInfoId");
            return (Criteria) this;
        }

        public Criteria andPurchaseInfoIdNotEqualTo(Integer value) {
            addCriterion("PURCHASE_INFO_ID <>", value, "purchaseInfoId");
            return (Criteria) this;
        }

        public Criteria andPurchaseInfoIdGreaterThan(Integer value) {
            addCriterion("PURCHASE_INFO_ID >", value, "purchaseInfoId");
            return (Criteria) this;
        }

        public Criteria andPurchaseInfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PURCHASE_INFO_ID >=", value, "purchaseInfoId");
            return (Criteria) this;
        }

        public Criteria andPurchaseInfoIdLessThan(Integer value) {
            addCriterion("PURCHASE_INFO_ID <", value, "purchaseInfoId");
            return (Criteria) this;
        }

        public Criteria andPurchaseInfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("PURCHASE_INFO_ID <=", value, "purchaseInfoId");
            return (Criteria) this;
        }

        public Criteria andPurchaseInfoIdIn(List<Integer> values) {
            addCriterion("PURCHASE_INFO_ID in", values, "purchaseInfoId");
            return (Criteria) this;
        }

        public Criteria andPurchaseInfoIdNotIn(List<Integer> values) {
            addCriterion("PURCHASE_INFO_ID not in", values, "purchaseInfoId");
            return (Criteria) this;
        }

        public Criteria andPurchaseInfoIdBetween(Integer value1, Integer value2) {
            addCriterion("PURCHASE_INFO_ID between", value1, value2, "purchaseInfoId");
            return (Criteria) this;
        }

        public Criteria andPurchaseInfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PURCHASE_INFO_ID not between", value1, value2, "purchaseInfoId");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdIsNull() {
            addCriterion("USER_INFO_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdIsNotNull() {
            addCriterion("USER_INFO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdEqualTo(Integer value) {
            addCriterion("USER_INFO_ID =", value, "userInfoId");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdNotEqualTo(Integer value) {
            addCriterion("USER_INFO_ID <>", value, "userInfoId");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdGreaterThan(Integer value) {
            addCriterion("USER_INFO_ID >", value, "userInfoId");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_INFO_ID >=", value, "userInfoId");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdLessThan(Integer value) {
            addCriterion("USER_INFO_ID <", value, "userInfoId");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("USER_INFO_ID <=", value, "userInfoId");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdIn(List<Integer> values) {
            addCriterion("USER_INFO_ID in", values, "userInfoId");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdNotIn(List<Integer> values) {
            addCriterion("USER_INFO_ID not in", values, "userInfoId");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdBetween(Integer value1, Integer value2) {
            addCriterion("USER_INFO_ID between", value1, value2, "userInfoId");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_INFO_ID not between", value1, value2, "userInfoId");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNull() {
            addCriterion("ITEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("ITEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(Integer value) {
            addCriterion("ITEM_ID =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(Integer value) {
            addCriterion("ITEM_ID <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(Integer value) {
            addCriterion("ITEM_ID >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ITEM_ID >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(Integer value) {
            addCriterion("ITEM_ID <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("ITEM_ID <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<Integer> values) {
            addCriterion("ITEM_ID in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<Integer> values) {
            addCriterion("ITEM_ID not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(Integer value1, Integer value2) {
            addCriterion("ITEM_ID between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ITEM_ID not between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNull() {
            addCriterion("ITEM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNotNull() {
            addCriterion("ITEM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andItemNameEqualTo(String value) {
            addCriterion("ITEM_NAME =", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotEqualTo(String value) {
            addCriterion("ITEM_NAME <>", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThan(String value) {
            addCriterion("ITEM_NAME >", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_NAME >=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThan(String value) {
            addCriterion("ITEM_NAME <", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThanOrEqualTo(String value) {
            addCriterion("ITEM_NAME <=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLike(String value) {
            addCriterion("ITEM_NAME like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotLike(String value) {
            addCriterion("ITEM_NAME not like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameIn(List<String> values) {
            addCriterion("ITEM_NAME in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotIn(List<String> values) {
            addCriterion("ITEM_NAME not in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameBetween(String value1, String value2) {
            addCriterion("ITEM_NAME between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotBetween(String value1, String value2) {
            addCriterion("ITEM_NAME not between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemUnitMoneyIsNull() {
            addCriterion("ITEM_UNIT_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andItemUnitMoneyIsNotNull() {
            addCriterion("ITEM_UNIT_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andItemUnitMoneyEqualTo(Integer value) {
            addCriterion("ITEM_UNIT_MONEY =", value, "itemUnitMoney");
            return (Criteria) this;
        }

        public Criteria andItemUnitMoneyNotEqualTo(Integer value) {
            addCriterion("ITEM_UNIT_MONEY <>", value, "itemUnitMoney");
            return (Criteria) this;
        }

        public Criteria andItemUnitMoneyGreaterThan(Integer value) {
            addCriterion("ITEM_UNIT_MONEY >", value, "itemUnitMoney");
            return (Criteria) this;
        }

        public Criteria andItemUnitMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("ITEM_UNIT_MONEY >=", value, "itemUnitMoney");
            return (Criteria) this;
        }

        public Criteria andItemUnitMoneyLessThan(Integer value) {
            addCriterion("ITEM_UNIT_MONEY <", value, "itemUnitMoney");
            return (Criteria) this;
        }

        public Criteria andItemUnitMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("ITEM_UNIT_MONEY <=", value, "itemUnitMoney");
            return (Criteria) this;
        }

        public Criteria andItemUnitMoneyIn(List<Integer> values) {
            addCriterion("ITEM_UNIT_MONEY in", values, "itemUnitMoney");
            return (Criteria) this;
        }

        public Criteria andItemUnitMoneyNotIn(List<Integer> values) {
            addCriterion("ITEM_UNIT_MONEY not in", values, "itemUnitMoney");
            return (Criteria) this;
        }

        public Criteria andItemUnitMoneyBetween(Integer value1, Integer value2) {
            addCriterion("ITEM_UNIT_MONEY between", value1, value2, "itemUnitMoney");
            return (Criteria) this;
        }

        public Criteria andItemUnitMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("ITEM_UNIT_MONEY not between", value1, value2, "itemUnitMoney");
            return (Criteria) this;
        }

        public Criteria andItemAmountIsNull() {
            addCriterion("ITEM_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andItemAmountIsNotNull() {
            addCriterion("ITEM_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andItemAmountEqualTo(Integer value) {
            addCriterion("ITEM_AMOUNT =", value, "itemAmount");
            return (Criteria) this;
        }

        public Criteria andItemAmountNotEqualTo(Integer value) {
            addCriterion("ITEM_AMOUNT <>", value, "itemAmount");
            return (Criteria) this;
        }

        public Criteria andItemAmountGreaterThan(Integer value) {
            addCriterion("ITEM_AMOUNT >", value, "itemAmount");
            return (Criteria) this;
        }

        public Criteria andItemAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("ITEM_AMOUNT >=", value, "itemAmount");
            return (Criteria) this;
        }

        public Criteria andItemAmountLessThan(Integer value) {
            addCriterion("ITEM_AMOUNT <", value, "itemAmount");
            return (Criteria) this;
        }

        public Criteria andItemAmountLessThanOrEqualTo(Integer value) {
            addCriterion("ITEM_AMOUNT <=", value, "itemAmount");
            return (Criteria) this;
        }

        public Criteria andItemAmountIn(List<Integer> values) {
            addCriterion("ITEM_AMOUNT in", values, "itemAmount");
            return (Criteria) this;
        }

        public Criteria andItemAmountNotIn(List<Integer> values) {
            addCriterion("ITEM_AMOUNT not in", values, "itemAmount");
            return (Criteria) this;
        }

        public Criteria andItemAmountBetween(Integer value1, Integer value2) {
            addCriterion("ITEM_AMOUNT between", value1, value2, "itemAmount");
            return (Criteria) this;
        }

        public Criteria andItemAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("ITEM_AMOUNT not between", value1, value2, "itemAmount");
            return (Criteria) this;
        }

        public Criteria andRegDateIsNull() {
            addCriterion("REG_DATE is null");
            return (Criteria) this;
        }

        public Criteria andRegDateIsNotNull() {
            addCriterion("REG_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andRegDateEqualTo(Date value) {
            addCriterion("REG_DATE =", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateNotEqualTo(Date value) {
            addCriterion("REG_DATE <>", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateGreaterThan(Date value) {
            addCriterion("REG_DATE >", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateGreaterThanOrEqualTo(Date value) {
            addCriterion("REG_DATE >=", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateLessThan(Date value) {
            addCriterion("REG_DATE <", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateLessThanOrEqualTo(Date value) {
            addCriterion("REG_DATE <=", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateIn(List<Date> values) {
            addCriterion("REG_DATE in", values, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateNotIn(List<Date> values) {
            addCriterion("REG_DATE not in", values, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateBetween(Date value1, Date value2) {
            addCriterion("REG_DATE between", value1, value2, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateNotBetween(Date value1, Date value2) {
            addCriterion("REG_DATE not between", value1, value2, "regDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("UPDATE_DATE =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("UPDATE_DATE <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("UPDATE_DATE >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATE >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("UPDATE_DATE <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATE <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("UPDATE_DATE in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("UPDATE_DATE not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATE between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATE not between", value1, value2, "updateDate");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table purchase_info
     *
     * @mbg.generated do_not_delete_during_merge Sun Oct 07 01:53:51 JST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table purchase_info
     *
     * @mbg.generated Sun Oct 07 01:53:51 JST 2018
     */
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
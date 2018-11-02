package com.kaige123.daomu.eureka_client_video_user.DAO.Bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OSaidlogExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table osaidlog
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table osaidlog
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table osaidlog
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table osaidlog
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    public OSaidlogExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table osaidlog
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table osaidlog
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table osaidlog
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table osaidlog
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table osaidlog
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table osaidlog
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table osaidlog
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table osaidlog
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
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
     * This method corresponds to the database table osaidlog
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table osaidlog
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table osaidlog
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
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

        public Criteria andAlidIsNull() {
            addCriterion("alid is null");
            return (Criteria) this;
        }

        public Criteria andAlidIsNotNull() {
            addCriterion("alid is not null");
            return (Criteria) this;
        }

        public Criteria andAlidEqualTo(Long value) {
            addCriterion("alid =", value, "alid");
            return (Criteria) this;
        }

        public Criteria andAlidNotEqualTo(Long value) {
            addCriterion("alid <>", value, "alid");
            return (Criteria) this;
        }

        public Criteria andAlidGreaterThan(Long value) {
            addCriterion("alid >", value, "alid");
            return (Criteria) this;
        }

        public Criteria andAlidGreaterThanOrEqualTo(Long value) {
            addCriterion("alid >=", value, "alid");
            return (Criteria) this;
        }

        public Criteria andAlidLessThan(Long value) {
            addCriterion("alid <", value, "alid");
            return (Criteria) this;
        }

        public Criteria andAlidLessThanOrEqualTo(Long value) {
            addCriterion("alid <=", value, "alid");
            return (Criteria) this;
        }

        public Criteria andAlidIn(List<Long> values) {
            addCriterion("alid in", values, "alid");
            return (Criteria) this;
        }

        public Criteria andAlidNotIn(List<Long> values) {
            addCriterion("alid not in", values, "alid");
            return (Criteria) this;
        }

        public Criteria andAlidBetween(Long value1, Long value2) {
            addCriterion("alid between", value1, value2, "alid");
            return (Criteria) this;
        }

        public Criteria andAlidNotBetween(Long value1, Long value2) {
            addCriterion("alid not between", value1, value2, "alid");
            return (Criteria) this;
        }

        public Criteria andAidIsNull() {
            addCriterion("aid is null");
            return (Criteria) this;
        }

        public Criteria andAidIsNotNull() {
            addCriterion("aid is not null");
            return (Criteria) this;
        }

        public Criteria andAidEqualTo(Long value) {
            addCriterion("aid =", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotEqualTo(Long value) {
            addCriterion("aid <>", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThan(Long value) {
            addCriterion("aid >", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThanOrEqualTo(Long value) {
            addCriterion("aid >=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThan(Long value) {
            addCriterion("aid <", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThanOrEqualTo(Long value) {
            addCriterion("aid <=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidIn(List<Long> values) {
            addCriterion("aid in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotIn(List<Long> values) {
            addCriterion("aid not in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidBetween(Long value1, Long value2) {
            addCriterion("aid between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotBetween(Long value1, Long value2) {
            addCriterion("aid not between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andMethodIsNull() {
            addCriterion("method is null");
            return (Criteria) this;
        }

        public Criteria andMethodIsNotNull() {
            addCriterion("method is not null");
            return (Criteria) this;
        }

        public Criteria andMethodEqualTo(String value) {
            addCriterion("method =", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotEqualTo(String value) {
            addCriterion("method <>", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodGreaterThan(String value) {
            addCriterion("method >", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodGreaterThanOrEqualTo(String value) {
            addCriterion("method >=", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodLessThan(String value) {
            addCriterion("method <", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodLessThanOrEqualTo(String value) {
            addCriterion("method <=", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodLike(String value) {
            addCriterion("method like", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotLike(String value) {
            addCriterion("method not like", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodIn(List<String> values) {
            addCriterion("method in", values, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotIn(List<String> values) {
            addCriterion("method not in", values, "method");
            return (Criteria) this;
        }

        public Criteria andMethodBetween(String value1, String value2) {
            addCriterion("method between", value1, value2, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotBetween(String value1, String value2) {
            addCriterion("method not between", value1, value2, "method");
            return (Criteria) this;
        }

        public Criteria andParamterIsNull() {
            addCriterion("paramter is null");
            return (Criteria) this;
        }

        public Criteria andParamterIsNotNull() {
            addCriterion("paramter is not null");
            return (Criteria) this;
        }

        public Criteria andParamterEqualTo(String value) {
            addCriterion("paramter =", value, "paramter");
            return (Criteria) this;
        }

        public Criteria andParamterNotEqualTo(String value) {
            addCriterion("paramter <>", value, "paramter");
            return (Criteria) this;
        }

        public Criteria andParamterGreaterThan(String value) {
            addCriterion("paramter >", value, "paramter");
            return (Criteria) this;
        }

        public Criteria andParamterGreaterThanOrEqualTo(String value) {
            addCriterion("paramter >=", value, "paramter");
            return (Criteria) this;
        }

        public Criteria andParamterLessThan(String value) {
            addCriterion("paramter <", value, "paramter");
            return (Criteria) this;
        }

        public Criteria andParamterLessThanOrEqualTo(String value) {
            addCriterion("paramter <=", value, "paramter");
            return (Criteria) this;
        }

        public Criteria andParamterLike(String value) {
            addCriterion("paramter like", value, "paramter");
            return (Criteria) this;
        }

        public Criteria andParamterNotLike(String value) {
            addCriterion("paramter not like", value, "paramter");
            return (Criteria) this;
        }

        public Criteria andParamterIn(List<String> values) {
            addCriterion("paramter in", values, "paramter");
            return (Criteria) this;
        }

        public Criteria andParamterNotIn(List<String> values) {
            addCriterion("paramter not in", values, "paramter");
            return (Criteria) this;
        }

        public Criteria andParamterBetween(String value1, String value2) {
            addCriterion("paramter between", value1, value2, "paramter");
            return (Criteria) this;
        }

        public Criteria andParamterNotBetween(String value1, String value2) {
            addCriterion("paramter not between", value1, value2, "paramter");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("ip is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("ip is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("ip =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("ip <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("ip >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("ip >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("ip <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("ip <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("ip like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("ip not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("ip in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("ip not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("ip between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("ip not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andOptionstimeIsNull() {
            addCriterion("optionstime is null");
            return (Criteria) this;
        }

        public Criteria andOptionstimeIsNotNull() {
            addCriterion("optionstime is not null");
            return (Criteria) this;
        }

        public Criteria andOptionstimeEqualTo(Date value) {
            addCriterion("optionstime =", value, "optionstime");
            return (Criteria) this;
        }

        public Criteria andOptionstimeNotEqualTo(Date value) {
            addCriterion("optionstime <>", value, "optionstime");
            return (Criteria) this;
        }

        public Criteria andOptionstimeGreaterThan(Date value) {
            addCriterion("optionstime >", value, "optionstime");
            return (Criteria) this;
        }

        public Criteria andOptionstimeGreaterThanOrEqualTo(Date value) {
            addCriterion("optionstime >=", value, "optionstime");
            return (Criteria) this;
        }

        public Criteria andOptionstimeLessThan(Date value) {
            addCriterion("optionstime <", value, "optionstime");
            return (Criteria) this;
        }

        public Criteria andOptionstimeLessThanOrEqualTo(Date value) {
            addCriterion("optionstime <=", value, "optionstime");
            return (Criteria) this;
        }

        public Criteria andOptionstimeIn(List<Date> values) {
            addCriterion("optionstime in", values, "optionstime");
            return (Criteria) this;
        }

        public Criteria andOptionstimeNotIn(List<Date> values) {
            addCriterion("optionstime not in", values, "optionstime");
            return (Criteria) this;
        }

        public Criteria andOptionstimeBetween(Date value1, Date value2) {
            addCriterion("optionstime between", value1, value2, "optionstime");
            return (Criteria) this;
        }

        public Criteria andOptionstimeNotBetween(Date value1, Date value2) {
            addCriterion("optionstime not between", value1, value2, "optionstime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table osaidlog
     *
     * @mbg.generated do_not_delete_during_merge Sat Oct 13 11:12:28 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table osaidlog
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
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
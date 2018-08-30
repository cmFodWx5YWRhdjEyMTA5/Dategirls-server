package com.ideaout.dategirls.domain;

import java.util.ArrayList;
import java.util.List;

public class FollowExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FollowExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFollowedUseridIsNull() {
            addCriterion("followed_userid is null");
            return (Criteria) this;
        }

        public Criteria andFollowedUseridIsNotNull() {
            addCriterion("followed_userid is not null");
            return (Criteria) this;
        }

        public Criteria andFollowedUseridEqualTo(Long value) {
            addCriterion("followed_userid =", value, "followedUserid");
            return (Criteria) this;
        }

        public Criteria andFollowedUseridNotEqualTo(Long value) {
            addCriterion("followed_userid <>", value, "followedUserid");
            return (Criteria) this;
        }

        public Criteria andFollowedUseridGreaterThan(Long value) {
            addCriterion("followed_userid >", value, "followedUserid");
            return (Criteria) this;
        }

        public Criteria andFollowedUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("followed_userid >=", value, "followedUserid");
            return (Criteria) this;
        }

        public Criteria andFollowedUseridLessThan(Long value) {
            addCriterion("followed_userid <", value, "followedUserid");
            return (Criteria) this;
        }

        public Criteria andFollowedUseridLessThanOrEqualTo(Long value) {
            addCriterion("followed_userid <=", value, "followedUserid");
            return (Criteria) this;
        }

        public Criteria andFollowedUseridIn(List<Long> values) {
            addCriterion("followed_userid in", values, "followedUserid");
            return (Criteria) this;
        }

        public Criteria andFollowedUseridNotIn(List<Long> values) {
            addCriterion("followed_userid not in", values, "followedUserid");
            return (Criteria) this;
        }

        public Criteria andFollowedUseridBetween(Long value1, Long value2) {
            addCriterion("followed_userid between", value1, value2, "followedUserid");
            return (Criteria) this;
        }

        public Criteria andFollowedUseridNotBetween(Long value1, Long value2) {
            addCriterion("followed_userid not between", value1, value2, "followedUserid");
            return (Criteria) this;
        }

        public Criteria andFollowUseridIsNull() {
            addCriterion("follow_userid is null");
            return (Criteria) this;
        }

        public Criteria andFollowUseridIsNotNull() {
            addCriterion("follow_userid is not null");
            return (Criteria) this;
        }

        public Criteria andFollowUseridEqualTo(Long value) {
            addCriterion("follow_userid =", value, "followUserid");
            return (Criteria) this;
        }

        public Criteria andFollowUseridNotEqualTo(Long value) {
            addCriterion("follow_userid <>", value, "followUserid");
            return (Criteria) this;
        }

        public Criteria andFollowUseridGreaterThan(Long value) {
            addCriterion("follow_userid >", value, "followUserid");
            return (Criteria) this;
        }

        public Criteria andFollowUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("follow_userid >=", value, "followUserid");
            return (Criteria) this;
        }

        public Criteria andFollowUseridLessThan(Long value) {
            addCriterion("follow_userid <", value, "followUserid");
            return (Criteria) this;
        }

        public Criteria andFollowUseridLessThanOrEqualTo(Long value) {
            addCriterion("follow_userid <=", value, "followUserid");
            return (Criteria) this;
        }

        public Criteria andFollowUseridIn(List<Long> values) {
            addCriterion("follow_userid in", values, "followUserid");
            return (Criteria) this;
        }

        public Criteria andFollowUseridNotIn(List<Long> values) {
            addCriterion("follow_userid not in", values, "followUserid");
            return (Criteria) this;
        }

        public Criteria andFollowUseridBetween(Long value1, Long value2) {
            addCriterion("follow_userid between", value1, value2, "followUserid");
            return (Criteria) this;
        }

        public Criteria andFollowUseridNotBetween(Long value1, Long value2) {
            addCriterion("follow_userid not between", value1, value2, "followUserid");
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
package com.ideaout.dategirls.domain;

import java.util.ArrayList;
import java.util.List;

public class PairApplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PairApplyExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andWeixinIsNull() {
            addCriterion("weixin is null");
            return (Criteria) this;
        }

        public Criteria andWeixinIsNotNull() {
            addCriterion("weixin is not null");
            return (Criteria) this;
        }

        public Criteria andWeixinEqualTo(String value) {
            addCriterion("weixin =", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotEqualTo(String value) {
            addCriterion("weixin <>", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinGreaterThan(String value) {
            addCriterion("weixin >", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinGreaterThanOrEqualTo(String value) {
            addCriterion("weixin >=", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLessThan(String value) {
            addCriterion("weixin <", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLessThanOrEqualTo(String value) {
            addCriterion("weixin <=", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLike(String value) {
            addCriterion("weixin like", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotLike(String value) {
            addCriterion("weixin not like", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinIn(List<String> values) {
            addCriterion("weixin in", values, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotIn(List<String> values) {
            addCriterion("weixin not in", values, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinBetween(String value1, String value2) {
            addCriterion("weixin between", value1, value2, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotBetween(String value1, String value2) {
            addCriterion("weixin not between", value1, value2, "weixin");
            return (Criteria) this;
        }

        public Criteria andQqIsNull() {
            addCriterion("qq is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("qq is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("qq =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("qq <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("qq >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("qq >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("qq <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("qq <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("qq like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("qq not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("qq in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("qq not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("qq between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("qq not between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andHeightIsNull() {
            addCriterion("height is null");
            return (Criteria) this;
        }

        public Criteria andHeightIsNotNull() {
            addCriterion("height is not null");
            return (Criteria) this;
        }

        public Criteria andHeightEqualTo(Double value) {
            addCriterion("height =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(Double value) {
            addCriterion("height <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(Double value) {
            addCriterion("height >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(Double value) {
            addCriterion("height >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(Double value) {
            addCriterion("height <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(Double value) {
            addCriterion("height <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<Double> values) {
            addCriterion("height in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<Double> values) {
            addCriterion("height not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(Double value1, Double value2) {
            addCriterion("height between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(Double value1, Double value2) {
            addCriterion("height not between", value1, value2, "height");
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

        public Criteria andImagelistIsNull() {
            addCriterion("imagelist is null");
            return (Criteria) this;
        }

        public Criteria andImagelistIsNotNull() {
            addCriterion("imagelist is not null");
            return (Criteria) this;
        }

        public Criteria andImagelistEqualTo(String value) {
            addCriterion("imagelist =", value, "imagelist");
            return (Criteria) this;
        }

        public Criteria andImagelistNotEqualTo(String value) {
            addCriterion("imagelist <>", value, "imagelist");
            return (Criteria) this;
        }

        public Criteria andImagelistGreaterThan(String value) {
            addCriterion("imagelist >", value, "imagelist");
            return (Criteria) this;
        }

        public Criteria andImagelistGreaterThanOrEqualTo(String value) {
            addCriterion("imagelist >=", value, "imagelist");
            return (Criteria) this;
        }

        public Criteria andImagelistLessThan(String value) {
            addCriterion("imagelist <", value, "imagelist");
            return (Criteria) this;
        }

        public Criteria andImagelistLessThanOrEqualTo(String value) {
            addCriterion("imagelist <=", value, "imagelist");
            return (Criteria) this;
        }

        public Criteria andImagelistLike(String value) {
            addCriterion("imagelist like", value, "imagelist");
            return (Criteria) this;
        }

        public Criteria andImagelistNotLike(String value) {
            addCriterion("imagelist not like", value, "imagelist");
            return (Criteria) this;
        }

        public Criteria andImagelistIn(List<String> values) {
            addCriterion("imagelist in", values, "imagelist");
            return (Criteria) this;
        }

        public Criteria andImagelistNotIn(List<String> values) {
            addCriterion("imagelist not in", values, "imagelist");
            return (Criteria) this;
        }

        public Criteria andImagelistBetween(String value1, String value2) {
            addCriterion("imagelist between", value1, value2, "imagelist");
            return (Criteria) this;
        }

        public Criteria andImagelistNotBetween(String value1, String value2) {
            addCriterion("imagelist not between", value1, value2, "imagelist");
            return (Criteria) this;
        }

        public Criteria andSexPreferIsNull() {
            addCriterion("sex_prefer is null");
            return (Criteria) this;
        }

        public Criteria andSexPreferIsNotNull() {
            addCriterion("sex_prefer is not null");
            return (Criteria) this;
        }

        public Criteria andSexPreferEqualTo(String value) {
            addCriterion("sex_prefer =", value, "sexPrefer");
            return (Criteria) this;
        }

        public Criteria andSexPreferNotEqualTo(String value) {
            addCriterion("sex_prefer <>", value, "sexPrefer");
            return (Criteria) this;
        }

        public Criteria andSexPreferGreaterThan(String value) {
            addCriterion("sex_prefer >", value, "sexPrefer");
            return (Criteria) this;
        }

        public Criteria andSexPreferGreaterThanOrEqualTo(String value) {
            addCriterion("sex_prefer >=", value, "sexPrefer");
            return (Criteria) this;
        }

        public Criteria andSexPreferLessThan(String value) {
            addCriterion("sex_prefer <", value, "sexPrefer");
            return (Criteria) this;
        }

        public Criteria andSexPreferLessThanOrEqualTo(String value) {
            addCriterion("sex_prefer <=", value, "sexPrefer");
            return (Criteria) this;
        }

        public Criteria andSexPreferLike(String value) {
            addCriterion("sex_prefer like", value, "sexPrefer");
            return (Criteria) this;
        }

        public Criteria andSexPreferNotLike(String value) {
            addCriterion("sex_prefer not like", value, "sexPrefer");
            return (Criteria) this;
        }

        public Criteria andSexPreferIn(List<String> values) {
            addCriterion("sex_prefer in", values, "sexPrefer");
            return (Criteria) this;
        }

        public Criteria andSexPreferNotIn(List<String> values) {
            addCriterion("sex_prefer not in", values, "sexPrefer");
            return (Criteria) this;
        }

        public Criteria andSexPreferBetween(String value1, String value2) {
            addCriterion("sex_prefer between", value1, value2, "sexPrefer");
            return (Criteria) this;
        }

        public Criteria andSexPreferNotBetween(String value1, String value2) {
            addCriterion("sex_prefer not between", value1, value2, "sexPrefer");
            return (Criteria) this;
        }

        public Criteria andCityAdjustIsNull() {
            addCriterion("city_adjust is null");
            return (Criteria) this;
        }

        public Criteria andCityAdjustIsNotNull() {
            addCriterion("city_adjust is not null");
            return (Criteria) this;
        }

        public Criteria andCityAdjustEqualTo(String value) {
            addCriterion("city_adjust =", value, "cityAdjust");
            return (Criteria) this;
        }

        public Criteria andCityAdjustNotEqualTo(String value) {
            addCriterion("city_adjust <>", value, "cityAdjust");
            return (Criteria) this;
        }

        public Criteria andCityAdjustGreaterThan(String value) {
            addCriterion("city_adjust >", value, "cityAdjust");
            return (Criteria) this;
        }

        public Criteria andCityAdjustGreaterThanOrEqualTo(String value) {
            addCriterion("city_adjust >=", value, "cityAdjust");
            return (Criteria) this;
        }

        public Criteria andCityAdjustLessThan(String value) {
            addCriterion("city_adjust <", value, "cityAdjust");
            return (Criteria) this;
        }

        public Criteria andCityAdjustLessThanOrEqualTo(String value) {
            addCriterion("city_adjust <=", value, "cityAdjust");
            return (Criteria) this;
        }

        public Criteria andCityAdjustLike(String value) {
            addCriterion("city_adjust like", value, "cityAdjust");
            return (Criteria) this;
        }

        public Criteria andCityAdjustNotLike(String value) {
            addCriterion("city_adjust not like", value, "cityAdjust");
            return (Criteria) this;
        }

        public Criteria andCityAdjustIn(List<String> values) {
            addCriterion("city_adjust in", values, "cityAdjust");
            return (Criteria) this;
        }

        public Criteria andCityAdjustNotIn(List<String> values) {
            addCriterion("city_adjust not in", values, "cityAdjust");
            return (Criteria) this;
        }

        public Criteria andCityAdjustBetween(String value1, String value2) {
            addCriterion("city_adjust between", value1, value2, "cityAdjust");
            return (Criteria) this;
        }

        public Criteria andCityAdjustNotBetween(String value1, String value2) {
            addCriterion("city_adjust not between", value1, value2, "cityAdjust");
            return (Criteria) this;
        }

        public Criteria andHobbyIsNull() {
            addCriterion("hobby is null");
            return (Criteria) this;
        }

        public Criteria andHobbyIsNotNull() {
            addCriterion("hobby is not null");
            return (Criteria) this;
        }

        public Criteria andHobbyEqualTo(String value) {
            addCriterion("hobby =", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyNotEqualTo(String value) {
            addCriterion("hobby <>", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyGreaterThan(String value) {
            addCriterion("hobby >", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyGreaterThanOrEqualTo(String value) {
            addCriterion("hobby >=", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyLessThan(String value) {
            addCriterion("hobby <", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyLessThanOrEqualTo(String value) {
            addCriterion("hobby <=", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyLike(String value) {
            addCriterion("hobby like", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyNotLike(String value) {
            addCriterion("hobby not like", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyIn(List<String> values) {
            addCriterion("hobby in", values, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyNotIn(List<String> values) {
            addCriterion("hobby not in", values, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyBetween(String value1, String value2) {
            addCriterion("hobby between", value1, value2, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyNotBetween(String value1, String value2) {
            addCriterion("hobby not between", value1, value2, "hobby");
            return (Criteria) this;
        }

        public Criteria andJoinWayIsNull() {
            addCriterion("join_way is null");
            return (Criteria) this;
        }

        public Criteria andJoinWayIsNotNull() {
            addCriterion("join_way is not null");
            return (Criteria) this;
        }

        public Criteria andJoinWayEqualTo(String value) {
            addCriterion("join_way =", value, "joinWay");
            return (Criteria) this;
        }

        public Criteria andJoinWayNotEqualTo(String value) {
            addCriterion("join_way <>", value, "joinWay");
            return (Criteria) this;
        }

        public Criteria andJoinWayGreaterThan(String value) {
            addCriterion("join_way >", value, "joinWay");
            return (Criteria) this;
        }

        public Criteria andJoinWayGreaterThanOrEqualTo(String value) {
            addCriterion("join_way >=", value, "joinWay");
            return (Criteria) this;
        }

        public Criteria andJoinWayLessThan(String value) {
            addCriterion("join_way <", value, "joinWay");
            return (Criteria) this;
        }

        public Criteria andJoinWayLessThanOrEqualTo(String value) {
            addCriterion("join_way <=", value, "joinWay");
            return (Criteria) this;
        }

        public Criteria andJoinWayLike(String value) {
            addCriterion("join_way like", value, "joinWay");
            return (Criteria) this;
        }

        public Criteria andJoinWayNotLike(String value) {
            addCriterion("join_way not like", value, "joinWay");
            return (Criteria) this;
        }

        public Criteria andJoinWayIn(List<String> values) {
            addCriterion("join_way in", values, "joinWay");
            return (Criteria) this;
        }

        public Criteria andJoinWayNotIn(List<String> values) {
            addCriterion("join_way not in", values, "joinWay");
            return (Criteria) this;
        }

        public Criteria andJoinWayBetween(String value1, String value2) {
            addCriterion("join_way between", value1, value2, "joinWay");
            return (Criteria) this;
        }

        public Criteria andJoinWayNotBetween(String value1, String value2) {
            addCriterion("join_way not between", value1, value2, "joinWay");
            return (Criteria) this;
        }

        public Criteria andPaymentIsNull() {
            addCriterion("payment is null");
            return (Criteria) this;
        }

        public Criteria andPaymentIsNotNull() {
            addCriterion("payment is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentEqualTo(String value) {
            addCriterion("payment =", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotEqualTo(String value) {
            addCriterion("payment <>", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentGreaterThan(String value) {
            addCriterion("payment >", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentGreaterThanOrEqualTo(String value) {
            addCriterion("payment >=", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLessThan(String value) {
            addCriterion("payment <", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLessThanOrEqualTo(String value) {
            addCriterion("payment <=", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLike(String value) {
            addCriterion("payment like", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotLike(String value) {
            addCriterion("payment not like", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentIn(List<String> values) {
            addCriterion("payment in", values, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotIn(List<String> values) {
            addCriterion("payment not in", values, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentBetween(String value1, String value2) {
            addCriterion("payment between", value1, value2, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotBetween(String value1, String value2) {
            addCriterion("payment not between", value1, value2, "payment");
            return (Criteria) this;
        }

        public Criteria andShareClickCountIsNull() {
            addCriterion("share_click_count is null");
            return (Criteria) this;
        }

        public Criteria andShareClickCountIsNotNull() {
            addCriterion("share_click_count is not null");
            return (Criteria) this;
        }

        public Criteria andShareClickCountEqualTo(String value) {
            addCriterion("share_click_count =", value, "shareClickCount");
            return (Criteria) this;
        }

        public Criteria andShareClickCountNotEqualTo(String value) {
            addCriterion("share_click_count <>", value, "shareClickCount");
            return (Criteria) this;
        }

        public Criteria andShareClickCountGreaterThan(String value) {
            addCriterion("share_click_count >", value, "shareClickCount");
            return (Criteria) this;
        }

        public Criteria andShareClickCountGreaterThanOrEqualTo(String value) {
            addCriterion("share_click_count >=", value, "shareClickCount");
            return (Criteria) this;
        }

        public Criteria andShareClickCountLessThan(String value) {
            addCriterion("share_click_count <", value, "shareClickCount");
            return (Criteria) this;
        }

        public Criteria andShareClickCountLessThanOrEqualTo(String value) {
            addCriterion("share_click_count <=", value, "shareClickCount");
            return (Criteria) this;
        }

        public Criteria andShareClickCountLike(String value) {
            addCriterion("share_click_count like", value, "shareClickCount");
            return (Criteria) this;
        }

        public Criteria andShareClickCountNotLike(String value) {
            addCriterion("share_click_count not like", value, "shareClickCount");
            return (Criteria) this;
        }

        public Criteria andShareClickCountIn(List<String> values) {
            addCriterion("share_click_count in", values, "shareClickCount");
            return (Criteria) this;
        }

        public Criteria andShareClickCountNotIn(List<String> values) {
            addCriterion("share_click_count not in", values, "shareClickCount");
            return (Criteria) this;
        }

        public Criteria andShareClickCountBetween(String value1, String value2) {
            addCriterion("share_click_count between", value1, value2, "shareClickCount");
            return (Criteria) this;
        }

        public Criteria andShareClickCountNotBetween(String value1, String value2) {
            addCriterion("share_click_count not between", value1, value2, "shareClickCount");
            return (Criteria) this;
        }

        public Criteria andIndroduceIsNull() {
            addCriterion("indroduce is null");
            return (Criteria) this;
        }

        public Criteria andIndroduceIsNotNull() {
            addCriterion("indroduce is not null");
            return (Criteria) this;
        }

        public Criteria andIndroduceEqualTo(String value) {
            addCriterion("indroduce =", value, "indroduce");
            return (Criteria) this;
        }

        public Criteria andIndroduceNotEqualTo(String value) {
            addCriterion("indroduce <>", value, "indroduce");
            return (Criteria) this;
        }

        public Criteria andIndroduceGreaterThan(String value) {
            addCriterion("indroduce >", value, "indroduce");
            return (Criteria) this;
        }

        public Criteria andIndroduceGreaterThanOrEqualTo(String value) {
            addCriterion("indroduce >=", value, "indroduce");
            return (Criteria) this;
        }

        public Criteria andIndroduceLessThan(String value) {
            addCriterion("indroduce <", value, "indroduce");
            return (Criteria) this;
        }

        public Criteria andIndroduceLessThanOrEqualTo(String value) {
            addCriterion("indroduce <=", value, "indroduce");
            return (Criteria) this;
        }

        public Criteria andIndroduceLike(String value) {
            addCriterion("indroduce like", value, "indroduce");
            return (Criteria) this;
        }

        public Criteria andIndroduceNotLike(String value) {
            addCriterion("indroduce not like", value, "indroduce");
            return (Criteria) this;
        }

        public Criteria andIndroduceIn(List<String> values) {
            addCriterion("indroduce in", values, "indroduce");
            return (Criteria) this;
        }

        public Criteria andIndroduceNotIn(List<String> values) {
            addCriterion("indroduce not in", values, "indroduce");
            return (Criteria) this;
        }

        public Criteria andIndroduceBetween(String value1, String value2) {
            addCriterion("indroduce between", value1, value2, "indroduce");
            return (Criteria) this;
        }

        public Criteria andIndroduceNotBetween(String value1, String value2) {
            addCriterion("indroduce not between", value1, value2, "indroduce");
            return (Criteria) this;
        }

        public Criteria andLeaveMessageIsNull() {
            addCriterion("leave_message is null");
            return (Criteria) this;
        }

        public Criteria andLeaveMessageIsNotNull() {
            addCriterion("leave_message is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveMessageEqualTo(String value) {
            addCriterion("leave_message =", value, "leaveMessage");
            return (Criteria) this;
        }

        public Criteria andLeaveMessageNotEqualTo(String value) {
            addCriterion("leave_message <>", value, "leaveMessage");
            return (Criteria) this;
        }

        public Criteria andLeaveMessageGreaterThan(String value) {
            addCriterion("leave_message >", value, "leaveMessage");
            return (Criteria) this;
        }

        public Criteria andLeaveMessageGreaterThanOrEqualTo(String value) {
            addCriterion("leave_message >=", value, "leaveMessage");
            return (Criteria) this;
        }

        public Criteria andLeaveMessageLessThan(String value) {
            addCriterion("leave_message <", value, "leaveMessage");
            return (Criteria) this;
        }

        public Criteria andLeaveMessageLessThanOrEqualTo(String value) {
            addCriterion("leave_message <=", value, "leaveMessage");
            return (Criteria) this;
        }

        public Criteria andLeaveMessageLike(String value) {
            addCriterion("leave_message like", value, "leaveMessage");
            return (Criteria) this;
        }

        public Criteria andLeaveMessageNotLike(String value) {
            addCriterion("leave_message not like", value, "leaveMessage");
            return (Criteria) this;
        }

        public Criteria andLeaveMessageIn(List<String> values) {
            addCriterion("leave_message in", values, "leaveMessage");
            return (Criteria) this;
        }

        public Criteria andLeaveMessageNotIn(List<String> values) {
            addCriterion("leave_message not in", values, "leaveMessage");
            return (Criteria) this;
        }

        public Criteria andLeaveMessageBetween(String value1, String value2) {
            addCriterion("leave_message between", value1, value2, "leaveMessage");
            return (Criteria) this;
        }

        public Criteria andLeaveMessageNotBetween(String value1, String value2) {
            addCriterion("leave_message not between", value1, value2, "leaveMessage");
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
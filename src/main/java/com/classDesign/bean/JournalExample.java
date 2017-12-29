package com.classDesign.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JournalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JournalExample() {
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

        public Criteria andJournalIdIsNull() {
            addCriterion("journal_id is null");
            return (Criteria) this;
        }

        public Criteria andJournalIdIsNotNull() {
            addCriterion("journal_id is not null");
            return (Criteria) this;
        }

        public Criteria andJournalIdEqualTo(Integer value) {
            addCriterion("journal_id =", value, "journalId");
            return (Criteria) this;
        }

        public Criteria andJournalIdNotEqualTo(Integer value) {
            addCriterion("journal_id <>", value, "journalId");
            return (Criteria) this;
        }

        public Criteria andJournalIdGreaterThan(Integer value) {
            addCriterion("journal_id >", value, "journalId");
            return (Criteria) this;
        }

        public Criteria andJournalIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("journal_id >=", value, "journalId");
            return (Criteria) this;
        }

        public Criteria andJournalIdLessThan(Integer value) {
            addCriterion("journal_id <", value, "journalId");
            return (Criteria) this;
        }

        public Criteria andJournalIdLessThanOrEqualTo(Integer value) {
            addCriterion("journal_id <=", value, "journalId");
            return (Criteria) this;
        }

        public Criteria andJournalIdIn(List<Integer> values) {
            addCriterion("journal_id in", values, "journalId");
            return (Criteria) this;
        }

        public Criteria andJournalIdNotIn(List<Integer> values) {
            addCriterion("journal_id not in", values, "journalId");
            return (Criteria) this;
        }

        public Criteria andJournalIdBetween(Integer value1, Integer value2) {
            addCriterion("journal_id between", value1, value2, "journalId");
            return (Criteria) this;
        }

        public Criteria andJournalIdNotBetween(Integer value1, Integer value2) {
            addCriterion("journal_id not between", value1, value2, "journalId");
            return (Criteria) this;
        }

        public Criteria andJournalUseridIsNull() {
            addCriterion("journal_userID is null");
            return (Criteria) this;
        }

        public Criteria andJournalUseridIsNotNull() {
            addCriterion("journal_userID is not null");
            return (Criteria) this;
        }

        public Criteria andJournalUseridEqualTo(Integer value) {
            addCriterion("journal_userID =", value, "journalUserid");
            return (Criteria) this;
        }

        public Criteria andJournalUseridNotEqualTo(Integer value) {
            addCriterion("journal_userID <>", value, "journalUserid");
            return (Criteria) this;
        }

        public Criteria andJournalUseridGreaterThan(Integer value) {
            addCriterion("journal_userID >", value, "journalUserid");
            return (Criteria) this;
        }

        public Criteria andJournalUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("journal_userID >=", value, "journalUserid");
            return (Criteria) this;
        }

        public Criteria andJournalUseridLessThan(Integer value) {
            addCriterion("journal_userID <", value, "journalUserid");
            return (Criteria) this;
        }

        public Criteria andJournalUseridLessThanOrEqualTo(Integer value) {
            addCriterion("journal_userID <=", value, "journalUserid");
            return (Criteria) this;
        }

        public Criteria andJournalUseridIn(List<Integer> values) {
            addCriterion("journal_userID in", values, "journalUserid");
            return (Criteria) this;
        }

        public Criteria andJournalUseridNotIn(List<Integer> values) {
            addCriterion("journal_userID not in", values, "journalUserid");
            return (Criteria) this;
        }

        public Criteria andJournalUseridBetween(Integer value1, Integer value2) {
            addCriterion("journal_userID between", value1, value2, "journalUserid");
            return (Criteria) this;
        }

        public Criteria andJournalUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("journal_userID not between", value1, value2, "journalUserid");
            return (Criteria) this;
        }

        public Criteria andJournalTitleIsNull() {
            addCriterion("journal_title is null");
            return (Criteria) this;
        }

        public Criteria andJournalTitleIsNotNull() {
            addCriterion("journal_title is not null");
            return (Criteria) this;
        }

        public Criteria andJournalTitleEqualTo(String value) {
            addCriterion("journal_title =", value, "journalTitle");
            return (Criteria) this;
        }

        public Criteria andJournalTitleNotEqualTo(String value) {
            addCriterion("journal_title <>", value, "journalTitle");
            return (Criteria) this;
        }

        public Criteria andJournalTitleGreaterThan(String value) {
            addCriterion("journal_title >", value, "journalTitle");
            return (Criteria) this;
        }

        public Criteria andJournalTitleGreaterThanOrEqualTo(String value) {
            addCriterion("journal_title >=", value, "journalTitle");
            return (Criteria) this;
        }

        public Criteria andJournalTitleLessThan(String value) {
            addCriterion("journal_title <", value, "journalTitle");
            return (Criteria) this;
        }

        public Criteria andJournalTitleLessThanOrEqualTo(String value) {
            addCriterion("journal_title <=", value, "journalTitle");
            return (Criteria) this;
        }

        public Criteria andJournalTitleLike(String value) {
            addCriterion("journal_title like", value, "journalTitle");
            return (Criteria) this;
        }

        public Criteria andJournalTitleNotLike(String value) {
            addCriterion("journal_title not like", value, "journalTitle");
            return (Criteria) this;
        }

        public Criteria andJournalTitleIn(List<String> values) {
            addCriterion("journal_title in", values, "journalTitle");
            return (Criteria) this;
        }

        public Criteria andJournalTitleNotIn(List<String> values) {
            addCriterion("journal_title not in", values, "journalTitle");
            return (Criteria) this;
        }

        public Criteria andJournalTitleBetween(String value1, String value2) {
            addCriterion("journal_title between", value1, value2, "journalTitle");
            return (Criteria) this;
        }

        public Criteria andJournalTitleNotBetween(String value1, String value2) {
            addCriterion("journal_title not between", value1, value2, "journalTitle");
            return (Criteria) this;
        }

        public Criteria andJournalContentIsNull() {
            addCriterion("journal_content is null");
            return (Criteria) this;
        }

        public Criteria andJournalContentIsNotNull() {
            addCriterion("journal_content is not null");
            return (Criteria) this;
        }

        public Criteria andJournalContentEqualTo(String value) {
            addCriterion("journal_content =", value, "journalContent");
            return (Criteria) this;
        }

        public Criteria andJournalContentNotEqualTo(String value) {
            addCriterion("journal_content <>", value, "journalContent");
            return (Criteria) this;
        }

        public Criteria andJournalContentGreaterThan(String value) {
            addCriterion("journal_content >", value, "journalContent");
            return (Criteria) this;
        }

        public Criteria andJournalContentGreaterThanOrEqualTo(String value) {
            addCriterion("journal_content >=", value, "journalContent");
            return (Criteria) this;
        }

        public Criteria andJournalContentLessThan(String value) {
            addCriterion("journal_content <", value, "journalContent");
            return (Criteria) this;
        }

        public Criteria andJournalContentLessThanOrEqualTo(String value) {
            addCriterion("journal_content <=", value, "journalContent");
            return (Criteria) this;
        }

        public Criteria andJournalContentLike(String value) {
            addCriterion("journal_content like", value, "journalContent");
            return (Criteria) this;
        }

        public Criteria andJournalContentNotLike(String value) {
            addCriterion("journal_content not like", value, "journalContent");
            return (Criteria) this;
        }

        public Criteria andJournalContentIn(List<String> values) {
            addCriterion("journal_content in", values, "journalContent");
            return (Criteria) this;
        }

        public Criteria andJournalContentNotIn(List<String> values) {
            addCriterion("journal_content not in", values, "journalContent");
            return (Criteria) this;
        }

        public Criteria andJournalContentBetween(String value1, String value2) {
            addCriterion("journal_content between", value1, value2, "journalContent");
            return (Criteria) this;
        }

        public Criteria andJournalContentNotBetween(String value1, String value2) {
            addCriterion("journal_content not between", value1, value2, "journalContent");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIsNull() {
            addCriterion("publish_time is null");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIsNotNull() {
            addCriterion("publish_time is not null");
            return (Criteria) this;
        }

        public Criteria andPublishTimeEqualTo(Date value) {
            addCriterion("publish_time =", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotEqualTo(Date value) {
            addCriterion("publish_time <>", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeGreaterThan(Date value) {
            addCriterion("publish_time >", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("publish_time >=", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeLessThan(Date value) {
            addCriterion("publish_time <", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeLessThanOrEqualTo(Date value) {
            addCriterion("publish_time <=", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIn(List<Date> values) {
            addCriterion("publish_time in", values, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotIn(List<Date> values) {
            addCriterion("publish_time not in", values, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeBetween(Date value1, Date value2) {
            addCriterion("publish_time between", value1, value2, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotBetween(Date value1, Date value2) {
            addCriterion("publish_time not between", value1, value2, "publishTime");
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
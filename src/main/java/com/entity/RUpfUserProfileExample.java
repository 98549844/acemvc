package com.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RUpfUserProfileExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RUpfUserProfileExample() {
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

        public Criteria andUpfUserIdIsNull() {
            addCriterion("UPF_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUpfUserIdIsNotNull() {
            addCriterion("UPF_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUpfUserIdEqualTo(String value) {
            addCriterion("UPF_USER_ID =", value, "upfUserId");
            return (Criteria) this;
        }

        public Criteria andUpfUserIdNotEqualTo(String value) {
            addCriterion("UPF_USER_ID <>", value, "upfUserId");
            return (Criteria) this;
        }

        public Criteria andUpfUserIdGreaterThan(String value) {
            addCriterion("UPF_USER_ID >", value, "upfUserId");
            return (Criteria) this;
        }

        public Criteria andUpfUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("UPF_USER_ID >=", value, "upfUserId");
            return (Criteria) this;
        }

        public Criteria andUpfUserIdLessThan(String value) {
            addCriterion("UPF_USER_ID <", value, "upfUserId");
            return (Criteria) this;
        }

        public Criteria andUpfUserIdLessThanOrEqualTo(String value) {
            addCriterion("UPF_USER_ID <=", value, "upfUserId");
            return (Criteria) this;
        }

        public Criteria andUpfUserIdLike(String value) {
            addCriterion("UPF_USER_ID like", value, "upfUserId");
            return (Criteria) this;
        }

        public Criteria andUpfUserIdNotLike(String value) {
            addCriterion("UPF_USER_ID not like", value, "upfUserId");
            return (Criteria) this;
        }

        public Criteria andUpfUserIdIn(List<String> values) {
            addCriterion("UPF_USER_ID in", values, "upfUserId");
            return (Criteria) this;
        }

        public Criteria andUpfUserIdNotIn(List<String> values) {
            addCriterion("UPF_USER_ID not in", values, "upfUserId");
            return (Criteria) this;
        }

        public Criteria andUpfUserIdBetween(String value1, String value2) {
            addCriterion("UPF_USER_ID between", value1, value2, "upfUserId");
            return (Criteria) this;
        }

        public Criteria andUpfUserIdNotBetween(String value1, String value2) {
            addCriterion("UPF_USER_ID not between", value1, value2, "upfUserId");
            return (Criteria) this;
        }

        public Criteria andUpfEngNameIsNull() {
            addCriterion("UPF_ENG_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUpfEngNameIsNotNull() {
            addCriterion("UPF_ENG_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUpfEngNameEqualTo(String value) {
            addCriterion("UPF_ENG_NAME =", value, "upfEngName");
            return (Criteria) this;
        }

        public Criteria andUpfEngNameNotEqualTo(String value) {
            addCriterion("UPF_ENG_NAME <>", value, "upfEngName");
            return (Criteria) this;
        }

        public Criteria andUpfEngNameGreaterThan(String value) {
            addCriterion("UPF_ENG_NAME >", value, "upfEngName");
            return (Criteria) this;
        }

        public Criteria andUpfEngNameGreaterThanOrEqualTo(String value) {
            addCriterion("UPF_ENG_NAME >=", value, "upfEngName");
            return (Criteria) this;
        }

        public Criteria andUpfEngNameLessThan(String value) {
            addCriterion("UPF_ENG_NAME <", value, "upfEngName");
            return (Criteria) this;
        }

        public Criteria andUpfEngNameLessThanOrEqualTo(String value) {
            addCriterion("UPF_ENG_NAME <=", value, "upfEngName");
            return (Criteria) this;
        }

        public Criteria andUpfEngNameLike(String value) {
            addCriterion("UPF_ENG_NAME like", value, "upfEngName");
            return (Criteria) this;
        }

        public Criteria andUpfEngNameNotLike(String value) {
            addCriterion("UPF_ENG_NAME not like", value, "upfEngName");
            return (Criteria) this;
        }

        public Criteria andUpfEngNameIn(List<String> values) {
            addCriterion("UPF_ENG_NAME in", values, "upfEngName");
            return (Criteria) this;
        }

        public Criteria andUpfEngNameNotIn(List<String> values) {
            addCriterion("UPF_ENG_NAME not in", values, "upfEngName");
            return (Criteria) this;
        }

        public Criteria andUpfEngNameBetween(String value1, String value2) {
            addCriterion("UPF_ENG_NAME between", value1, value2, "upfEngName");
            return (Criteria) this;
        }

        public Criteria andUpfEngNameNotBetween(String value1, String value2) {
            addCriterion("UPF_ENG_NAME not between", value1, value2, "upfEngName");
            return (Criteria) this;
        }

        public Criteria andUpfChiNameIsNull() {
            addCriterion("UPF_CHI_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUpfChiNameIsNotNull() {
            addCriterion("UPF_CHI_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUpfChiNameEqualTo(String value) {
            addCriterion("UPF_CHI_NAME =", value, "upfChiName");
            return (Criteria) this;
        }

        public Criteria andUpfChiNameNotEqualTo(String value) {
            addCriterion("UPF_CHI_NAME <>", value, "upfChiName");
            return (Criteria) this;
        }

        public Criteria andUpfChiNameGreaterThan(String value) {
            addCriterion("UPF_CHI_NAME >", value, "upfChiName");
            return (Criteria) this;
        }

        public Criteria andUpfChiNameGreaterThanOrEqualTo(String value) {
            addCriterion("UPF_CHI_NAME >=", value, "upfChiName");
            return (Criteria) this;
        }

        public Criteria andUpfChiNameLessThan(String value) {
            addCriterion("UPF_CHI_NAME <", value, "upfChiName");
            return (Criteria) this;
        }

        public Criteria andUpfChiNameLessThanOrEqualTo(String value) {
            addCriterion("UPF_CHI_NAME <=", value, "upfChiName");
            return (Criteria) this;
        }

        public Criteria andUpfChiNameLike(String value) {
            addCriterion("UPF_CHI_NAME like", value, "upfChiName");
            return (Criteria) this;
        }

        public Criteria andUpfChiNameNotLike(String value) {
            addCriterion("UPF_CHI_NAME not like", value, "upfChiName");
            return (Criteria) this;
        }

        public Criteria andUpfChiNameIn(List<String> values) {
            addCriterion("UPF_CHI_NAME in", values, "upfChiName");
            return (Criteria) this;
        }

        public Criteria andUpfChiNameNotIn(List<String> values) {
            addCriterion("UPF_CHI_NAME not in", values, "upfChiName");
            return (Criteria) this;
        }

        public Criteria andUpfChiNameBetween(String value1, String value2) {
            addCriterion("UPF_CHI_NAME between", value1, value2, "upfChiName");
            return (Criteria) this;
        }

        public Criteria andUpfChiNameNotBetween(String value1, String value2) {
            addCriterion("UPF_CHI_NAME not between", value1, value2, "upfChiName");
            return (Criteria) this;
        }

        public Criteria andUpfEmailIsNull() {
            addCriterion("UPF_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andUpfEmailIsNotNull() {
            addCriterion("UPF_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andUpfEmailEqualTo(String value) {
            addCriterion("UPF_EMAIL =", value, "upfEmail");
            return (Criteria) this;
        }

        public Criteria andUpfEmailNotEqualTo(String value) {
            addCriterion("UPF_EMAIL <>", value, "upfEmail");
            return (Criteria) this;
        }

        public Criteria andUpfEmailGreaterThan(String value) {
            addCriterion("UPF_EMAIL >", value, "upfEmail");
            return (Criteria) this;
        }

        public Criteria andUpfEmailGreaterThanOrEqualTo(String value) {
            addCriterion("UPF_EMAIL >=", value, "upfEmail");
            return (Criteria) this;
        }

        public Criteria andUpfEmailLessThan(String value) {
            addCriterion("UPF_EMAIL <", value, "upfEmail");
            return (Criteria) this;
        }

        public Criteria andUpfEmailLessThanOrEqualTo(String value) {
            addCriterion("UPF_EMAIL <=", value, "upfEmail");
            return (Criteria) this;
        }

        public Criteria andUpfEmailLike(String value) {
            addCriterion("UPF_EMAIL like", value, "upfEmail");
            return (Criteria) this;
        }

        public Criteria andUpfEmailNotLike(String value) {
            addCriterion("UPF_EMAIL not like", value, "upfEmail");
            return (Criteria) this;
        }

        public Criteria andUpfEmailIn(List<String> values) {
            addCriterion("UPF_EMAIL in", values, "upfEmail");
            return (Criteria) this;
        }

        public Criteria andUpfEmailNotIn(List<String> values) {
            addCriterion("UPF_EMAIL not in", values, "upfEmail");
            return (Criteria) this;
        }

        public Criteria andUpfEmailBetween(String value1, String value2) {
            addCriterion("UPF_EMAIL between", value1, value2, "upfEmail");
            return (Criteria) this;
        }

        public Criteria andUpfEmailNotBetween(String value1, String value2) {
            addCriterion("UPF_EMAIL not between", value1, value2, "upfEmail");
            return (Criteria) this;
        }

        public Criteria andUpfFaxIsNull() {
            addCriterion("UPF_FAX is null");
            return (Criteria) this;
        }

        public Criteria andUpfFaxIsNotNull() {
            addCriterion("UPF_FAX is not null");
            return (Criteria) this;
        }

        public Criteria andUpfFaxEqualTo(String value) {
            addCriterion("UPF_FAX =", value, "upfFax");
            return (Criteria) this;
        }

        public Criteria andUpfFaxNotEqualTo(String value) {
            addCriterion("UPF_FAX <>", value, "upfFax");
            return (Criteria) this;
        }

        public Criteria andUpfFaxGreaterThan(String value) {
            addCriterion("UPF_FAX >", value, "upfFax");
            return (Criteria) this;
        }

        public Criteria andUpfFaxGreaterThanOrEqualTo(String value) {
            addCriterion("UPF_FAX >=", value, "upfFax");
            return (Criteria) this;
        }

        public Criteria andUpfFaxLessThan(String value) {
            addCriterion("UPF_FAX <", value, "upfFax");
            return (Criteria) this;
        }

        public Criteria andUpfFaxLessThanOrEqualTo(String value) {
            addCriterion("UPF_FAX <=", value, "upfFax");
            return (Criteria) this;
        }

        public Criteria andUpfFaxLike(String value) {
            addCriterion("UPF_FAX like", value, "upfFax");
            return (Criteria) this;
        }

        public Criteria andUpfFaxNotLike(String value) {
            addCriterion("UPF_FAX not like", value, "upfFax");
            return (Criteria) this;
        }

        public Criteria andUpfFaxIn(List<String> values) {
            addCriterion("UPF_FAX in", values, "upfFax");
            return (Criteria) this;
        }

        public Criteria andUpfFaxNotIn(List<String> values) {
            addCriterion("UPF_FAX not in", values, "upfFax");
            return (Criteria) this;
        }

        public Criteria andUpfFaxBetween(String value1, String value2) {
            addCriterion("UPF_FAX between", value1, value2, "upfFax");
            return (Criteria) this;
        }

        public Criteria andUpfFaxNotBetween(String value1, String value2) {
            addCriterion("UPF_FAX not between", value1, value2, "upfFax");
            return (Criteria) this;
        }

        public Criteria andUpfTelIsNull() {
            addCriterion("UPF_TEL is null");
            return (Criteria) this;
        }

        public Criteria andUpfTelIsNotNull() {
            addCriterion("UPF_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andUpfTelEqualTo(String value) {
            addCriterion("UPF_TEL =", value, "upfTel");
            return (Criteria) this;
        }

        public Criteria andUpfTelNotEqualTo(String value) {
            addCriterion("UPF_TEL <>", value, "upfTel");
            return (Criteria) this;
        }

        public Criteria andUpfTelGreaterThan(String value) {
            addCriterion("UPF_TEL >", value, "upfTel");
            return (Criteria) this;
        }

        public Criteria andUpfTelGreaterThanOrEqualTo(String value) {
            addCriterion("UPF_TEL >=", value, "upfTel");
            return (Criteria) this;
        }

        public Criteria andUpfTelLessThan(String value) {
            addCriterion("UPF_TEL <", value, "upfTel");
            return (Criteria) this;
        }

        public Criteria andUpfTelLessThanOrEqualTo(String value) {
            addCriterion("UPF_TEL <=", value, "upfTel");
            return (Criteria) this;
        }

        public Criteria andUpfTelLike(String value) {
            addCriterion("UPF_TEL like", value, "upfTel");
            return (Criteria) this;
        }

        public Criteria andUpfTelNotLike(String value) {
            addCriterion("UPF_TEL not like", value, "upfTel");
            return (Criteria) this;
        }

        public Criteria andUpfTelIn(List<String> values) {
            addCriterion("UPF_TEL in", values, "upfTel");
            return (Criteria) this;
        }

        public Criteria andUpfTelNotIn(List<String> values) {
            addCriterion("UPF_TEL not in", values, "upfTel");
            return (Criteria) this;
        }

        public Criteria andUpfTelBetween(String value1, String value2) {
            addCriterion("UPF_TEL between", value1, value2, "upfTel");
            return (Criteria) this;
        }

        public Criteria andUpfTelNotBetween(String value1, String value2) {
            addCriterion("UPF_TEL not between", value1, value2, "upfTel");
            return (Criteria) this;
        }

        public Criteria andUpfLocIsNull() {
            addCriterion("UPF_LOC is null");
            return (Criteria) this;
        }

        public Criteria andUpfLocIsNotNull() {
            addCriterion("UPF_LOC is not null");
            return (Criteria) this;
        }

        public Criteria andUpfLocEqualTo(String value) {
            addCriterion("UPF_LOC =", value, "upfLoc");
            return (Criteria) this;
        }

        public Criteria andUpfLocNotEqualTo(String value) {
            addCriterion("UPF_LOC <>", value, "upfLoc");
            return (Criteria) this;
        }

        public Criteria andUpfLocGreaterThan(String value) {
            addCriterion("UPF_LOC >", value, "upfLoc");
            return (Criteria) this;
        }

        public Criteria andUpfLocGreaterThanOrEqualTo(String value) {
            addCriterion("UPF_LOC >=", value, "upfLoc");
            return (Criteria) this;
        }

        public Criteria andUpfLocLessThan(String value) {
            addCriterion("UPF_LOC <", value, "upfLoc");
            return (Criteria) this;
        }

        public Criteria andUpfLocLessThanOrEqualTo(String value) {
            addCriterion("UPF_LOC <=", value, "upfLoc");
            return (Criteria) this;
        }

        public Criteria andUpfLocLike(String value) {
            addCriterion("UPF_LOC like", value, "upfLoc");
            return (Criteria) this;
        }

        public Criteria andUpfLocNotLike(String value) {
            addCriterion("UPF_LOC not like", value, "upfLoc");
            return (Criteria) this;
        }

        public Criteria andUpfLocIn(List<String> values) {
            addCriterion("UPF_LOC in", values, "upfLoc");
            return (Criteria) this;
        }

        public Criteria andUpfLocNotIn(List<String> values) {
            addCriterion("UPF_LOC not in", values, "upfLoc");
            return (Criteria) this;
        }

        public Criteria andUpfLocBetween(String value1, String value2) {
            addCriterion("UPF_LOC between", value1, value2, "upfLoc");
            return (Criteria) this;
        }

        public Criteria andUpfLocNotBetween(String value1, String value2) {
            addCriterion("UPF_LOC not between", value1, value2, "upfLoc");
            return (Criteria) this;
        }

        public Criteria andUpfSalutationIsNull() {
            addCriterion("UPF_SALUTATION is null");
            return (Criteria) this;
        }

        public Criteria andUpfSalutationIsNotNull() {
            addCriterion("UPF_SALUTATION is not null");
            return (Criteria) this;
        }

        public Criteria andUpfSalutationEqualTo(String value) {
            addCriterion("UPF_SALUTATION =", value, "upfSalutation");
            return (Criteria) this;
        }

        public Criteria andUpfSalutationNotEqualTo(String value) {
            addCriterion("UPF_SALUTATION <>", value, "upfSalutation");
            return (Criteria) this;
        }

        public Criteria andUpfSalutationGreaterThan(String value) {
            addCriterion("UPF_SALUTATION >", value, "upfSalutation");
            return (Criteria) this;
        }

        public Criteria andUpfSalutationGreaterThanOrEqualTo(String value) {
            addCriterion("UPF_SALUTATION >=", value, "upfSalutation");
            return (Criteria) this;
        }

        public Criteria andUpfSalutationLessThan(String value) {
            addCriterion("UPF_SALUTATION <", value, "upfSalutation");
            return (Criteria) this;
        }

        public Criteria andUpfSalutationLessThanOrEqualTo(String value) {
            addCriterion("UPF_SALUTATION <=", value, "upfSalutation");
            return (Criteria) this;
        }

        public Criteria andUpfSalutationLike(String value) {
            addCriterion("UPF_SALUTATION like", value, "upfSalutation");
            return (Criteria) this;
        }

        public Criteria andUpfSalutationNotLike(String value) {
            addCriterion("UPF_SALUTATION not like", value, "upfSalutation");
            return (Criteria) this;
        }

        public Criteria andUpfSalutationIn(List<String> values) {
            addCriterion("UPF_SALUTATION in", values, "upfSalutation");
            return (Criteria) this;
        }

        public Criteria andUpfSalutationNotIn(List<String> values) {
            addCriterion("UPF_SALUTATION not in", values, "upfSalutation");
            return (Criteria) this;
        }

        public Criteria andUpfSalutationBetween(String value1, String value2) {
            addCriterion("UPF_SALUTATION between", value1, value2, "upfSalutation");
            return (Criteria) this;
        }

        public Criteria andUpfSalutationNotBetween(String value1, String value2) {
            addCriterion("UPF_SALUTATION not between", value1, value2, "upfSalutation");
            return (Criteria) this;
        }

        public Criteria andUpfDepartmentIsNull() {
            addCriterion("UPF_DEPARTMENT is null");
            return (Criteria) this;
        }

        public Criteria andUpfDepartmentIsNotNull() {
            addCriterion("UPF_DEPARTMENT is not null");
            return (Criteria) this;
        }

        public Criteria andUpfDepartmentEqualTo(String value) {
            addCriterion("UPF_DEPARTMENT =", value, "upfDepartment");
            return (Criteria) this;
        }

        public Criteria andUpfDepartmentNotEqualTo(String value) {
            addCriterion("UPF_DEPARTMENT <>", value, "upfDepartment");
            return (Criteria) this;
        }

        public Criteria andUpfDepartmentGreaterThan(String value) {
            addCriterion("UPF_DEPARTMENT >", value, "upfDepartment");
            return (Criteria) this;
        }

        public Criteria andUpfDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("UPF_DEPARTMENT >=", value, "upfDepartment");
            return (Criteria) this;
        }

        public Criteria andUpfDepartmentLessThan(String value) {
            addCriterion("UPF_DEPARTMENT <", value, "upfDepartment");
            return (Criteria) this;
        }

        public Criteria andUpfDepartmentLessThanOrEqualTo(String value) {
            addCriterion("UPF_DEPARTMENT <=", value, "upfDepartment");
            return (Criteria) this;
        }

        public Criteria andUpfDepartmentLike(String value) {
            addCriterion("UPF_DEPARTMENT like", value, "upfDepartment");
            return (Criteria) this;
        }

        public Criteria andUpfDepartmentNotLike(String value) {
            addCriterion("UPF_DEPARTMENT not like", value, "upfDepartment");
            return (Criteria) this;
        }

        public Criteria andUpfDepartmentIn(List<String> values) {
            addCriterion("UPF_DEPARTMENT in", values, "upfDepartment");
            return (Criteria) this;
        }

        public Criteria andUpfDepartmentNotIn(List<String> values) {
            addCriterion("UPF_DEPARTMENT not in", values, "upfDepartment");
            return (Criteria) this;
        }

        public Criteria andUpfDepartmentBetween(String value1, String value2) {
            addCriterion("UPF_DEPARTMENT between", value1, value2, "upfDepartment");
            return (Criteria) this;
        }

        public Criteria andUpfDepartmentNotBetween(String value1, String value2) {
            addCriterion("UPF_DEPARTMENT not between", value1, value2, "upfDepartment");
            return (Criteria) this;
        }

        public Criteria andUpfRankIsNull() {
            addCriterion("UPF_RANK is null");
            return (Criteria) this;
        }

        public Criteria andUpfRankIsNotNull() {
            addCriterion("UPF_RANK is not null");
            return (Criteria) this;
        }

        public Criteria andUpfRankEqualTo(String value) {
            addCriterion("UPF_RANK =", value, "upfRank");
            return (Criteria) this;
        }

        public Criteria andUpfRankNotEqualTo(String value) {
            addCriterion("UPF_RANK <>", value, "upfRank");
            return (Criteria) this;
        }

        public Criteria andUpfRankGreaterThan(String value) {
            addCriterion("UPF_RANK >", value, "upfRank");
            return (Criteria) this;
        }

        public Criteria andUpfRankGreaterThanOrEqualTo(String value) {
            addCriterion("UPF_RANK >=", value, "upfRank");
            return (Criteria) this;
        }

        public Criteria andUpfRankLessThan(String value) {
            addCriterion("UPF_RANK <", value, "upfRank");
            return (Criteria) this;
        }

        public Criteria andUpfRankLessThanOrEqualTo(String value) {
            addCriterion("UPF_RANK <=", value, "upfRank");
            return (Criteria) this;
        }

        public Criteria andUpfRankLike(String value) {
            addCriterion("UPF_RANK like", value, "upfRank");
            return (Criteria) this;
        }

        public Criteria andUpfRankNotLike(String value) {
            addCriterion("UPF_RANK not like", value, "upfRank");
            return (Criteria) this;
        }

        public Criteria andUpfRankIn(List<String> values) {
            addCriterion("UPF_RANK in", values, "upfRank");
            return (Criteria) this;
        }

        public Criteria andUpfRankNotIn(List<String> values) {
            addCriterion("UPF_RANK not in", values, "upfRank");
            return (Criteria) this;
        }

        public Criteria andUpfRankBetween(String value1, String value2) {
            addCriterion("UPF_RANK between", value1, value2, "upfRank");
            return (Criteria) this;
        }

        public Criteria andUpfRankNotBetween(String value1, String value2) {
            addCriterion("UPF_RANK not between", value1, value2, "upfRank");
            return (Criteria) this;
        }

        public Criteria andUpfStatusIsNull() {
            addCriterion("UPF_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andUpfStatusIsNotNull() {
            addCriterion("UPF_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andUpfStatusEqualTo(String value) {
            addCriterion("UPF_STATUS =", value, "upfStatus");
            return (Criteria) this;
        }

        public Criteria andUpfStatusNotEqualTo(String value) {
            addCriterion("UPF_STATUS <>", value, "upfStatus");
            return (Criteria) this;
        }

        public Criteria andUpfStatusGreaterThan(String value) {
            addCriterion("UPF_STATUS >", value, "upfStatus");
            return (Criteria) this;
        }

        public Criteria andUpfStatusGreaterThanOrEqualTo(String value) {
            addCriterion("UPF_STATUS >=", value, "upfStatus");
            return (Criteria) this;
        }

        public Criteria andUpfStatusLessThan(String value) {
            addCriterion("UPF_STATUS <", value, "upfStatus");
            return (Criteria) this;
        }

        public Criteria andUpfStatusLessThanOrEqualTo(String value) {
            addCriterion("UPF_STATUS <=", value, "upfStatus");
            return (Criteria) this;
        }

        public Criteria andUpfStatusLike(String value) {
            addCriterion("UPF_STATUS like", value, "upfStatus");
            return (Criteria) this;
        }

        public Criteria andUpfStatusNotLike(String value) {
            addCriterion("UPF_STATUS not like", value, "upfStatus");
            return (Criteria) this;
        }

        public Criteria andUpfStatusIn(List<String> values) {
            addCriterion("UPF_STATUS in", values, "upfStatus");
            return (Criteria) this;
        }

        public Criteria andUpfStatusNotIn(List<String> values) {
            addCriterion("UPF_STATUS not in", values, "upfStatus");
            return (Criteria) this;
        }

        public Criteria andUpfStatusBetween(String value1, String value2) {
            addCriterion("UPF_STATUS between", value1, value2, "upfStatus");
            return (Criteria) this;
        }

        public Criteria andUpfStatusNotBetween(String value1, String value2) {
            addCriterion("UPF_STATUS not between", value1, value2, "upfStatus");
            return (Criteria) this;
        }

        public Criteria andUpfEngFirstNameIsNull() {
            addCriterion("UPF_ENG_FIRST_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUpfEngFirstNameIsNotNull() {
            addCriterion("UPF_ENG_FIRST_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUpfEngFirstNameEqualTo(String value) {
            addCriterion("UPF_ENG_FIRST_NAME =", value, "upfEngFirstName");
            return (Criteria) this;
        }

        public Criteria andUpfEngFirstNameNotEqualTo(String value) {
            addCriterion("UPF_ENG_FIRST_NAME <>", value, "upfEngFirstName");
            return (Criteria) this;
        }

        public Criteria andUpfEngFirstNameGreaterThan(String value) {
            addCriterion("UPF_ENG_FIRST_NAME >", value, "upfEngFirstName");
            return (Criteria) this;
        }

        public Criteria andUpfEngFirstNameGreaterThanOrEqualTo(String value) {
            addCriterion("UPF_ENG_FIRST_NAME >=", value, "upfEngFirstName");
            return (Criteria) this;
        }

        public Criteria andUpfEngFirstNameLessThan(String value) {
            addCriterion("UPF_ENG_FIRST_NAME <", value, "upfEngFirstName");
            return (Criteria) this;
        }

        public Criteria andUpfEngFirstNameLessThanOrEqualTo(String value) {
            addCriterion("UPF_ENG_FIRST_NAME <=", value, "upfEngFirstName");
            return (Criteria) this;
        }

        public Criteria andUpfEngFirstNameLike(String value) {
            addCriterion("UPF_ENG_FIRST_NAME like", value, "upfEngFirstName");
            return (Criteria) this;
        }

        public Criteria andUpfEngFirstNameNotLike(String value) {
            addCriterion("UPF_ENG_FIRST_NAME not like", value, "upfEngFirstName");
            return (Criteria) this;
        }

        public Criteria andUpfEngFirstNameIn(List<String> values) {
            addCriterion("UPF_ENG_FIRST_NAME in", values, "upfEngFirstName");
            return (Criteria) this;
        }

        public Criteria andUpfEngFirstNameNotIn(List<String> values) {
            addCriterion("UPF_ENG_FIRST_NAME not in", values, "upfEngFirstName");
            return (Criteria) this;
        }

        public Criteria andUpfEngFirstNameBetween(String value1, String value2) {
            addCriterion("UPF_ENG_FIRST_NAME between", value1, value2, "upfEngFirstName");
            return (Criteria) this;
        }

        public Criteria andUpfEngFirstNameNotBetween(String value1, String value2) {
            addCriterion("UPF_ENG_FIRST_NAME not between", value1, value2, "upfEngFirstName");
            return (Criteria) this;
        }

        public Criteria andUpfEngLastNameIsNull() {
            addCriterion("UPF_ENG_LAST_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUpfEngLastNameIsNotNull() {
            addCriterion("UPF_ENG_LAST_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUpfEngLastNameEqualTo(String value) {
            addCriterion("UPF_ENG_LAST_NAME =", value, "upfEngLastName");
            return (Criteria) this;
        }

        public Criteria andUpfEngLastNameNotEqualTo(String value) {
            addCriterion("UPF_ENG_LAST_NAME <>", value, "upfEngLastName");
            return (Criteria) this;
        }

        public Criteria andUpfEngLastNameGreaterThan(String value) {
            addCriterion("UPF_ENG_LAST_NAME >", value, "upfEngLastName");
            return (Criteria) this;
        }

        public Criteria andUpfEngLastNameGreaterThanOrEqualTo(String value) {
            addCriterion("UPF_ENG_LAST_NAME >=", value, "upfEngLastName");
            return (Criteria) this;
        }

        public Criteria andUpfEngLastNameLessThan(String value) {
            addCriterion("UPF_ENG_LAST_NAME <", value, "upfEngLastName");
            return (Criteria) this;
        }

        public Criteria andUpfEngLastNameLessThanOrEqualTo(String value) {
            addCriterion("UPF_ENG_LAST_NAME <=", value, "upfEngLastName");
            return (Criteria) this;
        }

        public Criteria andUpfEngLastNameLike(String value) {
            addCriterion("UPF_ENG_LAST_NAME like", value, "upfEngLastName");
            return (Criteria) this;
        }

        public Criteria andUpfEngLastNameNotLike(String value) {
            addCriterion("UPF_ENG_LAST_NAME not like", value, "upfEngLastName");
            return (Criteria) this;
        }

        public Criteria andUpfEngLastNameIn(List<String> values) {
            addCriterion("UPF_ENG_LAST_NAME in", values, "upfEngLastName");
            return (Criteria) this;
        }

        public Criteria andUpfEngLastNameNotIn(List<String> values) {
            addCriterion("UPF_ENG_LAST_NAME not in", values, "upfEngLastName");
            return (Criteria) this;
        }

        public Criteria andUpfEngLastNameBetween(String value1, String value2) {
            addCriterion("UPF_ENG_LAST_NAME between", value1, value2, "upfEngLastName");
            return (Criteria) this;
        }

        public Criteria andUpfEngLastNameNotBetween(String value1, String value2) {
            addCriterion("UPF_ENG_LAST_NAME not between", value1, value2, "upfEngLastName");
            return (Criteria) this;
        }

        public Criteria andUpfChiFirstNameIsNull() {
            addCriterion("UPF_CHI_FIRST_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUpfChiFirstNameIsNotNull() {
            addCriterion("UPF_CHI_FIRST_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUpfChiFirstNameEqualTo(String value) {
            addCriterion("UPF_CHI_FIRST_NAME =", value, "upfChiFirstName");
            return (Criteria) this;
        }

        public Criteria andUpfChiFirstNameNotEqualTo(String value) {
            addCriterion("UPF_CHI_FIRST_NAME <>", value, "upfChiFirstName");
            return (Criteria) this;
        }

        public Criteria andUpfChiFirstNameGreaterThan(String value) {
            addCriterion("UPF_CHI_FIRST_NAME >", value, "upfChiFirstName");
            return (Criteria) this;
        }

        public Criteria andUpfChiFirstNameGreaterThanOrEqualTo(String value) {
            addCriterion("UPF_CHI_FIRST_NAME >=", value, "upfChiFirstName");
            return (Criteria) this;
        }

        public Criteria andUpfChiFirstNameLessThan(String value) {
            addCriterion("UPF_CHI_FIRST_NAME <", value, "upfChiFirstName");
            return (Criteria) this;
        }

        public Criteria andUpfChiFirstNameLessThanOrEqualTo(String value) {
            addCriterion("UPF_CHI_FIRST_NAME <=", value, "upfChiFirstName");
            return (Criteria) this;
        }

        public Criteria andUpfChiFirstNameLike(String value) {
            addCriterion("UPF_CHI_FIRST_NAME like", value, "upfChiFirstName");
            return (Criteria) this;
        }

        public Criteria andUpfChiFirstNameNotLike(String value) {
            addCriterion("UPF_CHI_FIRST_NAME not like", value, "upfChiFirstName");
            return (Criteria) this;
        }

        public Criteria andUpfChiFirstNameIn(List<String> values) {
            addCriterion("UPF_CHI_FIRST_NAME in", values, "upfChiFirstName");
            return (Criteria) this;
        }

        public Criteria andUpfChiFirstNameNotIn(List<String> values) {
            addCriterion("UPF_CHI_FIRST_NAME not in", values, "upfChiFirstName");
            return (Criteria) this;
        }

        public Criteria andUpfChiFirstNameBetween(String value1, String value2) {
            addCriterion("UPF_CHI_FIRST_NAME between", value1, value2, "upfChiFirstName");
            return (Criteria) this;
        }

        public Criteria andUpfChiFirstNameNotBetween(String value1, String value2) {
            addCriterion("UPF_CHI_FIRST_NAME not between", value1, value2, "upfChiFirstName");
            return (Criteria) this;
        }

        public Criteria andUpfChiLastNameIsNull() {
            addCriterion("UPF_CHI_LAST_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUpfChiLastNameIsNotNull() {
            addCriterion("UPF_CHI_LAST_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUpfChiLastNameEqualTo(String value) {
            addCriterion("UPF_CHI_LAST_NAME =", value, "upfChiLastName");
            return (Criteria) this;
        }

        public Criteria andUpfChiLastNameNotEqualTo(String value) {
            addCriterion("UPF_CHI_LAST_NAME <>", value, "upfChiLastName");
            return (Criteria) this;
        }

        public Criteria andUpfChiLastNameGreaterThan(String value) {
            addCriterion("UPF_CHI_LAST_NAME >", value, "upfChiLastName");
            return (Criteria) this;
        }

        public Criteria andUpfChiLastNameGreaterThanOrEqualTo(String value) {
            addCriterion("UPF_CHI_LAST_NAME >=", value, "upfChiLastName");
            return (Criteria) this;
        }

        public Criteria andUpfChiLastNameLessThan(String value) {
            addCriterion("UPF_CHI_LAST_NAME <", value, "upfChiLastName");
            return (Criteria) this;
        }

        public Criteria andUpfChiLastNameLessThanOrEqualTo(String value) {
            addCriterion("UPF_CHI_LAST_NAME <=", value, "upfChiLastName");
            return (Criteria) this;
        }

        public Criteria andUpfChiLastNameLike(String value) {
            addCriterion("UPF_CHI_LAST_NAME like", value, "upfChiLastName");
            return (Criteria) this;
        }

        public Criteria andUpfChiLastNameNotLike(String value) {
            addCriterion("UPF_CHI_LAST_NAME not like", value, "upfChiLastName");
            return (Criteria) this;
        }

        public Criteria andUpfChiLastNameIn(List<String> values) {
            addCriterion("UPF_CHI_LAST_NAME in", values, "upfChiLastName");
            return (Criteria) this;
        }

        public Criteria andUpfChiLastNameNotIn(List<String> values) {
            addCriterion("UPF_CHI_LAST_NAME not in", values, "upfChiLastName");
            return (Criteria) this;
        }

        public Criteria andUpfChiLastNameBetween(String value1, String value2) {
            addCriterion("UPF_CHI_LAST_NAME between", value1, value2, "upfChiLastName");
            return (Criteria) this;
        }

        public Criteria andUpfChiLastNameNotBetween(String value1, String value2) {
            addCriterion("UPF_CHI_LAST_NAME not between", value1, value2, "upfChiLastName");
            return (Criteria) this;
        }

        public Criteria andUpfPwdIsNull() {
            addCriterion("UPF_PWD is null");
            return (Criteria) this;
        }

        public Criteria andUpfPwdIsNotNull() {
            addCriterion("UPF_PWD is not null");
            return (Criteria) this;
        }

        public Criteria andUpfPwdEqualTo(String value) {
            addCriterion("UPF_PWD =", value, "upfPwd");
            return (Criteria) this;
        }

        public Criteria andUpfPwdNotEqualTo(String value) {
            addCriterion("UPF_PWD <>", value, "upfPwd");
            return (Criteria) this;
        }

        public Criteria andUpfPwdGreaterThan(String value) {
            addCriterion("UPF_PWD >", value, "upfPwd");
            return (Criteria) this;
        }

        public Criteria andUpfPwdGreaterThanOrEqualTo(String value) {
            addCriterion("UPF_PWD >=", value, "upfPwd");
            return (Criteria) this;
        }

        public Criteria andUpfPwdLessThan(String value) {
            addCriterion("UPF_PWD <", value, "upfPwd");
            return (Criteria) this;
        }

        public Criteria andUpfPwdLessThanOrEqualTo(String value) {
            addCriterion("UPF_PWD <=", value, "upfPwd");
            return (Criteria) this;
        }

        public Criteria andUpfPwdLike(String value) {
            addCriterion("UPF_PWD like", value, "upfPwd");
            return (Criteria) this;
        }

        public Criteria andUpfPwdNotLike(String value) {
            addCriterion("UPF_PWD not like", value, "upfPwd");
            return (Criteria) this;
        }

        public Criteria andUpfPwdIn(List<String> values) {
            addCriterion("UPF_PWD in", values, "upfPwd");
            return (Criteria) this;
        }

        public Criteria andUpfPwdNotIn(List<String> values) {
            addCriterion("UPF_PWD not in", values, "upfPwd");
            return (Criteria) this;
        }

        public Criteria andUpfPwdBetween(String value1, String value2) {
            addCriterion("UPF_PWD between", value1, value2, "upfPwd");
            return (Criteria) this;
        }

        public Criteria andUpfPwdNotBetween(String value1, String value2) {
            addCriterion("UPF_PWD not between", value1, value2, "upfPwd");
            return (Criteria) this;
        }

        public Criteria andUpfPwdChgDtIsNull() {
            addCriterion("UPF_PWD_CHG_DT is null");
            return (Criteria) this;
        }

        public Criteria andUpfPwdChgDtIsNotNull() {
            addCriterion("UPF_PWD_CHG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andUpfPwdChgDtEqualTo(Date value) {
            addCriterion("UPF_PWD_CHG_DT =", value, "upfPwdChgDt");
            return (Criteria) this;
        }

        public Criteria andUpfPwdChgDtNotEqualTo(Date value) {
            addCriterion("UPF_PWD_CHG_DT <>", value, "upfPwdChgDt");
            return (Criteria) this;
        }

        public Criteria andUpfPwdChgDtGreaterThan(Date value) {
            addCriterion("UPF_PWD_CHG_DT >", value, "upfPwdChgDt");
            return (Criteria) this;
        }

        public Criteria andUpfPwdChgDtGreaterThanOrEqualTo(Date value) {
            addCriterion("UPF_PWD_CHG_DT >=", value, "upfPwdChgDt");
            return (Criteria) this;
        }

        public Criteria andUpfPwdChgDtLessThan(Date value) {
            addCriterion("UPF_PWD_CHG_DT <", value, "upfPwdChgDt");
            return (Criteria) this;
        }

        public Criteria andUpfPwdChgDtLessThanOrEqualTo(Date value) {
            addCriterion("UPF_PWD_CHG_DT <=", value, "upfPwdChgDt");
            return (Criteria) this;
        }

        public Criteria andUpfPwdChgDtIn(List<Date> values) {
            addCriterion("UPF_PWD_CHG_DT in", values, "upfPwdChgDt");
            return (Criteria) this;
        }

        public Criteria andUpfPwdChgDtNotIn(List<Date> values) {
            addCriterion("UPF_PWD_CHG_DT not in", values, "upfPwdChgDt");
            return (Criteria) this;
        }

        public Criteria andUpfPwdChgDtBetween(Date value1, Date value2) {
            addCriterion("UPF_PWD_CHG_DT between", value1, value2, "upfPwdChgDt");
            return (Criteria) this;
        }

        public Criteria andUpfPwdChgDtNotBetween(Date value1, Date value2) {
            addCriterion("UPF_PWD_CHG_DT not between", value1, value2, "upfPwdChgDt");
            return (Criteria) this;
        }

        public Criteria andUpfFailCountIsNull() {
            addCriterion("UPF_FAIL_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andUpfFailCountIsNotNull() {
            addCriterion("UPF_FAIL_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andUpfFailCountEqualTo(Integer value) {
            addCriterion("UPF_FAIL_COUNT =", value, "upfFailCount");
            return (Criteria) this;
        }

        public Criteria andUpfFailCountNotEqualTo(Integer value) {
            addCriterion("UPF_FAIL_COUNT <>", value, "upfFailCount");
            return (Criteria) this;
        }

        public Criteria andUpfFailCountGreaterThan(Integer value) {
            addCriterion("UPF_FAIL_COUNT >", value, "upfFailCount");
            return (Criteria) this;
        }

        public Criteria andUpfFailCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("UPF_FAIL_COUNT >=", value, "upfFailCount");
            return (Criteria) this;
        }

        public Criteria andUpfFailCountLessThan(Integer value) {
            addCriterion("UPF_FAIL_COUNT <", value, "upfFailCount");
            return (Criteria) this;
        }

        public Criteria andUpfFailCountLessThanOrEqualTo(Integer value) {
            addCriterion("UPF_FAIL_COUNT <=", value, "upfFailCount");
            return (Criteria) this;
        }

        public Criteria andUpfFailCountIn(List<Integer> values) {
            addCriterion("UPF_FAIL_COUNT in", values, "upfFailCount");
            return (Criteria) this;
        }

        public Criteria andUpfFailCountNotIn(List<Integer> values) {
            addCriterion("UPF_FAIL_COUNT not in", values, "upfFailCount");
            return (Criteria) this;
        }

        public Criteria andUpfFailCountBetween(Integer value1, Integer value2) {
            addCriterion("UPF_FAIL_COUNT between", value1, value2, "upfFailCount");
            return (Criteria) this;
        }

        public Criteria andUpfFailCountNotBetween(Integer value1, Integer value2) {
            addCriterion("UPF_FAIL_COUNT not between", value1, value2, "upfFailCount");
            return (Criteria) this;
        }

        public Criteria andUpfLastLockTimeIsNull() {
            addCriterion("UPF_LAST_LOCK_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpfLastLockTimeIsNotNull() {
            addCriterion("UPF_LAST_LOCK_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpfLastLockTimeEqualTo(Date value) {
            addCriterion("UPF_LAST_LOCK_TIME =", value, "upfLastLockTime");
            return (Criteria) this;
        }

        public Criteria andUpfLastLockTimeNotEqualTo(Date value) {
            addCriterion("UPF_LAST_LOCK_TIME <>", value, "upfLastLockTime");
            return (Criteria) this;
        }

        public Criteria andUpfLastLockTimeGreaterThan(Date value) {
            addCriterion("UPF_LAST_LOCK_TIME >", value, "upfLastLockTime");
            return (Criteria) this;
        }

        public Criteria andUpfLastLockTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPF_LAST_LOCK_TIME >=", value, "upfLastLockTime");
            return (Criteria) this;
        }

        public Criteria andUpfLastLockTimeLessThan(Date value) {
            addCriterion("UPF_LAST_LOCK_TIME <", value, "upfLastLockTime");
            return (Criteria) this;
        }

        public Criteria andUpfLastLockTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPF_LAST_LOCK_TIME <=", value, "upfLastLockTime");
            return (Criteria) this;
        }

        public Criteria andUpfLastLockTimeIn(List<Date> values) {
            addCriterion("UPF_LAST_LOCK_TIME in", values, "upfLastLockTime");
            return (Criteria) this;
        }

        public Criteria andUpfLastLockTimeNotIn(List<Date> values) {
            addCriterion("UPF_LAST_LOCK_TIME not in", values, "upfLastLockTime");
            return (Criteria) this;
        }

        public Criteria andUpfLastLockTimeBetween(Date value1, Date value2) {
            addCriterion("UPF_LAST_LOCK_TIME between", value1, value2, "upfLastLockTime");
            return (Criteria) this;
        }

        public Criteria andUpfLastLockTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPF_LAST_LOCK_TIME not between", value1, value2, "upfLastLockTime");
            return (Criteria) this;
        }

        public Criteria andUpfLastLoginIsNull() {
            addCriterion("UPF_LAST_LOGIN is null");
            return (Criteria) this;
        }

        public Criteria andUpfLastLoginIsNotNull() {
            addCriterion("UPF_LAST_LOGIN is not null");
            return (Criteria) this;
        }

        public Criteria andUpfLastLoginEqualTo(Date value) {
            addCriterion("UPF_LAST_LOGIN =", value, "upfLastLogin");
            return (Criteria) this;
        }

        public Criteria andUpfLastLoginNotEqualTo(Date value) {
            addCriterion("UPF_LAST_LOGIN <>", value, "upfLastLogin");
            return (Criteria) this;
        }

        public Criteria andUpfLastLoginGreaterThan(Date value) {
            addCriterion("UPF_LAST_LOGIN >", value, "upfLastLogin");
            return (Criteria) this;
        }

        public Criteria andUpfLastLoginGreaterThanOrEqualTo(Date value) {
            addCriterion("UPF_LAST_LOGIN >=", value, "upfLastLogin");
            return (Criteria) this;
        }

        public Criteria andUpfLastLoginLessThan(Date value) {
            addCriterion("UPF_LAST_LOGIN <", value, "upfLastLogin");
            return (Criteria) this;
        }

        public Criteria andUpfLastLoginLessThanOrEqualTo(Date value) {
            addCriterion("UPF_LAST_LOGIN <=", value, "upfLastLogin");
            return (Criteria) this;
        }

        public Criteria andUpfLastLoginIn(List<Date> values) {
            addCriterion("UPF_LAST_LOGIN in", values, "upfLastLogin");
            return (Criteria) this;
        }

        public Criteria andUpfLastLoginNotIn(List<Date> values) {
            addCriterion("UPF_LAST_LOGIN not in", values, "upfLastLogin");
            return (Criteria) this;
        }

        public Criteria andUpfLastLoginBetween(Date value1, Date value2) {
            addCriterion("UPF_LAST_LOGIN between", value1, value2, "upfLastLogin");
            return (Criteria) this;
        }

        public Criteria andUpfLastLoginNotBetween(Date value1, Date value2) {
            addCriterion("UPF_LAST_LOGIN not between", value1, value2, "upfLastLogin");
            return (Criteria) this;
        }

        public Criteria andUpfVersionNoIsNull() {
            addCriterion("UPF_VERSION_NO is null");
            return (Criteria) this;
        }

        public Criteria andUpfVersionNoIsNotNull() {
            addCriterion("UPF_VERSION_NO is not null");
            return (Criteria) this;
        }

        public Criteria andUpfVersionNoEqualTo(Long value) {
            addCriterion("UPF_VERSION_NO =", value, "upfVersionNo");
            return (Criteria) this;
        }

        public Criteria andUpfVersionNoNotEqualTo(Long value) {
            addCriterion("UPF_VERSION_NO <>", value, "upfVersionNo");
            return (Criteria) this;
        }

        public Criteria andUpfVersionNoGreaterThan(Long value) {
            addCriterion("UPF_VERSION_NO >", value, "upfVersionNo");
            return (Criteria) this;
        }

        public Criteria andUpfVersionNoGreaterThanOrEqualTo(Long value) {
            addCriterion("UPF_VERSION_NO >=", value, "upfVersionNo");
            return (Criteria) this;
        }

        public Criteria andUpfVersionNoLessThan(Long value) {
            addCriterion("UPF_VERSION_NO <", value, "upfVersionNo");
            return (Criteria) this;
        }

        public Criteria andUpfVersionNoLessThanOrEqualTo(Long value) {
            addCriterion("UPF_VERSION_NO <=", value, "upfVersionNo");
            return (Criteria) this;
        }

        public Criteria andUpfVersionNoIn(List<Long> values) {
            addCriterion("UPF_VERSION_NO in", values, "upfVersionNo");
            return (Criteria) this;
        }

        public Criteria andUpfVersionNoNotIn(List<Long> values) {
            addCriterion("UPF_VERSION_NO not in", values, "upfVersionNo");
            return (Criteria) this;
        }

        public Criteria andUpfVersionNoBetween(Long value1, Long value2) {
            addCriterion("UPF_VERSION_NO between", value1, value2, "upfVersionNo");
            return (Criteria) this;
        }

        public Criteria andUpfVersionNoNotBetween(Long value1, Long value2) {
            addCriterion("UPF_VERSION_NO not between", value1, value2, "upfVersionNo");
            return (Criteria) this;
        }

        public Criteria andUpfCreateDtIsNull() {
            addCriterion("UPF_CREATE_DT is null");
            return (Criteria) this;
        }

        public Criteria andUpfCreateDtIsNotNull() {
            addCriterion("UPF_CREATE_DT is not null");
            return (Criteria) this;
        }

        public Criteria andUpfCreateDtEqualTo(Date value) {
            addCriterion("UPF_CREATE_DT =", value, "upfCreateDt");
            return (Criteria) this;
        }

        public Criteria andUpfCreateDtNotEqualTo(Date value) {
            addCriterion("UPF_CREATE_DT <>", value, "upfCreateDt");
            return (Criteria) this;
        }

        public Criteria andUpfCreateDtGreaterThan(Date value) {
            addCriterion("UPF_CREATE_DT >", value, "upfCreateDt");
            return (Criteria) this;
        }

        public Criteria andUpfCreateDtGreaterThanOrEqualTo(Date value) {
            addCriterion("UPF_CREATE_DT >=", value, "upfCreateDt");
            return (Criteria) this;
        }

        public Criteria andUpfCreateDtLessThan(Date value) {
            addCriterion("UPF_CREATE_DT <", value, "upfCreateDt");
            return (Criteria) this;
        }

        public Criteria andUpfCreateDtLessThanOrEqualTo(Date value) {
            addCriterion("UPF_CREATE_DT <=", value, "upfCreateDt");
            return (Criteria) this;
        }

        public Criteria andUpfCreateDtIn(List<Date> values) {
            addCriterion("UPF_CREATE_DT in", values, "upfCreateDt");
            return (Criteria) this;
        }

        public Criteria andUpfCreateDtNotIn(List<Date> values) {
            addCriterion("UPF_CREATE_DT not in", values, "upfCreateDt");
            return (Criteria) this;
        }

        public Criteria andUpfCreateDtBetween(Date value1, Date value2) {
            addCriterion("UPF_CREATE_DT between", value1, value2, "upfCreateDt");
            return (Criteria) this;
        }

        public Criteria andUpfCreateDtNotBetween(Date value1, Date value2) {
            addCriterion("UPF_CREATE_DT not between", value1, value2, "upfCreateDt");
            return (Criteria) this;
        }

        public Criteria andUpfCreateUserIsNull() {
            addCriterion("UPF_CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andUpfCreateUserIsNotNull() {
            addCriterion("UPF_CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andUpfCreateUserEqualTo(String value) {
            addCriterion("UPF_CREATE_USER =", value, "upfCreateUser");
            return (Criteria) this;
        }

        public Criteria andUpfCreateUserNotEqualTo(String value) {
            addCriterion("UPF_CREATE_USER <>", value, "upfCreateUser");
            return (Criteria) this;
        }

        public Criteria andUpfCreateUserGreaterThan(String value) {
            addCriterion("UPF_CREATE_USER >", value, "upfCreateUser");
            return (Criteria) this;
        }

        public Criteria andUpfCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("UPF_CREATE_USER >=", value, "upfCreateUser");
            return (Criteria) this;
        }

        public Criteria andUpfCreateUserLessThan(String value) {
            addCriterion("UPF_CREATE_USER <", value, "upfCreateUser");
            return (Criteria) this;
        }

        public Criteria andUpfCreateUserLessThanOrEqualTo(String value) {
            addCriterion("UPF_CREATE_USER <=", value, "upfCreateUser");
            return (Criteria) this;
        }

        public Criteria andUpfCreateUserLike(String value) {
            addCriterion("UPF_CREATE_USER like", value, "upfCreateUser");
            return (Criteria) this;
        }

        public Criteria andUpfCreateUserNotLike(String value) {
            addCriterion("UPF_CREATE_USER not like", value, "upfCreateUser");
            return (Criteria) this;
        }

        public Criteria andUpfCreateUserIn(List<String> values) {
            addCriterion("UPF_CREATE_USER in", values, "upfCreateUser");
            return (Criteria) this;
        }

        public Criteria andUpfCreateUserNotIn(List<String> values) {
            addCriterion("UPF_CREATE_USER not in", values, "upfCreateUser");
            return (Criteria) this;
        }

        public Criteria andUpfCreateUserBetween(String value1, String value2) {
            addCriterion("UPF_CREATE_USER between", value1, value2, "upfCreateUser");
            return (Criteria) this;
        }

        public Criteria andUpfCreateUserNotBetween(String value1, String value2) {
            addCriterion("UPF_CREATE_USER not between", value1, value2, "upfCreateUser");
            return (Criteria) this;
        }

        public Criteria andUpfModifyDtIsNull() {
            addCriterion("UPF_MODIFY_DT is null");
            return (Criteria) this;
        }

        public Criteria andUpfModifyDtIsNotNull() {
            addCriterion("UPF_MODIFY_DT is not null");
            return (Criteria) this;
        }

        public Criteria andUpfModifyDtEqualTo(Date value) {
            addCriterion("UPF_MODIFY_DT =", value, "upfModifyDt");
            return (Criteria) this;
        }

        public Criteria andUpfModifyDtNotEqualTo(Date value) {
            addCriterion("UPF_MODIFY_DT <>", value, "upfModifyDt");
            return (Criteria) this;
        }

        public Criteria andUpfModifyDtGreaterThan(Date value) {
            addCriterion("UPF_MODIFY_DT >", value, "upfModifyDt");
            return (Criteria) this;
        }

        public Criteria andUpfModifyDtGreaterThanOrEqualTo(Date value) {
            addCriterion("UPF_MODIFY_DT >=", value, "upfModifyDt");
            return (Criteria) this;
        }

        public Criteria andUpfModifyDtLessThan(Date value) {
            addCriterion("UPF_MODIFY_DT <", value, "upfModifyDt");
            return (Criteria) this;
        }

        public Criteria andUpfModifyDtLessThanOrEqualTo(Date value) {
            addCriterion("UPF_MODIFY_DT <=", value, "upfModifyDt");
            return (Criteria) this;
        }

        public Criteria andUpfModifyDtIn(List<Date> values) {
            addCriterion("UPF_MODIFY_DT in", values, "upfModifyDt");
            return (Criteria) this;
        }

        public Criteria andUpfModifyDtNotIn(List<Date> values) {
            addCriterion("UPF_MODIFY_DT not in", values, "upfModifyDt");
            return (Criteria) this;
        }

        public Criteria andUpfModifyDtBetween(Date value1, Date value2) {
            addCriterion("UPF_MODIFY_DT between", value1, value2, "upfModifyDt");
            return (Criteria) this;
        }

        public Criteria andUpfModifyDtNotBetween(Date value1, Date value2) {
            addCriterion("UPF_MODIFY_DT not between", value1, value2, "upfModifyDt");
            return (Criteria) this;
        }

        public Criteria andUpfModifyUserIsNull() {
            addCriterion("UPF_MODIFY_USER is null");
            return (Criteria) this;
        }

        public Criteria andUpfModifyUserIsNotNull() {
            addCriterion("UPF_MODIFY_USER is not null");
            return (Criteria) this;
        }

        public Criteria andUpfModifyUserEqualTo(String value) {
            addCriterion("UPF_MODIFY_USER =", value, "upfModifyUser");
            return (Criteria) this;
        }

        public Criteria andUpfModifyUserNotEqualTo(String value) {
            addCriterion("UPF_MODIFY_USER <>", value, "upfModifyUser");
            return (Criteria) this;
        }

        public Criteria andUpfModifyUserGreaterThan(String value) {
            addCriterion("UPF_MODIFY_USER >", value, "upfModifyUser");
            return (Criteria) this;
        }

        public Criteria andUpfModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("UPF_MODIFY_USER >=", value, "upfModifyUser");
            return (Criteria) this;
        }

        public Criteria andUpfModifyUserLessThan(String value) {
            addCriterion("UPF_MODIFY_USER <", value, "upfModifyUser");
            return (Criteria) this;
        }

        public Criteria andUpfModifyUserLessThanOrEqualTo(String value) {
            addCriterion("UPF_MODIFY_USER <=", value, "upfModifyUser");
            return (Criteria) this;
        }

        public Criteria andUpfModifyUserLike(String value) {
            addCriterion("UPF_MODIFY_USER like", value, "upfModifyUser");
            return (Criteria) this;
        }

        public Criteria andUpfModifyUserNotLike(String value) {
            addCriterion("UPF_MODIFY_USER not like", value, "upfModifyUser");
            return (Criteria) this;
        }

        public Criteria andUpfModifyUserIn(List<String> values) {
            addCriterion("UPF_MODIFY_USER in", values, "upfModifyUser");
            return (Criteria) this;
        }

        public Criteria andUpfModifyUserNotIn(List<String> values) {
            addCriterion("UPF_MODIFY_USER not in", values, "upfModifyUser");
            return (Criteria) this;
        }

        public Criteria andUpfModifyUserBetween(String value1, String value2) {
            addCriterion("UPF_MODIFY_USER between", value1, value2, "upfModifyUser");
            return (Criteria) this;
        }

        public Criteria andUpfModifyUserNotBetween(String value1, String value2) {
            addCriterion("UPF_MODIFY_USER not between", value1, value2, "upfModifyUser");
            return (Criteria) this;
        }

        public Criteria andUpfLdapPrincipalIsNull() {
            addCriterion("UPF_LDAP_PRINCIPAL is null");
            return (Criteria) this;
        }

        public Criteria andUpfLdapPrincipalIsNotNull() {
            addCriterion("UPF_LDAP_PRINCIPAL is not null");
            return (Criteria) this;
        }

        public Criteria andUpfLdapPrincipalEqualTo(String value) {
            addCriterion("UPF_LDAP_PRINCIPAL =", value, "upfLdapPrincipal");
            return (Criteria) this;
        }

        public Criteria andUpfLdapPrincipalNotEqualTo(String value) {
            addCriterion("UPF_LDAP_PRINCIPAL <>", value, "upfLdapPrincipal");
            return (Criteria) this;
        }

        public Criteria andUpfLdapPrincipalGreaterThan(String value) {
            addCriterion("UPF_LDAP_PRINCIPAL >", value, "upfLdapPrincipal");
            return (Criteria) this;
        }

        public Criteria andUpfLdapPrincipalGreaterThanOrEqualTo(String value) {
            addCriterion("UPF_LDAP_PRINCIPAL >=", value, "upfLdapPrincipal");
            return (Criteria) this;
        }

        public Criteria andUpfLdapPrincipalLessThan(String value) {
            addCriterion("UPF_LDAP_PRINCIPAL <", value, "upfLdapPrincipal");
            return (Criteria) this;
        }

        public Criteria andUpfLdapPrincipalLessThanOrEqualTo(String value) {
            addCriterion("UPF_LDAP_PRINCIPAL <=", value, "upfLdapPrincipal");
            return (Criteria) this;
        }

        public Criteria andUpfLdapPrincipalLike(String value) {
            addCriterion("UPF_LDAP_PRINCIPAL like", value, "upfLdapPrincipal");
            return (Criteria) this;
        }

        public Criteria andUpfLdapPrincipalNotLike(String value) {
            addCriterion("UPF_LDAP_PRINCIPAL not like", value, "upfLdapPrincipal");
            return (Criteria) this;
        }

        public Criteria andUpfLdapPrincipalIn(List<String> values) {
            addCriterion("UPF_LDAP_PRINCIPAL in", values, "upfLdapPrincipal");
            return (Criteria) this;
        }

        public Criteria andUpfLdapPrincipalNotIn(List<String> values) {
            addCriterion("UPF_LDAP_PRINCIPAL not in", values, "upfLdapPrincipal");
            return (Criteria) this;
        }

        public Criteria andUpfLdapPrincipalBetween(String value1, String value2) {
            addCriterion("UPF_LDAP_PRINCIPAL between", value1, value2, "upfLdapPrincipal");
            return (Criteria) this;
        }

        public Criteria andUpfLdapPrincipalNotBetween(String value1, String value2) {
            addCriterion("UPF_LDAP_PRINCIPAL not between", value1, value2, "upfLdapPrincipal");
            return (Criteria) this;
        }

        public Criteria andUpfEfsUserIdIsNull() {
            addCriterion("UPF_EFS_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUpfEfsUserIdIsNotNull() {
            addCriterion("UPF_EFS_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUpfEfsUserIdEqualTo(String value) {
            addCriterion("UPF_EFS_USER_ID =", value, "upfEfsUserId");
            return (Criteria) this;
        }

        public Criteria andUpfEfsUserIdNotEqualTo(String value) {
            addCriterion("UPF_EFS_USER_ID <>", value, "upfEfsUserId");
            return (Criteria) this;
        }

        public Criteria andUpfEfsUserIdGreaterThan(String value) {
            addCriterion("UPF_EFS_USER_ID >", value, "upfEfsUserId");
            return (Criteria) this;
        }

        public Criteria andUpfEfsUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("UPF_EFS_USER_ID >=", value, "upfEfsUserId");
            return (Criteria) this;
        }

        public Criteria andUpfEfsUserIdLessThan(String value) {
            addCriterion("UPF_EFS_USER_ID <", value, "upfEfsUserId");
            return (Criteria) this;
        }

        public Criteria andUpfEfsUserIdLessThanOrEqualTo(String value) {
            addCriterion("UPF_EFS_USER_ID <=", value, "upfEfsUserId");
            return (Criteria) this;
        }

        public Criteria andUpfEfsUserIdLike(String value) {
            addCriterion("UPF_EFS_USER_ID like", value, "upfEfsUserId");
            return (Criteria) this;
        }

        public Criteria andUpfEfsUserIdNotLike(String value) {
            addCriterion("UPF_EFS_USER_ID not like", value, "upfEfsUserId");
            return (Criteria) this;
        }

        public Criteria andUpfEfsUserIdIn(List<String> values) {
            addCriterion("UPF_EFS_USER_ID in", values, "upfEfsUserId");
            return (Criteria) this;
        }

        public Criteria andUpfEfsUserIdNotIn(List<String> values) {
            addCriterion("UPF_EFS_USER_ID not in", values, "upfEfsUserId");
            return (Criteria) this;
        }

        public Criteria andUpfEfsUserIdBetween(String value1, String value2) {
            addCriterion("UPF_EFS_USER_ID between", value1, value2, "upfEfsUserId");
            return (Criteria) this;
        }

        public Criteria andUpfEfsUserIdNotBetween(String value1, String value2) {
            addCriterion("UPF_EFS_USER_ID not between", value1, value2, "upfEfsUserId");
            return (Criteria) this;
        }

        public Criteria andUpfTrAdminGrpIdIsNull() {
            addCriterion("UPF_TR_ADMIN_GRP_ID is null");
            return (Criteria) this;
        }

        public Criteria andUpfTrAdminGrpIdIsNotNull() {
            addCriterion("UPF_TR_ADMIN_GRP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUpfTrAdminGrpIdEqualTo(String value) {
            addCriterion("UPF_TR_ADMIN_GRP_ID =", value, "upfTrAdminGrpId");
            return (Criteria) this;
        }

        public Criteria andUpfTrAdminGrpIdNotEqualTo(String value) {
            addCriterion("UPF_TR_ADMIN_GRP_ID <>", value, "upfTrAdminGrpId");
            return (Criteria) this;
        }

        public Criteria andUpfTrAdminGrpIdGreaterThan(String value) {
            addCriterion("UPF_TR_ADMIN_GRP_ID >", value, "upfTrAdminGrpId");
            return (Criteria) this;
        }

        public Criteria andUpfTrAdminGrpIdGreaterThanOrEqualTo(String value) {
            addCriterion("UPF_TR_ADMIN_GRP_ID >=", value, "upfTrAdminGrpId");
            return (Criteria) this;
        }

        public Criteria andUpfTrAdminGrpIdLessThan(String value) {
            addCriterion("UPF_TR_ADMIN_GRP_ID <", value, "upfTrAdminGrpId");
            return (Criteria) this;
        }

        public Criteria andUpfTrAdminGrpIdLessThanOrEqualTo(String value) {
            addCriterion("UPF_TR_ADMIN_GRP_ID <=", value, "upfTrAdminGrpId");
            return (Criteria) this;
        }

        public Criteria andUpfTrAdminGrpIdLike(String value) {
            addCriterion("UPF_TR_ADMIN_GRP_ID like", value, "upfTrAdminGrpId");
            return (Criteria) this;
        }

        public Criteria andUpfTrAdminGrpIdNotLike(String value) {
            addCriterion("UPF_TR_ADMIN_GRP_ID not like", value, "upfTrAdminGrpId");
            return (Criteria) this;
        }

        public Criteria andUpfTrAdminGrpIdIn(List<String> values) {
            addCriterion("UPF_TR_ADMIN_GRP_ID in", values, "upfTrAdminGrpId");
            return (Criteria) this;
        }

        public Criteria andUpfTrAdminGrpIdNotIn(List<String> values) {
            addCriterion("UPF_TR_ADMIN_GRP_ID not in", values, "upfTrAdminGrpId");
            return (Criteria) this;
        }

        public Criteria andUpfTrAdminGrpIdBetween(String value1, String value2) {
            addCriterion("UPF_TR_ADMIN_GRP_ID between", value1, value2, "upfTrAdminGrpId");
            return (Criteria) this;
        }

        public Criteria andUpfTrAdminGrpIdNotBetween(String value1, String value2) {
            addCriterion("UPF_TR_ADMIN_GRP_ID not between", value1, value2, "upfTrAdminGrpId");
            return (Criteria) this;
        }

        public Criteria andUpfNotesEmailIsNull() {
            addCriterion("UPF_NOTES_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andUpfNotesEmailIsNotNull() {
            addCriterion("UPF_NOTES_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andUpfNotesEmailEqualTo(String value) {
            addCriterion("UPF_NOTES_EMAIL =", value, "upfNotesEmail");
            return (Criteria) this;
        }

        public Criteria andUpfNotesEmailNotEqualTo(String value) {
            addCriterion("UPF_NOTES_EMAIL <>", value, "upfNotesEmail");
            return (Criteria) this;
        }

        public Criteria andUpfNotesEmailGreaterThan(String value) {
            addCriterion("UPF_NOTES_EMAIL >", value, "upfNotesEmail");
            return (Criteria) this;
        }

        public Criteria andUpfNotesEmailGreaterThanOrEqualTo(String value) {
            addCriterion("UPF_NOTES_EMAIL >=", value, "upfNotesEmail");
            return (Criteria) this;
        }

        public Criteria andUpfNotesEmailLessThan(String value) {
            addCriterion("UPF_NOTES_EMAIL <", value, "upfNotesEmail");
            return (Criteria) this;
        }

        public Criteria andUpfNotesEmailLessThanOrEqualTo(String value) {
            addCriterion("UPF_NOTES_EMAIL <=", value, "upfNotesEmail");
            return (Criteria) this;
        }

        public Criteria andUpfNotesEmailLike(String value) {
            addCriterion("UPF_NOTES_EMAIL like", value, "upfNotesEmail");
            return (Criteria) this;
        }

        public Criteria andUpfNotesEmailNotLike(String value) {
            addCriterion("UPF_NOTES_EMAIL not like", value, "upfNotesEmail");
            return (Criteria) this;
        }

        public Criteria andUpfNotesEmailIn(List<String> values) {
            addCriterion("UPF_NOTES_EMAIL in", values, "upfNotesEmail");
            return (Criteria) this;
        }

        public Criteria andUpfNotesEmailNotIn(List<String> values) {
            addCriterion("UPF_NOTES_EMAIL not in", values, "upfNotesEmail");
            return (Criteria) this;
        }

        public Criteria andUpfNotesEmailBetween(String value1, String value2) {
            addCriterion("UPF_NOTES_EMAIL between", value1, value2, "upfNotesEmail");
            return (Criteria) this;
        }

        public Criteria andUpfNotesEmailNotBetween(String value1, String value2) {
            addCriterion("UPF_NOTES_EMAIL not between", value1, value2, "upfNotesEmail");
            return (Criteria) this;
        }

        public Criteria andUpfDivisionIsNull() {
            addCriterion("UPF_DIVISION is null");
            return (Criteria) this;
        }

        public Criteria andUpfDivisionIsNotNull() {
            addCriterion("UPF_DIVISION is not null");
            return (Criteria) this;
        }

        public Criteria andUpfDivisionEqualTo(String value) {
            addCriterion("UPF_DIVISION =", value, "upfDivision");
            return (Criteria) this;
        }

        public Criteria andUpfDivisionNotEqualTo(String value) {
            addCriterion("UPF_DIVISION <>", value, "upfDivision");
            return (Criteria) this;
        }

        public Criteria andUpfDivisionGreaterThan(String value) {
            addCriterion("UPF_DIVISION >", value, "upfDivision");
            return (Criteria) this;
        }

        public Criteria andUpfDivisionGreaterThanOrEqualTo(String value) {
            addCriterion("UPF_DIVISION >=", value, "upfDivision");
            return (Criteria) this;
        }

        public Criteria andUpfDivisionLessThan(String value) {
            addCriterion("UPF_DIVISION <", value, "upfDivision");
            return (Criteria) this;
        }

        public Criteria andUpfDivisionLessThanOrEqualTo(String value) {
            addCriterion("UPF_DIVISION <=", value, "upfDivision");
            return (Criteria) this;
        }

        public Criteria andUpfDivisionLike(String value) {
            addCriterion("UPF_DIVISION like", value, "upfDivision");
            return (Criteria) this;
        }

        public Criteria andUpfDivisionNotLike(String value) {
            addCriterion("UPF_DIVISION not like", value, "upfDivision");
            return (Criteria) this;
        }

        public Criteria andUpfDivisionIn(List<String> values) {
            addCriterion("UPF_DIVISION in", values, "upfDivision");
            return (Criteria) this;
        }

        public Criteria andUpfDivisionNotIn(List<String> values) {
            addCriterion("UPF_DIVISION not in", values, "upfDivision");
            return (Criteria) this;
        }

        public Criteria andUpfDivisionBetween(String value1, String value2) {
            addCriterion("UPF_DIVISION between", value1, value2, "upfDivision");
            return (Criteria) this;
        }

        public Criteria andUpfDivisionNotBetween(String value1, String value2) {
            addCriterion("UPF_DIVISION not between", value1, value2, "upfDivision");
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
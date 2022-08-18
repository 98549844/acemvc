package com.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RFncFunctionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RFncFunctionExample() {
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

        public Criteria andFncApplIdIsNull() {
            addCriterion("FNC_APPL_ID is null");
            return (Criteria) this;
        }

        public Criteria andFncApplIdIsNotNull() {
            addCriterion("FNC_APPL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFncApplIdEqualTo(String value) {
            addCriterion("FNC_APPL_ID =", value, "fncApplId");
            return (Criteria) this;
        }

        public Criteria andFncApplIdNotEqualTo(String value) {
            addCriterion("FNC_APPL_ID <>", value, "fncApplId");
            return (Criteria) this;
        }

        public Criteria andFncApplIdGreaterThan(String value) {
            addCriterion("FNC_APPL_ID >", value, "fncApplId");
            return (Criteria) this;
        }

        public Criteria andFncApplIdGreaterThanOrEqualTo(String value) {
            addCriterion("FNC_APPL_ID >=", value, "fncApplId");
            return (Criteria) this;
        }

        public Criteria andFncApplIdLessThan(String value) {
            addCriterion("FNC_APPL_ID <", value, "fncApplId");
            return (Criteria) this;
        }

        public Criteria andFncApplIdLessThanOrEqualTo(String value) {
            addCriterion("FNC_APPL_ID <=", value, "fncApplId");
            return (Criteria) this;
        }

        public Criteria andFncApplIdLike(String value) {
            addCriterion("FNC_APPL_ID like", value, "fncApplId");
            return (Criteria) this;
        }

        public Criteria andFncApplIdNotLike(String value) {
            addCriterion("FNC_APPL_ID not like", value, "fncApplId");
            return (Criteria) this;
        }

        public Criteria andFncApplIdIn(List<String> values) {
            addCriterion("FNC_APPL_ID in", values, "fncApplId");
            return (Criteria) this;
        }

        public Criteria andFncApplIdNotIn(List<String> values) {
            addCriterion("FNC_APPL_ID not in", values, "fncApplId");
            return (Criteria) this;
        }

        public Criteria andFncApplIdBetween(String value1, String value2) {
            addCriterion("FNC_APPL_ID between", value1, value2, "fncApplId");
            return (Criteria) this;
        }

        public Criteria andFncApplIdNotBetween(String value1, String value2) {
            addCriterion("FNC_APPL_ID not between", value1, value2, "fncApplId");
            return (Criteria) this;
        }

        public Criteria andFncParentFuncIdIsNull() {
            addCriterion("FNC_PARENT_FUNC_ID is null");
            return (Criteria) this;
        }

        public Criteria andFncParentFuncIdIsNotNull() {
            addCriterion("FNC_PARENT_FUNC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFncParentFuncIdEqualTo(String value) {
            addCriterion("FNC_PARENT_FUNC_ID =", value, "fncParentFuncId");
            return (Criteria) this;
        }

        public Criteria andFncParentFuncIdNotEqualTo(String value) {
            addCriterion("FNC_PARENT_FUNC_ID <>", value, "fncParentFuncId");
            return (Criteria) this;
        }

        public Criteria andFncParentFuncIdGreaterThan(String value) {
            addCriterion("FNC_PARENT_FUNC_ID >", value, "fncParentFuncId");
            return (Criteria) this;
        }

        public Criteria andFncParentFuncIdGreaterThanOrEqualTo(String value) {
            addCriterion("FNC_PARENT_FUNC_ID >=", value, "fncParentFuncId");
            return (Criteria) this;
        }

        public Criteria andFncParentFuncIdLessThan(String value) {
            addCriterion("FNC_PARENT_FUNC_ID <", value, "fncParentFuncId");
            return (Criteria) this;
        }

        public Criteria andFncParentFuncIdLessThanOrEqualTo(String value) {
            addCriterion("FNC_PARENT_FUNC_ID <=", value, "fncParentFuncId");
            return (Criteria) this;
        }

        public Criteria andFncParentFuncIdLike(String value) {
            addCriterion("FNC_PARENT_FUNC_ID like", value, "fncParentFuncId");
            return (Criteria) this;
        }

        public Criteria andFncParentFuncIdNotLike(String value) {
            addCriterion("FNC_PARENT_FUNC_ID not like", value, "fncParentFuncId");
            return (Criteria) this;
        }

        public Criteria andFncParentFuncIdIn(List<String> values) {
            addCriterion("FNC_PARENT_FUNC_ID in", values, "fncParentFuncId");
            return (Criteria) this;
        }

        public Criteria andFncParentFuncIdNotIn(List<String> values) {
            addCriterion("FNC_PARENT_FUNC_ID not in", values, "fncParentFuncId");
            return (Criteria) this;
        }

        public Criteria andFncParentFuncIdBetween(String value1, String value2) {
            addCriterion("FNC_PARENT_FUNC_ID between", value1, value2, "fncParentFuncId");
            return (Criteria) this;
        }

        public Criteria andFncParentFuncIdNotBetween(String value1, String value2) {
            addCriterion("FNC_PARENT_FUNC_ID not between", value1, value2, "fncParentFuncId");
            return (Criteria) this;
        }

        public Criteria andFncFuncIdIsNull() {
            addCriterion("FNC_FUNC_ID is null");
            return (Criteria) this;
        }

        public Criteria andFncFuncIdIsNotNull() {
            addCriterion("FNC_FUNC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFncFuncIdEqualTo(String value) {
            addCriterion("FNC_FUNC_ID =", value, "fncFuncId");
            return (Criteria) this;
        }

        public Criteria andFncFuncIdNotEqualTo(String value) {
            addCriterion("FNC_FUNC_ID <>", value, "fncFuncId");
            return (Criteria) this;
        }

        public Criteria andFncFuncIdGreaterThan(String value) {
            addCriterion("FNC_FUNC_ID >", value, "fncFuncId");
            return (Criteria) this;
        }

        public Criteria andFncFuncIdGreaterThanOrEqualTo(String value) {
            addCriterion("FNC_FUNC_ID >=", value, "fncFuncId");
            return (Criteria) this;
        }

        public Criteria andFncFuncIdLessThan(String value) {
            addCriterion("FNC_FUNC_ID <", value, "fncFuncId");
            return (Criteria) this;
        }

        public Criteria andFncFuncIdLessThanOrEqualTo(String value) {
            addCriterion("FNC_FUNC_ID <=", value, "fncFuncId");
            return (Criteria) this;
        }

        public Criteria andFncFuncIdLike(String value) {
            addCriterion("FNC_FUNC_ID like", value, "fncFuncId");
            return (Criteria) this;
        }

        public Criteria andFncFuncIdNotLike(String value) {
            addCriterion("FNC_FUNC_ID not like", value, "fncFuncId");
            return (Criteria) this;
        }

        public Criteria andFncFuncIdIn(List<String> values) {
            addCriterion("FNC_FUNC_ID in", values, "fncFuncId");
            return (Criteria) this;
        }

        public Criteria andFncFuncIdNotIn(List<String> values) {
            addCriterion("FNC_FUNC_ID not in", values, "fncFuncId");
            return (Criteria) this;
        }

        public Criteria andFncFuncIdBetween(String value1, String value2) {
            addCriterion("FNC_FUNC_ID between", value1, value2, "fncFuncId");
            return (Criteria) this;
        }

        public Criteria andFncFuncIdNotBetween(String value1, String value2) {
            addCriterion("FNC_FUNC_ID not between", value1, value2, "fncFuncId");
            return (Criteria) this;
        }

        public Criteria andFncDescIsNull() {
            addCriterion("FNC_DESC is null");
            return (Criteria) this;
        }

        public Criteria andFncDescIsNotNull() {
            addCriterion("FNC_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andFncDescEqualTo(String value) {
            addCriterion("FNC_DESC =", value, "fncDesc");
            return (Criteria) this;
        }

        public Criteria andFncDescNotEqualTo(String value) {
            addCriterion("FNC_DESC <>", value, "fncDesc");
            return (Criteria) this;
        }

        public Criteria andFncDescGreaterThan(String value) {
            addCriterion("FNC_DESC >", value, "fncDesc");
            return (Criteria) this;
        }

        public Criteria andFncDescGreaterThanOrEqualTo(String value) {
            addCriterion("FNC_DESC >=", value, "fncDesc");
            return (Criteria) this;
        }

        public Criteria andFncDescLessThan(String value) {
            addCriterion("FNC_DESC <", value, "fncDesc");
            return (Criteria) this;
        }

        public Criteria andFncDescLessThanOrEqualTo(String value) {
            addCriterion("FNC_DESC <=", value, "fncDesc");
            return (Criteria) this;
        }

        public Criteria andFncDescLike(String value) {
            addCriterion("FNC_DESC like", value, "fncDesc");
            return (Criteria) this;
        }

        public Criteria andFncDescNotLike(String value) {
            addCriterion("FNC_DESC not like", value, "fncDesc");
            return (Criteria) this;
        }

        public Criteria andFncDescIn(List<String> values) {
            addCriterion("FNC_DESC in", values, "fncDesc");
            return (Criteria) this;
        }

        public Criteria andFncDescNotIn(List<String> values) {
            addCriterion("FNC_DESC not in", values, "fncDesc");
            return (Criteria) this;
        }

        public Criteria andFncDescBetween(String value1, String value2) {
            addCriterion("FNC_DESC between", value1, value2, "fncDesc");
            return (Criteria) this;
        }

        public Criteria andFncDescNotBetween(String value1, String value2) {
            addCriterion("FNC_DESC not between", value1, value2, "fncDesc");
            return (Criteria) this;
        }

        public Criteria andFncFuncTypIsNull() {
            addCriterion("FNC_FUNC_TYP is null");
            return (Criteria) this;
        }

        public Criteria andFncFuncTypIsNotNull() {
            addCriterion("FNC_FUNC_TYP is not null");
            return (Criteria) this;
        }

        public Criteria andFncFuncTypEqualTo(String value) {
            addCriterion("FNC_FUNC_TYP =", value, "fncFuncTyp");
            return (Criteria) this;
        }

        public Criteria andFncFuncTypNotEqualTo(String value) {
            addCriterion("FNC_FUNC_TYP <>", value, "fncFuncTyp");
            return (Criteria) this;
        }

        public Criteria andFncFuncTypGreaterThan(String value) {
            addCriterion("FNC_FUNC_TYP >", value, "fncFuncTyp");
            return (Criteria) this;
        }

        public Criteria andFncFuncTypGreaterThanOrEqualTo(String value) {
            addCriterion("FNC_FUNC_TYP >=", value, "fncFuncTyp");
            return (Criteria) this;
        }

        public Criteria andFncFuncTypLessThan(String value) {
            addCriterion("FNC_FUNC_TYP <", value, "fncFuncTyp");
            return (Criteria) this;
        }

        public Criteria andFncFuncTypLessThanOrEqualTo(String value) {
            addCriterion("FNC_FUNC_TYP <=", value, "fncFuncTyp");
            return (Criteria) this;
        }

        public Criteria andFncFuncTypLike(String value) {
            addCriterion("FNC_FUNC_TYP like", value, "fncFuncTyp");
            return (Criteria) this;
        }

        public Criteria andFncFuncTypNotLike(String value) {
            addCriterion("FNC_FUNC_TYP not like", value, "fncFuncTyp");
            return (Criteria) this;
        }

        public Criteria andFncFuncTypIn(List<String> values) {
            addCriterion("FNC_FUNC_TYP in", values, "fncFuncTyp");
            return (Criteria) this;
        }

        public Criteria andFncFuncTypNotIn(List<String> values) {
            addCriterion("FNC_FUNC_TYP not in", values, "fncFuncTyp");
            return (Criteria) this;
        }

        public Criteria andFncFuncTypBetween(String value1, String value2) {
            addCriterion("FNC_FUNC_TYP between", value1, value2, "fncFuncTyp");
            return (Criteria) this;
        }

        public Criteria andFncFuncTypNotBetween(String value1, String value2) {
            addCriterion("FNC_FUNC_TYP not between", value1, value2, "fncFuncTyp");
            return (Criteria) this;
        }

        public Criteria andFncFuncSeqIsNull() {
            addCriterion("FNC_FUNC_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andFncFuncSeqIsNotNull() {
            addCriterion("FNC_FUNC_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andFncFuncSeqEqualTo(Short value) {
            addCriterion("FNC_FUNC_SEQ =", value, "fncFuncSeq");
            return (Criteria) this;
        }

        public Criteria andFncFuncSeqNotEqualTo(Short value) {
            addCriterion("FNC_FUNC_SEQ <>", value, "fncFuncSeq");
            return (Criteria) this;
        }

        public Criteria andFncFuncSeqGreaterThan(Short value) {
            addCriterion("FNC_FUNC_SEQ >", value, "fncFuncSeq");
            return (Criteria) this;
        }

        public Criteria andFncFuncSeqGreaterThanOrEqualTo(Short value) {
            addCriterion("FNC_FUNC_SEQ >=", value, "fncFuncSeq");
            return (Criteria) this;
        }

        public Criteria andFncFuncSeqLessThan(Short value) {
            addCriterion("FNC_FUNC_SEQ <", value, "fncFuncSeq");
            return (Criteria) this;
        }

        public Criteria andFncFuncSeqLessThanOrEqualTo(Short value) {
            addCriterion("FNC_FUNC_SEQ <=", value, "fncFuncSeq");
            return (Criteria) this;
        }

        public Criteria andFncFuncSeqIn(List<Short> values) {
            addCriterion("FNC_FUNC_SEQ in", values, "fncFuncSeq");
            return (Criteria) this;
        }

        public Criteria andFncFuncSeqNotIn(List<Short> values) {
            addCriterion("FNC_FUNC_SEQ not in", values, "fncFuncSeq");
            return (Criteria) this;
        }

        public Criteria andFncFuncSeqBetween(Short value1, Short value2) {
            addCriterion("FNC_FUNC_SEQ between", value1, value2, "fncFuncSeq");
            return (Criteria) this;
        }

        public Criteria andFncFuncSeqNotBetween(Short value1, Short value2) {
            addCriterion("FNC_FUNC_SEQ not between", value1, value2, "fncFuncSeq");
            return (Criteria) this;
        }

        public Criteria andFncLinkIsNull() {
            addCriterion("FNC_LINK is null");
            return (Criteria) this;
        }

        public Criteria andFncLinkIsNotNull() {
            addCriterion("FNC_LINK is not null");
            return (Criteria) this;
        }

        public Criteria andFncLinkEqualTo(String value) {
            addCriterion("FNC_LINK =", value, "fncLink");
            return (Criteria) this;
        }

        public Criteria andFncLinkNotEqualTo(String value) {
            addCriterion("FNC_LINK <>", value, "fncLink");
            return (Criteria) this;
        }

        public Criteria andFncLinkGreaterThan(String value) {
            addCriterion("FNC_LINK >", value, "fncLink");
            return (Criteria) this;
        }

        public Criteria andFncLinkGreaterThanOrEqualTo(String value) {
            addCriterion("FNC_LINK >=", value, "fncLink");
            return (Criteria) this;
        }

        public Criteria andFncLinkLessThan(String value) {
            addCriterion("FNC_LINK <", value, "fncLink");
            return (Criteria) this;
        }

        public Criteria andFncLinkLessThanOrEqualTo(String value) {
            addCriterion("FNC_LINK <=", value, "fncLink");
            return (Criteria) this;
        }

        public Criteria andFncLinkLike(String value) {
            addCriterion("FNC_LINK like", value, "fncLink");
            return (Criteria) this;
        }

        public Criteria andFncLinkNotLike(String value) {
            addCriterion("FNC_LINK not like", value, "fncLink");
            return (Criteria) this;
        }

        public Criteria andFncLinkIn(List<String> values) {
            addCriterion("FNC_LINK in", values, "fncLink");
            return (Criteria) this;
        }

        public Criteria andFncLinkNotIn(List<String> values) {
            addCriterion("FNC_LINK not in", values, "fncLink");
            return (Criteria) this;
        }

        public Criteria andFncLinkBetween(String value1, String value2) {
            addCriterion("FNC_LINK between", value1, value2, "fncLink");
            return (Criteria) this;
        }

        public Criteria andFncLinkNotBetween(String value1, String value2) {
            addCriterion("FNC_LINK not between", value1, value2, "fncLink");
            return (Criteria) this;
        }

        public Criteria andFncOnclickIsNull() {
            addCriterion("FNC_ONCLICK is null");
            return (Criteria) this;
        }

        public Criteria andFncOnclickIsNotNull() {
            addCriterion("FNC_ONCLICK is not null");
            return (Criteria) this;
        }

        public Criteria andFncOnclickEqualTo(String value) {
            addCriterion("FNC_ONCLICK =", value, "fncOnclick");
            return (Criteria) this;
        }

        public Criteria andFncOnclickNotEqualTo(String value) {
            addCriterion("FNC_ONCLICK <>", value, "fncOnclick");
            return (Criteria) this;
        }

        public Criteria andFncOnclickGreaterThan(String value) {
            addCriterion("FNC_ONCLICK >", value, "fncOnclick");
            return (Criteria) this;
        }

        public Criteria andFncOnclickGreaterThanOrEqualTo(String value) {
            addCriterion("FNC_ONCLICK >=", value, "fncOnclick");
            return (Criteria) this;
        }

        public Criteria andFncOnclickLessThan(String value) {
            addCriterion("FNC_ONCLICK <", value, "fncOnclick");
            return (Criteria) this;
        }

        public Criteria andFncOnclickLessThanOrEqualTo(String value) {
            addCriterion("FNC_ONCLICK <=", value, "fncOnclick");
            return (Criteria) this;
        }

        public Criteria andFncOnclickLike(String value) {
            addCriterion("FNC_ONCLICK like", value, "fncOnclick");
            return (Criteria) this;
        }

        public Criteria andFncOnclickNotLike(String value) {
            addCriterion("FNC_ONCLICK not like", value, "fncOnclick");
            return (Criteria) this;
        }

        public Criteria andFncOnclickIn(List<String> values) {
            addCriterion("FNC_ONCLICK in", values, "fncOnclick");
            return (Criteria) this;
        }

        public Criteria andFncOnclickNotIn(List<String> values) {
            addCriterion("FNC_ONCLICK not in", values, "fncOnclick");
            return (Criteria) this;
        }

        public Criteria andFncOnclickBetween(String value1, String value2) {
            addCriterion("FNC_ONCLICK between", value1, value2, "fncOnclick");
            return (Criteria) this;
        }

        public Criteria andFncOnclickNotBetween(String value1, String value2) {
            addCriterion("FNC_ONCLICK not between", value1, value2, "fncOnclick");
            return (Criteria) this;
        }

        public Criteria andFncShownOnMenuIsNull() {
            addCriterion("FNC_SHOWN_ON_MENU is null");
            return (Criteria) this;
        }

        public Criteria andFncShownOnMenuIsNotNull() {
            addCriterion("FNC_SHOWN_ON_MENU is not null");
            return (Criteria) this;
        }

        public Criteria andFncShownOnMenuEqualTo(String value) {
            addCriterion("FNC_SHOWN_ON_MENU =", value, "fncShownOnMenu");
            return (Criteria) this;
        }

        public Criteria andFncShownOnMenuNotEqualTo(String value) {
            addCriterion("FNC_SHOWN_ON_MENU <>", value, "fncShownOnMenu");
            return (Criteria) this;
        }

        public Criteria andFncShownOnMenuGreaterThan(String value) {
            addCriterion("FNC_SHOWN_ON_MENU >", value, "fncShownOnMenu");
            return (Criteria) this;
        }

        public Criteria andFncShownOnMenuGreaterThanOrEqualTo(String value) {
            addCriterion("FNC_SHOWN_ON_MENU >=", value, "fncShownOnMenu");
            return (Criteria) this;
        }

        public Criteria andFncShownOnMenuLessThan(String value) {
            addCriterion("FNC_SHOWN_ON_MENU <", value, "fncShownOnMenu");
            return (Criteria) this;
        }

        public Criteria andFncShownOnMenuLessThanOrEqualTo(String value) {
            addCriterion("FNC_SHOWN_ON_MENU <=", value, "fncShownOnMenu");
            return (Criteria) this;
        }

        public Criteria andFncShownOnMenuLike(String value) {
            addCriterion("FNC_SHOWN_ON_MENU like", value, "fncShownOnMenu");
            return (Criteria) this;
        }

        public Criteria andFncShownOnMenuNotLike(String value) {
            addCriterion("FNC_SHOWN_ON_MENU not like", value, "fncShownOnMenu");
            return (Criteria) this;
        }

        public Criteria andFncShownOnMenuIn(List<String> values) {
            addCriterion("FNC_SHOWN_ON_MENU in", values, "fncShownOnMenu");
            return (Criteria) this;
        }

        public Criteria andFncShownOnMenuNotIn(List<String> values) {
            addCriterion("FNC_SHOWN_ON_MENU not in", values, "fncShownOnMenu");
            return (Criteria) this;
        }

        public Criteria andFncShownOnMenuBetween(String value1, String value2) {
            addCriterion("FNC_SHOWN_ON_MENU between", value1, value2, "fncShownOnMenu");
            return (Criteria) this;
        }

        public Criteria andFncShownOnMenuNotBetween(String value1, String value2) {
            addCriterion("FNC_SHOWN_ON_MENU not between", value1, value2, "fncShownOnMenu");
            return (Criteria) this;
        }

        public Criteria andFncPopUpIsNull() {
            addCriterion("FNC_POP_UP is null");
            return (Criteria) this;
        }

        public Criteria andFncPopUpIsNotNull() {
            addCriterion("FNC_POP_UP is not null");
            return (Criteria) this;
        }

        public Criteria andFncPopUpEqualTo(String value) {
            addCriterion("FNC_POP_UP =", value, "fncPopUp");
            return (Criteria) this;
        }

        public Criteria andFncPopUpNotEqualTo(String value) {
            addCriterion("FNC_POP_UP <>", value, "fncPopUp");
            return (Criteria) this;
        }

        public Criteria andFncPopUpGreaterThan(String value) {
            addCriterion("FNC_POP_UP >", value, "fncPopUp");
            return (Criteria) this;
        }

        public Criteria andFncPopUpGreaterThanOrEqualTo(String value) {
            addCriterion("FNC_POP_UP >=", value, "fncPopUp");
            return (Criteria) this;
        }

        public Criteria andFncPopUpLessThan(String value) {
            addCriterion("FNC_POP_UP <", value, "fncPopUp");
            return (Criteria) this;
        }

        public Criteria andFncPopUpLessThanOrEqualTo(String value) {
            addCriterion("FNC_POP_UP <=", value, "fncPopUp");
            return (Criteria) this;
        }

        public Criteria andFncPopUpLike(String value) {
            addCriterion("FNC_POP_UP like", value, "fncPopUp");
            return (Criteria) this;
        }

        public Criteria andFncPopUpNotLike(String value) {
            addCriterion("FNC_POP_UP not like", value, "fncPopUp");
            return (Criteria) this;
        }

        public Criteria andFncPopUpIn(List<String> values) {
            addCriterion("FNC_POP_UP in", values, "fncPopUp");
            return (Criteria) this;
        }

        public Criteria andFncPopUpNotIn(List<String> values) {
            addCriterion("FNC_POP_UP not in", values, "fncPopUp");
            return (Criteria) this;
        }

        public Criteria andFncPopUpBetween(String value1, String value2) {
            addCriterion("FNC_POP_UP between", value1, value2, "fncPopUp");
            return (Criteria) this;
        }

        public Criteria andFncPopUpNotBetween(String value1, String value2) {
            addCriterion("FNC_POP_UP not between", value1, value2, "fncPopUp");
            return (Criteria) this;
        }

        public Criteria andFncPopUpWidthIsNull() {
            addCriterion("FNC_POP_UP_WIDTH is null");
            return (Criteria) this;
        }

        public Criteria andFncPopUpWidthIsNotNull() {
            addCriterion("FNC_POP_UP_WIDTH is not null");
            return (Criteria) this;
        }

        public Criteria andFncPopUpWidthEqualTo(Short value) {
            addCriterion("FNC_POP_UP_WIDTH =", value, "fncPopUpWidth");
            return (Criteria) this;
        }

        public Criteria andFncPopUpWidthNotEqualTo(Short value) {
            addCriterion("FNC_POP_UP_WIDTH <>", value, "fncPopUpWidth");
            return (Criteria) this;
        }

        public Criteria andFncPopUpWidthGreaterThan(Short value) {
            addCriterion("FNC_POP_UP_WIDTH >", value, "fncPopUpWidth");
            return (Criteria) this;
        }

        public Criteria andFncPopUpWidthGreaterThanOrEqualTo(Short value) {
            addCriterion("FNC_POP_UP_WIDTH >=", value, "fncPopUpWidth");
            return (Criteria) this;
        }

        public Criteria andFncPopUpWidthLessThan(Short value) {
            addCriterion("FNC_POP_UP_WIDTH <", value, "fncPopUpWidth");
            return (Criteria) this;
        }

        public Criteria andFncPopUpWidthLessThanOrEqualTo(Short value) {
            addCriterion("FNC_POP_UP_WIDTH <=", value, "fncPopUpWidth");
            return (Criteria) this;
        }

        public Criteria andFncPopUpWidthIn(List<Short> values) {
            addCriterion("FNC_POP_UP_WIDTH in", values, "fncPopUpWidth");
            return (Criteria) this;
        }

        public Criteria andFncPopUpWidthNotIn(List<Short> values) {
            addCriterion("FNC_POP_UP_WIDTH not in", values, "fncPopUpWidth");
            return (Criteria) this;
        }

        public Criteria andFncPopUpWidthBetween(Short value1, Short value2) {
            addCriterion("FNC_POP_UP_WIDTH between", value1, value2, "fncPopUpWidth");
            return (Criteria) this;
        }

        public Criteria andFncPopUpWidthNotBetween(Short value1, Short value2) {
            addCriterion("FNC_POP_UP_WIDTH not between", value1, value2, "fncPopUpWidth");
            return (Criteria) this;
        }

        public Criteria andFncPopUpHeightIsNull() {
            addCriterion("FNC_POP_UP_HEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andFncPopUpHeightIsNotNull() {
            addCriterion("FNC_POP_UP_HEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andFncPopUpHeightEqualTo(Short value) {
            addCriterion("FNC_POP_UP_HEIGHT =", value, "fncPopUpHeight");
            return (Criteria) this;
        }

        public Criteria andFncPopUpHeightNotEqualTo(Short value) {
            addCriterion("FNC_POP_UP_HEIGHT <>", value, "fncPopUpHeight");
            return (Criteria) this;
        }

        public Criteria andFncPopUpHeightGreaterThan(Short value) {
            addCriterion("FNC_POP_UP_HEIGHT >", value, "fncPopUpHeight");
            return (Criteria) this;
        }

        public Criteria andFncPopUpHeightGreaterThanOrEqualTo(Short value) {
            addCriterion("FNC_POP_UP_HEIGHT >=", value, "fncPopUpHeight");
            return (Criteria) this;
        }

        public Criteria andFncPopUpHeightLessThan(Short value) {
            addCriterion("FNC_POP_UP_HEIGHT <", value, "fncPopUpHeight");
            return (Criteria) this;
        }

        public Criteria andFncPopUpHeightLessThanOrEqualTo(Short value) {
            addCriterion("FNC_POP_UP_HEIGHT <=", value, "fncPopUpHeight");
            return (Criteria) this;
        }

        public Criteria andFncPopUpHeightIn(List<Short> values) {
            addCriterion("FNC_POP_UP_HEIGHT in", values, "fncPopUpHeight");
            return (Criteria) this;
        }

        public Criteria andFncPopUpHeightNotIn(List<Short> values) {
            addCriterion("FNC_POP_UP_HEIGHT not in", values, "fncPopUpHeight");
            return (Criteria) this;
        }

        public Criteria andFncPopUpHeightBetween(Short value1, Short value2) {
            addCriterion("FNC_POP_UP_HEIGHT between", value1, value2, "fncPopUpHeight");
            return (Criteria) this;
        }

        public Criteria andFncPopUpHeightNotBetween(Short value1, Short value2) {
            addCriterion("FNC_POP_UP_HEIGHT not between", value1, value2, "fncPopUpHeight");
            return (Criteria) this;
        }

        public Criteria andFncPathIsNull() {
            addCriterion("FNC_PATH is null");
            return (Criteria) this;
        }

        public Criteria andFncPathIsNotNull() {
            addCriterion("FNC_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andFncPathEqualTo(String value) {
            addCriterion("FNC_PATH =", value, "fncPath");
            return (Criteria) this;
        }

        public Criteria andFncPathNotEqualTo(String value) {
            addCriterion("FNC_PATH <>", value, "fncPath");
            return (Criteria) this;
        }

        public Criteria andFncPathGreaterThan(String value) {
            addCriterion("FNC_PATH >", value, "fncPath");
            return (Criteria) this;
        }

        public Criteria andFncPathGreaterThanOrEqualTo(String value) {
            addCriterion("FNC_PATH >=", value, "fncPath");
            return (Criteria) this;
        }

        public Criteria andFncPathLessThan(String value) {
            addCriterion("FNC_PATH <", value, "fncPath");
            return (Criteria) this;
        }

        public Criteria andFncPathLessThanOrEqualTo(String value) {
            addCriterion("FNC_PATH <=", value, "fncPath");
            return (Criteria) this;
        }

        public Criteria andFncPathLike(String value) {
            addCriterion("FNC_PATH like", value, "fncPath");
            return (Criteria) this;
        }

        public Criteria andFncPathNotLike(String value) {
            addCriterion("FNC_PATH not like", value, "fncPath");
            return (Criteria) this;
        }

        public Criteria andFncPathIn(List<String> values) {
            addCriterion("FNC_PATH in", values, "fncPath");
            return (Criteria) this;
        }

        public Criteria andFncPathNotIn(List<String> values) {
            addCriterion("FNC_PATH not in", values, "fncPath");
            return (Criteria) this;
        }

        public Criteria andFncPathBetween(String value1, String value2) {
            addCriterion("FNC_PATH between", value1, value2, "fncPath");
            return (Criteria) this;
        }

        public Criteria andFncPathNotBetween(String value1, String value2) {
            addCriterion("FNC_PATH not between", value1, value2, "fncPath");
            return (Criteria) this;
        }

        public Criteria andFncPathParamIsNull() {
            addCriterion("FNC_PATH_PARAM is null");
            return (Criteria) this;
        }

        public Criteria andFncPathParamIsNotNull() {
            addCriterion("FNC_PATH_PARAM is not null");
            return (Criteria) this;
        }

        public Criteria andFncPathParamEqualTo(String value) {
            addCriterion("FNC_PATH_PARAM =", value, "fncPathParam");
            return (Criteria) this;
        }

        public Criteria andFncPathParamNotEqualTo(String value) {
            addCriterion("FNC_PATH_PARAM <>", value, "fncPathParam");
            return (Criteria) this;
        }

        public Criteria andFncPathParamGreaterThan(String value) {
            addCriterion("FNC_PATH_PARAM >", value, "fncPathParam");
            return (Criteria) this;
        }

        public Criteria andFncPathParamGreaterThanOrEqualTo(String value) {
            addCriterion("FNC_PATH_PARAM >=", value, "fncPathParam");
            return (Criteria) this;
        }

        public Criteria andFncPathParamLessThan(String value) {
            addCriterion("FNC_PATH_PARAM <", value, "fncPathParam");
            return (Criteria) this;
        }

        public Criteria andFncPathParamLessThanOrEqualTo(String value) {
            addCriterion("FNC_PATH_PARAM <=", value, "fncPathParam");
            return (Criteria) this;
        }

        public Criteria andFncPathParamLike(String value) {
            addCriterion("FNC_PATH_PARAM like", value, "fncPathParam");
            return (Criteria) this;
        }

        public Criteria andFncPathParamNotLike(String value) {
            addCriterion("FNC_PATH_PARAM not like", value, "fncPathParam");
            return (Criteria) this;
        }

        public Criteria andFncPathParamIn(List<String> values) {
            addCriterion("FNC_PATH_PARAM in", values, "fncPathParam");
            return (Criteria) this;
        }

        public Criteria andFncPathParamNotIn(List<String> values) {
            addCriterion("FNC_PATH_PARAM not in", values, "fncPathParam");
            return (Criteria) this;
        }

        public Criteria andFncPathParamBetween(String value1, String value2) {
            addCriterion("FNC_PATH_PARAM between", value1, value2, "fncPathParam");
            return (Criteria) this;
        }

        public Criteria andFncPathParamNotBetween(String value1, String value2) {
            addCriterion("FNC_PATH_PARAM not between", value1, value2, "fncPathParam");
            return (Criteria) this;
        }

        public Criteria andFncScreenIdIsNull() {
            addCriterion("FNC_SCREEN_ID is null");
            return (Criteria) this;
        }

        public Criteria andFncScreenIdIsNotNull() {
            addCriterion("FNC_SCREEN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFncScreenIdEqualTo(String value) {
            addCriterion("FNC_SCREEN_ID =", value, "fncScreenId");
            return (Criteria) this;
        }

        public Criteria andFncScreenIdNotEqualTo(String value) {
            addCriterion("FNC_SCREEN_ID <>", value, "fncScreenId");
            return (Criteria) this;
        }

        public Criteria andFncScreenIdGreaterThan(String value) {
            addCriterion("FNC_SCREEN_ID >", value, "fncScreenId");
            return (Criteria) this;
        }

        public Criteria andFncScreenIdGreaterThanOrEqualTo(String value) {
            addCriterion("FNC_SCREEN_ID >=", value, "fncScreenId");
            return (Criteria) this;
        }

        public Criteria andFncScreenIdLessThan(String value) {
            addCriterion("FNC_SCREEN_ID <", value, "fncScreenId");
            return (Criteria) this;
        }

        public Criteria andFncScreenIdLessThanOrEqualTo(String value) {
            addCriterion("FNC_SCREEN_ID <=", value, "fncScreenId");
            return (Criteria) this;
        }

        public Criteria andFncScreenIdLike(String value) {
            addCriterion("FNC_SCREEN_ID like", value, "fncScreenId");
            return (Criteria) this;
        }

        public Criteria andFncScreenIdNotLike(String value) {
            addCriterion("FNC_SCREEN_ID not like", value, "fncScreenId");
            return (Criteria) this;
        }

        public Criteria andFncScreenIdIn(List<String> values) {
            addCriterion("FNC_SCREEN_ID in", values, "fncScreenId");
            return (Criteria) this;
        }

        public Criteria andFncScreenIdNotIn(List<String> values) {
            addCriterion("FNC_SCREEN_ID not in", values, "fncScreenId");
            return (Criteria) this;
        }

        public Criteria andFncScreenIdBetween(String value1, String value2) {
            addCriterion("FNC_SCREEN_ID between", value1, value2, "fncScreenId");
            return (Criteria) this;
        }

        public Criteria andFncScreenIdNotBetween(String value1, String value2) {
            addCriterion("FNC_SCREEN_ID not between", value1, value2, "fncScreenId");
            return (Criteria) this;
        }

        public Criteria andFncProgClassIsNull() {
            addCriterion("FNC_PROG_CLASS is null");
            return (Criteria) this;
        }

        public Criteria andFncProgClassIsNotNull() {
            addCriterion("FNC_PROG_CLASS is not null");
            return (Criteria) this;
        }

        public Criteria andFncProgClassEqualTo(String value) {
            addCriterion("FNC_PROG_CLASS =", value, "fncProgClass");
            return (Criteria) this;
        }

        public Criteria andFncProgClassNotEqualTo(String value) {
            addCriterion("FNC_PROG_CLASS <>", value, "fncProgClass");
            return (Criteria) this;
        }

        public Criteria andFncProgClassGreaterThan(String value) {
            addCriterion("FNC_PROG_CLASS >", value, "fncProgClass");
            return (Criteria) this;
        }

        public Criteria andFncProgClassGreaterThanOrEqualTo(String value) {
            addCriterion("FNC_PROG_CLASS >=", value, "fncProgClass");
            return (Criteria) this;
        }

        public Criteria andFncProgClassLessThan(String value) {
            addCriterion("FNC_PROG_CLASS <", value, "fncProgClass");
            return (Criteria) this;
        }

        public Criteria andFncProgClassLessThanOrEqualTo(String value) {
            addCriterion("FNC_PROG_CLASS <=", value, "fncProgClass");
            return (Criteria) this;
        }

        public Criteria andFncProgClassLike(String value) {
            addCriterion("FNC_PROG_CLASS like", value, "fncProgClass");
            return (Criteria) this;
        }

        public Criteria andFncProgClassNotLike(String value) {
            addCriterion("FNC_PROG_CLASS not like", value, "fncProgClass");
            return (Criteria) this;
        }

        public Criteria andFncProgClassIn(List<String> values) {
            addCriterion("FNC_PROG_CLASS in", values, "fncProgClass");
            return (Criteria) this;
        }

        public Criteria andFncProgClassNotIn(List<String> values) {
            addCriterion("FNC_PROG_CLASS not in", values, "fncProgClass");
            return (Criteria) this;
        }

        public Criteria andFncProgClassBetween(String value1, String value2) {
            addCriterion("FNC_PROG_CLASS between", value1, value2, "fncProgClass");
            return (Criteria) this;
        }

        public Criteria andFncProgClassNotBetween(String value1, String value2) {
            addCriterion("FNC_PROG_CLASS not between", value1, value2, "fncProgClass");
            return (Criteria) this;
        }

        public Criteria andFncVersionNoIsNull() {
            addCriterion("FNC_VERSION_NO is null");
            return (Criteria) this;
        }

        public Criteria andFncVersionNoIsNotNull() {
            addCriterion("FNC_VERSION_NO is not null");
            return (Criteria) this;
        }

        public Criteria andFncVersionNoEqualTo(Long value) {
            addCriterion("FNC_VERSION_NO =", value, "fncVersionNo");
            return (Criteria) this;
        }

        public Criteria andFncVersionNoNotEqualTo(Long value) {
            addCriterion("FNC_VERSION_NO <>", value, "fncVersionNo");
            return (Criteria) this;
        }

        public Criteria andFncVersionNoGreaterThan(Long value) {
            addCriterion("FNC_VERSION_NO >", value, "fncVersionNo");
            return (Criteria) this;
        }

        public Criteria andFncVersionNoGreaterThanOrEqualTo(Long value) {
            addCriterion("FNC_VERSION_NO >=", value, "fncVersionNo");
            return (Criteria) this;
        }

        public Criteria andFncVersionNoLessThan(Long value) {
            addCriterion("FNC_VERSION_NO <", value, "fncVersionNo");
            return (Criteria) this;
        }

        public Criteria andFncVersionNoLessThanOrEqualTo(Long value) {
            addCriterion("FNC_VERSION_NO <=", value, "fncVersionNo");
            return (Criteria) this;
        }

        public Criteria andFncVersionNoIn(List<Long> values) {
            addCriterion("FNC_VERSION_NO in", values, "fncVersionNo");
            return (Criteria) this;
        }

        public Criteria andFncVersionNoNotIn(List<Long> values) {
            addCriterion("FNC_VERSION_NO not in", values, "fncVersionNo");
            return (Criteria) this;
        }

        public Criteria andFncVersionNoBetween(Long value1, Long value2) {
            addCriterion("FNC_VERSION_NO between", value1, value2, "fncVersionNo");
            return (Criteria) this;
        }

        public Criteria andFncVersionNoNotBetween(Long value1, Long value2) {
            addCriterion("FNC_VERSION_NO not between", value1, value2, "fncVersionNo");
            return (Criteria) this;
        }

        public Criteria andFncCreateDtIsNull() {
            addCriterion("FNC_CREATE_DT is null");
            return (Criteria) this;
        }

        public Criteria andFncCreateDtIsNotNull() {
            addCriterion("FNC_CREATE_DT is not null");
            return (Criteria) this;
        }

        public Criteria andFncCreateDtEqualTo(Date value) {
            addCriterion("FNC_CREATE_DT =", value, "fncCreateDt");
            return (Criteria) this;
        }

        public Criteria andFncCreateDtNotEqualTo(Date value) {
            addCriterion("FNC_CREATE_DT <>", value, "fncCreateDt");
            return (Criteria) this;
        }

        public Criteria andFncCreateDtGreaterThan(Date value) {
            addCriterion("FNC_CREATE_DT >", value, "fncCreateDt");
            return (Criteria) this;
        }

        public Criteria andFncCreateDtGreaterThanOrEqualTo(Date value) {
            addCriterion("FNC_CREATE_DT >=", value, "fncCreateDt");
            return (Criteria) this;
        }

        public Criteria andFncCreateDtLessThan(Date value) {
            addCriterion("FNC_CREATE_DT <", value, "fncCreateDt");
            return (Criteria) this;
        }

        public Criteria andFncCreateDtLessThanOrEqualTo(Date value) {
            addCriterion("FNC_CREATE_DT <=", value, "fncCreateDt");
            return (Criteria) this;
        }

        public Criteria andFncCreateDtIn(List<Date> values) {
            addCriterion("FNC_CREATE_DT in", values, "fncCreateDt");
            return (Criteria) this;
        }

        public Criteria andFncCreateDtNotIn(List<Date> values) {
            addCriterion("FNC_CREATE_DT not in", values, "fncCreateDt");
            return (Criteria) this;
        }

        public Criteria andFncCreateDtBetween(Date value1, Date value2) {
            addCriterion("FNC_CREATE_DT between", value1, value2, "fncCreateDt");
            return (Criteria) this;
        }

        public Criteria andFncCreateDtNotBetween(Date value1, Date value2) {
            addCriterion("FNC_CREATE_DT not between", value1, value2, "fncCreateDt");
            return (Criteria) this;
        }

        public Criteria andFncCreateUserIsNull() {
            addCriterion("FNC_CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andFncCreateUserIsNotNull() {
            addCriterion("FNC_CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andFncCreateUserEqualTo(String value) {
            addCriterion("FNC_CREATE_USER =", value, "fncCreateUser");
            return (Criteria) this;
        }

        public Criteria andFncCreateUserNotEqualTo(String value) {
            addCriterion("FNC_CREATE_USER <>", value, "fncCreateUser");
            return (Criteria) this;
        }

        public Criteria andFncCreateUserGreaterThan(String value) {
            addCriterion("FNC_CREATE_USER >", value, "fncCreateUser");
            return (Criteria) this;
        }

        public Criteria andFncCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("FNC_CREATE_USER >=", value, "fncCreateUser");
            return (Criteria) this;
        }

        public Criteria andFncCreateUserLessThan(String value) {
            addCriterion("FNC_CREATE_USER <", value, "fncCreateUser");
            return (Criteria) this;
        }

        public Criteria andFncCreateUserLessThanOrEqualTo(String value) {
            addCriterion("FNC_CREATE_USER <=", value, "fncCreateUser");
            return (Criteria) this;
        }

        public Criteria andFncCreateUserLike(String value) {
            addCriterion("FNC_CREATE_USER like", value, "fncCreateUser");
            return (Criteria) this;
        }

        public Criteria andFncCreateUserNotLike(String value) {
            addCriterion("FNC_CREATE_USER not like", value, "fncCreateUser");
            return (Criteria) this;
        }

        public Criteria andFncCreateUserIn(List<String> values) {
            addCriterion("FNC_CREATE_USER in", values, "fncCreateUser");
            return (Criteria) this;
        }

        public Criteria andFncCreateUserNotIn(List<String> values) {
            addCriterion("FNC_CREATE_USER not in", values, "fncCreateUser");
            return (Criteria) this;
        }

        public Criteria andFncCreateUserBetween(String value1, String value2) {
            addCriterion("FNC_CREATE_USER between", value1, value2, "fncCreateUser");
            return (Criteria) this;
        }

        public Criteria andFncCreateUserNotBetween(String value1, String value2) {
            addCriterion("FNC_CREATE_USER not between", value1, value2, "fncCreateUser");
            return (Criteria) this;
        }

        public Criteria andFncModifyDtIsNull() {
            addCriterion("FNC_MODIFY_DT is null");
            return (Criteria) this;
        }

        public Criteria andFncModifyDtIsNotNull() {
            addCriterion("FNC_MODIFY_DT is not null");
            return (Criteria) this;
        }

        public Criteria andFncModifyDtEqualTo(Date value) {
            addCriterion("FNC_MODIFY_DT =", value, "fncModifyDt");
            return (Criteria) this;
        }

        public Criteria andFncModifyDtNotEqualTo(Date value) {
            addCriterion("FNC_MODIFY_DT <>", value, "fncModifyDt");
            return (Criteria) this;
        }

        public Criteria andFncModifyDtGreaterThan(Date value) {
            addCriterion("FNC_MODIFY_DT >", value, "fncModifyDt");
            return (Criteria) this;
        }

        public Criteria andFncModifyDtGreaterThanOrEqualTo(Date value) {
            addCriterion("FNC_MODIFY_DT >=", value, "fncModifyDt");
            return (Criteria) this;
        }

        public Criteria andFncModifyDtLessThan(Date value) {
            addCriterion("FNC_MODIFY_DT <", value, "fncModifyDt");
            return (Criteria) this;
        }

        public Criteria andFncModifyDtLessThanOrEqualTo(Date value) {
            addCriterion("FNC_MODIFY_DT <=", value, "fncModifyDt");
            return (Criteria) this;
        }

        public Criteria andFncModifyDtIn(List<Date> values) {
            addCriterion("FNC_MODIFY_DT in", values, "fncModifyDt");
            return (Criteria) this;
        }

        public Criteria andFncModifyDtNotIn(List<Date> values) {
            addCriterion("FNC_MODIFY_DT not in", values, "fncModifyDt");
            return (Criteria) this;
        }

        public Criteria andFncModifyDtBetween(Date value1, Date value2) {
            addCriterion("FNC_MODIFY_DT between", value1, value2, "fncModifyDt");
            return (Criteria) this;
        }

        public Criteria andFncModifyDtNotBetween(Date value1, Date value2) {
            addCriterion("FNC_MODIFY_DT not between", value1, value2, "fncModifyDt");
            return (Criteria) this;
        }

        public Criteria andFncModifyUserIsNull() {
            addCriterion("FNC_MODIFY_USER is null");
            return (Criteria) this;
        }

        public Criteria andFncModifyUserIsNotNull() {
            addCriterion("FNC_MODIFY_USER is not null");
            return (Criteria) this;
        }

        public Criteria andFncModifyUserEqualTo(String value) {
            addCriterion("FNC_MODIFY_USER =", value, "fncModifyUser");
            return (Criteria) this;
        }

        public Criteria andFncModifyUserNotEqualTo(String value) {
            addCriterion("FNC_MODIFY_USER <>", value, "fncModifyUser");
            return (Criteria) this;
        }

        public Criteria andFncModifyUserGreaterThan(String value) {
            addCriterion("FNC_MODIFY_USER >", value, "fncModifyUser");
            return (Criteria) this;
        }

        public Criteria andFncModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("FNC_MODIFY_USER >=", value, "fncModifyUser");
            return (Criteria) this;
        }

        public Criteria andFncModifyUserLessThan(String value) {
            addCriterion("FNC_MODIFY_USER <", value, "fncModifyUser");
            return (Criteria) this;
        }

        public Criteria andFncModifyUserLessThanOrEqualTo(String value) {
            addCriterion("FNC_MODIFY_USER <=", value, "fncModifyUser");
            return (Criteria) this;
        }

        public Criteria andFncModifyUserLike(String value) {
            addCriterion("FNC_MODIFY_USER like", value, "fncModifyUser");
            return (Criteria) this;
        }

        public Criteria andFncModifyUserNotLike(String value) {
            addCriterion("FNC_MODIFY_USER not like", value, "fncModifyUser");
            return (Criteria) this;
        }

        public Criteria andFncModifyUserIn(List<String> values) {
            addCriterion("FNC_MODIFY_USER in", values, "fncModifyUser");
            return (Criteria) this;
        }

        public Criteria andFncModifyUserNotIn(List<String> values) {
            addCriterion("FNC_MODIFY_USER not in", values, "fncModifyUser");
            return (Criteria) this;
        }

        public Criteria andFncModifyUserBetween(String value1, String value2) {
            addCriterion("FNC_MODIFY_USER between", value1, value2, "fncModifyUser");
            return (Criteria) this;
        }

        public Criteria andFncModifyUserNotBetween(String value1, String value2) {
            addCriterion("FNC_MODIFY_USER not between", value1, value2, "fncModifyUser");
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
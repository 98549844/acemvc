package com.entity;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import java.io.Serializable;
import java.util.Date;

/**
 * @author: Kalam
 * @time: 2022/08/18 11:42
 * @description: 
 */
@EntityListeners(AuditingEntityListener.class)
public class RFncFunction extends RFncFunctionKey implements Serializable {
    @Column
    private String fncDesc;

    @Column
    private String fncFuncTyp;

    @Column
    private Short fncFuncSeq;

    @Column
    private String fncLink;

    @Column
    private String fncOnclick;

    @Column
    private String fncShownOnMenu;

    @Column
    private String fncPopUp;

    @Column
    private Short fncPopUpWidth;

    @Column
    private Short fncPopUpHeight;

    @Column
    private String fncPath;

    @Column
    private String fncPathParam;

    @Column
    private String fncScreenId;

    @Column
    private String fncProgClass;

    @Column
    private Long fncVersionNo;

    @Column
    private Date fncCreateDt;

    @Column
    private String fncCreateUser;

    @Column
    private Date fncModifyDt;

    @Column
    private String fncModifyUser;

    private static final long serialVersionUID = 1L;

    public String getFncDesc() {
        return fncDesc;
    }

    public void setFncDesc(String fncDesc) {
        this.fncDesc = fncDesc == null ? null : fncDesc.trim();
    }

    public String getFncFuncTyp() {
        return fncFuncTyp;
    }

    public void setFncFuncTyp(String fncFuncTyp) {
        this.fncFuncTyp = fncFuncTyp == null ? null : fncFuncTyp.trim();
    }

    public Short getFncFuncSeq() {
        return fncFuncSeq;
    }

    public void setFncFuncSeq(Short fncFuncSeq) {
        this.fncFuncSeq = fncFuncSeq;
    }

    public String getFncLink() {
        return fncLink;
    }

    public void setFncLink(String fncLink) {
        this.fncLink = fncLink == null ? null : fncLink.trim();
    }

    public String getFncOnclick() {
        return fncOnclick;
    }

    public void setFncOnclick(String fncOnclick) {
        this.fncOnclick = fncOnclick == null ? null : fncOnclick.trim();
    }

    public String getFncShownOnMenu() {
        return fncShownOnMenu;
    }

    public void setFncShownOnMenu(String fncShownOnMenu) {
        this.fncShownOnMenu = fncShownOnMenu == null ? null : fncShownOnMenu.trim();
    }

    public String getFncPopUp() {
        return fncPopUp;
    }

    public void setFncPopUp(String fncPopUp) {
        this.fncPopUp = fncPopUp == null ? null : fncPopUp.trim();
    }

    public Short getFncPopUpWidth() {
        return fncPopUpWidth;
    }

    public void setFncPopUpWidth(Short fncPopUpWidth) {
        this.fncPopUpWidth = fncPopUpWidth;
    }

    public Short getFncPopUpHeight() {
        return fncPopUpHeight;
    }

    public void setFncPopUpHeight(Short fncPopUpHeight) {
        this.fncPopUpHeight = fncPopUpHeight;
    }

    public String getFncPath() {
        return fncPath;
    }

    public void setFncPath(String fncPath) {
        this.fncPath = fncPath == null ? null : fncPath.trim();
    }

    public String getFncPathParam() {
        return fncPathParam;
    }

    public void setFncPathParam(String fncPathParam) {
        this.fncPathParam = fncPathParam == null ? null : fncPathParam.trim();
    }

    public String getFncScreenId() {
        return fncScreenId;
    }

    public void setFncScreenId(String fncScreenId) {
        this.fncScreenId = fncScreenId == null ? null : fncScreenId.trim();
    }

    public String getFncProgClass() {
        return fncProgClass;
    }

    public void setFncProgClass(String fncProgClass) {
        this.fncProgClass = fncProgClass == null ? null : fncProgClass.trim();
    }

    public Long getFncVersionNo() {
        return fncVersionNo;
    }

    public void setFncVersionNo(Long fncVersionNo) {
        this.fncVersionNo = fncVersionNo;
    }

    public Date getFncCreateDt() {
        return fncCreateDt;
    }

    public void setFncCreateDt(Date fncCreateDt) {
        this.fncCreateDt = fncCreateDt;
    }

    public String getFncCreateUser() {
        return fncCreateUser;
    }

    public void setFncCreateUser(String fncCreateUser) {
        this.fncCreateUser = fncCreateUser == null ? null : fncCreateUser.trim();
    }

    public Date getFncModifyDt() {
        return fncModifyDt;
    }

    public void setFncModifyDt(Date fncModifyDt) {
        this.fncModifyDt = fncModifyDt;
    }

    public String getFncModifyUser() {
        return fncModifyUser;
    }

    public void setFncModifyUser(String fncModifyUser) {
        this.fncModifyUser = fncModifyUser == null ? null : fncModifyUser.trim();
    }
}
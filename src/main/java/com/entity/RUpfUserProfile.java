package com.entity;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import java.io.Serializable;
import java.util.Date;

/**
 * @author: Kalam
 * @time: 2022/08/18 11:42
 * @description: 
 */
@EntityListeners(AuditingEntityListener.class)
public class RUpfUserProfile implements Serializable {

    @Column
    private String upfUserId;

    @Column
    private String upfEngName;

    @Column
    private String upfChiName;

    @Column
    private String upfEmail;

    @Column
    private String upfFax;

    @Column
    private String upfTel;

    @Column
    private String upfLoc;

    @Column
    private String upfSalutation;

    @Column
    private String upfDepartment;

    @Column
    private String upfRank;

    @Column
    private String upfStatus;

    @Column
    private String upfEngFirstName;

    @Column
    private String upfEngLastName;

    @Column
    private String upfChiFirstName;

    @Column
    private String upfChiLastName;

    @Column
    private String upfPwd;

    @Column
    private Date upfPwdChgDt;

    @Column
    private Integer upfFailCount;

    @Column
    private Date upfLastLockTime;

    @Column
    private Date upfLastLogin;

    @Column
    private Long upfVersionNo;

    @Column
    private Date upfCreateDt;

    @Column
    private String upfCreateUser;

    @Column
    private Date upfModifyDt;

    @Column
    private String upfModifyUser;

    @Column
    private String upfLdapPrincipal;

    @Column
    private String upfEfsUserId;

    @Column
    private String upfTrAdminGrpId;

    @Column
    private String upfNotesEmail;

    @Column
    private String upfDivision;

    private static final long serialVersionUID = 1L;

    public String getUpfUserId() {
        return upfUserId;
    }

    public void setUpfUserId(String upfUserId) {
        this.upfUserId = upfUserId == null ? null : upfUserId.trim();
    }

    public String getUpfEngName() {
        return upfEngName;
    }

    public void setUpfEngName(String upfEngName) {
        this.upfEngName = upfEngName == null ? null : upfEngName.trim();
    }

    public String getUpfChiName() {
        return upfChiName;
    }

    public void setUpfChiName(String upfChiName) {
        this.upfChiName = upfChiName == null ? null : upfChiName.trim();
    }

    public String getUpfEmail() {
        return upfEmail;
    }

    public void setUpfEmail(String upfEmail) {
        this.upfEmail = upfEmail == null ? null : upfEmail.trim();
    }

    public String getUpfFax() {
        return upfFax;
    }

    public void setUpfFax(String upfFax) {
        this.upfFax = upfFax == null ? null : upfFax.trim();
    }

    public String getUpfTel() {
        return upfTel;
    }

    public void setUpfTel(String upfTel) {
        this.upfTel = upfTel == null ? null : upfTel.trim();
    }

    public String getUpfLoc() {
        return upfLoc;
    }

    public void setUpfLoc(String upfLoc) {
        this.upfLoc = upfLoc == null ? null : upfLoc.trim();
    }

    public String getUpfSalutation() {
        return upfSalutation;
    }

    public void setUpfSalutation(String upfSalutation) {
        this.upfSalutation = upfSalutation == null ? null : upfSalutation.trim();
    }

    public String getUpfDepartment() {
        return upfDepartment;
    }

    public void setUpfDepartment(String upfDepartment) {
        this.upfDepartment = upfDepartment == null ? null : upfDepartment.trim();
    }

    public String getUpfRank() {
        return upfRank;
    }

    public void setUpfRank(String upfRank) {
        this.upfRank = upfRank == null ? null : upfRank.trim();
    }

    public String getUpfStatus() {
        return upfStatus;
    }

    public void setUpfStatus(String upfStatus) {
        this.upfStatus = upfStatus == null ? null : upfStatus.trim();
    }

    public String getUpfEngFirstName() {
        return upfEngFirstName;
    }

    public void setUpfEngFirstName(String upfEngFirstName) {
        this.upfEngFirstName = upfEngFirstName == null ? null : upfEngFirstName.trim();
    }

    public String getUpfEngLastName() {
        return upfEngLastName;
    }

    public void setUpfEngLastName(String upfEngLastName) {
        this.upfEngLastName = upfEngLastName == null ? null : upfEngLastName.trim();
    }

    public String getUpfChiFirstName() {
        return upfChiFirstName;
    }

    public void setUpfChiFirstName(String upfChiFirstName) {
        this.upfChiFirstName = upfChiFirstName == null ? null : upfChiFirstName.trim();
    }

    public String getUpfChiLastName() {
        return upfChiLastName;
    }

    public void setUpfChiLastName(String upfChiLastName) {
        this.upfChiLastName = upfChiLastName == null ? null : upfChiLastName.trim();
    }

    public String getUpfPwd() {
        return upfPwd;
    }

    public void setUpfPwd(String upfPwd) {
        this.upfPwd = upfPwd == null ? null : upfPwd.trim();
    }

    public Date getUpfPwdChgDt() {
        return upfPwdChgDt;
    }

    public void setUpfPwdChgDt(Date upfPwdChgDt) {
        this.upfPwdChgDt = upfPwdChgDt;
    }

    public Integer getUpfFailCount() {
        return upfFailCount;
    }

    public void setUpfFailCount(Integer upfFailCount) {
        this.upfFailCount = upfFailCount;
    }

    public Date getUpfLastLockTime() {
        return upfLastLockTime;
    }

    public void setUpfLastLockTime(Date upfLastLockTime) {
        this.upfLastLockTime = upfLastLockTime;
    }

    public Date getUpfLastLogin() {
        return upfLastLogin;
    }

    public void setUpfLastLogin(Date upfLastLogin) {
        this.upfLastLogin = upfLastLogin;
    }

    public Long getUpfVersionNo() {
        return upfVersionNo;
    }

    public void setUpfVersionNo(Long upfVersionNo) {
        this.upfVersionNo = upfVersionNo;
    }

    public Date getUpfCreateDt() {
        return upfCreateDt;
    }

    public void setUpfCreateDt(Date upfCreateDt) {
        this.upfCreateDt = upfCreateDt;
    }

    public String getUpfCreateUser() {
        return upfCreateUser;
    }

    public void setUpfCreateUser(String upfCreateUser) {
        this.upfCreateUser = upfCreateUser == null ? null : upfCreateUser.trim();
    }

    public Date getUpfModifyDt() {
        return upfModifyDt;
    }

    public void setUpfModifyDt(Date upfModifyDt) {
        this.upfModifyDt = upfModifyDt;
    }

    public String getUpfModifyUser() {
        return upfModifyUser;
    }

    public void setUpfModifyUser(String upfModifyUser) {
        this.upfModifyUser = upfModifyUser == null ? null : upfModifyUser.trim();
    }

    public String getUpfLdapPrincipal() {
        return upfLdapPrincipal;
    }

    public void setUpfLdapPrincipal(String upfLdapPrincipal) {
        this.upfLdapPrincipal = upfLdapPrincipal == null ? null : upfLdapPrincipal.trim();
    }

    public String getUpfEfsUserId() {
        return upfEfsUserId;
    }

    public void setUpfEfsUserId(String upfEfsUserId) {
        this.upfEfsUserId = upfEfsUserId == null ? null : upfEfsUserId.trim();
    }

    public String getUpfTrAdminGrpId() {
        return upfTrAdminGrpId;
    }

    public void setUpfTrAdminGrpId(String upfTrAdminGrpId) {
        this.upfTrAdminGrpId = upfTrAdminGrpId == null ? null : upfTrAdminGrpId.trim();
    }

    public String getUpfNotesEmail() {
        return upfNotesEmail;
    }

    public void setUpfNotesEmail(String upfNotesEmail) {
        this.upfNotesEmail = upfNotesEmail == null ? null : upfNotesEmail.trim();
    }

    public String getUpfDivision() {
        return upfDivision;
    }

    public void setUpfDivision(String upfDivision) {
        this.upfDivision = upfDivision == null ? null : upfDivision.trim();
    }
}
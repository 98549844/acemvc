package com.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @Classname: UserProfile
 * @Date: 2022/8/10 下午 03:53
 * @Author: kalam_au
 * @Description:
 */


@EntityListeners(AuditingEntityListener.class)
@Table(name = "R_UPF_USER_PROFILE", uniqueConstraints = {@UniqueConstraint(name = "R_UPF_PK", columnNames = "UPF_USER_ID")})
@Entity
public class UserProfile implements Serializable {
    private static final Logger log = LogManager.getLogger(UserProfile.class.getName());

    @Id
    @Column(name = "UPF_USER_ID")
    private String id;


    @Column(name = "UPF_ENG_NAME")
    private String englishName;


    @Column(name = "UPF_CHI_NAME")
    private String chineseName;

    @Column(name = "UPF_EMAIL")
    private String email;

    @Column(name = "UPF_FAX")
    private String fax;

    @Column(name = "UPF_TEL")
    private String tel;

    @Column(name = "UPF_LOC")
    private String locationCode;

    @Column(name = "UPF_SALUTATION")
    private String salutationCode;

    @Column(name = "UPF_DEPARTMENT")
    private String departmentCode;

    @Column(name = "UPF_RANK")
    private String rankCode;

    @Column(name = "UPF_STATUS")
    private String status;

    @Column(name = "UPF_ENG_FIRST_NAME")
    private String englishFirstName;

    @Column(name = "UPF_ENG_LAST_NAME")
    private String englishLastName;

    @Column(name = "UPF_CHI_FIRST_NAME")
    private String chineseFirstName;

    @Column(name = "UPF_CHI_LAST_NAME")
    private String chineseLastName;

    @Column(name = "UPF_PWD")
    private String password;

    @Column(name = "UPF_PWD_CHG_DT")
    private Date passwordChangedDate;

    @Column(name = "UPF_FAIL_COUNT")
    private Integer failCount;

    @Column(name = "UPF_LAST_LOCK_TIME")
    private Date lastLockTime;

    @Column(name = "UPF_LAST_LOGIN")
    private Date lastLogin;

    @Column(name = "UPF_VERSION_NO")
    private Long version;

    @Column(name = "UPF_CREATE_DT")
    private Date createdDate;

    @Column(name = "UPF_CREATE_USER")
    private String createdUser;

    @Column(name = "UPF_MODIFY_DT")
    private Date modifiedDate;

    @Column(name = "UPF_MODIFY_USER")
    private String modifiedUser;

    @Column(name = "UPF_LDAP_PRINCIPAL")
    private String ldapPrincipal;

    @Column(name = "UPF_EFS_USER_ID")
    private String efsUserId;

    @Column(name = "UPF_TR_ADMIN_GRP_ID")
    private String trAdminGroupId;

    @Column(name = "UPF_NOTES_EMAIL")
    private String upfNotesEmail;

    @Column(name = "UPF_DIVISION")
    private String upfDivision;

    @Column(name = "")
    private static final long serialVersionUID = 1L;

    public UserProfile(String id, String englishName, String chineseName, String email, String fax, String tel, String locationCode, String salutationCode, String departmentCode, String rankCode, String status, String englishFirstName, String englishLastName, String chineseFirstName, String chineseLastName, String password, Date passwordChangedDate, Integer failCount, Date lastLockTime, Date lastLogin, Long version, Date createdDate, String createdUser, Date modifiedDate, String modifiedUser, String ldapPrincipal, String efsUserId, String trAdminGroupId, String upfNotesEmail, String upfDivision) {
        this.id = id;
        this.englishName = englishName;
        this.chineseName = chineseName;
        this.email = email;
        this.fax = fax;
        this.tel = tel;
        this.locationCode = locationCode;
        this.salutationCode = salutationCode;
        this.departmentCode = departmentCode;
        this.rankCode = rankCode;
        this.status = status;
        this.englishFirstName = englishFirstName;
        this.englishLastName = englishLastName;
        this.chineseFirstName = chineseFirstName;
        this.chineseLastName = chineseLastName;
        this.password = password;
        this.passwordChangedDate = passwordChangedDate;
        this.failCount = failCount;
        this.lastLockTime = lastLockTime;
        this.lastLogin = lastLogin;
        this.version = version;
        this.createdDate = createdDate;
        this.createdUser = createdUser;
        this.modifiedDate = modifiedDate;
        this.modifiedUser = modifiedUser;
        this.ldapPrincipal = ldapPrincipal;
        this.efsUserId = efsUserId;
        this.trAdminGroupId = trAdminGroupId;
        this.upfNotesEmail = upfNotesEmail;
        this.upfDivision = upfDivision;
    }

    public UserProfile() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getChineseName() {
        return chineseName;
    }

    public void setChineseName(String chineseName) {
        this.chineseName = chineseName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getLocationCode() {
        return locationCode;
    }

    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }

    public String getSalutationCode() {
        return salutationCode;
    }

    public void setSalutationCode(String salutationCode) {
        this.salutationCode = salutationCode;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public String getRankCode() {
        return rankCode;
    }

    public void setRankCode(String rankCode) {
        this.rankCode = rankCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEnglishFirstName() {
        return englishFirstName;
    }

    public void setEnglishFirstName(String englishFirstName) {
        this.englishFirstName = englishFirstName;
    }

    public String getEnglishLastName() {
        return englishLastName;
    }

    public void setEnglishLastName(String englishLastName) {
        this.englishLastName = englishLastName;
    }

    public String getChineseFirstName() {
        return chineseFirstName;
    }

    public void setChineseFirstName(String chineseFirstName) {
        this.chineseFirstName = chineseFirstName;
    }

    public String getChineseLastName() {
        return chineseLastName;
    }

    public void setChineseLastName(String chineseLastName) {
        this.chineseLastName = chineseLastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getPasswordChangedDate() {
        return passwordChangedDate;
    }

    public void setPasswordChangedDate(Date passwordChangedDate) {
        this.passwordChangedDate = passwordChangedDate;
    }

    public Integer getFailCount() {
        return failCount;
    }

    public void setFailCount(Integer failCount) {
        this.failCount = failCount;
    }

    public Date getLastLockTime() {
        return lastLockTime;
    }

    public void setLastLockTime(Date lastLockTime) {
        this.lastLockTime = lastLockTime;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getModifiedUser() {
        return modifiedUser;
    }

    public void setModifiedUser(String modifiedUser) {
        this.modifiedUser = modifiedUser;
    }

    public String getLdapPrincipal() {
        return ldapPrincipal;
    }

    public void setLdapPrincipal(String ldapPrincipal) {
        this.ldapPrincipal = ldapPrincipal;
    }

    public String getEfsUserId() {
        return efsUserId;
    }

    public void setEfsUserId(String efsUserId) {
        this.efsUserId = efsUserId;
    }

    public String getTrAdminGroupId() {
        return trAdminGroupId;
    }

    public void setTrAdminGroupId(String trAdminGroupId) {
        this.trAdminGroupId = trAdminGroupId;
    }

    public String getUpfNotesEmail() {
        return upfNotesEmail;
    }

    public void setUpfNotesEmail(String upfNotesEmail) {
        this.upfNotesEmail = upfNotesEmail;
    }

    public String getUpfDivision() {
        return upfDivision;
    }

    public void setUpfDivision(String upfDivision) {
        this.upfDivision = upfDivision;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        UserProfile other = (UserProfile) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId())) && (this.getEnglishName() == null ? other.getEnglishName() == null : this.getEnglishName().equals(other.getEnglishName())) && (this.getChineseName() == null ? other.getChineseName() == null : this.getChineseName().equals(other.getChineseName())) && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail())) && (this.getFax() == null ? other.getFax() == null : this.getFax().equals(other.getFax())) && (this.getTel() == null ? other.getTel() == null : this.getTel().equals(other.getTel())) && (this.getLocationCode() == null ? other.getLocationCode() == null : this.getLocationCode().equals(other.getLocationCode())) && (this.getSalutationCode() == null ? other.getSalutationCode() == null : this.getSalutationCode().equals(other.getSalutationCode())) && (this.getDepartmentCode() == null ? other.getDepartmentCode() == null : this.getDepartmentCode().equals(other.getDepartmentCode())) && (this.getRankCode() == null ? other.getRankCode() == null : this.getRankCode().equals(other.getRankCode())) && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus())) && (this.getEnglishFirstName() == null ? other.getEnglishFirstName() == null : this.getEnglishFirstName().equals(other.getEnglishFirstName())) && (this.getEnglishLastName() == null ? other.getEnglishLastName() == null : this.getEnglishLastName().equals(other.getEnglishLastName())) && (this.getChineseFirstName() == null ? other.getChineseFirstName() == null : this.getChineseFirstName().equals(other.getChineseFirstName())) && (this.getChineseLastName() == null ? other.getChineseLastName() == null : this.getChineseLastName().equals(other.getChineseLastName())) && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword())) && (this.getPasswordChangedDate() == null ? other.getPasswordChangedDate() == null : this.getPasswordChangedDate().equals(other.getPasswordChangedDate())) && (this.getFailCount() == null ? other.getFailCount() == null : this.getFailCount().equals(other.getFailCount())) && (this.getLastLockTime() == null ? other.getLastLockTime() == null : this.getLastLockTime().equals(other.getLastLockTime())) && (this.getLastLogin() == null ? other.getLastLogin() == null : this.getLastLogin().equals(other.getLastLogin())) && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion())) && (this.getCreatedDate() == null ? other.getCreatedDate() == null : this.getCreatedDate().equals(other.getCreatedDate())) && (this.getCreatedUser() == null ? other.getCreatedUser() == null : this.getCreatedUser().equals(other.getCreatedUser())) && (this.getModifiedDate() == null ? other.getModifiedDate() == null : this.getModifiedDate().equals(other.getModifiedDate())) && (this.getModifiedUser() == null ? other.getModifiedUser() == null : this.getModifiedUser().equals(other.getModifiedUser())) && (this.getLdapPrincipal() == null ? other.getLdapPrincipal() == null : this.getLdapPrincipal().equals(other.getLdapPrincipal())) && (this.getEfsUserId() == null ? other.getEfsUserId() == null : this.getEfsUserId().equals(other.getEfsUserId())) && (this.getTrAdminGroupId() == null ? other.getTrAdminGroupId() == null : this.getTrAdminGroupId().equals(other.getTrAdminGroupId())) && (this.getUpfNotesEmail() == null ? other.getUpfNotesEmail() == null : this.getUpfNotesEmail().equals(other.getUpfNotesEmail())) && (this.getUpfDivision() == null ? other.getUpfDivision() == null : this.getUpfDivision().equals(other.getUpfDivision()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getEnglishName() == null) ? 0 : getEnglishName().hashCode());
        result = prime * result + ((getChineseName() == null) ? 0 : getChineseName().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getFax() == null) ? 0 : getFax().hashCode());
        result = prime * result + ((getTel() == null) ? 0 : getTel().hashCode());
        result = prime * result + ((getLocationCode() == null) ? 0 : getLocationCode().hashCode());
        result = prime * result + ((getSalutationCode() == null) ? 0 : getSalutationCode().hashCode());
        result = prime * result + ((getDepartmentCode() == null) ? 0 : getDepartmentCode().hashCode());
        result = prime * result + ((getRankCode() == null) ? 0 : getRankCode().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getEnglishFirstName() == null) ? 0 : getEnglishFirstName().hashCode());
        result = prime * result + ((getEnglishLastName() == null) ? 0 : getEnglishLastName().hashCode());
        result = prime * result + ((getChineseFirstName() == null) ? 0 : getChineseFirstName().hashCode());
        result = prime * result + ((getChineseLastName() == null) ? 0 : getChineseLastName().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getPasswordChangedDate() == null) ? 0 : getPasswordChangedDate().hashCode());
        result = prime * result + ((getFailCount() == null) ? 0 : getFailCount().hashCode());
        result = prime * result + ((getLastLockTime() == null) ? 0 : getLastLockTime().hashCode());
        result = prime * result + ((getLastLogin() == null) ? 0 : getLastLogin().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        result = prime * result + ((getCreatedUser() == null) ? 0 : getCreatedUser().hashCode());
        result = prime * result + ((getModifiedDate() == null) ? 0 : getModifiedDate().hashCode());
        result = prime * result + ((getModifiedUser() == null) ? 0 : getModifiedUser().hashCode());
        result = prime * result + ((getLdapPrincipal() == null) ? 0 : getLdapPrincipal().hashCode());
        result = prime * result + ((getEfsUserId() == null) ? 0 : getEfsUserId().hashCode());
        result = prime * result + ((getTrAdminGroupId() == null) ? 0 : getTrAdminGroupId().hashCode());
        result = prime * result + ((getUpfNotesEmail() == null) ? 0 : getUpfNotesEmail().hashCode());
        result = prime * result + ((getUpfDivision() == null) ? 0 : getUpfDivision().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", englishName=").append(englishName);
        sb.append(", chineseName=").append(chineseName);
        sb.append(", email=").append(email);
        sb.append(", fax=").append(fax);
        sb.append(", tel=").append(tel);
        sb.append(", locationCode=").append(locationCode);
        sb.append(", salutationCode=").append(salutationCode);
        sb.append(", departmentCode=").append(departmentCode);
        sb.append(", rankCode=").append(rankCode);
        sb.append(", status=").append(status);
        sb.append(", englishFirstName=").append(englishFirstName);
        sb.append(", englishLastName=").append(englishLastName);
        sb.append(", chineseFirstName=").append(chineseFirstName);
        sb.append(", chineseLastName=").append(chineseLastName);
        sb.append(", password=").append(password);
        sb.append(", passwordChangedDate=").append(passwordChangedDate);
        sb.append(", failCount=").append(failCount);
        sb.append(", lastLockTime=").append(lastLockTime);
        sb.append(", lastLogin=").append(lastLogin);
        sb.append(", version=").append(version);
        sb.append(", createdDate=").append(createdDate);
        sb.append(", createdUser=").append(createdUser);
        sb.append(", modifiedDate=").append(modifiedDate);
        sb.append(", modifiedUser=").append(modifiedUser);
        sb.append(", ldapPrincipal=").append(ldapPrincipal);
        sb.append(", efsUserId=").append(efsUserId);
        sb.append(", trAdminGroupId=").append(trAdminGroupId);
        sb.append(", upfNotesEmail=").append(upfNotesEmail);
        sb.append(", upfDivision=").append(upfDivision);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

}


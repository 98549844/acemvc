package com.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class RFncFunctionKey implements Serializable {
    @Column
    private String fncApplId;

    @Column
    private String fncParentFuncId;

    @Column
    private String fncFuncId;

    private static final long serialVersionUID = 1L;

    public String getFncApplId() {
        return fncApplId;
    }

    public void setFncApplId(String fncApplId) {
        this.fncApplId = fncApplId == null ? null : fncApplId.trim();
    }

    public String getFncParentFuncId() {
        return fncParentFuncId;
    }

    public void setFncParentFuncId(String fncParentFuncId) {
        this.fncParentFuncId = fncParentFuncId == null ? null : fncParentFuncId.trim();
    }

    public String getFncFuncId() {
        return fncFuncId;
    }

    public void setFncFuncId(String fncFuncId) {
        this.fncFuncId = fncFuncId == null ? null : fncFuncId.trim();
    }
}
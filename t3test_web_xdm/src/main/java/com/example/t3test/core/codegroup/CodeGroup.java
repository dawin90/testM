package com.example.t3test.core.codegroup;

import lombok.Data;

@Data
public class CodeGroup {
    private String codeGroupSeq;
    private String codeGroupName;
    private String codeGroupNameEng;
    private Integer codeGroupUseNY;
    private Integer codeGroupDelNY;
    private String codeGroupRegdate;
    private String codeGroupUpdate;

    public String getCodeGroupSeq() {
        return codeGroupSeq;
    }

    public void setCodeGroupSeq(String codeGroupSeq) {
        this.codeGroupSeq = codeGroupSeq;
    }

    public String getCodeGroupName() {
        return codeGroupName;
    }

    public void setCodeGroupName(String codeGroupName) {
        this.codeGroupName = codeGroupName;
    }

    public String getCodeGroupNameEng() {
        return codeGroupNameEng;
    }

    public void setCodeGroupNameEng(String codeGroupNameEng) {
        this.codeGroupNameEng = codeGroupNameEng;
    }

    public Integer getCodeGroupUseNY() {
        return codeGroupUseNY;
    }

    public void setCodeGroupUseNY(Integer codeGroupUseNY) {
        this.codeGroupUseNY = codeGroupUseNY;
    }

    public Integer getCodeGroupDelNY() {
        return codeGroupDelNY;
    }

    public void setCodeGroupDelNY(Integer codeGroupDelNY) {
        this.codeGroupDelNY = codeGroupDelNY;
    }

    public String getCodeGroupRegdate() {
        return codeGroupRegdate;
    }

    public void setCodeGroupRegdate(String codeGroupRegdate) {
        this.codeGroupRegdate = codeGroupRegdate;
    }

    public String getCodeGroupUpdate() {
        return codeGroupUpdate;
    }

    public void setCodeGroupUpdate(String codeGroupUpdate) {
        this.codeGroupUpdate = codeGroupUpdate;
    }
}

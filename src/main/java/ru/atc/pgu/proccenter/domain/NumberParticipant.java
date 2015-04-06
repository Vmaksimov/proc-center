package ru.atc.pgu.proccenter.domain;

import javax.persistence.*;

/**
 * User: vmaksimov
 */
@Entity
public class NumberParticipant {

    @Id
    private String regNo;

    @Column(columnDefinition = "boolean default false")
    private boolean isUsed;

    public boolean isUsed() {
        return isUsed;
    }

    public void setUsed(boolean isUsed) {
        this.isUsed = isUsed;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "schoolCode", referencedColumnName = "code")
    private School school;

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }
}

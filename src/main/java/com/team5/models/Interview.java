package com.team5.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "interview")
public class Interview {

    @Id
    @NotNull
    @Column(name = "ID")
    private long id;

    @NotNull
    @Basic
    @Column(name = "VACANCY_ID")
    private long idVacancy;

    @NotNull
    @Basic
    @Column(name = "CANDIDATE_ID")
    private long idCandidate;

    @Basic
    @Column(name = "PLAN_DATE")
    private Date planDate;

    @Basic
    @Column(name = "FACT_DATE")
    private Date factDate;

    public Date getPlanDate() {
        return planDate;
    }

    public void setPlanDate(Date planDate) {
        this.planDate = planDate;
    }

    public Date getFactDate() {
        return factDate;
    }

    public void setFactDate(Date factDate) {
        this.factDate = factDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdVacancy() {
        return idVacancy;
    }

    public void setIdVacancy(long idVacancy) {
        this.idVacancy = idVacancy;
    }

    public long getIdCandidate() {
        return idCandidate;
    }

    public void setIdCandidate(long idCandidate) {
        this.idCandidate = idCandidate;
    }

    public Interview(@NotNull long id, @NotNull long idVacancy, @NotNull long idCandidate, Date planDate, Date factnDate) {
        this.id = id;
        this.idVacancy = idVacancy;
        this.idCandidate = idCandidate;
        this.planDate = planDate;
        this.factDate = factnDate;
    }

    public Interview() {
    }
}

package com.example.softdelete.entity;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="bolum")
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
public class Bolum extends BaseEntity implements Serializable {

    @Column(name="bolum_adi")
    private String bolumAdi;

    @ManyToMany(mappedBy = "bolumList")
    private List<Universite> universiteList = new ArrayList<>();

    public Bolum() {

    }

    public Bolum(String bolumAdi) {
        this.bolumAdi = bolumAdi;
    }

    public String getBolumAdi() {
        return bolumAdi;
    }

    public void setBolumAdi(String bolumAdi) {
        this.bolumAdi = bolumAdi;
    }

    public List<Universite> getUniversiteList() {
        return universiteList;
    }

    public void setUniversiteList(List<Universite> universiteList) {
        this.universiteList = universiteList;
    }
}
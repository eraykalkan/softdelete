package com.example.softdelete.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="personel")
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
public class Personel extends BaseEntity implements Serializable {

    @Column(name="ad")
    private String ad;

    @OneToMany(
            mappedBy = "personel",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<PersonelGorev> personelGorevList=new ArrayList<>();

    public Personel() {

    }

    public Personel(String ad, List<PersonelGorev> personelGorevList) {
        this.ad = ad;
        this.personelGorevList = personelGorevList;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public List<PersonelGorev> getPersonelGorevList() {
        return personelGorevList;
    }

    public void setPersonelGorevList(List<PersonelGorev> personelGorevList) {
        this.personelGorevList = personelGorevList;
    }


    public void addGorev(PersonelGorev personelGorev) {
        personelGorevList.add(personelGorev);
        personelGorev.setPersonel(this);
    }

    public void removeGorev(PersonelGorev personelGorev) {
        personelGorevList.remove(personelGorev);
        personelGorev.setPersonel(null);
    }
}

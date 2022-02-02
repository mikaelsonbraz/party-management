package com.mikaelsonbraz.partymanagement.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Guest implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    public long id;

    public String name;

    public Integer numberCompanions;

    public String getName(){
        return this.name;
    }

    public Integer getNumberCompanions(){
        return  this.numberCompanions;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setNumberCompanions(Integer number){
        this.numberCompanions = number;
    }

}

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
}

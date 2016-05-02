package com.joseph.web.model;

import java.util.Date;

/**
 * Created by joseph on 01/05/2016.
 */

public class Person {

    private String name;

    private String prenom;

    private Date dateNaissance;

    public Person(String name, String prenom) {
        this.name = name;
        this.prenom = prenom;
        this.dateNaissance = new Date();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

}

package com.example.hibernatelearn;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="db")
public class SampleUsers {
    @Id
    private int uid;


    //@Transient
    //private String uname;
    private AllName name;
    private String ucolor;

    public SampleUsers() {

    }

    public SampleUsers(int uid, AllName name, String ucolor) {
        this.uid = uid;
        this.name = name;
        this.ucolor = ucolor;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUcolor() {
        return ucolor;
    }

    public void setUcolor(String ucolor) {
        this.ucolor = ucolor;
    }
    @Override
    public String toString() {
        return "SampleUsers{" +
                "uid=" + uid +
                ", uname='" + name + '\'' +
                ", ucolor='" + ucolor + '\'' +
                '}';
    }

    public AllName getName() {
        return name;
    }

    public void setName(AllName name) {
        this.name = name;
    }
}

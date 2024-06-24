package com.hibernate;

import javax.persistence.Embeddable;

@Embeddable
public class Certificate {
    private String course;
    private String duration;

    public Certificate(){
        super();
    }

    public Certificate(String course, String duration){
        this.course = course;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Certificate [course=" + course + ", duration=" + duration + "]";
    }
}

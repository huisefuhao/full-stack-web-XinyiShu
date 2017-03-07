package edu.infsci2560.models;

import java.net.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Entity
public class Masterpiece {
    
    public enum tag {
        Others,
        FamilyMeal,
        ValentineAtHome,
        SimpleButTasty,
        FitnessMeal
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected tag tag;
    protected String date;
    protected URL path;

    public Masterpiece() {
        this.id = Long.MAX_VALUE;
        this.tag = tag.Others;
        this.date = null;
        this.path = null;
    }
    
    public Masterpiece(Long id, tag tag, String date, URL path) {
        this.id = id;
        this.tag = tag;
        this.date = date;
        this.path = path;
    }

    @Override
    public String toString() {
        return "[ id=" + this.id + ", tag=" + this.tag + ", date=" + this.date + ", path=" + this.path + " ]";
    }

    @Override
    public boolean equals(Object other) {  
        return EqualsBuilder.reflectionEquals(this, other);
    }

    @Override
    public int hashCode() {  
        return HashCodeBuilder.reflectionHashCode(this);
    }

    public tag getTag() {
        return tag;
    }

    public void setTag(tag tag) {
        this.tag = tag;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    public URL getPath() {
        return path;
    }

    public void setPath(URL path) {
        this.path = path;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
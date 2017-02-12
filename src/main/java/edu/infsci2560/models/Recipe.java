package edu.infsci2560.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Entity
public class Recipe {
    public enum recipeType {
        Unknown,
        MeatLover,
        Vegetarian, 
        Baker,
        SweetTooth,
        Alcoholic,
        InstantGourmet
    }


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected String title;
    protected recipeType recipeType;
    
    public Recipe() {
        this.id = Long.MAX_VALUE;
        this.title = null;
        this.recipeType = recipeType.Unknown;
    }
    
    public Recipe(Long id, String name, recipeType recipeType) {
        this.id = id;
        this.title = name;
        this.recipeType = recipeType;
    }

    @Override
    public String toString() {
        return "[ id=" + this.id + ", title=" + this.title + ", workoutType=" + this.recipeType + " ]";
    }

    @Override
    public boolean equals(Object other) {       //???
        return EqualsBuilder.reflectionEquals(this, other);
    }

    @Override
    public int hashCode() {     //???
        return HashCodeBuilder.reflectionHashCode(this);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public recipeType getRecipeType() {
        return recipeType;
    }

    public void setRecipeType(recipeType recipeType) {
        this.recipeType = recipeType;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
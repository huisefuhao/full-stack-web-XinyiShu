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
        SuperMuscle,
        Alcoholic
    }


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected String title;
    protected recipeType recipeType;
    protected String procedure;
    
    public Recipe() {
        this.id = Long.MAX_VALUE;
        this.title = null;
        this.recipeType = recipeType.Unknown;
        this.procedure = null;
    }
    
    public Recipe(Long id, String name, recipeType recipeType, String proc) {
        this.id = id;
        this.title = name;
        this.recipeType = recipeType;
        this.procedure = proc;
    }

    @Override
    public String toString() {
        return "[ id=" + this.id + ", title=" + this.title + ", recipeType=" + this.recipeType + ", recipeProcedure=" + this.procedure + " ]";
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
    
    public String getProcedure() {
        return procedure;
    }

    public void setProcedure(String procedure) {
        this.procedure = procedure;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
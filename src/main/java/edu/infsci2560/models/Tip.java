package edu.infsci2560.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *
 * @author xinyi
 */
@Entity
public class Tip {

    //private static final long serialVersionUID = 1L;

    public enum category {
        Prep,
        Storing,
        Cooking,
        Cleaning,
        Others
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected category category;
    @Column(length = 4096)
    protected String cookingTips;

    public Tip() {
        this.id = Long.MAX_VALUE;
        this.category = category.Others;
        this.cookingTips = cookingTips;
    }

    public Tip(Long id, category category, String cookingTips) {
        this.id = id;
        this.category = category;
        this.cookingTips = cookingTips;
    }

    @Override
    public String toString() {
        return "[ id=" + this.id + ", category=" + this.category + ", cookingTips=" + this.cookingTips + " ]";
    }

    @Override
    public boolean equals(Object other) {
        return EqualsBuilder.reflectionEquals(this, other);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    /**
     * @return the category
     */
    public category getCategory() {
        return category;
    }

    /**
     * @param set the category
     */
    public void setCategory(category category) {
        this.category = category;
    }

    /**
     * @return the cookingTips
     */
    public String getCookingTips() {
        return cookingTips;
    }

    /**
     * @param set the cooking tips
     */
    public void setCookingTips(String cookingTips) {
        this.cookingTips = cookingTips;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

}
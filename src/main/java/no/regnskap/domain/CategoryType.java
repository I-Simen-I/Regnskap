package no.regnskap.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CATEGORY_TYPE")
public class CategoryType {

    @Id
    @Column(name = "CATEGORY_TYPE", nullable = false)
    private String categoryType;

    @Column(name = "NAME", nullable = false)
    private String name;

    public CategoryType(String categoryType, String name) {
        this.categoryType = categoryType;
        this.name = name;
    }

    public String getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(String categoryType) {
        this.categoryType = categoryType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object other) {
        boolean result = false;

        if (other instanceof CategoryType) {
            CategoryType otherCategoryType = (CategoryType) other;
            result = (this.categoryType.equals(otherCategoryType.categoryType));
        }

        return result;
    }

    @Override
    public int hashCode() {
        return categoryType != null ? categoryType.hashCode() : 0;
    }
}

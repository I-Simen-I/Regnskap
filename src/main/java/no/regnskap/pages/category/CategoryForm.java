package no.regnskap.pages.category;

import java.io.Serializable;

public class CategoryForm implements Serializable {

    private String user;

    private String categoryName;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}

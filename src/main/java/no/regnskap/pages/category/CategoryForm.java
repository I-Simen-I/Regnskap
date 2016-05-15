package no.regnskap.pages.category;

import no.regnskap.domain.Category;
import no.regnskap.domain.CategoryType;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class CategoryForm implements Serializable {

    private String user;
    private String categoryName;
    private String selectedCategoryType;
    private Map<String, CategoryType> categoryTypeMap;
    private List<String> categoryTypeListAsString;
    private List<Category> savedCategoryList;

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

    public String getSelectedCategoryType() {
        return selectedCategoryType;
    }

    public void setSelectedCategoryType(String selectedCategoryType) {
        this.selectedCategoryType = selectedCategoryType;
    }

    public Map<String, CategoryType> getCategoryTypeMap() {
        return categoryTypeMap;
    }

    public void setCategoryTypeMap(Map<String, CategoryType> categoryTypeSelectList) {
        this.categoryTypeMap = categoryTypeSelectList;
    }

    public List<String> getCategoryTypeListAsString() {
        return categoryTypeListAsString;
    }

    public void setCategoryTypeListAsString(List<String> categoryTypeListAsString) {
        this.categoryTypeListAsString = categoryTypeListAsString;
    }

    public List<Category> getSavedCategoryList() {
        return savedCategoryList;
    }

    public void setSavedCategoryList(List<Category> savedCategoryList) {
        this.savedCategoryList = savedCategoryList;
    }
}

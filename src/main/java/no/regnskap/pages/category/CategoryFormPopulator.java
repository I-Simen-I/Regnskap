package no.regnskap.pages.category;

import no.regnskap.domain.Category;
import no.regnskap.domain.CategoryType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CategoryFormPopulator {

    public void populateForm(CategoryForm form, List<Category> categoryList, List<CategoryType> categoryTypeList) {
        form.setSavedCategoryList(categoryList);
        form.setCategoryTypeMap(createCategoryTypes(categoryTypeList));
        form.setCategoryTypeListAsString(getCategoryNames(categoryTypeList));
    }

    public void resetForm(CategoryForm form, List<Category> categoryList) {
        form.setCategoryName(null);
        form.setSelectedCategoryType(null);
        form.setSavedCategoryList(categoryList);
    }

    private List<String> getCategoryNames(List<CategoryType> categoryTypeList) {
        List<String> categoryTypeNameList = new ArrayList<>();
        for (CategoryType type : categoryTypeList) {
            categoryTypeNameList.add(type.getName());
        }
        return categoryTypeNameList;
    }

    private Map<String, CategoryType> createCategoryTypes(List<CategoryType> categoryTypeList) {
        Map<String, CategoryType> map = new HashMap<>();
        for (CategoryType type : categoryTypeList) {
            map.put(type.getName(), type);
        }
        return map;
    }
}

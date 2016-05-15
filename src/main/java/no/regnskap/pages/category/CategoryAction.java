package no.regnskap.pages.category;

import no.regnskap.domain.Category;
import no.regnskap.domain.CategoryType;
import no.regnskap.pages.CommonAction;
import no.regnskap.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CategoryAction extends CommonAction {
    private CategoryForm form = new CategoryForm();
    private CategoryFormPopulator populator = new CategoryFormPopulator();

    @Autowired
    private CategoryService service;

    @Override
    public void onload() {
        populator.populateForm(form, service.getAllCategories(), service.getAllCategoryTypes());
    }

    public void save() {
        CategoryType categoryType = getForm().getCategoryTypeMap().get(getForm().getSelectedCategoryType());
        Category kategori = new Category(getForm().getCategoryName(), categoryType, new Date(), getUser());
        service.save(kategori);
        populator.resetForm(form, service.getAllCategories());
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Kategorien " + kategori.getName() + " er nå opprettet"));
    }

    public List<String> completeText(String query) {
        List<String> results = new ArrayList<>();
        for (Category kategori : getForm().getSavedCategoryList()) {
            if (kategori.getName().toLowerCase().startsWith(query.toLowerCase())) {
                results.add(kategori.getName());
            }
        }
        return results;
    }

    public CategoryForm getForm() {
        return form;
    }

    public void setService(CategoryService service) {
        this.service = service;
    }
}

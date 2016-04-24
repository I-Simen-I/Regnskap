package no.regnskap.pages.category;

import no.regnskap.domain.Category;
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

    private List<Category> categoryList;

    @Autowired
    private CategoryService service;

    @Override
    public void onload() {
        categoryList = service.findAll();
    }

    public void save() {
        Category kategori = new Category(getForm().getCategoryName(), new Date(), getUser());
        service.save(kategori);
        form.setCategoryName(null);
        categoryList = service.findAll();
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Kategorien " + kategori.getName() + " er nå opprettet"));
    }

    public List<String> completeText(String query) {
        List<String> results = new ArrayList<>();
        for (Category kategori : getCategoryList()) {
            if (kategori.getName().toLowerCase().startsWith(query.toLowerCase())) {
                results.add(kategori.getName());
            }
        }

        return results;
    }

    public CategoryForm getForm() {
        return form;
    }

    public List<Category> getCategoryList() {
        return categoryList;
    }

    public void setService(CategoryService service) {
        this.service = service;
    }
}

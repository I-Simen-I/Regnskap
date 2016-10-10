package no.regnskap.rest;

import no.regnskap.domain.Category;
import no.regnskap.domain.CategoryType;
import no.regnskap.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RequestMapping(value = "/api/")
@RestController
public class CategoryRestController {

    private final CategoryService categoryService;

    @Autowired
    public CategoryRestController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @RequestMapping(value = "/category/", method = RequestMethod.POST)
    public ResponseEntity<Void> save(@RequestBody Category category, UriComponentsBuilder ucBuilder) {
        if (categoryService.findById(category.getCategoryId()) != null) {
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }

        categoryService.save(category);

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setLocation(ucBuilder.path("/category/{id}").buildAndExpand(category.getCategoryId()).toUri());
        return new ResponseEntity<Void>(httpHeaders, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/category/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Category> findById(@PathVariable("id") long id) {
        Category category = categoryService.findById(id);

        if (category == null) {
            return new ResponseEntity<Category>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<Category>(category, HttpStatus.OK);
    }

    @RequestMapping(value = "/category/", method = RequestMethod.GET)
    public ResponseEntity<List<Category>> getAllCategories() {
        List<Category> categoryList = categoryService.getAllCategories();

        if (categoryList.isEmpty()) {
            return new ResponseEntity<List<Category>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Category>>(categoryList, HttpStatus.OK);
    }

    @RequestMapping(value = "/category/categoryType/", method = RequestMethod.GET)
    public ResponseEntity<List<CategoryType>> getAllCategoryTypes() {
        List<CategoryType> categoryTypeList = categoryService.getAllCategoryTypes();

        if (categoryTypeList.isEmpty()) {
            return new ResponseEntity<List<CategoryType>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<CategoryType>>(categoryTypeList, HttpStatus.OK);
    }
}

package com.shoping;


import com.shoping.models.CategoryRepository;
import com.shoping.models.PageRepository;
import com.shoping.models.data.Category;
import com.shoping.models.data.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@ControllerAdvice
public class Common {

    @Autowired
    private PageRepository pageRepo;

    @Autowired
    private CategoryRepository categoryRepo;

    @ModelAttribute
    public void sharedData(Model model){

        List<Page> pages = pageRepo.findAllByOrderBySortingAsc();

        List<Category> categories = categoryRepo.findAll();

        model.addAttribute("cpages", pages);
        model.addAttribute("ccategories", categories);
    }
}

package com.shoping.controllers;


import com.shoping.models.CategoryRepository;
import com.shoping.models.data.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin/categories")
public class AdminCategoriesController {


    @Autowired
    private CategoryRepository categoryRepo;


    @GetMapping
    public String index(Model model) {

        List<Category> categories = categoryRepo.findAll();

        model.addAttribute("categories", categories);

        return "admin/categories/index";

    }


//    @ModelAttribute("category")
//    public Category getCategory(){
//        return new Category();
//    }



    @GetMapping("/add")
    public String add(Category category) {
        return "admin/categories/add";
    }
}

package smpark.springframework.recipeapp.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import smpark.springframework.recipeapp.domain.Category;
import smpark.springframework.recipeapp.domain.UnitOfMeasure;
import smpark.springframework.recipeapp.repositories.CategoryRepository;
import smpark.springframework.recipeapp.repositories.UnitOfMeasureRepository;
import smpark.springframework.recipeapp.services.RecipeService;

import java.util.Optional;

@Slf4j
@Controller
public class IndexController {
  private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model){
        log.debug("Getting index page");
       model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}

package edu.infsci2560.controllers;

import edu.infsci2560.models.Recipe;
import edu.infsci2560.repositories.RecipeRepository;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author xinyi
 */
@Controller
public class RecipeEditController {
    @Autowired
    private RecipeRepository repository;
    
//    @RequestMapping(value = "recipes/edit/{id}", method = RequestMethod.GET)
//    public ModelAndView index(@PathVariable Long id) { 
//        Recipe recipe = repository.findOne(id);
//        return new ModelAndView("recipeEdit", "recipe", recipe);
//    }
//    
//    @RequestMapping(value = "recipe/edit/{id}", method = RequestMethod.PUT, consumes="application/x-www-form-urlencoded", produces = "application/json")
//    public String update( @Valid Recipe recipe, BindingResult result) {
//        repository.save(recipe);
//        return "redirect:/recipes";
//    }

    @RequestMapping(value = "recipes/edit/{id}", method = RequestMethod.GET)
    public ModelAndView index(@PathVariable Long id) { 
        Recipe recipe = repository.findOne(id);
        return new ModelAndView("recipeEdit", "recipe", recipe);
    }
    
    @RequestMapping(value = "recipes/edit/{id}", method = RequestMethod.PUT, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public ModelAndView update( @Valid Recipe recipe, BindingResult result) {
        repository.save(recipe);
//        return "redirect:/recipes";
        return new ModelAndView("recipe", "recipes", repository.findAll());
    } 
}
package edu.infsci2560.controllers;

import edu.infsci2560.models.Tip;
import edu.infsci2560.repositories.TipRepository;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author xinyi
 */
@Controller
public class TipController {
    @Autowired
    private TipRepository repository;
    
    @RequestMapping(value = "tip", method = RequestMethod.GET)
    public ModelAndView index() {        
        return new ModelAndView("tip", "tip", repository.findAll());
    }
    
    @RequestMapping(value = "tip/add", method = RequestMethod.POST, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public ModelAndView create(@ModelAttribute @Valid Tip tip, BindingResult result) {
        repository.save(tip);
        return new ModelAndView("tip", "tip", repository.findAll());
    }
    
}
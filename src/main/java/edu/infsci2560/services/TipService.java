package edu.infsci2560.services;

import edu.infsci2560.models.Tip;
import edu.infsci2560.models.Tip.Category;
import edu.infsci2560.repositories.TipRepository;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.concurrent.atomic.AtomicInteger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author xinyi
 */
@RestController
@RequestMapping("/public/api/tip")
public class TipService {

    @Autowired
    private TipRepository repository;

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Iterable<Tip>> list() {
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(repository.findAll(), headers, HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Tip> list(@PathVariable("id") Long id) {
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(repository.findOne(id), headers, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, consumes="application/json", produces = "application/json")
    public ResponseEntity<Tip> create(@RequestBody Tip tips) {
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(repository.save(tips), headers, HttpStatus.OK);
    }
}
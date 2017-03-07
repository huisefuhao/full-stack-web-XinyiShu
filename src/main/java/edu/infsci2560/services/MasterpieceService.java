package edu.infsci2560.services;

import edu.infsci2560.models.Masterpiece;
import edu.infsci2560.models.Masterpiece.tag;
import edu.infsci2560.repositories.MasterpieceRepository;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
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
@RequestMapping("/public/api/masterpiece")
public class MasterpieceService {

    @Autowired
    private MasterpieceRepository repository;

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Iterable<Masterpiece>> list() {
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(repository.findAll(), headers, HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Masterpiece> list(@PathVariable("id") Long id) {
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(repository.findOne(id), headers, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, consumes="application/json", produces = "application/json")
    public ResponseEntity<Masterpiece> create(@RequestBody Masterpiece masterpiece) {
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(repository.save(masterpiece), headers, HttpStatus.OK);
    }
}
package com.dhanush.springproject.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.dhanush.springproject.model.load;
import com.dhanush.springproject.repository.loadRepository;
import com.dhanush.springproject.services.loadService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
public class loadController {

    @Autowired
    private loadService loadservice;
    private final loadRepository loadrepository;

    //constructor. we should create this constructor as soon as we initialize the objects(loadservice and loadrepository)
    public loadController(loadService loadservice, loadRepository loadrepository) {
        this.loadservice = loadservice;
        this.loadrepository = loadrepository;
    }

    public List<load> getAllLoads() {
        return loadservice.getAllLoads();
    }

    @GetMapping("/load")
    public List<load> getLoadsByShipperId(@RequestParam UUID shipperId) {
        return loadrepository.findByShipperId(shipperId);
    }

    @GetMapping("/load/{loadId}")
    public load getLoads(@PathVariable long loadId) {
        return this.loadservice.getLoads(loadId);
    }

    @PostMapping("/load")
    public String addLoad(@RequestBody load Load) {
        this.loadservice.addLoad(Load);        
        return "load details added succesfully";
    }

    @PutMapping("load/{loadId}")
    public load updateLoad(@RequestBody load Load) {
        return this.loadservice.updateLoad(Load);
    }

    @DeleteMapping("/load/{loadId}")
    public ResponseEntity<HttpStatus> deleteLoad(@PathVariable String loadId){
        try{
            this.loadservice.deleteLoad(Long.parseLong(loadId));
            return new ResponseEntity<>(HttpStatus.OK);
        } catch(Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}

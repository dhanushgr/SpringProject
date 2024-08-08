package com.dhanush.springproject.controller;

import java.util.List;
import java.util.UUID;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.dhanush.springproject.model.load;
import com.dhanush.springproject.repository.loadRepository;
import com.dhanush.springproject.services.loadService;
import com.dhanush.springproject.exception.LoadApiNotFoundException;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class loadController {

    @Autowired
    private final loadService loadservice;
    private final loadRepository loadrepository;

    //constructor. we should create this constructor as soon as we initialize the objects(loadservice and loadrepository)
    public loadController(loadService loadservice, loadRepository loadrepository) {
        this.loadservice = loadservice;
        this.loadrepository = loadrepository;
    }

    @GetMapping("/load")
    public ResponseEntity<List<load>> getAllLoads() {
        List<load> loadData = this.loadservice.getAllLoads();
        if (loadData.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(loadData, HttpStatus.OK);
    }

    @GetMapping("/load/shipperId/{shipperId}")
    public ResponseEntity<List<load>> getLoadsByShipperId(@PathVariable String shipperId) {
        List<load> loadData = loadrepository.findByShipperId(UUID.fromString(shipperId));
        if (loadData.isEmpty()) {
            throw new LoadApiNotFoundException("Not found Load with shipperId = " + shipperId);
        }
        return new ResponseEntity<>(loadData, HttpStatus.OK);
    }

    @GetMapping("/load/{loadId}")
    public ResponseEntity<load> getLoad(@PathVariable long loadId) {
        load loadData = this.loadservice.getLoad(loadId);
        return new ResponseEntity<>(loadData, HttpStatus.OK);
    }

    @PostMapping("/load")
    public ResponseEntity<load> addLoad(@RequestBody load Load) {
        load _load = this.loadservice.addLoad(Load);
        return new ResponseEntity<>(_load, HttpStatus.CREATED);
    }

    @PutMapping("load/{loadId}")
    public ResponseEntity<load> updateLoad(@PathVariable long loadId, @RequestBody load loadBody) {
        load _updatedLoad = this.loadservice.updateLoad(loadId, loadBody);
        return new ResponseEntity<>(_updatedLoad, HttpStatus.OK);
    }

    @DeleteMapping("/load/{loadId}")
    public ResponseEntity<HttpStatus> deleteLoad(@PathVariable long loadId){
        this.loadservice.deleteLoad(loadId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

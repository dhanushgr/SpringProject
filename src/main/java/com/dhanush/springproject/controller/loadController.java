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

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/load")
    public ResponseEntity<List<load>> getAllLoads() {
        try {
            List<load> loadData = this.loadservice.getAllLoads();
            if (loadData.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
            return new ResponseEntity<>(loadData, HttpStatus.OK);
        } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/load/shipperId/{shipperId}")
    public ResponseEntity<List<load>> getLoadsByShipperId(@PathVariable String shipperId) {
        try {
            List<load> loadData = loadrepository.findByShipperId(UUID.fromString(shipperId));
            if (loadData.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
            return new ResponseEntity<>(loadData, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/load/{loadId}")
    public ResponseEntity<load> getLoads(@PathVariable long loadId) {
        try {
            Optional<load> loadData = this.loadservice.getLoads(loadId);
            if (loadData.isPresent()) {
                return new ResponseEntity<>(loadData.get(), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/load")
    public ResponseEntity<load> addLoad(@RequestBody load Load) {
        try {
            load _load = this.loadservice.addLoad(Load);
            return new ResponseEntity<>(_load, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("load/{loadId}")
    public ResponseEntity<load> updateLoad(@RequestBody load Load) {
        try{
            load _load = this.loadservice.updateLoad(Load);
            return new ResponseEntity<>(_load, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
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

package com.dhanush.springproject.services;

import java.util.List;
import java.util.UUID;
import java.util.Optional;

import com.dhanush.springproject.exception.LoadApiNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhanush.springproject.model.load;
import com.dhanush.springproject.repository.loadRepository;

@Service
public class loadServiceImplementation implements loadService{

    @Autowired
    private loadRepository loadrepository;

    @Override
    public List<load> getAllLoads() {
        return loadrepository.findAll();
    }

    @Override
    public load getLoad(long loadId){
        String notFoundMessage = "Not found Load with loadId = " + Long.toString(loadId);
        return loadrepository.findById(loadId)
                .orElseThrow(() -> new LoadApiNotFoundException(notFoundMessage));
    }

    @Override
    public load addLoad(load Load){
        loadrepository.save(Load);
        return Load;
    }

    @Override
    public load updateLoad(load Load){
        loadrepository.save(Load);
        return Load;
    }

    @Override
    public void deleteLoad(long loadId){
        loadrepository.deleteById(loadId);
    }
}
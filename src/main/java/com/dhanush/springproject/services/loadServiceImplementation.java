package com.dhanush.springproject.services;

import java.util.List;
import java.util.UUID;

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
    public load getLoads(long loadId){
        return loadrepository.getReferenceById(loadId);
    }

    @Override
    public List<load> getLoadsByShipperId(UUID shipperId){
        return loadrepository.findByShipperId(shipperId);
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
    public void deleteLoad(long parseLong){
        load entity = loadrepository.getReferenceById(parseLong);
        loadrepository.delete(entity);
    }
}
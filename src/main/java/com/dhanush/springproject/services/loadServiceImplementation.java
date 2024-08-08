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
    public load updateLoad(long loadId, load loadBody){
        String notFoundMessage = "Unable to update: Not found Load with loadId = " + Long.toString(loadId);
        load loadDetail = loadrepository.findById(loadId)
                .orElseThrow(() -> new LoadApiNotFoundException(notFoundMessage));

        // Update the loadDetail with new load details
        loadDetail.setDate(loadBody.getDate());
        loadDetail.setLoadingPoint(loadBody.getLoadingPoint());
        loadDetail.setNoOfTrucks(loadBody.getNoOfTrucks());
        loadDetail.setProductType(loadBody.getProductType());
        loadDetail.setTruckType(loadBody.getTruckType());
        loadDetail.setUnloadingPoint(loadBody.getUnloadingPoint());
        loadDetail.setWeight(loadBody.getWeight());
        loadDetail.setComment(loadBody.getComment());

        return loadrepository.save(loadDetail);
    }

    @Override
    public void deleteLoad(long loadId){
        loadrepository.deleteById(loadId);
    }
}
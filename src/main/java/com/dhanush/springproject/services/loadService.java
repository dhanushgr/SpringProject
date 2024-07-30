package com.dhanush.springproject.services;

import java.util.List;
import java.util.UUID;

import com.dhanush.springproject.model.load;

public interface loadService {

    public List<load> getAllLoads();

    public load getLoads(long loadId);

    public List<load> getLoadsByShipperId(UUID shipperId);

    public load addLoad(load Load);

    public load updateLoad(load Load);

    public void deleteLoad(long parseLong);
}
package com.dhanush.springproject.services;

import java.util.List;
import java.util.UUID;
import java.util.Optional;


import com.dhanush.springproject.model.load;

public interface loadService {

    public List<load> getAllLoads();

    public load getLoad(long loadId);

    public load addLoad(load Load);

    public load updateLoad(load Load);

    public void deleteLoad(long loadId);
}
package com.gulshan.App.service;

import com.gulshan.App.model.Laptop;
import com.gulshan.App.repo.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    @Autowired
    private LaptopRepository repo;

    public void addLaptop(Laptop lap){
        repo.save(lap);
    }
    public boolean isGoodForProp(Laptop lap){
        return true;
    }
}

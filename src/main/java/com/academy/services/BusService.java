package com.academy.services;

import com.academy.entities.Bus;

import java.util.ArrayList;
import java.util.List;

public class BusService {
    private List<Bus> buses;
    private BusService singleton;

    private BusService() {
        buses = new ArrayList<>();
    }

    public BusService getInstance() {
        if (singleton == null) {
            singleton = new BusService();
        }
        return singleton;
    }
}

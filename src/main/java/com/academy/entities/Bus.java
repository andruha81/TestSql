package com.academy.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bus {
    private long id;
    private String model;
    private Company company;
}

package com.academy.services;

import com.academy.entities.Bus;
import com.academy.entities.Company;

import java.util.ArrayList;
import java.util.List;

public class CompanyService {
    private List<Company> companies;
    private CompanyService singleton;

    private CompanyService() {
        companies = new ArrayList<>();
    }

    public CompanyService getInstance() {
        if (singleton == null) {
            singleton = new CompanyService();
        }
        return singleton;
    }
}

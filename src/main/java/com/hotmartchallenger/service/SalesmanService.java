package com.hotmartchallenger.service;

import com.hotmartchallenger.repository.SalesmanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalesmanService {

    @Autowired
    private SalesmanRepository salesmanRepository;

}

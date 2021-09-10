package com.hotmartchallenger.service;

import com.hotmartchallenger.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaleService {

    @Autowired
    private SaleRepository saleRepository;
}

package com.hotmartchallenger.service;

import com.hotmartchallenger.repository.PurchaserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PurchaserService {

    @Autowired
    private PurchaserRepository purchaserRepository;
}

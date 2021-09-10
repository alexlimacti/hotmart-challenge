package com.hotmartchallenger.service;

import com.hotmartchallenger.repository.ProductCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductCategoryService {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

}

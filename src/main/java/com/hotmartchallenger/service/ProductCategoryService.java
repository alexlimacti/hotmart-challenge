package com.hotmartchallenger.service;

import com.hotmartchallenger.model.ProductCategory;
import com.hotmartchallenger.repository.ProductCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductCategoryService {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    public Page<ProductCategory> findAll(Pageable pageable) {
        return productCategoryRepository.findAll(pageable);
    }

    public <S extends ProductCategory> S save(S s) {
        return productCategoryRepository.save(s);
    }

    public Optional<ProductCategory> findById(Long aLong) {
        return productCategoryRepository.findById(aLong);
    }

    public void deleteById(Long aLong) {
        productCategoryRepository.deleteById(aLong);
    }
}

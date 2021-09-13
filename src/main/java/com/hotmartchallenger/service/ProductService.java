package com.hotmartchallenger.service;

import com.hotmartchallenger.dto.GetProductDTO;
import com.hotmartchallenger.dto.SetProductDTO;
import com.hotmartchallenger.exception.EntityNotFoundException;
import com.hotmartchallenger.mapper.ProductMapper;
import com.hotmartchallenger.model.Product;
import com.hotmartchallenger.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductCategoryService productCategoryService;

    @Autowired
    private ProductMapper productMapper;

    public static final String MSG_CATEGORY_NOT_FOUND = "There is no code category %d";

    public Page<Product> findAll(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    public GetProductDTO save(SetProductDTO productDTO) {

        var category = productCategoryService.findById(productDTO.getCategory()).orElseThrow(() -> new EntityNotFoundException(MSG_CATEGORY_NOT_FOUND));

        Product product = Product.builder()
                .name(productDTO.getName())
                .description(productDTO.getDescription())
                .productCategory(category)
                .creationDate(LocalDate.now())
                .build();

        return productMapper.getProductDto(productRepository.save(product));
    }

    public Optional<Product> findById(Long aLong) {
        return productRepository.findById(aLong);
    }

    public void deleteById(Long aLong) {
        productRepository.deleteById(aLong);
    }
}

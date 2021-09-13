package com.hotmartchallenger.mapper;

import com.hotmartchallenger.dto.GetProductDTO;
import com.hotmartchallenger.dto.SetProductDTO;
import com.hotmartchallenger.model.Product;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    @Autowired
    private ModelMapper modelMapper;

    public Product getProduct(SetProductDTO productDTO){
        Product product = modelMapper.map(productDTO, Product.class);
        return product;
    }

    public GetProductDTO getProductDto(Product product){
        GetProductDTO productDTO = modelMapper.map(product, GetProductDTO.class);
        productDTO.setCategory(product.getProductCategory().getName());
        return productDTO;
    }
}

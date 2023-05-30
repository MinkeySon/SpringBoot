package com.springboot.w3_pt.service;

import com.springboot.w3_pt.data.dto.ProductDto;
import com.springboot.w3_pt.data.dto.ProductResponseDto;

public interface ProductService {
    ProductResponseDto getProduct(Long number);
    ProductResponseDto saveProduct(ProductDto productDto);
    ProductResponseDto changeProductName(Long number, String name)throws Exception ;
    void deleteProduct(Long number) throws Exception;
}

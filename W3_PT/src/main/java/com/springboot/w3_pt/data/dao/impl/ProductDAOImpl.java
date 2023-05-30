package com.springboot.w3_pt.data.dao.impl;

import com.springboot.w3_pt.data.dao.ProductDAO;
import com.springboot.w3_pt.data.entity.Product;
import com.springboot.w3_pt.data.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Optional;
@Component // 해당 클래스를 스프링이 관리하는 빈으로 등록하려면 @Component 또는 @Service 어노테이션 추가해야함.(필수)
public class ProductDAOImpl implements ProductDAO {
    private final ProductRepository productRepository;
    @Autowired
    public ProductDAOImpl(ProductRepository productRepository){
        this.productRepository = productRepository;
    }
    @Override
    public Product insertProduct(Product product){
        Product savedProduct = productRepository.save(product);
        return savedProduct;
    }
    @Override
    public Product selectProduct(Long number){
        Product selectProduct = productRepository.getById(number);
        return selectProduct;
    }
    @Override
    public Product updateProductName(Long number, String name) throws Exception {
        Optional<Product> selectedProduct = productRepository.findById(number);
        //Optional은 NullPointerException 회피

        Product updatedProduct;
        if(selectedProduct.isPresent()){
            Product product = selectedProduct.get();

            product.setName(name);
            product.setUpdateAt(LocalDateTime.now());

            updatedProduct = productRepository.save(product);
        }else{
            throw new Exception();
        }
        return updatedProduct;
    }
    @Override
    public void deleteProduct(Long number)throws Exception{
        Optional<Product> selectedProduct = productRepository.findById(number);

        if(selectedProduct.isPresent()){
            Product product = selectedProduct.get();

            productRepository.delete(product);
        }else{
            throw new Exception();
        }

    }

}

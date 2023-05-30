package com.springboot.w3_pt.data.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ProductDto {
    private String name;
    private int price;
    private int stock;

    public ProductDto(String name, int price, int stock){
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
}

package com.springboot.w3_pt.data.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ProductResponseDto {
    private Long number;
    private String name;
    private int price;
    private int stock;
    public ProductResponseDto(){}

    public ProductResponseDto(Long number, String name, int price, int stock){
        this.number = number;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
}

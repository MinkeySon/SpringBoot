package com.springboot.w3_pt.data.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ChangeProductNameDto {
    private Long number;
    private String name;

    public ChangeProductNameDto(Long number, String name){
        this.number = number;
        this.name = name;
    }
    public ChangeProductNameDto(){}

}

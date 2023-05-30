package com.springboot.w3_pt.data.entity;

import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity //Entity 명시 어노테이션
@Table(name="product") //테이블 명 명시 어노테이션 없으면 class 이름임.
public class Product {
    @Id // 모든 Entity는 @Id 어노테이션 필수!
    @GeneratedValue(strategy = GenerationType.IDENTITY) // @Id 어노테이션과 같이 사용됨. 해당 필드의 값을 어떤 방식으로 자동으로 생성할 지 결정.
    private Long number;
    @Column(nullable=false)
    private String name;
    @Column(nullable = false)
    private Integer stock;
    @Column(nullable = false)
    private Integer price;

    // pk인 number, null 허용 안하는 String name, Integer stock, Integer price

    private LocalDateTime createAt;
    private LocalDateTime updateAt;
}

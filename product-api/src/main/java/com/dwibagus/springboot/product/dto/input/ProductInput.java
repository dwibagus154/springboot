package com.dwibagus.springboot.product.dto.input;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ProductInput {
    private String name;
    private Long category;
    private  Double price;
}

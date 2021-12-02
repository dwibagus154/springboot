package com.dwibagus.springboot.product.dto.output;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ProductOutput {
    private Long id;
    private String name;
    private Long category;
    private Double price;
}

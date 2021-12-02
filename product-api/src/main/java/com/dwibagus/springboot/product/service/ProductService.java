package com.dwibagus.springboot.product.service;

import com.dwibagus.springboot.product.dto.input.ProductInput;
import com.dwibagus.springboot.product.dto.output.ProductOutput;

import java.awt.print.Pageable;
import java.util.List;

public interface ProductService {
    ProductOutput getOne(Long id);

    List<ProductOutput> getAll(Pageable pageable);

    void addOne(ProductInput input);

    void deleteOne(Long id);

    List<ProductOutput> getAllByName(String name, Pageable pageable);

    List<ProductOutput> getAllByCategoryId(Long categoryId);
}

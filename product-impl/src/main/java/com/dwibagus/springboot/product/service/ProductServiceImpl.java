package com.dwibagus.springboot.product.service;

import com.dwibagus.springboot.product.dto.input.ProductInput;
import com.dwibagus.springboot.product.dto.output.ProductOutput;
import com.dwibagus.springboot.product.model.Product;
import com.dwibagus.springboot.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    private ModelMapper modelMapper;

    @Override
    public ProductOutput getOne(Long id){
        return null;
    }
    @Override
    public List<ProductOutput> getAll(Pageable pageable){
        return null;
    }
    @Override
    public void addOne(ProductInput input){
        Product product = Product
                .builder()
                .name(input.getName())
                .category(input.getCategory())
                .price(input.getPrice())
                .build();
        this.productRepository.save(product);
    }
    @Override
    public void deleteOne(Long id){}


    @Override
    public List<ProductOutput> getAllByName(String name, Pageable pageable){
        return null;
    }

    @Override
    public List<ProductOutput> getAllByCategoryId(Long categoryId){
        return null;
    }

}

package com.dwibagus.springboot.product.controller;


import com.dwibagus.springboot.product.dto.input.ProductInput;
import com.dwibagus.springboot.product.dto.output.ProductOutput;
import com.dwibagus.springboot.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;
import java.util.List;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

    private  final ProductService productService;
//    @GetMapping("{id}")
//    public ResponseEntity<ProductOutput> getOne(@PathVariable long id){
//        return ResponseEntity.ok(ProductOutput.builder().build());
//    }
//
//    @GetMapping
//    public ResponseEntity<List<ProductOutput>> getAll(){
//        return ResponseEntity.ok(null);
//    }
//
//    @PostMapping
//    public ResponseEntity<ProductOutput> getOne(ProductInput productInput){
//        return ResponseEntity.ok(ProductOutput.builder().build());
//    }

    @GetMapping("{id}")
    public ProductOutput getOne(@PathVariable long id){
        return productService.getOne(id);
    }

    @GetMapping
    public List<ProductOutput> getAll(Pageable pageable){
        return productService.getAll(pageable);
    }

//    @PostMapping
//    public ResponseEntity<ProductOutput> getOne(ProductInput productInput){
//        return ResponseEntity.ok(ProductOutput.builder().build());
//    }

    @PostMapping
    public String addOne(@RequestBody ProductInput productInput){

        productService.addOne(productInput);
        return  "contoh";
    }
}

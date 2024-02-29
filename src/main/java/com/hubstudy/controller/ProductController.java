package com.hubstudy.controller;

import com.hubstudy.dto.product.requests.ProductCreateRequest;
import com.hubstudy.entities.Product;
import com.hubstudy.services.ProductService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
@AllArgsConstructor
@NoArgsConstructor
public class ProductController {

    private ProductService productService;

    @PostMapping("/create")
    public Product create(@RequestBody ProductCreateRequest productCreateRequest){
        return productService.create(productCreateRequest);
    }
    @GetMapping("/{product}")
    public Product getById(@PathVariable("productId") Integer productId){
        return productService.getByID(productId);
    }
}

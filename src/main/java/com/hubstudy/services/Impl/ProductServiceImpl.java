package com.hubstudy.services.Impl;

import com.hubstudy.core.mapper.ModelMapperService;
import com.hubstudy.dto.product.requests.ProductCreateRequest;
import com.hubstudy.entities.Product;
import com.hubstudy.repository.ProductRepository;
import com.hubstudy.services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {
    private ModelMapperService modelMapperService;
    private ProductRepository productRepository;
    @Override
    public Product create(ProductCreateRequest productCreateRequest) {
        Product createdProduct = modelMapperService.forRequest()
                .map(productCreateRequest, Product.class);
        return productRepository.save(createdProduct);
    }

    @Override
    public Product getByID(Integer productId) {
        return productRepository.findById(productId).orElseThrow(()-> new RuntimeException("böyle bir id yok"));
    }
}

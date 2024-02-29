package com.hubstudy.services;

import com.hubstudy.dto.product.requests.ProductCreateRequest;
import com.hubstudy.entities.Product;

public interface ProductService {
    Product create(ProductCreateRequest productCreateRequest);
    Product getByID(Integer productId);
}

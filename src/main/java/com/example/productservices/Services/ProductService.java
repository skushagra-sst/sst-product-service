package com.example.productservices.Services;

import com.example.productservices.DTO.FakeStoreDto;
import com.example.productservices.Models.Product;

import java.util.List;

public interface ProductService {
    List<FakeStoreDto> getAllProducts(String limit, String sort) throws Exception;

    FakeStoreDto getSingleProduct(Long id) throws Exception;

    Product upsertProduct(Product product);

    void deleteProduct(Long id);

    List<FakeStoreDto> getProductOfCategory(String productCategory);

    FakeStoreDto createProduct(FakeStoreDto product);

    void updateProduct(Long id, FakeStoreDto product);

    String[] getAllCategory();
}

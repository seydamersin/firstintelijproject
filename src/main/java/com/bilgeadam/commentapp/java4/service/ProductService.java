package com.bilgeadam.commentapp.java4.service;

import com.bilgeadam.commentapp.java4.repository.IProductRepository;
import com.bilgeadam.commentapp.java4.repository.entity.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final IProductRepository productRepository;

    public void saveAll(List<Product> products) {

        productRepository.saveAll(products);
    }


}

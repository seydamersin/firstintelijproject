package com.bilgeadam.commentapp.java4.controller;

import com.bilgeadam.commentapp.java4.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    /**   @GetMapping("/gthan") public ResponseEntity<List<Product>> gthan(double price) {
    return ResponseEntity.ok(productService.findAllByGreaterThan(price));
    }

     @GetMapping("/expirationdatebefore") public ResponseEntity<List<Product>> expirationDateBefore(LocalDate date) {
     return ResponseEntity.ok(productService.findAllByExpirationDate(expirationDate));
     }

     @GetMapping("/expirationdatebefore") public ResponseEntity<List<Product>> expirationDateBefore2(LocalDate date) {
     return ResponseEntity.ok(productService.findAllByExpirationDate(expirationDate));
     }**/

}

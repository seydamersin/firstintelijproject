package com.bilgeadam.commentapp.java4.repository;

import com.bilgeadam.commentapp.java4.repository.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAllByPriceGreaterThan(double price);

    List<Product> findAllByExpirationDateBefore(LocalDate date);

    List<Product> findAllByExpirationDateAfterOr();

}

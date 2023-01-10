package com.bilgeadam.commentapp.java4.repository;

import com.bilgeadam.commentapp.java4.repository.entity.ProductComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductCommentRepository extends JpaRepository<ProductComment, Long> {
}

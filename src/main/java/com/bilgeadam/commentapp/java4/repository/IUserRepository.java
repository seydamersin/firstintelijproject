package com.bilgeadam.commentapp.java4.repository;

import com.bilgeadam.commentapp.java4.repository.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IUserRepository extends JpaRepository<User, Long> {
    List<User> findAllByOrderByName();

    //   User findByNameAndSurname(String name, String surname);

    Optional<List<User>> findAllOptionalByNameContainingIgnoreCase(String value);

    Optional<List<User>> findAllOptionalByEmailContainingIgnoreCase(String value);


    Optional<List<User>> findAllOptionalByEmailEndingWithIgnoreCase(String value);

    @Query(value = "select * from tbl_user as u where u.email.=?1 and u.password=?2", nativeQuery = true)
    Optional<User> findOptionalByEmailAndPassword(String email, String password);

    @Query(value = "select * from tbl_user as u where u.email=?1 and u.password=?2", nativeQuery = true)
    Optional<User> findOptionalByEmailAndPassword2(String email, String password);

    @Query(value = "select * from tbl_user as u where u.email=:email and u.password=:password", nativeQuery = true)
    Optional<User> findOptionalByEmailAndPassword3(@Param("email") String email, @Param("password") String password);

    @Query("select u from User  u where length( u.password)> ?1")
    List<User> controlPassword(int length);

    @Query("select u from User  u where length( u.password)>:x")
    List<User> controlPassword2(@Param("x") int length);

}

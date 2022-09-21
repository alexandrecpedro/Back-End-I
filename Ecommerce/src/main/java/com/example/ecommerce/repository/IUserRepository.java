package com.example.ecommerce.repository;

import com.example.ecommerce.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
@Transactional
public interface IUserRepository extends JpaRepository<UserEntity, Integer> {
    /** Method **/
    Optional<UserEntity> findByUsername(String username);
}

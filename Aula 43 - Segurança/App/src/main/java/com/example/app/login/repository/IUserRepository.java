package com.example.app.login.repository;

import com.example.app.login.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
@Transactional
public interface IUserRepository extends JpaRepository<AppUser, Long> {
    /** Method **/
    Optional<AppUser> findByEmail(String email);
}

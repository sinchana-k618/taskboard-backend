package com.taskboard.taskboard_backend;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {

    Optional<User> findByemail(String email);
    boolean existsByemail(String email);

}

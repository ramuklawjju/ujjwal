package com.ujjwal.repository;

import com.ujjwal.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * @author ujjwal
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
}

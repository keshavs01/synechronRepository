package com.synechron.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.synechron.entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {

	Users findByEmailIdAndPassword(String email, String password);

}

package com.piggymetrics.jwt.repository;

import com.piggymetrics.jwt.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User,String> {

    User findByUsername(final String username);
}

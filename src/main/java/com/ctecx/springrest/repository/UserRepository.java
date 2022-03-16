package com.ctecx.springrest.repository;

import com.ctecx.springrest.usermodel.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Integer> {
}

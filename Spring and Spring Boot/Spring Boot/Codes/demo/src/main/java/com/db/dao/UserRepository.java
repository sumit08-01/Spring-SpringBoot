package com.db.dao;

import org.springframework.data.repository.CrudRepository;

import com.db.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}

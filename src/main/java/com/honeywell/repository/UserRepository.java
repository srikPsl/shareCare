package com.honeywell.repository;

import com.honeywell.demo.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by gundubos on 27/07/19.
 */
public interface UserRepository extends CrudRepository<Integer, User> {
}

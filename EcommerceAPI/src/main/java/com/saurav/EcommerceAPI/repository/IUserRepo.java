package com.saurav.EcommerceAPI.repository;

import com.saurav.EcommerceAPI.model.User;
import org.springframework.data.repository.CrudRepository;

public interface IUserRepo extends CrudRepository<User,Integer> {
}

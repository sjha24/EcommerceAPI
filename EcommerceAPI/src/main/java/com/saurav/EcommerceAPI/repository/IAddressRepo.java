package com.saurav.EcommerceAPI.repository;

import com.saurav.EcommerceAPI.model.Address;
import org.springframework.data.repository.CrudRepository;

public interface IAddressRepo extends CrudRepository<Address,Integer> {
}

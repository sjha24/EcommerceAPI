package com.saurav.EcommerceAPI.service;
import com.saurav.EcommerceAPI.model.Address;
import com.saurav.EcommerceAPI.repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AddressService {
    @Autowired
    IAddressRepo addressRepo;
    public String addAddress(Address address) {
        if(address != null){
            addressRepo.save(address);
            return "address saved successful";
        }
        return "Not added !!!";
    }
}

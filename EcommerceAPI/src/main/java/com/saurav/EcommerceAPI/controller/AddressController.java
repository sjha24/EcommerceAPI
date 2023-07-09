package com.saurav.EcommerceAPI.controller;
import com.saurav.EcommerceAPI.model.Address;
import com.saurav.EcommerceAPI.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("address")
public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping()
    public String addAddress(@RequestBody Address address) {
        return addressService.addAddress(address);
    }
}

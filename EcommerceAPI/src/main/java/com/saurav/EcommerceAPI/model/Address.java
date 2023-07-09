package com.saurav.EcommerceAPI.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Address_Id;
    private String name;
    private String landmark;
    private String phone_Number;
    private String zipcode;
    private String state;
    @ManyToOne
    @JoinColumn(name = "fk_user_ID")
    User user_ID;
}

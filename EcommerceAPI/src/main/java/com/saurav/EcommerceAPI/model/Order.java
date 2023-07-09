package com.saurav.EcommerceAPI.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;

    @ManyToOne
    @JoinColumn(name = "fk_user_id")
    private User userId;

    @ManyToOne
    @JoinColumn(name = "fk_product_id")
    private Product productId;

    @ManyToOne
    @JoinColumn(name = "fk_address_id")
    private Address addressId;

    private Integer productQuantity;
}

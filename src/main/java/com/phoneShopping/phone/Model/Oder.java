package com.phoneShopping.phone.Model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Oder {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long OdID;


    @ManyToOne
    @JoinColumn(name = "cust_id")
    private Customer customer;


    @ManyToOne
    @JoinColumn(name = "pro_id")
    private Product product;
}

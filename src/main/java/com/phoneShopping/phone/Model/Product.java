package com.phoneShopping.phone.Model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor


public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pro_id;

    private String product_name;
    private  int    product_price;
//    @Lob
//    private byte[] imageData;


}

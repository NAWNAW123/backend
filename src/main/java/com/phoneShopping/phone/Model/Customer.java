package com.phoneShopping.phone.Model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cust_id;
    private String mobile;
    private String addres;
    private String first_name;
    private String last_name;
    private String password;



}

package com.phoneShopping.phone.Repository;

import com.phoneShopping.phone.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo  extends JpaRepository<Product,Long> {
}

package com.phoneShopping.phone.Repository;

import com.phoneShopping.phone.Model.Oder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends JpaRepository<Oder,Long> {
}

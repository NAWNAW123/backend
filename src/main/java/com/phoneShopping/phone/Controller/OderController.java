package com.phoneShopping.phone.Controller;

import com.phoneShopping.phone.Model.Oder;
import com.phoneShopping.phone.Model.Product;
import com.phoneShopping.phone.Repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/Order")
public class OderController {

    @Autowired
    private OrderRepo orderRepo;


    @GetMapping("/List")
    public List<Oder> getOder() {
        return orderRepo.findAll();
    }

    @PostMapping("/save")
    public Oder createOder(@RequestBody Oder oder) {
        return orderRepo.save(oder);
    }

    @GetMapping("/getbyId/{OdID}")
    public Optional<Oder> getProduct(@PathVariable Long OdID) {
        return orderRepo.findById(OdID);
    }

//    @DeleteMapping(value )
//    public String deleteOrder() {
//        Product deleteProduct = orderRepo.findById(OdID).get().getProduct();
//        orderRepo.delete(deleteOrder());
//        return "deleted";
//
//
//    }

}

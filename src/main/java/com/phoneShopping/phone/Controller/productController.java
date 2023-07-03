package com.phoneShopping.phone.Controller;


import com.phoneShopping.phone.Model.Product;
import com.phoneShopping.phone.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController
@RequestMapping("/product")
public class productController {

    @Autowired
    private ProductRepo productRepo;

    @GetMapping("/list")
    public List<Product> getProduct(){
        return productRepo.findAll();
    }

    @PostMapping("/save")
    public Product createProduct(@RequestBody Product product){
        return productRepo.save(product);
    }


    @PutMapping("/update/{pro_id}")
    public String updateProduct(@PathVariable Long pro_id,@RequestBody Product product){
        Product updatedProduct=productRepo.findById(pro_id).get();
        updatedProduct.setProduct_name(product.getProduct_name());
        updatedProduct.setProduct_price(product.getProduct_price());
//        updatedProduct.setImageData(product.getImageData());
        productRepo.save(updatedProduct);
        return "Updated";
    }

    @DeleteMapping(value ="/delete/{pro_id}")
    public String deleteProduct(@PathVariable Long pro_id){
        Product deleteProduct=productRepo.findById(pro_id).get();
        productRepo.delete(deleteProduct);
        return "deleted";
    }

    @GetMapping("/getbyId/{pro_id}")
    public Optional<Product> getProduct(@PathVariable Long pro_id){
        return productRepo.findById(pro_id);
    }


}

package com.example.ExampleProject;

import com.example1.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class ProductController {
   List<Product> list =new ArrayList<Product>();

  public ProductController()
  {
      Product p1=new Product(1,"tv",40000);
      Product p2=new Product(2,"ac",50000);
      Product p3=new Product(3,"fridge",60000);

      list.add(p1);
      list.add(p2);
      list.add(p3);

  }
  @GetMapping("/details")
  public List<Product> getProduct()
  {
      return list;
  }
    @PostMapping("/add")
    public Product send(@RequestBody Product details)
    {
        list.add(details);
        return details;
    }

}


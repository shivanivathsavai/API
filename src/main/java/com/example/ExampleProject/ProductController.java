package com.example.ExampleProject;

import com.example1.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.function.UnaryOperator;

@RestController
public class ProductController {
   List<Product> list =new ArrayList<Product>();

   /*Input details*/

  public ProductController()
  {
      list.add(new Product(1,"tv",40000));
      list.add(new Product(2,"ac",50000));
      list.add(new Product(3,"fridge",60000));

  }

  /*Returns list with the details using GET*/
    
  @GetMapping("/getdetails")
  public List<Product> getProduct()
  {
      return list;
  }

  /*Returns details we added using POST */

  @PostMapping("/adddetails")
  public Product send(@RequestBody Product details)
    {
        list.add(details);
        return details;
    }

}


package com.example.ExampleProject;

import com.example1.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import java.util.function.UnaryOperator;

@RestController
public class ProductController {

    List<Product> list = new ArrayList<Product>();

    /*Input details*/

    public ProductController()
    {
        list.add(new Product("1", "tv", 40000));
        list.add(new Product("2", "ac", 50000));
        list.add(new Product("3", "fridge", 60000));

    }

    /*Returns list with the details using GET*/

    @GetMapping("/get")
    public List<Product> getProduct()
    {
        return list;
    }

    /*Returns details we added using POST */

    @PostMapping("/post")
    public Product send(@RequestBody Product details)
    {
        list.add(details);
        return details;
    }

     /*Deletes by specified id */

    @DeleteMapping("/delete/{id}")
    public Product delete(@PathVariable String id)
    {
        Iterator<Product> iterator = list.iterator();
        while (iterator.hasNext())
        {
            Product product = iterator.next();
            if (product.getId().equals(id))
            {
                iterator.remove();
                return product;
            }

        }
        return null;
    }

    /*Updates by id with all details*/

    @PutMapping("/put/{id}")
    public List<Product> update(@PathVariable String id, @RequestBody Product update) {

        Iterator<Product> iterator = list.iterator();
        while (iterator.hasNext())
        {
            Product product = iterator.next();
            if (product.getId().equals(id))
            {
                iterator.remove();
                list.add(update);
                return list;
            }
        }
         return null;

    }

    /*Updates only specific field*/

     @PatchMapping("/patch/{id}")
   public void patch(@PathVariable String id,@RequestBody Product update1)
     {
         Iterator<Product> iterator = list.iterator();
         while (iterator.hasNext())
         {
             Product product = iterator.next();
             if (product.getId().equals(id))
             {
                 product.setId(update1.getId());
             }
         }
     }
}



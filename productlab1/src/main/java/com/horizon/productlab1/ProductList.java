package com.horizon.productlab1;
import java.util.ArrayList;

public class ProductList {
    private ArrayList<Product> products;
    public ProductList(){
        products=new ArrayList<>();
        products.add(new Product("Laptop",1000,0.18));
        products.add(new Product("Phone",500,0.18));
        products.add(new Product("Microwave",300,0.18));
    }
    public Product findByName(String name){
        for(Product p:products){
            if(p.getName().equalsIgnoreCase(name)){
                return p;
            }
        }
        return null;
    }
}

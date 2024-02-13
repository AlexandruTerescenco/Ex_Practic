package edu.step.oop;

public class Product {
    private String productId;
    private String name;
    private double price;
    private int quantity;

    public Product(String id){productId = id;}
    public Product(String id, String nam, double pri){productId = id; name = nam; price  = pri;}
    public Product(String id, String nam, double pri, int qty){productId = id; name = nam; price  = pri; quantity = qty;}

    public double get_price(){
        return this.price;
    }

    public void set_quantity(int qty){
        this.quantity = qty;
    }
}

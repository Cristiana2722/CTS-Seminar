package ro.ase.cts.s03;

import java.util.ArrayList;

// Meaningful variable names
// Ensure functions/methods names consistency
// Do NOT use name of the class as part of variable names
// Functions / methods for different actions
// The name of the method says what the method does
// Do NOT use flags for multiple functionalities

public class Main {
    public static void main(String[] args) {
        // write your code here
        OnlineShop o = new OnlineShop("Emag", "logo.jpg", new ArrayList<Product>());

        Product p1 = new Product("Laptop", 3200.5, 1,1, 1123, "");
        Product p2 = new Product("Frigider", 207.95, 1,2, 1245, "");

        Product p3 = new Product(p1);

        p3.setQuantity(5);
        p3.setName("Paine");

//        o.modifyProductsList(1,p1);
//        o.modifyProductsList(1,p2);
        o.addProduct(p1);
        o.addProduct(p2);

//        o.modifyProductsList(2, p1);
        o.removeProduct(p1);

        System.out.println(p1.equals(p2));
    }
}

class OnlineShop {
    private String name;
    private String image;
    private ArrayList<Product> products;

    public OnlineShop(String name, String image, ArrayList<Product> products) {
        this.products = new ArrayList<Product>();
        this.image = image;
        this.name = name;
    }

    public void addProduct(Product p) {
        this.products.add(p);
    }

    public void removeProduct(Product p) {
        this.products.remove(p);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageURL() {
        return image;
    }

    public void setImageURL(String image) {
        this.image = image;
    }
}

class Product {
    private int Id;
    private String name;
    private double price;
    private int type;
    private int category;
    private int quantity;
    private String expiryDate; //expiry date - only for goods
    private String details; // ex.: processor, memory, power, volume (for refrigerators etc)

    public Product(String name, double price, int type, int category, int id, String expiryDate) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.category = category;
        this.Id = id;
        this.expiryDate = expiryDate;
    }
    public Product() {

    }
    public Product(Product p) {
        this.name = p.name;
        this.price = p.price;
        this.type = p.type;
        this.category = p.category;
        this.Id = p.Id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public boolean equals(Product p) {
        return p.Id == this.Id && p.name.equals(this.name) && p.price == this.price && p.type == p.type && p.category == this.category;
    }

    public void increasePriceByPercentage(double percentage) {
        this.price += this.price * percentage;
    }

    public void decreasePriceByPercentage(double percentage) {
        this.price -= this.price * percentage / 100;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }
}

class User {
    private String username;
    private String Id;
    private ArrayList<Order> order;

    public User(String username, String Id) {
        this.username = username;
        this.Id = Id;
        order = new ArrayList<Order>();
    }

    public void addOrder(Order o) {
        this.order.add(o);
    }

    public void removeOrder(Order o) {
        this.order.remove(o);
    }
}

class Order {
    private ArrayList<Product> products;
    private String address;

    public Order() {
        products = new ArrayList<Product>();
    }

    public void add(Product product) {
        if(products.size() > 99)
            return;
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

class InventoryProduct extends Product {
    private int quantity;

    public InventoryProduct(Product p, int quantity) {
        super();
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}



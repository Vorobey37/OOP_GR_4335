package Domen;

public class Product {
    private int productID;
    private String productName;
    private String productCategory;
    private double price;

    public Product(int productID, String productName, String productCategory, double price) {
        this.productID = productID;
        this.productName = productName;
        this.productCategory = productCategory;
        this.price = price;
        
    }

    public int getProductID () {
        return productID;
    }

    public String getProductName() {
        return productName;
    }
    
    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setPrice(double price) {
        if (price<=0) {
            throw new RuntimeException("Такой цены быть не может!"); 
        }
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString () {
        return "Product{name = " + productName + 
        ", category = " + productCategory + 
        ", cost = " + price + "}";
    }
    
    }


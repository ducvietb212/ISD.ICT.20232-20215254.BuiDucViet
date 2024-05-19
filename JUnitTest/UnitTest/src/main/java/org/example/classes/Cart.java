package org.example.classes;

import java.util.Date;
import java.util.List;

public class Cart {
    private List<Product> products;
    private int id;
    private Date creationDate;
    private Date lastModifiedDate;

    public Cart() {
    }

    public Cart(List<Product> products, int id, Date creationDate, Date lastModifiedDate) {
        this.products = products;
        this.id = id;
        this.creationDate = creationDate;
        this.lastModifiedDate = lastModifiedDate;
    }

    public boolean checkProductsAvailability() {
        if (products == null || products.isEmpty()) {
            return false;
        }
        for (Product product : products) {
            if (!product.getAvailability()) {
                return false;
            }
        }
        return true;
    }

    public double calculateSubtotalPrice() {
        if (products == null) {
            return 0;
        }
        double subtotal = 0;
        for (Product product : products) {
            subtotal += product.getPrice() * product.getQuantity();
        }
        return subtotal;
    }

    public boolean emptyCart() {
        if (products == null) {
            return false;
        }
        products.clear();
        return true;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
}

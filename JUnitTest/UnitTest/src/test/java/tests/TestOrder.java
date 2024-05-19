package tests;

import org.example.classes.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestOrder {

    @Test
    public void testOrderCreation() {
        // Create sample products
        List<Product> products = new ArrayList<>();
        Product product1 = new Product(1, "Product 1","Category 1" ,10, 5, true);
        Product product2 = new Product(2, "Product 2","Category 2" ,10, 2, true);
        products.add(product1);
        products.add(product2);

        // Create sample cart
        Cart cart = new Cart(products, 1, new Date(), new Date());

        // Create sample delivery info
        DeliveryForm deliveryForm = new DeliveryForm(1, "Name A", "a@gmail.com", "0123456789", "123 Main St");

        double shippingFee = 10.0;
        double totalAmount = 80.0; // Subtotal: 10 * 5 + 10 * 2 = 70

        Order order = new Order(cart, deliveryForm, totalAmount, shippingFee);

        assertNotNull(order);
        assertEquals(cart, order.getCart());
        assertEquals(deliveryForm, order.getDeliveryInfo());
        assertEquals(totalAmount, order.getTotalAmount(), 0.001);
    }

    @Test
    public void testOrderSettersAndGetters() {
        List<Product> products = new ArrayList<>();
        Product product1 = new Product(1, "Product 1","Category 1" ,10, 5, true);
        Product product2 = new Product(2, "Product 2","Category 2" ,10, 2, true);
        products.add(product1);
        products.add(product2);

        // Create sample cart
        Cart cart = new Cart(products, 1, new Date(), new Date());
        DeliveryForm deliveryForm = new DeliveryForm(1, "Name A", "a@gmail.com", "0123456789", "123 Main St");
        double shippingFee = 10.0;
        double totalAmount = 80.0;

        Order order = new Order(cart, deliveryForm, totalAmount, shippingFee);

        Cart newCart = new Cart(products, 2, new Date(), new Date());
        DeliveryForm newDeliveryForm = new DeliveryForm(2, "Name B", "b@gmail.com", "0987654321", "456 Main St");
        double newShippingFee = 30.0;
        double newTotalAmount = 100.0;

        order.setCart(newCart);
        order.setDeliveryInfo(newDeliveryForm);
        order.setTotalShippingFee(newShippingFee);

        assertEquals(newCart, order.getCart());
        assertEquals(newDeliveryForm, order.getDeliveryInfo());
        assertEquals(newTotalAmount, order.getTotalAmount(), 0.001);
    }
}

package tests;

import org.example.classes.Product;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestProduct {

    @Test
    public void testGetAvailability_whenQuantityIsGreaterThanZero() {
        Product product = new Product(1, "Test Product","Test Category" ,99.99, 10, true);
        assertTrue(product.getAvailability(), "Product should be available when quantity is greater than zero.");
    }

    @Test
    public void testGetAvailability_whenQuantityIsZero() {
        Product product = new Product(1, "Test Product","Test Category" ,99.99, 0, true);
        assertFalse(product.getAvailability(), "Product should not be available when quantity is zero.");
    }

    @Test
    public void testGetPrice() {
        Product product = new Product(1, "Test Product","Test Category" ,99.99, 0, true);
        assertEquals(99.99, product.getPrice(), 0.001, "Product price should be 99.99.");
    }

    @Test
    public void testSetAndGetId() {
        Product product = new Product();
        product.setId(1);
        assertEquals(1, product.getId(), "Product ID should be 1.");
    }

    @Test
    public void testSetAndGetTitle() {
        Product product = new Product();
        product.setTitle("Test Product");
        assertEquals("Test Product", product.getTitle(), "Product title should be 'Test Product'.");
    }

    @Test
    public void testSetAndGetCategory() {
        Product product = new Product();
        product.setCategory("Test Category");
        assertEquals("Test Category", product.getCategory(), "Product category should be 'Test Category'.");
    }

    @Test
    public void testSetAndGetPrice() {
        Product product = new Product();
        product.setPrice(99.99);
        assertEquals(99.99, product.getPrice(), 0.001, "Product price should be 99.99.");
    }

    @Test
    public void testSetAndGetQuantity() {
        Product product = new Product();
        product.setQuantity(10);
        assertEquals(10, product.getQuantity(), "Product quantity should be 10.");
    }

    @Test
    public void testSetAndGetRushDelivery() {
        Product product = new Product();
        product.setRushDelivery(false);
        assertFalse(product.isRushDelivery(), "Product rush delivery should be false");
    }
}

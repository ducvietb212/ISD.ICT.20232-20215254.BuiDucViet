package tests;

import org.example.classes.Cart;
import org.example.classes.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class TestCart {
    private Cart cart;
    private List<Product> products;

    @BeforeEach
    public void setUp() {
        products = new ArrayList<>();
        products.add(new Product(1, "Product 1","Category 1" ,10, 10, true));
        products.add(new Product(2, "Product 2","Category 2" ,10, 0, false));// Not available
        cart = new Cart(products, 123, new Date(), new Date());
    }

    @Test
    public void testCheckProductsAvailability_allProductsAvailable() {
        products.get(1).setQuantity(3); // Make all products available
        assertTrue(cart.checkProductsAvailability(), "All products should be available.");
    }

    @Test
    public void testCheckProductsAvailability_someProductsUnavailable() {
        assertFalse(cart.checkProductsAvailability(), "Not all products are available.");
    }

    @Test
    public void testCalculateSubtotalPrice() {
        assertEquals(100.0, cart.calculateSubtotalPrice(), 0.001, "Subtotal price should be 30.0.");
    }

    @Test
    public void testEmptyCart() {
        assertTrue(cart.emptyCart(), "Cart should be empty after calling emptyCart.");
        assertTrue(cart.getProducts().isEmpty(), "Cart products list should be empty.");
    }

    @Test
    public void testSetAndGetId() {
        cart.setId(456);
        assertEquals(456, cart.getId(), "Cart ID should be 456.");
    }

    @Test
    public void testSetAndGetCreationDate() {
        Date newDate = new Date();
        cart.setCreationDate(newDate);
        assertEquals(newDate, cart.getCreationDate(), "Creation date should be set correctly.");
    }

    @Test
    public void testSetAndGetLastModifiedDate() {
        Date newDate = new Date();
        cart.setLastModifiedDate(newDate);
        assertEquals(newDate, cart.getLastModifiedDate(), "Last modified date should be set correctly.");
    }

    @Test
    public void testSetAndGetProducts() {
        List<Product> newProducts = new ArrayList<>();
        newProducts.add(new Product(3, "Product 3","Category 3" ,30.0, 3, false));// Not available

        cart.setProducts(newProducts);
        assertEquals(newProducts, cart.getProducts(), "Products list should be set correctly.");
    }
}

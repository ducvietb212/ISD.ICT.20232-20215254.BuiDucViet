package tests;

import org.example.classes.DeliveryForm;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class TestDeliveryForm {
    private DeliveryForm deliveryForm;

    @BeforeEach
    public void setUp() {
        deliveryForm = new DeliveryForm(1, "Name A", "a@gmail.com", "0123456789", "123 Main St");
    }

    @Test
    public void testGetId() {
        assertEquals(1, deliveryForm.getId(), "ID should be 1.");
    }

    @Test
    public void testSetId() {
        deliveryForm.setId(2);
        assertEquals(2, deliveryForm.getId(), "ID should be 2 after setting.");
    }

    @Test
    public void testGetName() {
        assertEquals("Name A", deliveryForm.getRecipientName(), "Recipient name should be 'Name A'.");
    }

    @Test
    public void testSetName() {
        deliveryForm.setRecipientName("Name B");
        assertEquals("Name B", deliveryForm.getRecipientName(), "Recipient name should be 'Name B' after setting.");
    }

    @Test
    public void testGetMail() {
        assertEquals("a@gmail.com", deliveryForm.getEmail(), "Email should be 'a@gmail.com'.");
    }

    @Test
    public void testSetMail() {
        deliveryForm.setEmail("b@gmail.com");
        assertEquals("b@gmail.com", deliveryForm.getEmail(), "Email should be 'b@gmail.com' after setting.");
    }

    @Test
    public void testGetPhoneNumber() {
        assertEquals("0123456789", deliveryForm.getPhoneNumber(), "Phone number should be '0123456789'.");
    }

    @Test
    public void testSetPhoneNumber() {
        deliveryForm.setPhoneNumber("0987654321");
        assertEquals("0987654321", deliveryForm.getPhoneNumber(), "Phone number should be '0987654321' after setting.");
    }

    @Test
    public void testGetAddress() {
        assertEquals("123 Main St", deliveryForm.getAddress(), "Address should be '123 Main St'.");
    }

    @Test
    public void testSetAddress() {
        deliveryForm.setAddress("456 Elm St");
        assertEquals("456 Elm St", deliveryForm.getAddress(), "Address should be '456 Elm St' after setting.");
    }


}

package org.example.classes;

public class DeliveryForm {
    private int id;
    private String recipientName;
    private String email;
    private String phoneNumber;
    private String address;

    public DeliveryForm() {
    }

    public DeliveryForm(int id, String recipientName, String email, String phoneNumber, String address) {
        this.id = id;
        this.recipientName = recipientName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

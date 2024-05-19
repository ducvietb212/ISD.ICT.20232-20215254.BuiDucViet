package org.example.classes;

public class Order {
    private Cart cart;
    private DeliveryForm deliveryForm;
    private double totalAmount;
    private double totalShippingFee;


    public Order(Cart cart, DeliveryForm deliveryForm, double totalAmount, double totalShippingFee) {
        this.cart = cart;
        this.deliveryForm = deliveryForm;
        this.totalAmount = totalAmount;
        this.totalShippingFee = totalShippingFee;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public DeliveryForm getDeliveryInfo() {
        return deliveryForm;
    }

    public void setDeliveryInfo(DeliveryForm deliveryForm) {
        this.deliveryForm = deliveryForm;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public DeliveryForm getDeliveryForm() {
        return deliveryForm;
    }

    public void setDeliveryForm(DeliveryForm deliveryForm) {
        this.deliveryForm = deliveryForm;
    }

    public double getTotalShippingFee() {
        return totalShippingFee;
    }

    public void setTotalShippingFee(double totalShippingFee) {
        this.totalShippingFee = totalShippingFee;
        setTotalAmount(cart.calculateSubtotalPrice() + totalShippingFee);
    }
}

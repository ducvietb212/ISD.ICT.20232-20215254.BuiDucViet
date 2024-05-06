Basic flow
1. Customer requests to view cart and select items to buy
2. Software checks the whether the inventory quantity is sufficient to provide
3. Software requests the delivery information from customer
4. Customer enters the delivery information
5. Software calculates delivery fee, product price and check the validation of the delivery information
6. Customer chooses the delivery method
7. Software check if this order can be rush ship
8. Software requests customer more information about the order in case of rush order
9. Customer selects the payment method and gives information requested by VNPay
10. Software send notification for success in payment and order in processing
Alternative flow
Step 5: Delivery information is not valid -> Notify the customer and ask the customer to input the valid information -> Resume at Step 4
Step 7: If there is any product that did not support for rush order -> Notify to the customer to update the delivery information -> Resume at Step 6
Step 9: Customer wants to terminate the order -> Terminate the order and refund

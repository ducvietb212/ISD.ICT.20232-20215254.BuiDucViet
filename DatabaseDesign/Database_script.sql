create table product(
productID int primary key,
productDescription varchar(200),
quantity int,
warehouseEntryDate datetime,
wght float
)


create table cart(
cartID int primary key
)

create table transactions(
transactionID int primary key,
date date,
time time,
amount int
)

create table invoice(
invoiceID int primary key,
totalFee float,
shippingFee float
)

create table orders(
orderID int primary key
)

create table DeliveryInfo(
infoID int primary key,
receiver varchar(50),
address varchar(100),
phoneNumber varchar(12)
)

create table RushOrderInfo(
infoID int,
deliveryTime time,
deliveryIns varchar(100),
primary key(infoID),
foreign key(infoID) references DeliveryInfo(infoID)
)

create table Product_cart(
productID int,
cartID int,
productQuantity int,
foreign key (productID) references product(productID),
foreign key (cartID) references cart(cartID)
)

create table Cart_order(
cartID int,
orderID int,
primary key (cartID, orderID),
foreign key (cartID) references cart(cartID),
foreign key (orderID) references orders(orderID)
)

create table Transaction_order(
transactionID int,
orderID int,
primary key(transactionID, orderID),
foreign key (transactionID) references transactions(transactionID),
foreign key (orderID) references orders(orderID)
)

create table Invoice_order(
invoiceID int,
orderID int,
primary key (invoiceID, orderID),
foreign key (invoiceID) references invoice(invoiceID),
foreign key (orderID) references orders(orderID)
)

create table DeliveryInfo_order(
infoID int,
orderID int,
primary key(infoID, orderID),
foreign key (infoID) references DeliveryInfo ( infoID),
foreign key (orderID) references orders(orderID)
)


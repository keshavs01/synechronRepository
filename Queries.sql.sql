1) Login_Registration_details 


create table Login_Registration_details 
(
id int auto_increment unique, 

userName varchar(25) primary key,
 
password varchar(25),

email_Id varchar(25),
 
fullname varchar(25),
 
is_Admin boolean default false,
 
contact_No long
);


INSERT INTO Login_Registration_details (userName, password, email_Id, fullname,is_Admin,contact_No)

VALUES ("Priyanka", "PPP", "PPP@gmail.com","Priyanka Dhamankar",True,1111111111);

-------------------------------------------------------------------------------------------------
2) Driver_Details

create table  Driver_Details
(
driver_Id int primary key auto_increment, 

driver_Name varchar(25), 

rating int(1), 

city varchar(25),

mobile long);

INSERT INTO Driver_Details (driver_Name, rating, city, mobile)

VALUES ("Driver1", 4,"Balewadi",2222222222);

-----------------------------------------------------------------------------------------------------

3) Car_Category

create table Car_Category
(category_Id int primary key auto_increment,
 category_Name varchar(25),
 price_per_km double(10,2));


INSERT INTO Car_Category (category_Name, price_per_km)
VALUES ("Sedan", 11.00);

-----------------------------------------------------------------------------------------------------
4) Car_Details

create table Car_Details

(car_Id int primary key auto_increment,
 
car_Name varchar(25),
 
rating int(1), 
 
category_Id int,

foreign key(category_Id) references Car_Category(category_Id));

INSERT INTO Car_Details (car_Name, rating, category_Id)
VALUES ("Swift Desire", 4,1);

-------------------------------------------------------------------------------------

5) Offer_Details

create table Offer_Details
(offer_Id int primary key auto_increment,
 offer_Details varchar(50),
 offer_Code varchar(25));


INSERT INTO Offer_Details (offer_Details, offer_Code)
VALUES ("20 % OFF", "FLAT20");

----------------------------------------------------------------------------------------



6) Trip_Details


create table Trip_Details

(trip_Id int primary key auto_increment,
 
trip_start varchar(25),
 
trip_end varchar(25),

 userName varchar(25), 

 car_Id int, 
 
driver_Id int, 
foreign key (userName) references Login_Registration_details(userName) on delete cascade,
 
foreign key (car_Id) references car_Details(car_Id),
 
foreign key (driver_Id) references driver_Details(driver_Id));

------------------------------------------------------------------------------------------
7) Payment_Details

 create table Payment_Details

 (payment_Id int primary key auto_increment, 

 amount double(10,2), 
 
discount double(10,2),

userName varchar(255), 

trip_Id int, 

driver_Id int,
 
foreign key (userName) references Login_Registration_details(userName),

foreign key (driver_Id) references driver_Details(driver_Id),

 foreign key (trip_Id) references trip_Details(trip_Id));



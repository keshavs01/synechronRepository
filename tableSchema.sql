use synechron;
drop table CarDetails;
drop table DriverDetails;
drop table Category;
drop table UserDeatils;
drop table TripDetails;
drop table PaymentDetails;



CREATE TABLE DriverDetails (
    Driver_id int NOT NULL PRIMARY KEY auto_increment,
    First_Name varchar(255),
	Last_Name varchar(255) ,
    phone_number long,
    city varchar(255) NOT NULL,
    driver_rating int  NOT NULL  
);

CREATE TABLE Category (
    category_id int NOT NULL PRIMARY KEY auto_increment,
	NumberOfPassenger int NOT NULL,
	costPerKm varchar(255) ,
    car_rating int  NOT NULL  
);

INSERT INTO DriverDetails  (First_Name, Last_Name,phone_number,city,driver_rating)
VALUES ( 'Keshav', 'Singh',9753790255,'Pune',4);

CREATE TABLE CarDetails (
    car_id int NOT NULL PRIMARY KEY auto_increment,
	car_Name varchar(255) ,
    car_rating int  NOT NULL,
    category_id int Not Null,
    FOREIGN KEY (category_id) REFERENCES Category(category_id)
);

create table UserDetails(
	id int auto_increment unique, 
	user_id varchar(255) primary key,
	password varchar(25),
    fullname varchar(25),
	email_id varchar(25),
    ph_number long, 	
	isadmin boolean default false	
);
select * from PaymentDetails;


create table tripDetails(
	trip_id int primary key,
	trip_source varchar(255),
    trip_destination varchar(255),
	user_id varchar(255), 
    car_id int, 
    driver_id int, 
    foreign key (user_id) references UserDetails(user_id) on delete cascade,
	foreign key (car_id) references carDetails(car_id),
	foreign key (driver_id) references driverDetails(driver_id)
    );
CREATE TABLE PaymentDetails (
    payment_id int NOT NULL PRIMARY KEY auto_increment,
	user_id varchar(255) NOT NULL,
	driver_id int,
    trip_id int  NOT NULL ,
    discounted_amount double(15,10),
    total_amount double(15,10),
    foreign key (user_id) references userDetails(user_id),
	foreign key (driver_id) references driverDetails(driver_id),
	foreign key (trip_id) references tripDetails(trip_id)
);

create table offerdetails(
	offer_id int primary key, 
    offercode varchar(25),
    offerdetails varchar(50)
    );
    


select * from tripDetails; 
select * from  carDetails;
select * from UserDeatils;
commit;


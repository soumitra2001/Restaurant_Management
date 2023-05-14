<h1 align="center">🏬🍔 Restaurant Management Service API 🍝🍨</h1>

* This repository contains the code for a Restaurant Management System. The system includes functionality for managing restaurants, as well as for user authentication and authorization.

* The restaurant management system is a web-based application that uses Spring Boot. It 
helps streamline restaurant data management and provides an easy-to-use interface for 
restaurant managers to manage food item details and other information. The application 
also allows restaurants to view and update their personal details

* Implemented CRUD operations with data validation, MySQL database configuration, 
Swagger integration, authentication and established table relationships, authentication 
using “MD-5” algorithm

* Tech stack used: Spring Boot, Hibernate, MySQL, OOPs, Postman, Swagger, and Java

>## Data flow
 The application is built using the SpringBoot framework and consists of four layers: DTO, model, service, and repository.-

* **DTO** -The DTO layer consists of classes that are used to transfer data between different layers of the application
* **Controller** - The controller layer handles the HTTP requests, translates the JSON parameter to object, and authenticates the request and transfer it to the business (service) layer. In short, it consists of views i.e., frontend part.
* **Service** -The business layer handles all the business logic. It consists of service classes and uses services provided by data access layers.
* **Repository** - This layer mainatains the h2-database thing on which CRUD operations are performed
* **Model** - This layer consists basically the class level things- the various classes required for the project and these classes consists the attributes to be stored.

>## API Documentation
The API's default port is:  http://localhost:8080.

### API Endpoints:
Restaurant-controller
* GET
/restaurants/{id}

* PUT
/restaurants/{id}

* DELETE
/restaurants/{id}

* GET
/restaurants

* POST
/restaurants

Restaurant-management-controller

* PUT /restaurantmanagement/restaurantid/{restaurantEmployeeRecordId}

* GET /restaurantmanagement/restaurantid/{restaurantid}

User-controller

* POST
/user/signup

* POST
/user/signin

* GET
/user/food
 
 >## Database Design
     
      create table authentication_token (
       token_id bigint not null auto_increment,
        token varchar(255),
        token_creation_date date,
        fk_user_id bigint not null,
        primary key (token_id)
        )
      
      create table food (
       id bigint not null auto_increment,
        food_name varchar(255),
        food_price float(53) not null,
        restaurant_restaurant_id bigint,
        primary key (id)
        )
    	
	 create table restaurant (
       restaurant_id bigint not null auto_increment,
        restaurant_address varchar(255),
        restaurant_name varchar(255),
        primary key (restaurant_id)
        )
        
     create table restaurant_management (
       restaurant_management_record_id bigint not null auto_increment,
        restaurant_description varchar(255),
        restaurant_head_chef_name varchar(255),
        restaurant_head_chef_salary integer,
        restaurant_staff_total_expense bigint,
        restaurant_staffs_number integer not null,
        restaurant_restaurant_id bigint,
        primary key (restaurant_management_record_id)
        )
        
      create table user (
       user_id bigint not null auto_increment,
        user_contact_number varchar(255),
        user_email varchar(255),
        user_first_name varchar(255),
        user_last_name varchar(255),
        user_password varchar(255),
        primary key (user_id)
        )
        
      create table user (
       user_id bigint not null auto_increment,
        user_contact_number varchar(255),
        user_email varchar(255),
        user_first_name varchar(255),
        user_last_name varchar(255),
        user_password varchar(255),
        primary key (user_id)
        )
        
      alter table authentication_token 
       add constraint FKh1d4j9xvy9w1g1kfttfnedeh5 
       foreign key (fk_user_id) 
       references user (user_id)
       
      alter table food 
       add constraint FKayiiqy14avfrfpl1liao2ex2a 
       foreign key (restaurant_restaurant_id) 
       references restaurant (restaurant_id)
       
      alter table restaurant_management 
       add constraint FKcjo90ljj47hv39jdwfw47dkwh 
       foreign key (restaurant_restaurant_id) 
       references restaurant (restaurant_id)


>## Project Summary
  This is a Spring Boot project of Restaurant Management. User can order for themselves some food.
  Upon user registration basic validation applied to the filled data if all the validation passes then only user can order some food.
  We can add Restaurants and also add some food in the restaurant. Later we can also update or delete restaurant info.

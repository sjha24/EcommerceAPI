# EcommerceAPI
[![Java](https://img.shields.io/badge/Java>=8.0-blue.svg)](https://docs.spring.io/spring-boot/docs/0.5.0.M6/api/org/springframework/boot/SpringApplication.html)
[![maven](https://img.shields.io/badge/maven->=3.0.5-green.svg)](https://www.npmjs.com/package/npm/v/5.5.0)
[![springBoot](https://img.shields.io/badge/SpringBoot->=3.0.6-blue.svg)](https://nodejs.org/en/blog/release/v9.3.0)
>This is a backend API built using the Spring framework that handles various HTTP requests for an Ecommerce API. The API allows users to create accounts, add products, create orders and manage addresses

## Framework used
 * Spring Boot
## Languaged Uesd
 * Java
## Data Model
>The data model is defined in the various class, which has the following attributes
* User Model
```
userId:integer
userName:string
userEmail:string
userPassword:string
userPhoneNumber:string
```
* Product Model
```
productId:integer 
productName:string
productPrice:integer
productDescription:string
productCategory:string
productBrand:string
```
* Order Model
```
orderId:integer
userId:integer (foreign key mapping)
productId:integer(foreign key mapping)
addressId:integer(foreign key mapping)
productQuantity:integer

```
* Address Model
```
addressId:integer    
addressName:string
landmark:string
phoneNumber:string
zipcode:string
state:string
userId : foreign key mapping
```
## Data Flow
```
1. User send as a request to the application throgh the endpoints
2. the api recived request and sends it to the appropriate controll method
3. the controller method makes a call to the method in service class.
4. he controller method returns a response to the API
5. The API sends the response back to the user
```
## Function Used 
# Api end points
```
user (POST): Create a new user
user (GET): Get user by user ID (path Variable)
product (POST): Add a new product
product (GET): Get all products
product/{id} (DELETE): Delete a product by product ID (path variable)
product (GET): Get products based on category (path Variable)
address (POST): Create a new address
order (POST): Place a new order
order : Get an order by order ID (path Variable)
order/{id} (DELETE) : Delete a order by order ID (path variable)
```
## Data Structure Used
* MySql Database 
```
 We have used Persistent database to implement CRUD Operations.
```

## Project Summary
```
This API provides basic functionality for an Ecommerce platform, allowing users to create accounts, add products, create orders and manage addresses.
```
## Author

Saurav Kumar

* twiter : [@saurav](https://twitter.com/Sauravjha24)
* Github : [@sjha](https://github.com/sjha24)

## Contributing

Contributions , issues and features requestes are welcome !

Feel free to check issues page

## Show your support

Give a rating if this project help you

## License

Copyright : 2023 [Saurav Kumar]()
This project is [GeekSter](https://www.geekster.in/) license

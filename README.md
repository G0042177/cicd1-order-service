Order Service

This service lets you create orders and view all orders.

It runs on port 8082.

GET /orders — view all orders

POST /orders — create an order

Swagger: http://localhost:8082/swagger-ui/index.html

Orders are stored in memory and are cleared when the service stops. The
productId is for a product in the Catalog Service, but this service does not
connect to Catalog yet.
CICD-1 Lab 1 
 
Browser / Swagger 

       | 
       +--> Catalog Service :8081 --> temporary Product List<> 
       | 
       +--> Order Service   :8082 --> temporary Order List<> 
 
Separate GitHub repositories 
Separate open pull requests 
 
Week 2: add JPA + H2 
Week 3: add Order -> Catalog communication with OpenFeign 

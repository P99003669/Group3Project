### COMPLAINT MANAGEMENT SYSTEM (using SpringBoot and MicroServices)

---------
Complaint management system is a software program that allows companies to address customers' enquiries, deliver consistent support and manage complaints in a timely manner. In general, these applications are offered as part of customer relationship management software packages. Application contains mainly two parts: 
1. RESTful web services: API's build using spring boot are used for handling all the back end operations which includes session management. 
2. Front End: User interfaces designed and developed using basic front end utilising web services.

# Contributors List

Name                           |   PS No.  |    Contribution     | Issuess Faced                                              |      Issues Resolved         
-------------------------------|-----------|---------------------|------------------------------------------------------------|------------------------------
`1) V Sneharani Patro`         | 99003652  | Complaint Module    | Faced issue in cookie management                           |Resolved
`2) B Pankaj Kumar`            | 99003658  | Employee Module     | Faced issue while fetching data from database for dropdown |Resolved
`3) Kuchipudi Bhagyasree`      | 99003664  | Module Integration  | Faced issue while integrating microservices                |Resolved
`4) Yash Chhipa`               | 99003666  | Admin Module        | Faced issueRole management                                 |Resolved
`5) Saisandeepreddy Gandluri`  | 99003669  | Resolver Module     | Faced issue in giving feedback individually                |Resolved

#### Features available based on the user role
* Employee Registration
  * Employee login
  * Adding Employee in DB.
  * New Complaint
  * View Self Complaint's

* Admin
  * Admin login
  * View All Complaint's
  * Assign Roles

* Resolver
  * Resolver login
  * View Assigned Complaint's
  * Update the Status of Complaint's

* Technologies: 
  * Spring Boot
  * Hibernate with JPA 
  * MySQL
  * Session management
  * Microservices using Eureka Server

#### Application screenshots
*Home page
   ![Screenshot (1)](https://user-images.githubusercontent.com/78849248/113241201-ccfbc300-92cb-11eb-8504-3cb0cf1e2c0c.png)

 * Login
  ![Screenshot (5)](https://user-images.githubusercontent.com/78849248/113241212-d2590d80-92cb-11eb-8585-641efe07cab3.png)

 * Register 
    ![Screenshot (4)](https://user-images.githubusercontent.com/78849248/113241221-d7b65800-92cb-11eb-9f1a-17895f269d1e.png)



#### Sell
    
  * Home 
     * ![Screenshot (13)](https://user-images.githubusercontent.com/78859930/112817872-8bd39b00-90a0-11eb-9215-efdee0c9936b.png)
    * After clicking on sell:- Coin registration
      ![Screenshot (14)](https://user-images.githubusercontent.com/78859930/112818077-c4737480-90a0-11eb-9777-17808468f1cf.png)  
    * After Coin Registration
       ![Screenshot (16)](https://user-images.githubusercontent.com/78859930/112818390-1a481c80-90a1-11eb-9d89-555ca832e3d2.png)

#### Buy
   
   * Home
        ![Screenshot (13)](https://user-images.githubusercontent.com/78859930/112817872-8bd39b00-90a0-11eb-9215-efdee0c9936b.png)
    * Buy Page 
        ![Screenshot (17)](https://user-images.githubusercontent.com/78859930/112818721-73b04b80-90a1-11eb-96b5-89437ed760b2.png)
    * Adding buyers Details
       ![Screenshot (19)](https://user-images.githubusercontent.com/78859930/112818985-bbcf6e00-90a1-11eb-8322-643fc171cd49.png)
    * Sucesss Page 
       ![Screenshot (21)](https://user-images.githubusercontent.com/78859930/112946105-c433b180-9152-11eb-8aa6-411c31a5444d.png)


---------
# Test Plan For Coin Buy/Sell System
![Screenshot (5)](https://user-images.githubusercontent.com/78849248/113090383-441b5380-9207-11eb-868d-149257ec7d66.png)


#### Registration and Login Test Cases:

 #### Positive Test Cases


|SL.NO.|Test Case|Expected Result|Test Result|
| - | - | - | - |
|1|Employee clicks on Sign Up Button|Registration from opens|Successful|
|2|Enters registration details in correct format|Registration is successful and the data is stored in the database.|Successful|
|3|After Successful registration, Employee clicks on login button |Login form opens|Successful|
|4|Enters registration details in correct format|Employee is successfully logged in and Home Page opens.|Successful|
|5|A Employee clicks on New Complaint Button|Employee will be redirected to Add Complaint Page|Successful|
|6|A Employee clicks on View Complaint's Button|Employee will be redirected to a page which shows previous Complaint's|Successful|
|7|A Employee clicks on Logout Button|Employee will be redirected to a Home Page|Successful|


#### Negative Test Cases

|SL.NO.|Test Case|Expected Result|Test Result|
| - | - | - | - |
|1|Employee tries to register with invalid credentials i.e. quantity of characters allowed, password requirements, Email format |Application should not move to the next page and error page occurs|Successful|
|2|Employee tries to sign up with invalid  ID|Could not sign up because ID is needed to access Employee Detail's|Successful|
|3|Enters invalid credentials in the login page |Redirects Employee to Registration Page.|Successful|

### Employee Registration form:


|SL.NO.|Test Case|Expected Result|Test Result|
| - | - | - | - |
|1|Employee clicks on “Sign Up” option|Employee Registration form opens|Successful|
|2|Employee enters all his details in the form and submits the form|Values are stored in the database with Employee's  id as one of the attribute|<p>Successful</p><p></p><p></p><p></p><p></p><p></p><p></p><p></p>|
|3|Employee can Logout after successful registration|Successfully logged out and back to homepage|<p>Successful</p><p></p>|


### System Level and Subsystem Level UMLs - Structural and Behavioral:

 #### System Level UML
 
 ![System level uml](https://user-images.githubusercontent.com/78852647/113107824-fb24c880-9221-11eb-89d2-e04f26be8f63.PNG)

 #### Subsystem Level UML
 
 #### Structural Diagram:
 
  ##### Class Diagram
 
 ![ClassDiagram](https://user-images.githubusercontent.com/78852647/113108915-1e9c4300-9223-11eb-834b-a2e87e22a667.PNG)

 #### Behavioral Diagram:
 
  ##### Usecase Diagram
  
  ![Usecase Diagram](https://user-images.githubusercontent.com/78852647/113109170-5dca9400-9223-11eb-9118-5ad747446bfb.PNG)

### Checkout flow Test Cases:

 #### Positive Test Cases

|SL.NO.|Test Case|Expected Result|Test Result|
| - | - | - | - |
|1|Employee clicks on “New Complaint” option|The Add Complaint Should be Appeared|Successful|
|2|Employee clicks on "View Complaint's" option|Redirected to the Complaint's Page where Complaint's of the Employee is already fetched|Successful|
|3|Employee enters the details in correct format and submits the form|Redirected to the Succesful Page and details stored in Data Base|Successful|






---------

### Development server

This project was generated with [Springboot in SpringSuit tool].

Import the project in spring tool suit and in test file run the  /Project/src/test/java/net/codejava/ProjectApplicationTests.java run in Junit

Run . Navigate to `http://localhost:8080/`. The app will automatically reload if you change any of the source files.

Run `ng build` to build the project. The build artifacts will be stored in the `dist/` directory. Use the `--prod` flag for a production build.

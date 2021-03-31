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
 ![Screenshot (1)](https://user-images.githubusercontent.com/78849248/113101470-610d5200-921a-11eb-9228-997a15d089bc.png)
 
 * Login
 ![Screenshot (5)](https://user-images.githubusercontent.com/78849248/113101712-af225580-921a-11eb-8bb1-37b5586ba014.png)

 * Register 
   ![Screenshot (4)](https://user-images.githubusercontent.com/78849248/113101579-839f6b00-921a-11eb-95d5-910818edd1b3.png)



#### Admin
    
  * Home 
    ![Screenshot (6)](https://user-images.githubusercontent.com/78849248/113101799-c95c3380-921a-11eb-946c-632a0239abad.png)

    * After clicking on view users
    ![Screenshot (7)](https://user-images.githubusercontent.com/78849248/113101895-e2fd7b00-921a-11eb-9daa-04254b8e6b18.png)
    
    * After clicking on view compliants
    ![Screenshot (11)](https://user-images.githubusercontent.com/78849248/113102009-06c0c100-921b-11eb-8af8-52bfbfdfb289.png)
    
    * After clicking on view resolvers
   ![Screenshot (10)](https://user-images.githubusercontent.com/78849248/113102078-248e2600-921b-11eb-9b24-06361c1ee096.png)

    * After clicking on assign roles
   ![Screenshot (8)](https://user-images.githubusercontent.com/78849248/113102147-412a5e00-921b-11eb-99c9-a7c3f67d7a87.png)

#### Employee
   
   * Home
        ![Screenshot (13)](https://user-images.githubusercontent.com/78849248/113102245-65863a80-921b-11eb-8647-811631406682.png)

    * After clicking on New Complaint
       ![Screenshot (14)](https://user-images.githubusercontent.com/78849248/113102321-7fc01880-921b-11eb-9b17-5f4e9f8bdb11.png)

    * After clicking on Pending Complaints
      ![Screenshot (19)](https://user-images.githubusercontent.com/78849248/113102483-bac24c00-921b-11eb-9ee3-9f4d1a5d8e57.png)

    * After clicking on Resolved Complaints 
      ![Screenshot (22)](https://user-images.githubusercontent.com/78849248/113102573-d75e8400-921b-11eb-98d2-966213742b16.png)


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

# Spring Boot H2 Database

---

## Project Structure

**_application.properties_ => server.port = 2000**

**_controller\EmployeeController.java_ => REST APIs**

**_handler\ValidationHandler.java_ => allows to manage validation messages**

**_model\Employee.java_ => entity class**


---

## Project Detail

>**1. Go to Postman and test with valid information**

![Ekran görüntüsü 2023-06-18 101632.png](..%2F..%2FEkran%20g%F6r%FCnt%FCs%FC%202023-06-18%20101632.png)

_**If you enter valid information, there is no problem**_

>**2. Now, test with invalid information**

![validation.png](..%2F..%2Fvalidation.png)

![validation2.png](..%2F..%2Fvalidation2.png)

_**The program throws "Http Status 400 Bad Request" and "validation messages"**_




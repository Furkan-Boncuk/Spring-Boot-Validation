# Spring Boot Validation

---

## Project Structure

**_application.properties_ => server.port = 2000**

**_controller\EmployeeController.java_ => REST APIs**

**_handler\ValidationHandler.java_ => allows to manage validation messages**

**_model\Employee.java_ => entity class**


---

## Project Detail

>**1. Go to Postman and test with valid information**

![Ekran görüntüsü 2023-06-18 101632](https://github.com/Furkan-Boncuk/Spring-Boot-Validation/assets/114020260/1d34472d-449d-4f81-b73a-4c1a33c4289b)

_**If you enter valid information, there is no problem**_

>**2. Now, test with invalid information**

![validation](https://github.com/Furkan-Boncuk/Spring-Boot-Validation/assets/114020260/7c6be65b-a35a-45c1-a2b6-a1c7fce3e8f9)

![validation2](https://github.com/Furkan-Boncuk/Spring-Boot-Validation/assets/114020260/9c0e4c76-9aeb-4b69-9cd4-ea7aa44581d7)

_**The program throws "Http Status 400 Bad Request" and "validation messages"**_




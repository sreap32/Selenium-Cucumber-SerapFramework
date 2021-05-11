Feature: Task2


  @Test2
  Scenario: Verify new customer added successfully
    Given The user wants to check in login page text "Guru99 Bank" is present
    When The user wants to login into application with given credentials
    Then The user wants to verify  that the Home page contains text as "Manger Id: mngr323344"
    Then The user wants to  Click on new customer button
    Then The user wants to verify you are in New Customer Entry Page
  Then The user wants to Fill the information for new customer details
    |Customer Name | James Brown |
    |Gender        | Male   |
    |Address       |123 noway  |
    |City          |Kenwood    |
    |State         |Texas      |
    |DateofBirth   |07/19/1988 |
    |PIN           |123456       |
    |Mobile Number |12312312   |
    |E-mail        |james_brown277678@hotmail.com|
    |Password      |5680|
  And The user wants to verify message as "Customer Registered Successfully!!!"

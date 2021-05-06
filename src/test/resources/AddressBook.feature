Feature: Task1


  @Test
  Scenario: Create new project
    Given The user wants to Address Book
    When The user wants to enter Email and Password
    Then Click Sign in button
    Then Click Addresses
    Then Click New Addresses
    Then Enter all infos
     |FirstName    | Serp   |
     |LastName     | Klc   |
     |Address1     |123 noway|
     |Address2     |456 noway|
     |City         |Kenwood |
     |State        |Texas    |
     |ZipCode      |77338    |
     |Country      |United States|
     |Birthday     |07/19/1988   |
     |Age          |32           |
     |Website      |https://www.facebook.com/  |
     |Phone        |12312312     |
     |CommonInterests |Climbing  |
     |Note            |This is my fake address|
    Then Click Create Addresses button
    Then Check success message
    And Click Sign out

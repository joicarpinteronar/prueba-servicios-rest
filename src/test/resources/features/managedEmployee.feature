@Regression
Feature: Like an employer
         I want to be able to consume the Rest services
         To be able to manage employee information

  Scenario Outline: Successfully validate the creation of an employee
    Given that Employee uses the service in Dummy
    When he sends the service information to create an employee
      | id   | name   | salary   | age   |
      | <id> | <name> | <salary> | <age> |
    Then validates the creation of an employee by service
      | status   | message   |
      | <status> | <message> |
    And Validate the response code 200
    Examples:
      | id | name | salary | age | status | message |
     ##@externalData@./src/test/resources/dataDriven/CreateEmployee.xlsx@create

  Scenario: Validation of Consultation to the entire list of employees
    Given that Employee uses the service in Dummy
    When he consults the list of employees
    Then validate that the query is satisfactory
    And Validate the response code 200

  Scenario Outline: Validation and consultation of an employee in a satisfactory manner
    Given that Employee uses the service in Dummy
    When he consults the employee by his id
      | id   | idEmployee   |
      | <id> | <idEmployee> |
    Then validation of the employee query
      | status   | message   |
      | <status> | <message> |
    And Validate the response code 200
    Examples:
      | id | idEmployee | status | message |
     ##@externalData@./src/test/resources/dataDriven/ConsultEmployee.xlsx@query

  Scenario: Validate the correct elimination of an employee
    Given that Employee uses the service in Dummy
    When he eliminates the indicated employee
    Then validates that the deletion is successful
    And Validate the response code 200
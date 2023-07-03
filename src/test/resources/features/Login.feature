@JiraXray-[TestSet]
Feature: Login Orange HRM

  @JiraXray-[Test] @HappyPath
  Scenario: Login succesfull
    Given que me logeo con mis credenciales
    |username|password|
    | Admin  |admin123|
    Then se mostrará el dashboard de recursos humanos
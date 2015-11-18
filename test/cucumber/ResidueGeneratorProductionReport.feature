Feature: Residue Generator Production Report
  As a researcher
  I want visualize the waste production of the residue generators
  So I can collect data for my research

  Scenario: generate month based Residue Production report
  Given the system has a residue generator at “endereco” registered
  When the system generate the general production report for the last "5" months
  Then the residue generator at “endereco” appears at the report

  Scenario: generate empty month based Residue Production report
    Given the system has no registered residue Generator
    When the system generates an production report for the last "5" months
    Then then report is empty

  Scenario: generate month based Residue Production report web
    Given I am at the Residue Generator Report page
    When I click ask the system to produce a report based on the last "5" months
    Then I am at the Report Waste Production page

  Scenario: generate empty month based Residue Production report web
    Given I am at the Residue Generator Report page
    And the system has no registered residue Generator
    When I click ask the system to produce a report based on the last "5" months
    Then I am at the Report Waste Production page
    And the report is empty

  Scenario: generate historical month based residue production report
    Given the system has a residue generator at "Cookie Street"
    When the system receives a request to generate the residue generator production report for the month of "November" for the last "3" years
    Then a report with data for that month and years is generated

  Scenario: generate empty historical month based residue production report
    Given the system has no registered residue generator
    When the system receives a request to generate the residue generator production report
    Then a report with no data is generated

  Scenario: generate historical month based residue production report web
     Given I am at the residue generator report page
     When I select the generate report button
     And I fill the required fields correctly
     Then I am at the Historical Month Report Waste Production page

  Scenario: generate empty historical month based residue production report web
     Given I am at the residue generator report page
     And the system has no registered residue generator
     When I select the generate report button
     And I fill the required fields correctly
     Then I am at the Historical Month Report Waste Production page
     And a report with no data is generated
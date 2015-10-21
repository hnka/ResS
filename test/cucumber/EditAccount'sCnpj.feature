Feature: Edit account's cnpj
  As a generator's owner
  I want to edit correctly my cnpj
  So that I can keep the system update
 
#if($EditGeneratorCnpj)
  @ignore
  Scenario: Edit the cnpj Correctly
    Given the system has a residue generator with Cnpj "12345678912345"
    When I change my cnpj to "45912367834512"
    Then the generator with cnpj is not edited
 
  @ignore
  Scenario: Edit the cnpj incorrectly
    Given the system has a residue generator with Cnpj "12345678912345"
    When I change my cnpj to "testecnpj"
    Then the generator with cnpj is not edited
  @ignore
 
  Scenario: Edit the cnpj correctly web
    Given I am at the residue generator edit page
    When I fill the cnpj field with "45912367834512"
    And I update my changes
    Then I can see a confirmation message
 
  @ignore
  Scenario: Edit the cnpj incorrectly web
    Given I am at te residue generator edit page
    When I fill the cnpj field with "testecnpj"
    And I update my changes
    Then I can see a error message
#end
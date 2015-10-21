#if($Edit restaurants account)

Feature: Edit restaurants account
    As a restaurants owner
    I want edit my restaurant's informations
    So that I can keep the system updated
 
Scenario: Unsuccessful Edition due to empty fields
    Given that I am logged in my restaurant's account
    When I edit the informations about my restaurant
    And I leave any empty information fields
    Then the changes will not be saved

Scenario: successful edition of a restaurant account
    Given that I am logged in my restaurant account
    When I edit the informations about my restaurant
    And I filled out all the informations
    Then the changes will be saved

Scenario: Unsuccessful edtion due to empty fields web
    Given that I am at my home account
    When I select the "Edit" button
    And I leave anything blank
    And I select the "update" button
    Then I see a error mensage
    And I can not edit

Scenario: Edit restaurants account web
    Given that I am at my home account
    When I select the "Edit" button
    And I filled out all the informations
    And I select the "Update" button
    Then I see a success mensage
    And I edit the informantions

#end
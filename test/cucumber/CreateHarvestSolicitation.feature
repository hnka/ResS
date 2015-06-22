Feature: Create a harvest solicitation
  As a residue generator logged into the system
  I want to create a harvest solicitation
  So that I can unload my residues in a appropriate place

  Scenario: Successful creation of a harvest solicitation
    Given there is no active harvest solicitation fot the generator which id is "194"
    When  I submit the harvest solicitation
    Then  the system should store the solicitation

   Scenario: Missing Fields
     Given there is no active harvest solicitation fot the generator which id is "194"
     When  I only set the estimated amount of residue as "50"
     And   I submit the harvest solicitation
     Then  the system should not create a harvest solicitation

    Scenario: Invalid Date
      Given there is no active harvest solicitation
      And   the id of my business is "194"
      When  I set the date as "43/05/2040"
      And   I submit the harvest solicitation
      Then  the system should not create a havest solicitation

     Scenario: Successful creation of a harvest solicitation web
       Given I am at the harvest solicitation creation page
       When  I fill the company name field with "Lore Ipsum"
       And   fill the other required fields
       And   submit the fields
       Then  I should see the new harvest solicitation on the solicitation page

     Scenario: Unsuccessful creation of a harvest solicitation web
       Given Given I am at the harvest solicitation creation page
       When  I fill the date field with "43/05/2040"
       And   submit the fields
       Then  I should stay at the same page
       And   see an error message indicating why the submission failed


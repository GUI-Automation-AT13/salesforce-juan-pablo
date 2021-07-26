Feature: Create Contact

  Scenario: create a contact with required fields
    Given I login to salesforce site as an admin user
    And I navigate to "CONTACTS" page
    When I create a new Contact with fields
      | lastname | nes lastname |
    Then A successful message is displayed
    And I check header name
    Then I check details fields
    When I navigate to "CONTACTS" page
    Then I check the contacts was created


  Scenario: create a contact with all fields
    Given I login to salesforce site as an admin user
    And I navigate to Contacts page
    When I create a new Contact with fields
      | salutation      | Dr.               |
      | firstName       | Contact           |
      | lastname        | Test              |
      | title           | nes Title         |
      | department      | Tarija            |
      | birthdate       | 19/7/2021         |
      | phone           | 1789654           |
      | homePhone       | 1789654           |
      | mobilePhone     | 1789654           |
      | otherPhone      | 1789654           |
      | fax             | 1789654           |
      | email           | example@gmail.com |
      | assistantName   | AssistantName     |
      | assistantPhone  | 1789654           |
      | languages       | English           |
      | mailingStreet   | Ballivian         |
      | postalCode      | Ballivian         |
      | city            | Tarija            |
      | province        | Cercado           |
      | country         | Bolivia           |
      | otherStreet     | Ballivian         |
      | otherPostalCode | Ballivian         |
      | otherCity       | Tarija            |
      | otherProvince   | Cercado           |
      | otherCountry    | Bolivia           |
      | description     | good test         |
      | level           | Primary           |

    Then A successful message is displayed
    And I check header name
    Then I check details fields
    When I move to contacts pages
    Then I check the contacts was created


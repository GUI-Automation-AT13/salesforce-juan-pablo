Feature: Create Contact

  Scenario: create a contact with required fields
    Given I login to salesforce site as an admin user
    And I navigate to "CONTACTS" page
    When I create a new Contact with fields
      | LastName | lastname |
    Then A successful message is displayed
    And I check header name
    Then I check details fields
    When I navigate to "CONTACTS" page
    Then I check the contacts was created


  Scenario: create a contact with all fields
    Given I login to salesforce site as an admin user
    And I navigate to "CONTACTS" page
    When I create a new Contact with fields
      | Salutation        | Dr.               |
      | FirstName         | Contact           |
      | LastName          | lastname          |
      | Title             | Title`            |
      | Department        | Tarija            |
      | Birthdate         | 19/7/2021         |
      | Phone             | 1789654           |
      | HomePhone         | 1789654           |
      | MobilePhone       | 1789654           |
      | OtherPhone        | 1789654           |
      | Fax               | 1789654           |
      | Email             | example@gmail.com |
      | AssistantName     | AssistantName     |
      | AssistantPhone    | 1789654           |
      | MailingStreet     | Ballivian         |
      | MailingPostalCode | Ballivian         |
      | MailingCity       | Tarija            |
      | MailingState      | Cercado           |
      | MailingCountry    | Bolivia           |
      | OtherStreet       | Ballivian         |
      | OtherPostalCode   | Ballivian         |
      | OtherCity         | Tarija            |
      | OtherState        | Cercado           |
      | OtherCountry      | Bolivia           |
      | Languages__c      | Spanish           |
      | Level__c          | Primary           |
      | Description       | good test         |
    Then A successful message is displayed
    And I check header name
    Then I check details fields
    When I navigate to "CONTACTS" page
    Then I check the contacts was created


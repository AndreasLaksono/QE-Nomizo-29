Feature: Register

  Scenario Outline: POST - As an admin I have to be able to create new user
    Given I set an endpoint for post new "<email>", "<username>" with "<password>"
    When I request post detail user
    Then I validate the status code is "<status_code>"
    And validate the "<message>" after create user
    And get email if "<message>" for other request
    Examples:
      |email|username|password|status_code|message|
      |   |   |   |201|bad request|
      |mail|User123|Test1234|201|success login|
      |mail|User123|   |201|bad request|
      |qe|User123|Test1234|201|bad request|
      |  |User123|Test1234|201|bad request|


#  Scenario Outline: POST - As an admin I have to be able to create new user
#    Given I set an endpoint for post user "<email>" with "<password>"
#    When I request post detail user
#    Then I validate the status code is "<status_code>"
#    And validate the "<message>" after create user
#    And get token if "<message>" for other request
#    Examples:
#      |email|password|status_code|message|
#      |null|null|500|bad request|
#      |mail|Test1234|200|success login|
#      |mail|null|500 |bad request|
#      |qe1@gmail.com|Test.1234|500|bad request|
#      |null|Test.1234|500|bad request|
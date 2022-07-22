Feature: Nomizo app
  As a user
  I want to access the application
  So that I cant use the application

  Scenario Outline: Login Scenario
    Given I am on loading page
    And I click skip button
    When I input "<email>" email
    And I input "<password>" password
    And I click login button
    Then I validate "<data>" error message login
    Examples:
    |email|password|data|
    |laksono651@gmail.com|Test1234|success admin|
    |qe1@gmail.com|Test1234|success user|
    |              |         |error null all|
    |              |Test1234|error null email|
    |laksono651@gmail.com|         |error null password|

  Scenario Outline: Register Scenario
    Given I am on loading page
    And I click skip button
    And I click register menu button
    When I input "<email>" email
    And I input "<password>" password
    And I input "<passwordConfirm>" confirmation password
    And I click register button
    Then I validate "<dataRegister>" error message register
    Examples:
      |email|password|passwordConfirm|dataRegister|
      |qe1@mail.com|Test1234|Test1234|success|
      |laksono651@gmail.com|Test1234|Test1234|error gagal|
      |              |         |       |error null all|
      |              |Test1234|Test1234|error null email|
      |qe1@mail.com|          |Test1234|error null password|
      |qe1@mail.com|Test1234|         |error null confirmation password|

  Scenario: Profile - Logout User
    Given I am on loading page
    And I click skip button
    When I input "laksono651@gmail.com" email
    And I input "Test1234" password
    And I click login button
    Then I go to profile page
    And I click setting button
    And I click logout button
    And validate the result

  Scenario Outline: Profile - Edit User
    Given I am on loading page
    And I click skip button
    And I input "laksono651@gmail.com" email
    And I input "Test1234" password
    And I click login button
    When I go to profile page
    And I click setting button
    And I click edit profile button
    Then I am on edit profile page
    And I input "<username>" user
    And I input "<FullName>" full name
    And I input "<Bio>" bio
    And I click save button profile
    And validate the "<result>" edit profile
    Examples:
    |username|FullName|Bio|result|
    |babyyaga330|Andreas Laksono|Hi I'm Andreas|success|
    |           |Andreas Laksono|Hi I'm Andreas|error null username|
    |babyyaga330|               |Hi I'm Andreas|error null full name|
    |babyyaga330|Andreas Laksono|              |error null bio|
    |           |               |              |error null all|

  Scenario: Profile - View populer post
    Given I am on loading page
    And I click skip button
    When I input "laksono651@gmail.com" email
    And I input "Test1234" password
    And I click login button
    Then I go to profile page
    And I click populer post
    And I validate response after click populer post

  Scenario: Profile - View latest post
    Given I am on loading page
    And I click skip button
    When I input "laksono651@gmail.com" email
    And I input "Test1234" password
    And I click login button
    Then I go to profile page
    And I click latest post
    And I validate response after click latest post

  Scenario Outline: Profile - Search
    Given I am on loading page
    And I click skip button
    When I input "laksono651@gmail.com" email
    And I input "Test1234" password
    And I click login button
    Then I go to profile page
    And I click button search in profile
    And I input "<search>" field
    And I validate "<response>" after search in profile page
    Examples:
    |search|response|
    |food|success|
    |      |failed|

  Scenario: Notification - View
    Given I am on loading page
    And I click skip button
    When I input "laksono651@gmail.com" email
    And I input "Test1234" password
    And I click login button
    Then I go to notification page
    And I validate response after click notification page

  Scenario Outline: Post - Create new post
    Given I am on loading page
    And I click skip button
    And I input "laksono651@gmail.com" email
    And I input "Test1234" password
    When I click login button
    And I go to post page
    And I input "<judul>" judul diskusi
    And I input "<deskripsi>" deskripsi diskusi
    And I chose the kategori
    Then I click post button
    And validate the "<result>" after create new post
    Examples:
    |judul|deskripsi|result|
    |Atlet termahal|Tuliskan Atlet termalah menurut kalian|Success|
    |              |Hallo                                 |error null judul|
    |Olahraga      |                                      |error null deskripsi|
    |              |                                      |error null|

  Scenario Outline: Post - Create new kategori
    Given I am on loading page
    And I click skip button
    And I input "laksono651@gmail.com" email
    And I input "Test1234" password
    When I click login button
    And I go to post page
    And I click kategori button
    And I click button tambah kategori
    Then I input "<nama>" nama ketegori
    And I input "<bio>" bio ketegori
    And I input "<rules>" rules kategori
    And I click save button kategori
    And validate the "<result>" after create new categori
    Examples:
      |nama|bio|rules|result|
      |Pendidikan|Membahas tentang dunia pendidikan|Hanya hal yang berkaitan dengan pendidikan saja|success|
      |          |Membahas tentang dunia pendidikan|Hanya hal yang berkaitan dengan pendidikan saja|error null nama|
      |Pendidikan|               |Hanya hal yang berkaitan dengan pendidikan saja|error null full bio|
      |Pendidikan|Membahas tentang dunia pendidikan|              |error null result|
      |          |               |              |error null|

  Scenario: Search - Follow user
    Given I am on loading page
    And I click skip button
    When I input "laksono651@gmail.com" email
    And I input "Test1234" password
    And I click login button
    And I am on home page
    Then I click search button
    And I click user
    And I am on user page
    And I click button follow user

  Scenario: Search - Follow kategori
    Given I am on loading page
    And I click skip button
    When I input "laksono651@gmail.com" email
    And I input "Test1234" password
    And I click login button
    And I am on home page
    Then I click search button
    And I click kategori
    And I am on kategori page
    And I click button follow kategori

  Scenario: Post - Send Comment
    Given I am on loading page
    And I click skip button
    When I input "laksono651@gmail.com" email
    And I input "Test1234" password
    And I click login button
    And I am on home page
    Then I click post card
    And I click comment button
    And I input "Wow keren sekali!!!" in comment
    And I click send comment button
    And validate the result after comment

  Scenario: Post - Share post
    Given I am on loading page
    And I click skip button
    When I input "laksono651@gmail.com" email
    And I input "Test1234" password
    And I click login button
    And I am on home page
    Then I click share post card button
    And validate the result after click share button

  Scenario: Post - Report
    Given I am on loading page
    And I click skip button
    When I input "laksono651@gmail.com" email
    And I input "Test1234" password
    And I click login button
    And I am on home page
    Then I click share post card button
    And validate the result after click share button

  Scenario Outline: Search
    Given I am on loading page
    And I click skip button
    When I input "laksono651@gmail.com" email
    And I input "Test1234" password
    And I click login button
    And I am on home page
    Then I click search button
    And I click field search
    And I input "Foods"
    And I click "<type>"
    And validate the result search
    Examples:
    |type|
    |populer|
    |terbaru|
    |kategori|
    |kreator|

#  Scenario: Follow User
#    Given I am on loading page
#    And I click skip button
#    When I input "laksono651@gmail.com" email
#    And I input "Test1234" password
#    And I click login button
#    Then I am on home page
#    And I click menu post button
#    And I click follow user button
#    And validate the result follow user
#
#  Scenario: Follow Kategori
#    Given I am on loading page
#    And I click skip button
#    When I input "laksono651@gmail.com" email
#    And I input "Test1234" password
#    And I click login button
#    Then I am on home page
#    And I click menu post button
#    And I click follow kategori
#    And validate the result follow kategori
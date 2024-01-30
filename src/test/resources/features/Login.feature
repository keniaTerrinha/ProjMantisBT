@regressivo
  Feature:Login

  Background:
    Given that it the user are home page


  Scenario Outline: Access login successfully <identification>
    When Enter username and password <username> and <password>
    And click on button login
    Then valid user page <username>
    Then valid page title <titlePage>

    Examples:
      | identification | username            |titlePage  | password  |
      | successfully   | "kenia.terrinha"    | "MantisBT"|"Kenia@06!"|





    Scenario Outline: Access login unsuccessfully <identification>
    When Enter username and password <username> and <password>
      And click on button login
      Then valid password invalid <msg>



      Examples:
        | identification                       | username         | password    |msg |
        | unsuccessfully username              | "camila.Jesus"   | "Kenia@06!" |"Your account may be disabled or blocked or the username/password you entered is incorrect."    |
        | unsuccessfully password              | "kenia.terrinha" | "Test@2023" |"Your account may be disabled or blocked or the username/password you entered is incorrect."    |
        | unsuccessfully username and password | "camila.Jesus"   | "Test@2023" |"Your account may be disabled or blocked or the username/password you entered is incorrect."    |





    Scenario Outline:  Exit my account  <identification>
      When Enter username and password <username> and <password>
      And click on button login
      And click on my account
      Then click on exit

      Examples:
        | identification | username           | password  |
        | successfully   | "kenia.terrinha"   |"Kenia@06!"|



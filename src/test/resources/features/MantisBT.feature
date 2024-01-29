
  Feature:MantisBT

  Background:
    Given that it the user are home page
    When Enter username and password "kenia.terrinha" and "Kenia@06!"
    And click on button login


@regressivo
  Scenario Outline: Access login successfully <identification>
    Then valid user page <username>
    Then valid page title <titlePage>

    Examples:
      | identification | username            |titlePage |
      | successfully   | "kenia.terrinha"    | "MantisBT"|
      | successfully   | "kenia.terrinha"    | "MantisBT"|




    Scenario Outline: Access login unsuccessfully <identification>

      Then valid password invalid <msg>



      Examples:
        | identification                       | username         | password    |msg |
        | unsuccessfully username              | "camila.Jesus"   | "Kenia@06!" |"Your account may be disabled or blocked or the username/password you entered is incorrect."    |
        | unsuccessfully password              | "kenia.terrinha" | "Test@2023" |"Your account may be disabled or blocked or the username/password you entered is incorrect."    |
        | unsuccessfully username and password | "camila.Jesus"   | "Test@2023" |"Your account may be disabled or blocked or the username/password you entered is incorrect."    |




    Scenario: Exit my account
      And click on my account
      Then click on exit





    Scenario Outline: Access my account <identification>
      And click on my account
      Then validate edition account <realNameCurrent>

      Examples:
        | identification         | realNameCurrent    |
        | edition successfully   | "kenia Olinquevicz"|
        | edition successfully   | "222333"           |
        | edition successfully   | "##!!@@**_-"       |
        | edition successfully   | "Kenia Terrinha"   |




    Scenario: select project <identification>
      Then select the project




    Scenario Outline: access my view <identification>
      Then click in menu opcion my view


      Examples:
        | identification | username         | password    |titlePage |
        | successfully   | "" | "" | ""|





    Scenario Outline: access view tasks<identification>

      Then click in menu opcion view tasks


      Examples:
        | identification | username         | password    |titlePage |
        | successfully   | "" | "" | ""|



    Scenario Outline: access task creation through the menu <identification>
      Then select the project
      Then click in menu opcion create tasks <descsummary> and <descDescription>


      Examples:
        | identification                                           | descsummary             | descDescription    |
        |  unsuccessfully with descsummary  and descDescription    | "New Project menu"      | "New project test automation through the menu create task" |
        |  unsuccessfully without  descDescription                 | ""                      | "New project test automation through the menu create task" |
        |  unsuccessfully without descsummary                      | "New Project menu"      | "" |
        |  unsuccessfully without descsummary  and descDescription | ""                      | "" |



    Scenario Outline: access task creation through the button <identification>
      Then select the project
      Then click button create tasks <descsummary> and <descDescription>


      Examples:
        | identification                                            | descsummary        | descDescription                               |
        |  successfully                                             | "New Project buton"| "New Project through the button  create task" |
        |  unsuccessfully without descsummary                       | ""                 | "New Project through the button  create task" |
        |  unsuccessfully without descDescription                   | "Project button"   | ""                                            |
        |  unsuccessfully without descsummary  and descDescription  | ""                 | ""                                            |




    Scenario Outline: access change log <identification>


      Then click in menu opcion change log


      Examples:
        | identification | username         | password    |titlePage |
        | successfully   | "" | "" | ""|



    Scenario Outline: access planning <identification>


      Then click in menu opcion planning


      Examples:
        | identification | username         | password    |titlePage |
        | successfully   | "" | "" | ""|

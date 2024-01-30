@regressivo
  Feature:MantisBT

  Background:
    Given that it the user are home page
    When Enter username and password "kenia.terrinha" and "Kenia@06!"
    And click on button login


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




    Scenario: access my view
      Then click in menu opcion my view



    Scenario: access view tasks

      Then click in menu opcion view tasks
      And printT and export task





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




    Scenario Outline: search task <identification>
       Then search number Task <numTask>
       And click search <msg>



      Examples:
        | identification                               | numTask            |msg              |
        |  successfully                                | "0000203"          |""               |
        |  unsuccessfully without the first 4 digits   | "203"              |""               |
        |  unsuccessfully just two digits              | "03"               |"Access Denied"  |


    Scenario Outline: access change log <identification>


      Then click in menu opcion change log



      Examples:
        | identification | msgText                                      |
        | successfully   | "No Change Log information available" |



    Scenario Outline: access planning <identification>


      Then click in menu opcion planning



      Examples:
        | identification | msgText                            |
        | successfully   | "No Roadmap information available" |



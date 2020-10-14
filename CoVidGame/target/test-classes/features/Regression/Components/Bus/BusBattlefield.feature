@PublicBus @Regression
Feature: Super villain COVID-19 has struck Planet Earth, and humans are on the verge of extinction. Our superheroes, The Avengers have come to the rescue. This mission starts with battling our super villain starting from Bus to other locations and educate humans to fight COVID villain.

  Scenario Outline: "Hulk SOAP" enters the virtual Bus battlefield and solves the list of all online questionnaires successfully.
    Given "<SuperHero>" has navigated to the webApp
    And enters his/her warrior name as "<WarriorName>" and starts the journey
    And selects his battlefield "<Battlefield_type>"
    And starts the questionnaire
    When the questions are successfully attacked one at a time until the end "<Battlefield_type>"

    Examples:
      | SuperHero | WarriorName | Battlefield_type |
      | Hulk 500  | Hulk_500    | Bus              |


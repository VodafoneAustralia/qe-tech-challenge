@PublicPlace @Regression
Feature: Super villain COVID-19 has struck Planet Earth, and humans are on the verge of extinction. Our superheroes, The Avengers have come to the rescue. This mission starts with battling our super villain at various Public places and educate humans  to fight COVID villain.

  Scenario Outline: "Iron Man The Handwasher" enters the virtual Public place battlefield and solves the list of all online questionnaires successfully related to precautions.
    Given "<SuperHero>" has navigated to the webApp
    And enters his/her warrior name as "<WarriorName>" and starts the journey
    And selects his battlefield "<Battlefield_type>"
    And starts the questionnaire
    When the questions are successfully attacked one at a time until the end "<Battlefield_type>"

    Examples:
      | SuperHero    | WarriorName | Battlefield_type |
      | Iron Man 500 | IronMan_500 | PublicPlace      |

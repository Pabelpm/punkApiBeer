# Fintonic - Punk Api Beer
---

## US-001 Create a base app
### Functional description
 **This application needs the following requirements :**

  * MVVM with liveData as presentation pattern
  * Clean architecture
  * Dependency injection with Hilt
  * Unit Test
  * UI Android Test
  * Barista Utils for UI Android Test
  * Communication layer with Retrofit
  * Local repository with Room
  * Show images using glide android
  * Using customs views

###### DoR
1. *Thinking about the general project and choose framework or organisation for the requirements*

###### DoD
1. *Added frameworks and example for them*
1. *Android Project compiled*


---
## US-002 Retrive and show first beer´s page
### Functional description
 A user enters the application, he can see a list with some beers

###### Gherkins
    Feature: Show first page of beer

    As a user with the Fintonic - Punk Api Beer app
    I want to see some beers

      Scenario: A user with the Fintonic - Punk Api Beer app
        Given a user init his Fintonic - Punk Api Beer app
        When the system retrive all beers
        Then the system provide and show some beers

###### DoR
1. *Internal and external dependencies have been defined*
2. *Acceptance Criteria are defined and accepted by the team*

###### DoD
1. *Unit test pass*
2. *Acceptance test pass*



---
## US-003 Show special beer
### Functional description
 A user enters the application, he requests recovery special beer and that it be show with a full description, with the fewest server calls

###### Gherkins
    Feature: Show special beer

    As a user with the Fintonic - Punk Api Beer
    I want to see a special beer

      Scenario: A user with the Fintonic - Punk Api Beer
        Given a user init his Fintonic - Punk Api Beer app
        When the user click the beer that want to obtain his information
        Then the system provide and show the full beer information

###### DoR
1. *Internal and external dependencies have been defined*
2. *Acceptance Criteria are defined and accepted by the team*

###### DoD
1. *Unit test pass*
2. *Acceptance test pass*



---
## US-004 Get all beers
### Functional description
 A user enters the application, he can see the last beers seen

###### Gherkins
    Feature: Show last beers seen

    As a user with the Fintonic - Punk Api Beer
    I want to see last beers seen

      Scenario: A user with the Fintonic - Punk Api Beer
        Given a user init his Fintonic - Punk Api Beer app
        When the user stays in the principal window
        And the user scrolls to the end
        Then the system provide last beer seen

###### DoR
1. *Internal and external dependencies have been defined*
2. *Acceptance Criteria are defined and accepted by the team*

###### DoD
1. *Unit test pass*
2. *Acceptance test pass*





# Fintonic - Punk Api Beer Explanations
---

Run all ( Unit and instrumentation) test  ./gradlew testAll


# Fintonic - Comments about app
---


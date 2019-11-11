Feature: add a nearby planet/planets to star

  Scenario: add the planet to the star it is circling around
    Given I am logged as a admin and chose a star
    And I don't have a planet on a current star
    When I search for planet on a star planet list
    And I add planet as a star planet list
    Then I should have a planet on a star planet list
 
  Scenario: add the planet to the star it is circling around when already exist
    Given I am logged as a admin and chose a star
    And I don't have a planet on a current star
    When I search for planet on a star planet list
    And I add planet as a star planet list
    Then I should have get a error
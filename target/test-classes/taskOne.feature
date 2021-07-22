Feature: I want to test task one

  Scenario: I want to select the first filter
    Given I go to shop page
    When I select "Men's Apparel" first list of filters and I select "30" second list of filters
    Then I check and see this filters on the display
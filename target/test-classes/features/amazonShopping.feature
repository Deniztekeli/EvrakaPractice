Feature: Buy functionality

  @wip
  Scenario: User should buy iphone12
  When Go to url
  And Search iPhone12 512
  And Check that the results are listed
  And Click iPhone12 at the top of the list
  Then Log the following values for each size .Size information .Price .Color .Stock status
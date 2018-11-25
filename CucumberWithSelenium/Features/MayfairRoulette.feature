Feature: As a WH Customer I want to be able to search for specific game on Vegas Casino and login to the webpage

Scenario: Verify if WH Customer is able to search for specific game on Vegas Casino and login to the webpage
   		Given Customer is on Vegas Casino home page
   		When Customer clicks magnifier button
   		When Customer enters Mayfair Roulette as a game name
   		When Customer hovers over the Mayfair Roulette game title 
   		When Customer clicks More button
   		When Customer clicks Play Now button
   		Then Validate full Login Window is displayed
   		
Feature: Navigation to DS Algo Homepage

    
  Scenario: Navigating to the Homepage of DS Algo
    Given I have opened the Web browser
    When I give DS Algo  portal URL
    Then I get navigated to the mainpage
     And I see the 'Get Started' button
    When I click on the 'Get Started' button
    Then I should be navigated to the homepage of DS Algo

  
  Scenario: Accessing Data Structure Sections without Logging In
    Given I am on  Homepage
    Given I have not logged in
    When I click on the 'Data Structure' dropdown button
    Then I should see six different Data Structure entries
    When I click on each entry 
    Then I should get error message 'you are not logged in'
    
   
    
    Scenario: Exploring buttons under each topic on the page 
    Given I am on the Homepage
    When I click on the 'Get Started' button under 'Data Structure Introduction' description
    Then I should see error message 'You are not logged in'
    And I click the 'Get Started' button under 'Array','Linked-list','Queue','Tree','Stack' and 'Graph'
    Then I should get the error message "You are not logged in'
	  

    Scenario: Navigate to Register  pages
    Given I am on the DsAlgo homepage
    When I click on the 'Register' link on the home
    Then I should be taken to the Registration page
    
    Scenario: Navigate to and Sign-in pages
    Given I am on the Ds Algo mainhomepage
    Given I click on the 'Sign-in' link
    Then I should be taken to the Sign-in page
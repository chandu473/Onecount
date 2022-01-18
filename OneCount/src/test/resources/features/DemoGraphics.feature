Feature: DEMOGRAPHICS page validations

 
  Scenario Outline: Navigate to the Demographics Page and validate the Create Demo filed is Displayed
    Given user navigate to the onecount App and login with "<UserName>" and "<PassWord>"
    When user clicks on Setup Side menu and navigates to the Demograhics page
    Then Verify the user is able to view the Create Demo Button
    Then Verify the user is able to logout and close the browser

    Examples: 
      | UserName | PassWord |
      | onecount | test     |

  Scenario Outline: Navigate to the Demographics Page and Create a New Demo
    Given user navigate to the onecount App and login with "<UserName>" and "<PassWord>"
    When user clicks on Setup Side menu and navigates to the Demograhics page
    Then Verify the user is able to view the Create Demo Button
    Then user clicks on create demo button in Demographics Page
    Then user switches to the new demo popup and verifies the title of the popup
    When user pass the input data and clicks the save button
    Then user verifies the newly created Demo is displayed in the Demo builder page
    Then Verify the user is able to logout and close the browser

    Examples: 
      | UserName | PassWord |
      | onecount | test     |

    
   Scenario Outline: Verify the action Icons Are displaying in the Demographics page
    Given user navigate to the onecount App and login with "<UserName>" and "<PassWord>"
    When user clicks on Setup Side menu and navigates to the Demograhics page
    Then Verify the user is able to view the Create Demo Button
    Then Verify the user is able to view the datatable and Operations tab in the DemoPage
    Then Verify the user is able to view the action icons 
    Then Verify the user is able to logout and close the browser
    
    
    Examples: 
      | UserName | PassWord |
      | onecount | test     |
    
    
 
   Scenario Outline: Verify the action Icons Are displaying in the Demographics page
    Given user navigate to the onecount App and login with "<UserName>" and "<PassWord>"
    When user clicks on Setup Side menu and navigates to the Demograhics page
    Then Verify the user is able to view the Create Demo Button
    Then Verify the user is able to view the datatable and Operations tab in the DemoPage
    Then Verify the user is able to view the action icons 
    Then Verify the user is able to perform the Edit action and update the demo.
    
    Examples: 
      | UserName | PassWord |
      | onecount | test     |
      
      
       @Azeem
   Scenario Outline: Verify the action Icons Are displaying in the Demographics page
    Given user navigate to the onecount App and login with "<UserName>" and "<PassWord>"
    When user clicks on Setup Side menu and navigates to the Demograhics page
    Then Verify the user is able to view the Create Demo Button
    Then Verify the user is able to view the datatable and Operations tab in the DemoPage
    Then Verify the user is able to view the action icons 
    Then Verify the user is able to perform the Delete action and search for the same Demo.
    
    Examples: 
      | UserName | PassWord |
      | onecount | test     |
    
    
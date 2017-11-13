Feature: Login feature

  Background: Navigate to Login Page
    Given that I navigate to the "Login Page" menu category
    And I am on the Login Page


  Scenario: dismiss the permission popup
    When I press view with id "com.android.packageinstaller:id/permission_allow_button"
    Then I should see the login fields
    And I should see the login button

Feature: Test SkillRary 
Scenario: To test login functionality  
Given I should go to the login page 
And Enter the username "admin"
And Enter the password "admin"
And Click on the login button
Then I should see the username as "SkillRary Ecommerce" 
And click on the username
And click on the sign out
And I have to go to skillrary homepage as "SkillRary Courses"
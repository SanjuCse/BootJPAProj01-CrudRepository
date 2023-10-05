@acms
Feature: acms
@login @all
Scenario: Verify the user to able to login to the url with valid credentials.
 Given I enter URL on the browser
Then I passed vaild user name and vaild password
And Click on check box
 And Click On login button
@Region @all
 Scenario: Verify the user to able to create Region.
 Given I enter URL on the browser
 Then I passed vaild user name and vaild password
And Click on check box
 And Click On login button
 When User Clicks on Region
 And Add the details on it 
 Then Click on create and User succesfully created 
 #Then I can see the successful message
@Update @all 
Scenario: Verify User is successfuly able to update Region
 Given I enter URL on the browser
 Then I passed vaild user name and vaild password
And Click on check box
 And Click On login button
 When User Clicks on Region
 And User have started upadting the Region
And User have Entered all the updated fields 
Then User click on Update and display Toast Message
@CreateAccount @all
Scenario: Verify Whether User Should able to create Account
Given I enter URL on the browser
 Then I passed vaild user name and vaild password
And Click on check box
 And Click On login button
 Then Click on create Account and add all mandatory fields
 And Added all mandatory fields
 And I have Validated Admin Profile
 
 @calenderpopup @all
 Scenario: Checking for calender popup
  Given I enter URL on the browser
Then I passed vaild user name and vaild password
And Click on check box
 And Click On login button
  When I click on Claender icon
  
  @Toseethefileuploadpopup
 Scenario: Checking for file upload popup
 
  Given I enter URL on the browser
Then I passed vaild user name and vaild password
And Click on check box
 And Click On login button
 Then I have Uploaded the po file 


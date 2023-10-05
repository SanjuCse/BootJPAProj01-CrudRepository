@acms
Feature: acms
@login
Scenario: Verify the user to able to login to the url with valid credentials.
 Given I enter URL on the browser
Then I passed vaild user name and vaild password
And Click on check box
 And Click On login button
 @dateautomate
Scenario: i am automating the date
  Given I enter URL on the browser
Then I passed vaild user name and vaild password
And Click on check box
 And Click On login button
 Then Enter a date into date to textfield
  @selecting_account
Scenario: i am selecting the account
Given I enter URL on the browser
Then I passed vaild user name and vaild password
And Click on check box
 And Click On login button
 And Click on account module
 And Click on under account submodule account button
 And Click on create button
 And Select region dropdown
 And Select dropdown click
 And enter company profile name
 And select account type dropdown
 And select a customer
 And enter address in the textfield
 And enter state in the textfield
 And enter country in the textfield
 And enter postcode in the textfield
 And enter admin profile name
 And enter email
 And click on manage account checkbox
 And clik on create button
 And get text from technical assignee
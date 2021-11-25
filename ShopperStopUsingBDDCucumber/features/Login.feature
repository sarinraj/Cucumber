Feature: Login Feature
Scenario: Positive Sign in
Given user must be on home page
When user click on heart icon
And user enter mobile number registered
And user click send otp
And user enters continue in OTP page 
Then User is on home page
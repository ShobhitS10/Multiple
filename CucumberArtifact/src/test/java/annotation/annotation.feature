Feature: annotation 
#This is how background can be used to eliminate duplicate steps 

Background: 
   User navigates to Facebook Given 
   I am on Facebook login page 

#Scenario with AND 
Scenario: 
   When I enter Username as "TOM"
   And I enter Password as "JERRY" 
   Then Login should fail 

#Scenario with BUT 
Scenario: 
   When I enter Username as "TOM" 
   And I enter Password as "JERRY" 
   Then Login should fail 
   But Relogin option should be available
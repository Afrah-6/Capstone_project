Feature: Checking dropdown Feature

Scenario: Books
Given User is on home page
When User clicks on Books 
And User clicks on 99-299 under Books by Budget
Then user clicks on first book and adds to cart



Scenario: Fiction
Given User is on home page
When User clicks on Fiction 
And User clicks on Fiction-BestSellers under Best-Sellers
Then user clicks on first book and adds to cart


Scenario: Non-Fiction
Given User is on home page
When User clicks on Non-Fiction 
And User clicks on Best Books Of The Year under Browse
Then user clicks on first book and adds to cart



Scenario: Teens & Ya
Given User is on home page
When User clicks on Teens& Ya
And User clicks on RelationShip Stories Under Top Subjects
Then user clicks on first book and adds to cart




Scenario: Kids
Given User is on home page
When User clicks on Kids
And User clicks on Akbar and Birbal  under Popular Series
Then user clicks on first book and adds to cart




Scenario: Exams
Given User is on home page
When User clicks on Exams
And User clicks on Banking(IBPS, SBI) under Government Exams
Then user clicks on first book and adds to cart
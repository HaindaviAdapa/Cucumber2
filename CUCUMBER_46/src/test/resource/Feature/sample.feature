Feature: I will be automating Add Skills functionality in Orange HRM

Background: Common Steps
Given User Opens chrome browser
When User Opens URL"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

Scenario: Adding Skills
Given User enters Username as "Admin" and Password as "admin123"
Then User navigates to Skills Page
When User creates Skills record as Skill Name as "Skill808" and Skill Description as "Skill808 desc"
Then  Close browser

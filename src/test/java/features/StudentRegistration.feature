Feature: Course registration
@test
Scenario Outline: Student registration
    Given The student navigates to registration page on chrome browser
    When The student enters all the data    
    And The student submits the form
    Then Submission should be received
    Examples:
   
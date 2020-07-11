Feature: Login
  Agile Story: As a user, I should be able to login with correct credentials to different accounts

  Scenario: Librarian account verification

    Given Librarian is on the login page
    Then Librarian should be able to login with correct credentials and sees the Dashboard


  Scenario: Student account verification

    Given Student is on the login page
    Then Student should be able to login with correct credentials and sees the Dashboard


  Scenario: Admin account verification and sees the Dashboard

    Given Admin is on the login page
    Then Admin should be able to login with correct credentials
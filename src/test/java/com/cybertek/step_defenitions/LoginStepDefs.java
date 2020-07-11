package com.cybertek.step_defenitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStepDefs {

    @Given("Librarian is on the login page")
    public void librarian_is_on_the_login_page() {
        System.out.println("Librarian is on the login page");
    }


    @Then("Librarian should be able to login with correct credentials")
    public void librarian_should_be_able_to_login_with_correct_credentials() {
        System.out.println("Librarian should be able to login with correct credentialsand sees the Dashboard");
    }

    @Given("Student is on the login page")
    public void student_is_on_the_login_page() {
        System.out.println("Student is on the login page");
    }


    @Then("Student should be able to login with correct credentials")
    public void student_should_be_able_to_login_with_correct_credentials() {
        System.out.println("Student should be able to login with correct credentials and sees the Dashboard");
    }

    @Given("Admin is on the login page")
    public void admin_is_on_the_login_page() {
        System.out.println(" Admin is on the login page");
    }


    @Then("Admin should be able to login with correct credentials")
    public void admin_should_be_able_to_login_with_correct_credentials() {
        System.out.println("Admin should be able to login with correct credentials and sees the Dashboard");
    }

    }


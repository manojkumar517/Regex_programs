package com.bridzlabs;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration {

    public String FirstName(String name) {
        String regex = "[A-Z][a-z]{2,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        if (matcher.matches()) {
            return name;
        }
        String fail = "No match found, Please Enter correct validations for name...";
        return fail;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("WELCOME TO USER REGISTRATION PROGRAM USING REGEX");
        Scanner scan = new Scanner(System.in);
        UserRegistration obj = new UserRegistration();

        String firstName;
        System.out.println("Enter the first name, Start with capital letter and has min 3 letter :-");
        firstName = scan.next();
        String firstname = obj.FirstName(firstName);
        System.out.println("First Name is:- " + firstname);

        String lastName;
        System.out.println("Enter the last name, Start with capital letter and has min 3 letter :-");
        lastName = scan.next();
        String lastname = obj.FirstName(lastName);
        System.out.println("Last Name is:- " + lastName);
    }
}
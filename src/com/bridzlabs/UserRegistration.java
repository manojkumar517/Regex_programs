package com.bridzlabs;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration {
    public String Name(String name) {
        String regex = "[A-Z][a-z]{2,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        if (matcher.matches()) {
            return name;
        }
        String fail = "No match found, Please Enter correct validations for name...";
        return fail;
    }

    public String email(String email){
        String regex = "[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if(matcher.matches()){
            return email;
        }
        String fail = "No match found, Please Enter correct validations for Email...";
        return fail;
    }

    public String mobileNumber(String mobNumber){
        String regex = "^[0-9]{2}[/-]{1}[0-9]{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mobNumber);
        if(matcher.matches()){
            return mobNumber;
        }
        String fail = "No match found, Please Enter correct validations for Mobile number...";
        return fail;
    }

    public String passwordCheck(String password){
        String regex = "^/(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        if(matcher.matches()){
            return password;
        }
        String fail = "No match found, Please Enter correct validations for Password...";
        return fail;
    }

    public static void main(String[] args) {
        System.out.println("WELCOME TO USER REGISTRATION PROGRAM USING REGEX");
        Scanner scan = new Scanner(System.in);
        UserRegistration obj = new UserRegistration();
        String firstName;
        System.out.println("Enter the first name, Start with capital letter and has min 3 letter :-");
        firstName = scan.next();
        String firstname = obj.Name(firstName);
        System.out.println("First Name is:- "+firstname);

        String lastName;
        System.out.println("Enter the last name, Start with capital letter and has min 3 letter :-");
        lastName = scan.next();
        String lastname = obj.Name(lastName);
        System.out.println("Last Name is:- "+lastname);

        String emailId;
        System.out.println("Enter your email Id");
        emailId = scan.next();
        String email = obj.email(emailId);
        System.out.println("Email Id is :- "+email);

        String mobNumber;
        System.out.println("Enter mobile number country code follow by space an 10 digit number");
        mobNumber = scan.next();
        String number = obj.mobileNumber(mobNumber);
        System.out.println("Mobile Number is:- "+number);

        String password;
        System.out.println("Enter password with having minimum 8 character, Atleast 1 Uppercase letter, Atleast 1 Number");
        password = scan.next();
        String pass = obj.passwordCheck(password);
        System.out.println("Password is :- "+pass);
    }
}
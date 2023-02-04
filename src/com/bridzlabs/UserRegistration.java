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

        String name;
        System.out.println("Enter the first name, Start with capital letter and has min 3 letter :-");
        name = scan.next();
        String res = obj.FirstName(name);
        System.out.println(res);
    }
}
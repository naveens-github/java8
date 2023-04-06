package com.myproject.java8.preDefinedFunctionalInterfacesPredicate;

import java.util.Scanner;
import java.util.function.Predicate;

//Program for user authentication by using predicate
class User{
    String username;
    String password;
    User(String username, String password){
        this.username = username;
        this.password = password;
    }
}
public class Test5 {
    public static void main(String[] args) {
        Predicate<User> p = u -> u.username.equals("durga") && u.password.equals("java");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the username");
        String username= scanner.next();
        System.out.println("Enter the password");
        String password = scanner.next();
        User user = new User(username, password);
        if(p.test(user))
            System.out.println("Valid user: Logging in");
        else
            System.out.println("Not a valid user: try again");
    }
}

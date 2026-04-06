package com.login;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        LoginService service = new LoginService();
        Scanner sc = new Scanner(System.in);

        System.out.println("Login Authentication System");

        while (true) {
            System.out.print("Enter Username: ");
            String username = sc.nextLine();

            System.out.print("Enter Password: ");
            String password = sc.nextLine();

            if (service.validateLogin(username, password)) {
                System.out.println("Login Successful!");
            } else {
                System.out.println("Login Failed!");
            }
        }
    }
}
package com.palmeralex.personalfinanceapp;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Personal Finance Management App!");

        // Placeholder for the main application logic
        User user = new User("testuser", "password123");
        System.out.println("User created: " + user);

        boolean isAuthenticated = user.authenticate("password123");
        System.out.println("Authentication successful: " + isAuthenticated);

        Main app = new Main();
        app.run();
    }

    public void run() {
        // This method will handle the main application flow
        // For now, let's just display a simple menu

        boolean running = true;

        while (running) {
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            java.util.Scanner scanner = new java.util.Scanner(System.in);
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Placeholder for registration logic
                    System.out.println("Register selected.");
                    break;
                case 2:
                    // Placeholder for login logic
                    System.out.println("Login selected.");
                    break;
                case 3:
                    running = false;
                    System.out.println("Exiting the app.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

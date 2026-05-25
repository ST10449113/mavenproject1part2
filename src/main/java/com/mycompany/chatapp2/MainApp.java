/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chatapp2;

/**
 *
 * @author Student
 */
import java.util.Scanner;

public class MainApp {
    
   public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Login login = new Login();

        // =====================
        // REGISTER
        // =====================

        System.out.println("===== REGISTER =====");

        System.out.print("Enter username: ");
        String username = input.nextLine();

        System.out.print("Enter password: ");
        String password = input.nextLine();

        System.out.print("Enter phone number: ");
        String phoneNumber = input.nextLine();

        String registerResult =
                login.registerUser(username,
                        password,
                        phoneNumber);

        System.out.println(registerResult);

        // =====================
        // LOGIN
        // =====================

        System.out.println("\n===== LOGIN =====");

        System.out.print("Enter username: ");
        String loginUsername = input.nextLine();

        System.out.print("Enter password: ");
        String loginPassword = input.nextLine();

        boolean loginSuccess =
                login.loginUser(loginUsername,
                        loginPassword);

        System.out.println(
                login.returnLoginStatus(loginSuccess)
        );

        // =====================
        // ONLY IF LOGIN SUCCESS
        // =====================

        if (loginSuccess) {

            System.out.println("\nWelcome to ChatApp.");

            // Number of messages
            System.out.print(
                    "How many messages would you like to send? "
            );

            int numMessages = input.nextInt();
            input.nextLine();

            // FOR LOOP
            for (int i = 0; i < numMessages; i++) {

                boolean running = true;

                // WHILE LOOP
                while (running) {

                    System.out.println("\n===== MENU =====");

                    System.out.println("1. Send Messages");
                    System.out.println("2. Show recently sent messages");
                    System.out.println("3. Quit");

                    System.out.print("Choose option: ");

                    int option = input.nextInt();
                    input.nextLine();

                    switch(option) {

                        // =================
                        // SEND MESSAGE
                        // =================

                        case 1:

                            System.out.print(
                                    "Enter recipient number: "
                            );

                            String recipient =
                                    input.nextLine();

                            System.out.print(
                                    "Enter message: "
                            );

                            String message =
                                    input.nextLine();

                            Message msg =
                                    new Message(
                                            i,
                                            recipient,
                                            message
                                    );

                            System.out.println(
                                    msg.checkRecipientCell()
                            );

                            System.out.println(
                                    msg.checkMessageLength()
                            );

                            System.out.println(
                                    "\n1. Send Message"
                            );

                            System.out.println(
                                    "2. Disregard Message"
                            );

                            System.out.println(
                                    "3. Store Message"
                            );

                            int sendChoice =
                                    input.nextInt();

                            input.nextLine();

                            System.out.println(
                                    msg.sentMessage(sendChoice)
                            );

                            System.out.println(
                                    "\n" + msg.printMessages()
                            );

                            break;

                        // =================
                        // COMING SOON
                        // =================

                        case 2:

                            System.out.println(
                                    "Coming Soon."
                            );

                            break;

                        // =================
                        // QUIT
                        // =================

                        case 3:

                            System.out.println(
                                    "Total messages sent: "
                                    + Message.returnTotalMessages()
                            );

                            System.exit(0);

                        default:

                            System.out.println(
                                    "Invalid option."
                            );
                    }

                    running = false;
                }
            }
        }
    }

    private static class Login {

        public Login() {
        }

        private String registerUser(String username, String password, String phoneNumber) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        private boolean loginUser(String loginUsername, String loginPassword) {
            throw new UnsupportedOperationException("Not supported yet."); 
        }

        private boolean returnLoginStatus(boolean loginSuccess) {
            throw new UnsupportedOperationException("Not supported yet."); 
        }
    }
}
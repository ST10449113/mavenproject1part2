/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chatapp2;

/**
 *
 * @author Student
 */
public class Login {
   // User details stored by variables.
   // Data saved here once user registers. 
    
    private String username;
    private String password;
    private String phoneNumber;
   
    // User validation
    // underscore checked by username.contains("_")
    // short username ensured by usename.length() <= 5
  public boolean checkUserName (String username) {
    return username.contains("_") && username.length()<= 5;
   }
   
    // Password validation 
    public boolean checkPasswordComplexity (String password) {
       boolean hasCapital = false;
       boolean hasNumber = false;
       boolean hasSpecial = false;
       
       // Tracking password requirenments 
       // Loop through each character in the password
       for(char c:password.toCharArray()) {
           if(Character.isUpperCase(c)) {    // Checking if character is uppercase
               hasCapital=true;   
           }
           if(Character.isDigit(c)) {        // Checking if character is number
               hasNumber=true;
           }
           if(Character.isLetterOrDigit(c)) {    // Checking if character special
               hasSpecial=true;
           }
        }
    return password.length()>=8 && hasCapital && hasNumber && hasSpecial;    // All condition must meet password
}  

    //Phone number validation
    public boolean checkCellPhoneNumber(String phoneNumber) {
        return phoneNumber.startsWith("+27") && phoneNumber.length()<=12;   // Must start with +27 and be no more than 12 characters
    }
   
    //User registration
    public String registerUser(String username, String password, String phoneNumber) {
         
        // Validate username
        if(!checkUserName(username)) {
            return "Username not formatted correctly; please ensure username contains an underscore and length is no more than five characters";
        }
        
        // Validate password
        if(!checkPasswordComplexity(password)) {
            return "Password not formatted correctly; please ensure password contains at least eight characters, a capital letter, a number and a spcial character";
        }
        
        // Validate phone number
        if(!checkCellPhoneNumber(phoneNumber)) {
            return "Cell phone number not correctly formattd or does not contain international code";
        }
        
         // If all validations pass, user details can be saved
        this.username=username;
        this.password=password;
        this.phoneNumber=phoneNumber;
        
        return "User registered successfully.";
    }
    
    // Return login status
    public String returnLoginStatus(boolean loginSuccess) {
        if(loginSuccess) {
            return "Login Successful!";
        } else {
            return "Login failed.Incorrect username or password!";
        }
    }

    boolean loginUser(String loginUsername, String loginPassword) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
    
    


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chatapp2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginTest {

    Login login = new Login();

    @Test
    public void testValidUsername() {
        assertTrue(login.checkUserName("ab_c"));
    }

    @Test
    public void testInvalidUsername() {
        assertFalse(login.checkUserName("abcd"));
    }

    @Test
    public void testValidPassword() {
        assertTrue(login.checkPasswordComplexity("Password1!"));
    }

    @Test
    public void testInvalidPassword() {
        assertFalse(login.checkPasswordComplexity("password"));
    }

    @Test
    public void testValidPhoneNumber() {
        assertTrue(login.checkCellPhoneNumber("+27831234567"));
    }

    @Test
    public void testInvalidPhoneNumber() {
        assertFalse(login.checkCellPhoneNumber("0831234567"));
    }
}
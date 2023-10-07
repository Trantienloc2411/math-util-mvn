/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.f1nn.mathutil.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author f1nn
 */
public class MathUtilityTest {
    //Cấu trúc TC: ID | Step/Procedures | Expected Result | Status
    /*
    Test case 1: Verify getFactorial(with n = 0)
    //Steps: 
    //      1. Given n = 0
            2. Call/Invoke getFactorial(n = 0)
    //Expected Result;
            The method must return 1 as the result of 0!
    //Status: Passed or Failed
    
    */
    @Test
    public void verifyFactorialGivenRightArgument0Returns0Ok(){
        assertEquals(1,MathUtility.getFactorial(1));
    }
    
        /*
    Test case 2: Verify getFactorial(with n = 1)
    //Steps: 
    //      1. Given n = 1
            2. Call/Invoke getFactorial(n = 1)
    //Expected Result;
            The method must return 1 as the result of 1!
    //Status: Passed or Failed
    
    */
    @Test
    public void verifyFactorialGivenRightArgument1Returns1Ok(){
        assertEquals(1,MathUtility.getFactorial(1));
    }
        /*
    Test case 3: Verify getFactorial(with n = 1)
    //Steps: 
    //      1. Given n = 0
            2. Call/Invoke getFactorial(n = 1)
    //Expected Result;
            The method must return 1 as the result of 1!
    //Status: Passed or Failed
    
    */
    @Test
    public void verifyFactorialGivenRightArgument5Returns0Ok(){
        assertEquals(120,MathUtility.getFactorial(5));
    }
    
            /*
    Test case 4: Verify getFactorial(with n = 5)
    //Steps: 
    //      1. Given n = 5
            2. Call/Invoke getFactorial(n = 5)
    //Expected Result;
            The method must return 120 as the result of 5!
    //Status: Passed or Failed
    
    */
    
}

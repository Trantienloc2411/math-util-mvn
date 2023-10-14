/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.f1nn.mathutil.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author f1nn
 */
public class MathUtilityDDTTest {
    
    //Prepare Data Collection will fill in Assert()
    //Function return 2-Dimetional will compare n! has equal or not
    public static Object[][] initData(){
        //int[] a = {5, 10, 15, 20, 25};
        Object[][] testData = 
        {
                            {0, 1},
                            {1, 1},
                            {3, 6},
                            {4, 24},
                            {5, 120}
        };
        
        return testData;
    }
    //Fill Data in Assert()
    @ParameterizedTest
    @MethodSource("initData")
    public void verifyFactorialGivenRightArgumentReturnsOK(int n, long expected){
        assertEquals(expected, MathUtility.getFactorial(n));
    }
}

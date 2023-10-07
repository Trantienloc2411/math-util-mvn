/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.f1nn.mathutil.core;

/**
 *
 * @author f1nn
 */
public class MathUtility {
    public static final double PI = 3.1415;
    public static long getFactorial(int n){
        long result = 1;
        if( n < 0 || n > 20){
            throw new IllegalArgumentException("Invailed n. n must be in between 0 and 20");
        }
        if(n == 0 || n == 1){
            return 1;
        }
        for(int i = 2; i<=n;i++){
            result *= i;
        }
        
        return result;
    }
}
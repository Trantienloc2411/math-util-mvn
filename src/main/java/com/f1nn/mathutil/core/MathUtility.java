/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.f1nn.mathutil.core;
//VCS: Version Control System
//SCM: Source control Management
//

/**
 *
 * @author f1nn
 */
public class MathUtility {
    public static final double PI = 3.1415;
//    public static long getFactorial(int n){
//        long result = 1;  // It will be fail right here
//        if( n < 0 || n > 20){
//            throw new IllegalArgumentException("Invailed n. n must be in between 0 and 20");
//        }
//        if(n == 0 || n == 1){
//            return 1;
//        }
//        for(int i = 2; i<=n;i++){
//            result *= i;
//        }
//        
//        return result;
//    }
    
    //Upgrade getFactorial - Using Recursion
    
    public static long getFactorial(int n){
        
        if(n == 0 || n == 1){
            return 1;
        }
        else if(n < 0 || n > 20){
            throw new IllegalArgumentException("Invailed n ; N must be in between 0 and 20");
        }
        
        return n * getFactorial(n-1);
        //GITHUB Actions return the values.
    }
}


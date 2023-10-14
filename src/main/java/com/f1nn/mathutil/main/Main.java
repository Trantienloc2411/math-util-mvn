/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.f1nn.mathutil.main;

import com.f1nn.mathutil.core.MathUtility;



/**
 *
 * @author f1nn
 */
//Đây là bộ thư viện chứa các hàm dùng trong tính toán
//toán học, clone giống class Math bên JDK
//Khi gọi là thư viện dùng chung mà không cần nhớ nhung gì sau khi xử lí -> thư viện chứa đồ static
public class Main {
    
    public static void main(String[] args) {
        //test thử hàm mình vừa viết giai thừa xem có đúng không
        //chuẩn bị bộ data test, test case
        //Test case #1' Check if getFactorial() runs
        //well with n = 0
        //Test procedures:
        //Given  n = 0
        //Invoke getFactorial (n=0)
        //Expected Result: 1:; //0! == 1?????
        
        long expected = 1; //em hy vọng 1 được trả về
        int  n = 0;
        long actual = MathUtility.getFactorial(0); //Chạy hàm mới biêt
        //in ra và tự kết luận có giống kì vọng hay không?
        System.out.println(n+"!| Expected = " + expected + " | actual = " + actual);
        //Test case #2' Check if getFactorial() runs
        //well with n = 1
        //Test procedures:
        //Given  n = 1
        //Invoke getFactorial (n=1)
        //Expected Result: 1:; //1! == 1?????
        System.out.println("1!| Expected = 1 | actual = " + MathUtility.getFactorial(5));
        //PE
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.danchoixom.mathutil.core;

/**
 *
 * @author trung
 */
public class MathUtility {
    
    public static final double PI = 3.1415;
    
    //HAM TINH N! = 1.2.3....N
    //0! = 1! = 1
    //21! LA KIEU LONG KO CHUA NOI 
    // GAI RANG BUOC VAO  CHO METHOD/HAM
    public static long getFactorial(int n){
        long product = 1; // tich ban dau bang 1
        if (n==0 || n==1){
            return 1;
        }
        if(n<0 || n>20){
            throw new IllegalArgumentException("Invalid n. n must be between 0..20, plz.");
        }
        for (int i = 2; i <= n; i++) {
            product *= i; 
            
        }
        return product;
    }
    //return som de ham khong bao loi
}

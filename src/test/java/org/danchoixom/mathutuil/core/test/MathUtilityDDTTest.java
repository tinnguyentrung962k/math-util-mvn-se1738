/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.danchoixom.mathutuil.core.test;

import org.danchoixom.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author trung
 */
public class MathUtilityDDTTest {
    
    public static Object[][] initTestData(){
        Integer testData[][] = {{0,1},
                                {1,1},
                                {2,2},
                                {3,6},
                                {5,120}};
        return testData;
    }
    
    //Nhoi data vao trong assertEquals(expected-cot 1, actual-cot 0)
    @ParameterizedTest
    @MethodSource("initTestData")
    public void testFactorialGivenRightArgumentReturnWell(int n,long expected){
        assertEquals(expected,MathUtility.getFactorial(n) );
    }
    
}
// Ky thuat DDT Data Driven Testing - tach data kiem thu ra 
//khoi cau lenh assert() cho de theo doi, de bao tri cac bo 
//test case, cac bo test data

//Thuong dung mang 2 chieu de chua bo data test
//mang 2 chieu gom: cac input va expected
//cac unit test framework tu dong biet cach  trich tung cap
//input/expected o trong mang ra roi nhi vao trong ham so sanh

//mang du lieu test case phai la public static - quy uoc

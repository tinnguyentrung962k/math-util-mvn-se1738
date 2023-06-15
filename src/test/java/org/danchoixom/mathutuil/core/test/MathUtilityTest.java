/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.danchoixom.mathutuil.core.test;

import static org.danchoixom.mathutil.core.MathUtility.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;

/**
 *
 * @author trung
 */
public class MathUtilityTest {
    // Test ngoại lệ thì sao 
    @Test
    public void testFactorialGivenWrongArgumentThrowsException(){
        //assertThrows(expectedType,         executable);
        //           ngoại lệ cần bắt      đoạn code gây ra ngoại lệ
        //                                 đưa 1 object chứa đoạn code gây Exception
        //                                    lambda expression đưa vào
//        Executable ex = new Executable(){
//            @Override
//            public void execute() throws Throwable{
//                getFactorial(-5);
//            }
//        };
        Executable exLamda = () -> getFactorial(-5);
        assertThrows(IllegalArgumentException.class,() -> getFactorial(-5));
    }
    @Test
    public void testFactorialGivenRightArgumentReturnsWell() {
        //assertEquals(69, 70);
        assertEquals(1, getFactorial(0));
        assertEquals(1, getFactorial(1));
        assertEquals(2, getFactorial(2));
        assertEquals(6, getFactorial(3));
        assertEquals(24, getFactorial(4));
        assertEquals(120, getFactorial(5));
    }

}

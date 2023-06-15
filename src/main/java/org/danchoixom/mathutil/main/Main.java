/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.danchoixom.mathutil.main;

import org.danchoixom.mathutil.core.MathUtility;

/**
 *
 * @author trung
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //test case 1: check if getF() returns well with n = 0;
        //steps/procedures
        // input n = 0 to the function/method
        // run the method to get the actual value of 0!
        // expected: 0! must be is 1, expected value 1
        
        // ta co ham tinh giai thua, ta phai test ham
        // test thong qua cac test case, nhung tinh huong xai ham
        //chuan bi bo data va expected value
        //sau do run cac test case de coi dung sai
        //Test case 1: (ten, muc dich cua test case) check getF() with n = 0;
        //Step/Procedures: (cac buoc tien hanh)
        //                  1. given n = 0;
        //                  2. execute getF(n=0)
        //Expected value:   (ham hy vong se tra ve may)
        //                  getF(0) 0! must return 1
        //Test case #1: n = 0
        System.out.println("Check getF(0) 0! | expected: 1 | actual: " + MathUtility.getFactorial(0));
        
        //Test case 2: (ten, muc dich cua test case) check getF() with n = 1;
        //Step/Procedures: (cac buoc tien hanh)
        //                  1. given n = 1;
        //                  2. execute getF(n=1)
        //Expected value:   (ham hy vong se tra ve may)
        //                  getF(1) 1! must return 1
        //Test case #2: n = 1
        System.out.println("Check getF(1) 1! | expected: 1 | actual: " + MathUtility.getFactorial(1));
        
        //Test case 3: (ten, muc dich cua test case) check getF() with n = 2;
        //Step/Procedures: (cac buoc tien hanh)
        //                  1. given n = 2;
        //                  2. execute getF(n=2)
        //Expected value:   (ham hy vong se tra ve may)
        //                  getF(2) 1! must return 2
        //Test case #3: n = 2
        System.out.println("Check getF(2) 2! | expected: 2 | actual: " + MathUtility.getFactorial(2));
        
        //Test case 4: (ten, muc dich cua test case) check getF() with n = 3;
        //Step/Procedures: (cac buoc tien hanh)
        //                  1. given n = 3;
        //                  2. execute getF(n=3)
        //Expected value:   (ham hy vong se tra ve may)
        //                  getF(3) 3! must return 6
        //Test case #4: n = 3
        System.out.println("Check getF(3) 3! | expected: 6 | actual: " + MathUtility.getFactorial(3));
        
        //Test case 5: (ten, muc dich cua test case) check getF() with n = 5;
        //Step/Procedures: (cac buoc tien hanh)
        //                  1. given n = 5;
        //                  2. execute getF(n=5)
        //Expected value:   (ham hy vong se tra ve may)
        //                  getF(5) 5! must return 120
        //Test case #4: n = 3
        System.out.println("Check getF(5) 5! | expected: 120 | actual: " + MathUtility.getFactorial(5));
        
        //am giai thu thi sao ???
        //test case #6: n=-1
        
         System.out.println("Check getF(-1) -1! | expected: Exception | actual: " );
         MathUtility.getFactorial(-1); //vi ngoai le se ngat lenh println();
                                       // in truoc roi cho ngoai le xh
        
    }
    
    //Thiet ke ham giai thua: am giai thua va >20! thi khong tinh duoc
    // ham se nem ra ngoai le
    //TDD: Test Driven Development: viet code, lam app theo style
        //code va test song hanh voi nhau
        //code va test code là cap bai trung, code lien tuc dc test
        //du moi viet so so
        //phai nghi ngay luon cac bo test case khi bat dau viet code
        //dac trung cua tdd: xanh xanh do do
}

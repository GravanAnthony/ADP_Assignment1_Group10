/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adp_assignment1_group10;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Disabled;

/**
 *
 * @author Nawaaz Amien 219099839
 */
public class SmallProgramsTest {
    
    public SmallPrograms test1;
    public SmallPrograms test2;
    public SmallPrograms test3;
    
    public SmallProgramsTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        test1 = new SmallPrograms();
        test1.setA(18);
        test1.setB(6);
    
        test2 = new SmallPrograms();
        test2.setA(6);
        test2.setB(18);
        
        test3 = test2;
    }
    
    @AfterEach
    public void tearDown(){
    }

    /**
     * Test of Object Equality, Object Identity, Test fail, Test timeout, Test Disabling
     */
    
    //Testing Object Equality
    @Test
    public void testEquality(){
    assertEquals(test1.getA(), test2.getB());
    }
    
    //Testing Object Identity
    @Test
    public void testIdentity(){
    assertSame(test2, test3);
    }
    
    //Test fail, this is meant for the test to fail
    @Test
    public void testFail(){
    fail("Failing on purpose");
    assertEquals(test1.getA(), test2.getB());
    }
    
    //Test timeout, this is supposed to error
    @Test
    @Timeout(10)
    public void testTimeOut()throws InterruptedException {
     while (true) {
        Thread.sleep(300);
     }
    }
    
    //Test disabling, this is meant to skip the test
    @Test
    @Disabled("Purposely disabling this test")
    public void testDisable() {
    }
  
    
   
    
}

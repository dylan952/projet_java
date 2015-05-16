/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetmiage;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author D.SEVEUR-NOLEO
 */
public class CalTest {
    
    public CalTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of recompute method, of class Cal.
     */
    @Test
    public void testRecompute() {
        System.out.println("recompute");
        Cal instance = null;
        instance.recompute();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isLeap method, of class Cal.
     */
    @Test
    public void testIsLeap() {
        System.out.println("isLeap");
        int year = 0;
        Cal instance = null;
        boolean expResult = false;
        boolean result = instance.isLeap(year);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDate method, of class Cal.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        int yy = 0;
        int mm = 0;
        int dd = 0;
        Cal instance = null;
        instance.setDate(yy, mm, dd);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDayActive method, of class Cal.
     */
    @Test
    public void testSetDayActive() {
        System.out.println("setDayActive");
        int newDay = 0;
        Cal instance = null;
        instance.setDayActive(newDay);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

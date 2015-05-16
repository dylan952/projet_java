/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetmiage;

import java.util.ArrayList;
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
public class CalendrierTest {
    
    public CalendrierTest() {
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
     * Test of getEvements method, of class Calendrier.
     */
    @Test
    public void testGetEvements() {
        System.out.println("getEvements");
        Calendrier instance = new Calendrier();
        ArrayList<Evenement> expResult = null;
        ArrayList<Evenement> result = instance.getEvements();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEvenement method, of class Calendrier.
     */
    @Test
    public void testGetEvenement() {
        System.out.println("getEvenement");
        String d = "";
        Calendrier instance = new Calendrier();
        ArrayList<Evenement> expResult = null;
        ArrayList<Evenement> result = instance.getEvenement(d);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Calendrier.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Calendrier instance = new Calendrier();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

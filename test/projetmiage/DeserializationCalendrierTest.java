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
public class DeserializationCalendrierTest {
    
    public DeserializationCalendrierTest() {
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
     * Test of getDeserializedCalendrier method, of class DeserializationCalendrier.
     */
    @Test
    public void testGetDeserializedCalendrier_String() {
        System.out.println("getDeserializedCalendrier");
        String cheminFichier = "";
        DeserializationCalendrier instance = new DeserializationCalendrier();
        Calendrier expResult = null;
        Calendrier result = instance.getDeserializedCalendrier(cheminFichier);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDeserializedCalendrier method, of class DeserializationCalendrier.
     */
    @Test
    public void testGetDeserializedCalendrier() {
        System.out.println("getDeserializedCalendrier");
        DeserializationCalendrier instance = new DeserializationCalendrier();
        Calendrier expResult = null;
        Calendrier result = instance.getDeserializedCalendrier();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

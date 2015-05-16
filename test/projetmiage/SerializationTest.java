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
import projetmiage.GestionModule.Formation;

/**
 *
 * @author D.SEVEUR-NOLEO
 */
public class SerializationTest {
    
    public SerializationTest() {
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
     * Test of serializeFormation method, of class Serialization.
     */
    @Test
    public void testSerializeFormation() {
        System.out.println("serializeFormation");
        Formation f = null;
        Serialization instance = new Serialization();
        instance.serializeFormation(f);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of serializeCalendar method, of class Serialization.
     */
    @Test
    public void testSerializeCalendar() {
        System.out.println("serializeCalendar");
        Calendrier c = null;
        Serialization instance = new Serialization();
        instance.serializeCalendar(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

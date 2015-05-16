/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetmiage.GestionModule;

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
public class addModuleTest {
    
    public addModuleTest() {
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
     * Test of verifInsert method, of class addModule.
     */
    @Test
    public void testVerifInsert() {
        System.out.println("verifInsert");
        String nom = "A";
        String abbreviation = "A";
        String couleur = "A";
        int nbSeance = 2;
        addModule instance = new addModule(new ListModule());
        boolean expResult = true;
        boolean result = instance.verifInsert(nom, abbreviation, couleur, nbSeance);
        assertEquals(expResult, result);
    }
    
}

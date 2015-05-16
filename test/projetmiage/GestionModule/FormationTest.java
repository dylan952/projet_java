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
public class FormationTest {
    
    public FormationTest() {
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
     * Test of updateFormation method, of class Formation.
     */
    @Test
    public void testUpdateFormation() {
        System.out.println("updateFormation");
        String nom = "";
        ListModule liste = null;
        float dureeTypeSeance = 0.0F;
        Formation instance = null;
        instance.updateFormation(nom, liste, dureeTypeSeance);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNom method, of class Formation.
     */
    @Test
    public void testSetNom() {
        System.out.println("setNom");
        String nom = "";
        Formation instance = null;
        instance.setNom(nom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListe method, of class Formation.
     */
    @Test
    public void testSetListe() {
        System.out.println("setListe");
        ListModule liste = null;
        Formation instance = null;
        instance.setListe(liste);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDureeTypeSeance method, of class Formation.
     */
    @Test
    public void testSetDureeTypeSeance() {
        System.out.println("setDureeTypeSeance");
        float dureeTypeSeance = 0.0F;
        Formation instance = null;
        instance.setDureeTypeSeance(dureeTypeSeance);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

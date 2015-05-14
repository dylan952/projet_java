/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import projetmiage.GestionModule.Module;
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
public class ModuleTest {
    
    public ModuleTest() {
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
     * Test of updateModule method, of class Module.
     */
    @Test
    public void testUpdateModule() {
        System.out.println("updateModule");
        String pnom = "TEST";
        String pabbreviation = "TEST";
        String pcouleur = "TEST";
        int pnbSeances = 10;
        Module instance = new Module("", "", "", 0);
        Module moduleExpect = new Module(pnom, pabbreviation, pcouleur, pnbSeances);
        instance.updateModule(pnom, pabbreviation, pcouleur, pnbSeances);
        assertEquals(moduleExpect.toString(), instance.toString());
    }

    /**
     * Test of setNbseance method, of class Module.
     */
    @Test
    public void testSetNbseance() {
        System.out.println("setNbseance");
        int pNbSeances = 20;
        Module instance = new Module("", "", "", 0);
        instance.setNbseance(pNbSeances);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(pNbSeances, instance.getNbSeances());
    }

    /**
     * Test of setCouleur method, of class Module.
     */
    @Test
    public void testSetCouleur() {
        System.out.println("setCouleur");
        String pCouleur = "RED";
        Module instance = new Module("", "", "", 0);
        instance.setCouleur(pCouleur);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(pCouleur, instance.getCouleur());
    }

    /**
     * Test of setAbbreviation method, of class Module.
     */
    @Test
    public void testSetAbbreviation() {
        System.out.println("setAbbreviation");
        String pAbbreviation = "TT";
        Module instance = new Module("", "", "", 0);
        instance.setAbbreviation(pAbbreviation);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(pAbbreviation, instance.getAbbreviation());
    }

    /**
     * Test of setNom method, of class Module.
     */
    @Test
    public void testSetNom() {
        System.out.println("setNom");
        String pnom = "TEST";
        Module instance = new Module("", "", "", 0);
        instance.setNom(pnom);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(pnom, instance.getNom());
    }

    /**
     * Test of getNom method, of class Module.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        Module instance = new Module("", "", "", 0);
        String expResult = "";
        String result = instance.getNom();
        assertEquals(expResult, result);

    }

    /**
     * Test of getAbbreviation method, of class Module.
     */
    @Test
    public void testGetAbbreviation() {
        System.out.println("getAbbreviation");
        Module instance = new Module("", "", "", 0);
        String expResult = "";
        String result = instance.getAbbreviation();
        assertEquals(expResult, result);

    }

    /**
     * Test of getCouleur method, of class Module.
     */
    @Test
    public void testGetCouleur() {
        System.out.println("getCouleur");
        Module instance = new Module("", "", "", 0);
        String expResult = "";
        String result = instance.getCouleur();
        assertEquals(expResult, result);

    }

    /**
     * Test of getNbSeances method, of class Module.
     */
    @Test
    public void testGetNbSeances() {
        System.out.println("getNbSeances");
        Module instance = new Module("", "", "", 0);
        int expResult = 0;
        int result = instance.getNbSeances();
        assertEquals(expResult, result);

    }

    /**
     * Test of toString method, of class Module.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Module instance = new Module("TEST", "TT", "BLEU", 10);
        String expResult = "Module{nom=TEST, abbreviation=TT, couleur=BLEU, nbSeances=10}";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetmiage.GestionModule;

import projetmiage.GestionModule.ListModule;
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
public class ListModuleTest {
    
    public ListModuleTest() {
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
     * Test of addModule method, of class ListModule.
     */
    @Test
    public void testAddModule() {
        System.out.println("addModule");
        Module m = new Module("TEST", "TT", "RED", 10);
        ListModule instance = new ListModule();
        instance.addModule(m);
    }

    /**
     * Test of getModule method, of class ListModule.
     */
    @Test
    public void testGetModule_int() {
        System.out.println("getModule");
        int index = 0;
        ListModule instance = new ListModule();
        Module expResult = null;
        Module result = instance.getModule(index);
        assertEquals(expResult, result);
    }

    /**
     * Test of getModule method, of class ListModule.
     */
    @Test
    public void testGetModule_String() {
        System.out.println("getModule");
        String nomModule = "TEST";
        ListModule instance = new ListModule();
        Module m = new Module("TEST", "TT", "RED", 10);
        instance.addModule(m);
        Module result = instance.getModule(nomModule);
        assertEquals(m, result);

    }

    /**
     * Test of getAllModules method, of class ListModule.
     */
    @Test
    public void testGetAllModules() {
        System.out.println("getAllModules");
        ListModule instance = new ListModule();
        String[] expResult = null;
        String[] result = instance.getAllModules();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ListModule.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ListModule instance = new ListModule();
        String expResult = "ListModule{listModule=[]}";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

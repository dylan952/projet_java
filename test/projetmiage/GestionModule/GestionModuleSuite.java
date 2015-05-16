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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author D.SEVEUR-NOLEO
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({projetmiage.GestionModule.ListModuleTest.class, projetmiage.GestionModule.addModuleTest.class, projetmiage.GestionModule.GestionFormationTest.class, projetmiage.GestionModule.GestionModuleTest.class, projetmiage.GestionModule.EditModuleTest.class, projetmiage.GestionModule.FormationTest.class, projetmiage.GestionModule.ModuleTest.class})
public class GestionModuleSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}

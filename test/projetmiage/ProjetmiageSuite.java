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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author D.SEVEUR-NOLEO
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({projetmiage.ProjetMiageTest.class, projetmiage.CalTest.class, projetmiage.InformationsTest.class, projetmiage.EvenementTest.class, projetmiage.DeserializationCalendrierTest.class, projetmiage.TableauTest.class, projetmiage.SerializationTest.class, projetmiage.GestionModule.GestionModuleSuite.class, projetmiage.CalendrierTest.class, projetmiage.Accueil.AccueilSuite.class})
public class ProjetmiageSuite {

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

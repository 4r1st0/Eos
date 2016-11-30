/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eos.io;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dommer01
 */
public class CheckUserInputTest {
    
    public CheckUserInputTest() {
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
     * Test of checkDataUniformity method, of class CheckUserInput.
     */
    @Test
    public void testCheckDataUniformity() {
        System.out.println("checkDataUniformity");
        int referenceValue = 1;
        int comparisonValue = 1;
        CheckUserInput instance = new CheckUserInput();
        int expResult = 0;
        int result = instance.checkDataUniformity(referenceValue, comparisonValue);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkHeaderTextfield method, of class CheckUserInput.
     */
    @Test
    public void testCheckHeaderTextfield() {
        System.out.println("checkHeaderTextfield");
        String header = "";
        CheckUserInput instance = new CheckUserInput();
        int expResult = 1;
        int result = instance.checkHeaderTextfield(header);
        assertEquals(expResult, result);
    }
    
}

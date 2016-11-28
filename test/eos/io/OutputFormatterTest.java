/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eos.io;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
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
public class OutputFormatterTest {
    
    public OutputFormatterTest() {
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
     * Test of exponentSign method, of class OutputFormatter.
     */
    @Test
    public void testExponentSign() {
        System.out.println("Test of exponentSign method:");
        System.out.println("Valid number format: 0.0000E00 or 0.0000E-00");
        double dPositiv = 123456;
        double dNegativ = 0.123456;
                
        String expResultPositiv = "1.2346E+05";
        String expResultNegativ = "1.2346E-01";
        
        String resultPositiv = OutputFormatter.exponentSign(dPositiv);
        String resultNegativ = OutputFormatter.exponentSign(dNegativ);
        assertEquals(expResultPositiv, resultPositiv);
        System.out.println("Conversion of 0.0000E00 to 0.0000E+00");
        assertEquals(expResultNegativ, resultNegativ);
        System.out.println("Maintain exponent minus sign: 0.0000E-00");
    }
    
}

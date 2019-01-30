/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import projext2.Projext2;

/**
 *
 * @author jit
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
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
   @Test
    public void testSum(){
        int[][] A = new int[3][3];
        int[][] B = new int[3][3];
        
        int[][] result = {{0, 0, 0},
                          {0, 0, 0},
                          {0, 0, 0}};
        assertArrayEquals(result, projext2.Projext2.SumAB(A, B));
        }
}

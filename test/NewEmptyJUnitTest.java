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
    
    @Test
    public void test_Sum(){
        int[][] A = {{68, 64, 3, 9}
                    ,{49, 58, 29, 37}
                    ,{32, 98, 33, 66}
                    ,{98, 38, 44, 27}};
        int[][] B = {{91, 60, 28, 40}
                    ,{21, 98, 33, 19}
                    ,{53, 36, 5, 62}
                    ,{37, 7, 21, 76}};
        int[][] result = {{159, 124, 31, 49}
                        ,{70, 156, 62, 56}
                        ,{85, 134, 38, 128}
                        ,{135, 45, 65, 103}};
        assertArrayEquals(result, projext2.Projext2.SumAB(A, B));
        
    }
      @Test
    public void test2_Transpose(){
        int[][] A = new int[5][25];
        int[][] result = new int[25][5];
        assertArrayEquals(result, projext2.Projext2.Transpose(A));
    }
        @Test
    public void test_1Det() {
        int[][] A = {{1, 2, 3, 4, 5}
                    ,{6, 7, 8, 9, 10}
                    ,{11, 12, 13, 14, 15}
                    ,{16, 17, 18, 19, 20}
                    ,{21, 22, 23, 24, 25}};
        assertEquals(0,projext2.Projext2.DET(A));
        
    }
     @Test
    public void testSubt(){
        int[][] A = new int[3][3];
        int[][] B = new int[3][3];
        
        int[][] result = {{0, 0, 0},
                          {0, 0, 0},
                          {0, 0, 0}};
        assertArrayEquals(result, projext2.Projext2.SUBTAB(A, B));
    }
    
        @Test
    public void testTranspose() {
        int[][] M = { 
                {68, 64 ,3 ,9},
                {49, 58, 29 ,37},
                {32, 98 ,33, 66},
                {98 ,38, 44 ,27}};
        int[][] result = {{68 , 49  ,  32  ,  98},    
                {64   , 58  ,  98  ,  38},    
                {3    , 29  ,  33   , 44 },   
                {9   ,  37  ,  66  ,  27}} ;
        
        assertArrayEquals(result,projext2.Projext2.Transpose(M));
    
    }
    
    @Test
    public void testMUL(){
        int[][] A = {{68, 64, 3, 9}
                    ,{49, 58, 29, 37}
                    ,{32, 98, 33, 66}
                    ,{98, 38, 44, 27}};
        int[][] B = {{91, 60, 28, 40}
                    ,{21, 98, 33, 19}
                    ,{53, 36, 5, 62}
                    ,{37, 7, 21, 76}};
        int[][] result = {{8024, 10523, 4220, 4806}
                        ,{8583, 9927, 4208, 7672}
                        ,{9161, 13174, 5681, 10204}
                        ,{13047, 11377, 4785, 9422}};
        assertArrayEquals(result, projext2.Projext2.MUL(A, B));
    }
    @Test
        public void test_MUL(){
        int[][] A = {{91, 26,75 ,98 ,86}};
        int[][] B = {{30, 88},
                {57, 12},
                {32, 95},
                {93, 13},
                {33, 28}};
        int[][] result ={{18564 ,19127}};
        assertArrayEquals(result, projext2.Projext2.MUL(A, B));
    }
        @Test
            public void test_1MUL(){
        int[][] A = {{68, 64, 3, 9}
                    ,{49, 58, 29, 37}
                    ,{32, 98, 33, 66}
                    ,{98, 38, 44, 27}};
        int[][] B = {{91, 60, 28, 40}
                    ,{21, 98, 33, 19}
                    ,{53, 36, 5, 62}
                    ,{37, 7, 21, 76}};
        int[][] result = {{8024, 10523, 4220, 4806}
                        ,{8583, 9927, 4208, 7672}
                        ,{9161, 13174, 5681, 10204}
                        ,{13047, 11377, 4785, 9422}};
        assertArrayEquals(result, projext2.Projext2.MUL(A, B));
    }
      @Test
    public void test_Transpose(){
        int[][] M = {{1000000}};
        int[][] result = {{1000000}};
        assertArrayEquals(result, projext2.Projext2.Transpose(M));
    }
        @Test
    public void test_Det() {
        int[][] M = {{1, 2, 3}
                    ,{4, 5, 6}
                    ,{7, 8, 9}};
        assertEquals(0,projext2.Projext2.DET(M));
    }
    @Test
       public void testDet() {
        int[][] M = {{1, 2}
                    ,{3, 4}};
        assertEquals(-2,projext2.Projext2.DET(M));
    }
          @Test
    public void testSUBT(){
        int[][] A = {{68, 64, 3, 9}
                    ,{49, 58, 29, 37}
                    ,{32, 98, 33, 66}
                    ,{98, 38, 44, 27}};
        int[][] B = {{91, 60, 28, 40}
                    ,{21, 98, 33, 19}
                    ,{53, 36, 5, 62}
                    ,{37, 7, 21, 76}};
        int[][] result = {{-23, 4, -25, -31}
                        ,{28, -40, -4, 18}
                        ,{-21, 62, 28, 4}
                        ,{61, 31, 23, -49}};
        assertArrayEquals(result, projext2.Projext2.SUBTAB(A, B));
        
    }
        @Test
    public void test_Subt(){
        int[][] A = new int[5][5];
        int[][] B = new int[5][5];
        
        int[][] result = {{0, 0, 0,0,0},
                          {0, 0, 0,0,0},
                         {0, 0, 0,0,0},
                         {0, 0, 0,0,0},
                         {0, 0, 0,0,0}
        };
        assertArrayEquals(result, projext2.Projext2.SUBTAB(A, B));
    }
            @Test
    public void test_2MUL(){
        int[][] A = new int[5][5];
        int[][] B = new int[5][5];
        
        int[][] result = {{0, 0, 0,0,0},
                          {0, 0, 0,0,0},
                         {0, 0, 0,0,0},
                         {0, 0, 0,0,0},
                         {0, 0, 0,0,0}
        };
        assertArrayEquals(result, projext2.Projext2.MUL(A, B));
    }
    
}

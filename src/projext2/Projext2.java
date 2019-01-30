
package projext2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Projext2 {

   
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input.txt");
        PrintWriter file_output = new PrintWriter("output.txt");
        Scanner input = new Scanner(file);
        
    }
        public static int[][] MUL(int[][] A , int[][] B){
        int[][] MULAB = new int[A.length][B[0].length];
        int sum = 0;
        for(int i = 0 ; i < A.length ; i++){
            for (int j = 0; j < B[0].length; j++) {
                for (int n = 0 ; n < B.length ; n++){
                   sum += A[i][n] * B[n][j];  
                }
                MULAB[i][j] = sum;
                sum = 0;
            }
        }
        return MULAB;
    }
        
        // method use to sum two Arrays we pass the array A and B then return array of sum namde SumAB
        public static int[][] SumAB(int[][] A, int[][] B) {
        int[][] SumAB = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                SumAB[i][j] = A[i][j] + B[i][j];
            } 
        }

        return SumAB;
    }
        
         // method use to subtract two Arrays we pass the array A and B then return array of subtract SUBTAB 
         public static int[][] SUBTAB(int[][] A, int[][] B) {
        int[][] SUBTAB = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                SUBTAB[i][j] = A[i][j] - B[i][j];
            } 
        }

        return SUBTAB;
    }
         
         
         // method use to Transpose an Array >>  we pass the array M then return array result transposeM
       public static int[][] Transpose(int[][] M) {
        int[][] transposeM = new int[M[0].length][M.length];
        for (int i = 0; i < transposeM.length ; i++) {
            for (int j = 0; j < transposeM[0].length ; j++) {
                transposeM[i][j] = M[j][i];
            }
        }
        
        return transposeM;
    }
    
}

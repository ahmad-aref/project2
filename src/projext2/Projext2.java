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
        
                while (input.hasNextInt()) {
            int t = input.nextInt();
            for (int cases = 0; cases < t; cases++) {
                file_output.println("Case#"+ (cases + 1)+ ":");   
                int N = input.nextInt();
                int M = input.nextInt();
                int[][] A = new int[N][M];
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < M; j++) {
                        A[i][j] = input.nextInt();
                    }
                }
                
                  
                N = input.nextInt();
                M = input.nextInt();
                int[][] B = new int[N][M];
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < M; j++) {
                        B[i][j] = input.nextInt();
                    }
                }
                
            }
                }
                
                file_output.close();

    }

    public static int[][] MUL(int[][] A, int[][] B) {
        int[][] MULAB = new int[A.length][B[0].length];
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                for (int n = 0; n < B.length; n++) {
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
        for (int i = 0; i < transposeM.length; i++) {
            for (int j = 0; j < transposeM[0].length; j++) {
                transposeM[i][j] = M[j][i];
            }
        }

        return transposeM;
    }

    public static int DET(int[][] A) {
        int test[][];
        int Result = 0;

        if (A.length == 1) {
            Result = A[0][0];
            return Result;
        }
        if (A.length == 2) {
            Result = ((A[0][0] * A[1][1]) - (A[0][1] * A[1][0]));
            return Result;
        }
        for (int i = 0; i < A[0].length; i++) {
            test = new int[A.length - 1][A[0].length - 1];

            for (int j = 1; j < A.length; j++) {
                for (int k = 0; k < A[0].length; k++) {
                    if (k < i) {
                        test[j - 1][k] = A[j][k];
                    } else if (k > i) {
                        test[j - 1][k - 1] = A[j][k];
                    }
                }
            }

            Result += A[0][i] * Math.pow(-1, i) * DET(test);
        }
        return Result;
    }

}

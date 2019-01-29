
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

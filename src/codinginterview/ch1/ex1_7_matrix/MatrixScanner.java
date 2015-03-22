package codinginterview.ch1.ex1_7_matrix;

import java.io.*;
import java.util.Scanner;

public class MatrixScanner {

    int a[][] = new int[3][5];
    int b[][] = new int[3][5];
    
    public void readMatrix() throws FileNotFoundException {
        FileReader fr = new FileReader("matrix-input.txt");
        Scanner sc = new Scanner(fr);
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                a[i][j] = sc.nextInt();            
            }
        }
        
        // copy into second matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                b[i][j] = a[i][j];            
            }
        }
        
        
    } // end of read matrix
    
    
    public void scanMatrix() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (a[i][j] == 0) {
                    updateMatrix(i, j, b);
                }
            }
        }
    }
    
    public void updateMatrix(int row, int column, int[][] b) {
        int k = row;
        
        // setting row to zero
        while (k == row) {
            for (int c = 0; c < 5; c++) {
                b[k][c] = 0;
            }
            k++;
        }
        
        int m = column;
        // setting column to zero
        while (m == column) {
            for (int d = 0; d < 3; d++) {
                b[d][m] = 0;
            }
            m++;
        }
    
   
        
    } // end of updateMatrix()
    
    public void printMatrix() {
    	for (int i = 0; i < 3; i++) {
    		for (int j = 0; j < 5; j++) {
    			System.out.print(b[i][j]);
    		}
    		System.out.println();
    	}
    	
    }
    
}

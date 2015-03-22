package codinginterview.ch1.ex1_7_matrix;

import java.io.FileNotFoundException;

public class TestMatrixScanner {
	public static void main(String[] args) throws FileNotFoundException {
		MatrixScanner ms = new MatrixScanner();
		ms.readMatrix();
		ms.scanMatrix();
		ms.printMatrix();
	}

}

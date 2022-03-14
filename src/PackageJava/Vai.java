package PackageJava;

import java.util.Scanner;

public class Vai {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int M[][] = new int[3][3];
		int i;
		int j;
		int dp = 0;
		int dsp = 0;
		int dif = 0;

		M[0][0] = 1;
		M[0][1] = 2;
		M[0][2] = 3;

		M[1][0] = 4;
		M[1][1] = 5;
		M[1][2] = 6;

		M[2][0] = 7;
		M[2][1] = 8;
		M[2][2] = 9;

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print(M[i][j]+ "   ");

				if (i == j) {
					dp += M[i][j];
				}
				if ((i + j) == 2) {
					dsp += M[i][j];
				}
				dif = dp-dsp;
				dif= Math.abs(dif);
			}
	
			System.out.println();
		}
		System.out.println("The left-to-right diagonal |1+5+9|  = " + dp);
		System.out.println("The right to left diagonal |3+5+7|  = " + dsp);
		System.out.println("Their absolute difference is |15-15|= "+ dif);

	}

}

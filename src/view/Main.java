package view;

import controller.ThreadMatriz;

public class Main {

	public static void main(String[] args) {
		int m[][] = new int[3][5];
		
		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 5; c++) {
				m[l][c] = (int) (Math.random() * 100) + 1;
			}
			
		}

//		for (int l = 0; l < 3; l++) {
//			for (int c = 0; c < 5; c++) {
//				System.out.print("[ " + m[l][c] + " ] ");
//			}
//			System.out.println("");
//		}
		
		for (int l = 0; l < 3; l++) {
			ThreadMatriz tm = new ThreadMatriz(m[l], l);
			tm.start();
		}

	}

}

package appication;

import java.util.Scanner;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		 System.out.println("Digite a quantidade de linhas da Matriz: ");
		 int n = sc.nextInt();
		 System.out.println("Digite a quantidade de colunas da Matriz: ");
		 int m = sc.nextInt();
		
		
		 int [][] mat = new int[n][m];
		 
		 for (int i = 0; i < n ; i++) {
			 for (int j = 0 ; j < m; j++) {
				 mat[i][j] = sc.nextInt();
				 
			 }
		 }
		 
		 System.out.println();
		 
		 System.out.println("Digite um número a ser procurado na MATRIZ: ");
		 int x = sc.nextInt();
		 
		 for (int i = 0; i < n ; i++) {
			 for (int j = 0 ; j < m; j++) {
				 if(mat[i][j] == x) {
					 
					 System.out.println("Position: " + i + "," + j);
					 
					 if (j > 0) {
					 System.out.println("Left: " + mat[i][j - 1]);
					 }
					 if (i > 0) {
					 System.out.println("Up: " + mat[i - 1][j]);
					 }
					 if (j < mat[i].length - 1) {
					 System.out.println("Right: " + mat[i][j - 1]);
					 }
					 if (i < mat.length - 1) {
					 System.out.println("Down: " + mat[i - 1][j]);
					 }
					 
				 }
				 
			 }
		 }
		 
		
		
		sc.close();

	}

}

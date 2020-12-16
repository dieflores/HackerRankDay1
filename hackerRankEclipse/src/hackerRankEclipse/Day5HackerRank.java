package hackerRankEclipse;

import java.util.Scanner;

public class Day5HackerRank {

	private static final Scanner scanner = new Scanner(System.in); //Desde aqui
		 public static void main(String[] args) {
	        int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?"); // hasta aqui ya estaba en el ejercicio.
	        
	        for(int i = 1;i<= 10;i++) {
	        	System.out.println(n + " x " + i + " = " + n*i);
	        	
	        }

	}

}

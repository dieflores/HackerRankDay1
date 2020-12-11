package hackerRankEclipse;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day1CompleteHackerRank {
	
	    public static void main(String[] args) {
	        int i = 4;
	        double d = 4.0;
	        String s = "HackerRank ";
			
	        Scanner scan = new Scanner(System.in);
	        
	        int a;
	        double b;
	        String s2;
	    //    String s3;
	           
	    a = scan.nextInt();
	    b = scan.nextDouble();
	    s2 = scan.nextLine();
	    // s3 = s + s2;  AQUI TUVE LA PIEDRA DEL CAMINO

	        
	    System.out.println(i + a);
	    System.out.println(d + b);
	    System.out.println(s + scan.nextLine());  //AQUI LO SOLUCIONÉ

	   

	        scan.close();
	    }
	}



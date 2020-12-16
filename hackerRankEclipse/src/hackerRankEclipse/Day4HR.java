package hackerRankEclipse;

import java.util.Scanner;

public class Day4HR {
	
	private int age;	
	  
	public Day4HR (int initialAge) {
  		// Add some more code to run some checks on initialAge
          if(initialAge <0){
              System.out.println("Age is not valid, setting age to 0.");
          }
          else {
              age = initialAge;
          }
	}

	public void amIOld() {
        String amIOld = "";
        if(age < 13){
            amIOld = "You are young.";
        }
        else if(age >= 13 && age < 18){
            amIOld = "You are a teenager.";            
        }
        else {
            amIOld = "You are old.";
        }
  		// Write code determining if this person's age is old and print the correct statement:
        System.out.println(amIOld);
	}

	public void yearPasses() {
        age++; // aqui estuve un buen rato tratando de resolver
  		// Increment this person's age.
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Day4HR p = new Day4HR(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
    }
}

// AUN ASI AL PROGRAMA HAY QUE SOLUCIONAR DE QUE SE REPITEN LOS STRING DE RESPUESTA Y VOLVER A ASIGNAR SI 
// SON MAYORES O MENORES PARA QUE NO SE REPITAN.

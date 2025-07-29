
import  java.util.Random;
import  java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Random random = new Random(); 
		Scanner sc = new Scanner(System.in);

		int valeur = random.nextInt(100) + 1;
// System.out.println( "reponse est "+ valeur);
		System.out.println("Trouve le nombre Aléatoire entre 1 et 100");

		int reponse = 0;
		int tryCount = 0;

		do { 
			System.out.print("Ta proposition :");
            reponse = sc.nextInt();  // lit à chaque tour
			

			if (reponse < valeur){
			System.out.println("c'est plus grand");
			tryCount ++;
		}else if (reponse > valeur){
			System.out.println("c'est plus petit");
			tryCount ++;
		}else{
			System.out.println("Félicitation tu as gagner , Tu a reussi a  gagner en :" +  " " + tryCount + " " + "tentative.");
			sc.close();
		}
		
		}while (reponse != valeur);
	}
}

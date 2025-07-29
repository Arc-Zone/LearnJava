
import java.util.Scanner;
public class bashRoyale{
        private static final Scanner sc = new Scanner(System.in);


    public static void menu() {
        System.out.println("______Bash Royale______");
        System.out.println("1. Play");
        System.out.println("2. Option");
        System.out.println("3. Exit");
        System.out.print("Choix : ");
    }
            
    public static void Delay(int sec){
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Le délai a été interrompu !");
        }
       
    }

    public static void game() {
        int charactereNumberChoose ;
        boolean gaming = true;
        while(gaming){
            Delay(2);
            System.out.println("Initialisation du shell...");
            Delay(2);
            System.out.println("Chargement des variables de chaos...");
            Delay(2);
            System.out.println("Connexion au Serveur Principal : [Bash Royale Arena]...");
            Delay(2);
            System.out.println("Analyse des joueurs connectés... 64 terminaux détectés.");
            Delay(2);
            System.out.println("But du jeu : Survivre. Dominer. Commander.");
            // Simulation d’une boucle de jeu ou action
            System.out.println("\n========== [ SÉLECTION DU COMBATTANT ] ==========");
            chooseCaracter();
            charactereNumberChoose =  Integer.parseInt(sc.nextLine());
            switch (charactereNumberChoose) {
                case 1:
                    System.out.println("Guerrier Sélectionner");
                    break;
                case 2 :
                    System.out.println("Mage Sélectionner");
                break;
                case 3 :
                System.out.println("3 Rôdeur Sélectionner");
                break;
                default:
                    throw new AssertionError();
            }
            String input = sc.nextLine().trim().toLowerCase();
                if (input.equals(5)) {
                        gaming = false;
                        Delay(1);
                }

                
        }
    }
        public static void chooseCaracter(){
            System.out.println("1- Guerrier");
            System.out.println("2 -Mage");
            System.out.println("3 -Rôdeur");
            System.out.println("4 -Soigneur");
            System.out.println("5 -Exit");
            System.out.print("Choix : ");
        }

    public static void main(String[] args) {
    int choice = 0 ;
    do{
        menu();
        choice = Integer.parseInt(sc.nextLine());
        
        switch (choice) {
            case 1:
                game();
                break;
                case 2:
                System.out.println("Pas encore implémenté, feignant !");
                break;
            case 3:
                System.out.println("Fermeture du shell. À bientôt, commandant.");
                break;

            default:
                throw new AssertionError();
        }
    } while(choice != 3);

    }
}
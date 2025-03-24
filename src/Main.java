import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Créer un objet Scanner pour lire les entrées de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir les deux entiers
        System.out.print("Entrez l'entier a : ");
        int a = scanner.nextInt();

        System.out.print("Entrez l'entier b : ");
        int b = scanner.nextInt();

        // Calculer la division de a par b
        int division = a / b;

        // Calculer le modulo de a par b
        int modulo = a % b;

        // Afficher les résultats
        System.out.println("Division de a par b : " + division);
        System.out.println("Modulo de a par b : " + modulo);

        // Fermer le scanner
        scanner.close();
    }
}
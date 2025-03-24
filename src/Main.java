``import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Saisie sécurisée de l'entier a
            int a = readValidInt(scanner, "Entrez l'entier a : ");

            // Saisie sécurisée de l'entier b (vérification division par zéro)
            int b;
            while (true) {
                b = readValidInt(scanner, "Entrez l'entier b : ");
                if (b != 0) break;
                System.out.println("Erreur : b ne peut pas être zéro.");
            }

            // Calculs
            int division = a / b;
            int modulo = a % b;

            // Affichage
            System.out.println("Division de a par b : " + division);
            System.out.println("Modulo de a par b : " + modulo);

        } finally {
            // Ne pas fermer System.in pour éviter des problèmes ultérieurs
            // Le Scanner sera garbage collecté
        }
    }

    /**
     * Lit un entier valide depuis l'entrée utilisateur.
     * @param scanner Objet Scanner pour la lecture
     * @param prompt Message à afficher
     * @return Entier valide saisi
     */
    private static int readValidInt(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Erreur : entrez un nombre valide.");
                scanner.next(); // Vide l'entrée invalide
            }
        }
    }
}

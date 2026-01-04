import java.util.Scanner;
import java.util.Arrays;


public class Etudiant {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // 1. Nombre d'étudiants
        System.out.print("Entrer le nombre d'étudiants : ");
        int n = s.nextInt();

        // 2. Création du tableau
        float[] grades = new float[n];

        // 3. Remplissage des notes
        System.out.println("Entrer les notes des étudiants :");
        for (int i = 0; i < n; i++) {
            System.out.print("Note " + (i + 1) + " : ");
            grades[i] = s.nextFloat();
        }

        // 4. Trier le tableau
        Arrays.sort(grades);

        // Afficher les notes triées
        System.out.println("\nNotes triées :");
        for (float g : grades) {
            System.out.println(g);
        }

        // 5. Calcul de la moyenne
        float somme = 0;
        for (float g : grades) {
            somme += g;
        }
        float moyenne = somme / n;
        System.out.println("\nMoyenne : " + moyenne);

        // 6. Minimum et maximum
        System.out.println("Note minimale : " + grades[0]);
        System.out.println("Note maximale : " + grades[n - 1]);

        // 7. Nombre d'étudiants avec une note spécifique
        System.out.print("\nEntrer la note à rechercher : ");
        float noteRecherche = s.nextFloat();

        int compteur = 0;
        for (float g : grades) {
            if (g == noteRecherche) {
                compteur++;
            }
        }
        System.out.println("Nombre d'étudiants ayant la note " + noteRecherche + " : " + compteur);

        // 8. Fermer le scanner
        s.close();
    }
}



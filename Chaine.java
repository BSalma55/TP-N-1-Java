import java.util.Scanner;

public class Chaine {

        public static void main(String[] args) {

            Scanner s = new Scanner(System.in);

            System.out.println("Enter a line of text (max. 100 characters):");
            String ch = s.nextLine();

            int[] nb_occurrences = new int[26];

            // Ignorer la casse
            ch = ch.toLowerCase();

            // Comptage des lettres
            for (int i = 0; i < ch.length(); i++) {
                char c = ch.charAt(i);

                if (c >= 'a' && c <= 'z') {
                    nb_occurrences[c - 'a']++;
                }
            }

            // Affichage
            System.out.println("The string \"" + ch + "\" contains:");
            for (int i = 0; i < 26; i++) {
                if (nb_occurrences[i] > 0) {
                    System.out.println(
                            nb_occurrences[i] + " occurrence(s) of the letter '" + (char) ('A' + i) + "'"
                    );
                }
            }

            s.close();
        }
    }



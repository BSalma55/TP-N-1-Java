import java.util.Scanner;

public class Verbs {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("entrer un verbe du premier groupe: ");
            String verbe = s.nextLine().toLowerCase();

            //verif si le verb ends with er
            if (!verbe.endsWith("er") || verbe.length() <= 2 ) {
                System.out.println("Erreur : ce n'est pas un verbe régulier du premier groupe !");
                s.close();
                return;
            }

            //extraire le radical
            String radical = verbe.substring(0 , verbe.length()-2) ;
            //  Conjuguer au présent
            System.out.println("➔ je " + radical + "e");
            System.out.println("➔ tu " + radical + "es");
            System.out.println("➔ il/elle " + radical + "e");
            System.out.println("➔ nous " + radical + "ons");
            System.out.println("➔ vous " + radical + "ez");
            System.out.println("➔ ils/elles " + radical + "ent");

            s.close();
        }
}

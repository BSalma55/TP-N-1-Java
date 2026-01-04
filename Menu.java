import java.util.Scanner;

public class Menu {

        public static void main(String[] args) {

            Scanner s = new Scanner(System.in);
            String str = "";
            int choice;

            do {
                System.out.println("Menu:");
                System.out.println("1. Enter a character string");
                System.out.println("2. Display the entered string");
                System.out.println("3. Reverse the entered string");
                System.out.println("4. Count the number of words in the string");
                System.out.println("5. Exit");
                System.out.print("Choose an option: ");

                choice = s.nextInt();
                s.nextLine(); // clear buffer

                System.out.println();

                switch (choice) {

                    case 1:
                        System.out.print("Enter a character string: ");
                        str = s.nextLine();
                        break;

                    case 2:
                        if (str.isEmpty()) {
                            System.out.println("No string has been entered!");
                        } else {
                            System.out.println("The entered string is: " + str);
                        }
                        break;

                    case 3:
                        if (str.isEmpty()) {
                            System.out.println("No string has been entered!");
                        } else {
                            String reversedString = new StringBuilder(str).reverse().toString();
                            System.out.println("Reversed string: " + reversedString);
                        }
                        break;

                    case 4:
                        if (str.isEmpty()) {
                            System.out.println("No string has been entered!");
                        } else {
                            String trimmed = str.trim();
                            if (trimmed.isEmpty()) {
                                System.out.println("Number of words: 0");
                            } else {
                                String[] words = trimmed.split("\\s+");
                                System.out.println("Number of words: " + words.length);
                            }
                        }
                        break;

                    case 5:
                        System.out.println("Program terminated.");
                        break;

                    default:
                        System.out.println("Invalid option!");
                }

                if (choice != 5) {
                    System.out.println("\nPress Enter to return to the menu...");
                    s.nextLine();
                }

            } while (choice != 5);

            s.close();
        }
    }


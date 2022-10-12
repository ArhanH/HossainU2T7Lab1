import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Length of String and Introduction
        System.out.print("Enter a string: ");
        String s1 = myScanner.nextLine();
        System.out.println(s1.length());

        // Splitting the String
        if (s1.length() % 2 == 0){
            System.out.println("First half: " + s1.substring(0, s1.length() / 2));
            System.out.println("Second half: " + s1.substring(s1.length() / 2, s1.length()));
        }
        else {
            System.out.println("First half: " + s1.substring(0, s1.length() / 2));
            System.out.println("Second half: " + s1.substring(s1.length() + 1, s1.length()));
        }

        // Second String Length
        System.out.print("Enter a second string: ");
        String s2 = myScanner.nextLine();

        if (s1.length() > s2.length()){
            System.out.println(s1 + " is longer");
        }
        else if(s1.length() < s2.length()) {
            System.out.println(s2 + " is longer");
        }
        else {
            System.out.println("Both strings have the same length");
        }

        // Alphabetically





    }
}
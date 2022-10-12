import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Obtain String 1
        System.out.print("Enter first string: ");
        String string1 = myScanner.nextLine();

        // Obtain String 1 Length
        int string1Length = string1.length();
        System.out.println(string1Length);

        // Two Halves
        int indexHalf = string1Length / 2;

        if (string1Length % 2 == 0){
            System.out.println("First half: " + string1.substring(0, indexHalf));
            System.out.println("Second half: " + string1.substring(indexHalf));
        }
        else {
            System.out.println("First half: " + string1.substring(0, indexHalf));
            System.out.println("Second half: " + string1.substring(indexHalf));
        }

        // Obtain String 2
        System.out.print("Enter second string: ");
        String string2 = myScanner.nextLine();
        int string2Length = string2.length();

        // Comparing Length of Strings
        if (string1.length() > string2.length()){
            System.out.println(string1 + " is longer");
        }
        else if(string1.length() < string2.length()) {
            System.out.println(string2 + " is longer");
        }
        else {
            System.out.println("Both strings have the same length");
        }

        // Alphabetical Order of Strings
        if(string1.equals(string2)){
            System.out.println("They are equal");
        }
        else{
            int compare = string1.compareTo(string2);
            if (compare < 0){
                System.out.println(string1 + " comes first alphabetically");
            }
            else{
                System.out.println(string2 + " comes first alphabetically");
            }
        }

        // Index
        if(string1.contains(string2)){
            System.out.println(string2 + " is found on index " + string1.indexOf(string2));
        }
        else {
            System.out.println(string2 + " is not found in " + string1);
        }

    }
}

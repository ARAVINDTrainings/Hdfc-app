import java.util.Scanner; // Import the Scanner class to read user input

public class Main {
    // The main method is the entry point of any Java program
    public static void main(String[] args) {
        
        // 1. Output Text
        System.out.println("--- Welcome to Java Programming! ---");
        
        // 2. Variables and Data Types
        String language = "Java";
        int releaseYear = 1995;
        System.out.println(language + " was created in the year " + releaseYear + ".");
        
        // 3. User Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();
        
        System.out.print("Enter your age: ");
        int userAge = scanner.nextInt();
        
        // 4. Conditional Logic (If-Else)
        if (userAge >= 18) {
            System.out.println("Hello " + userName + ", you are an adult.");
        } else {
            System.out.println("Hello " + userName + ", you are a minor.");
        }
        
        // 5. Loops (For Loop)
        System.out.println("\nCounting to 3 using a loop:");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Number: " + i);
        }
        

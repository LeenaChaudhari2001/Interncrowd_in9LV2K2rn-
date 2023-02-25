import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class survey {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "survey.txt";

        System.out.println("Welcome to the survey system!");
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Do you like programming? (yes/no): ");
        String likeProgramming = scanner.nextLine();

        System.out.print("What programming language do you like the most?: ");
        String language = scanner.nextLine();

        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Likes programming: " + likeProgramming + "\n");
            writer.write("Favorite language: " + language + "\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to file.");
            e.printStackTrace();
        }

        System.out.println("Thank you for taking the survey! Your responses have been recorded in " + fileName);
    }
}

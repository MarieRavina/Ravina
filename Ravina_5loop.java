/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ravina_5loop;

import java.util.Scanner;

/**
 *
 * @author My PC
 */
public class Ravina_5loop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
             do {
                 displayMenu();
                 int choice = scanner.nextInt();
                 
                 boolean isCorrect;
                 
                 switch (choice) {
                     case 1 -> isCorrect = solveTrigonometryProblem();
                     case 2 -> isCorrect = solveSolidMensurationProblem();
                     case 3 -> isCorrect = solveGeometryProblem();
                     case 4 -> isCorrect = solveIntegersProblem();
                     case 5 -> isCorrect = solveArithmeticProblem();
                     case 0 -> {
                         System.out.println("Goodbye! Thank you for using the Math Problem Solver.");
                         return;  // Exit the program if the user chooses to exit
                     }
                     default -> {
                         System.out.println("Invalid choice. Please enter a valid option.");
                         continue;
                     }
                 }
                 
                 // Display whether the user's answer is correct
                 if (isCorrect) {
                     System.out.println("Correct!");
                 } else {
                     System.out.println("Incorrect. Please try again.");
                 }
                 
                 // Ask the user if they want to continue
                 System.out.print("Do you want to continue? (yes/no): ");
                 String continueOption = scanner.next().toLowerCase();
                 
                 if (!continueOption.equals("yes")) {
                     System.out.println("Goodbye! Thank you for using the Math Problem Solver.");
                     break;  // Exit the loop if the user chooses not to continue
                 }
                 
             } while (true);
         }
    }

    public static void displayMenu() {
        System.out.println("Math Problem Solver");
        System.out.println("1. Trigonometry");
        System.out.println("2. Solid Mensuration");
        System.out.println("3. Geometry");
        System.out.println("4. Integers");
        System.out.println("5. Arithmetic");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    public static boolean solveTrigonometryProblem() {
        // Trigonometry question
        System.out.println("Solving a trigonometry problem: What is the tangent of 60 degrees?");
        // Correct answer
        double correctAnswer = Math.tan(Math.toRadians(60));

        return getUserAnswerAndCheck(correctAnswer);
    }

    public static boolean solveSolidMensurationProblem() {
        // Solid mensuration question
        System.out.println("Solving a solid mensuration problem: What is the volume of a cylinder with radius 5 and height 8?");
        // Correct answer
        double correctAnswer = Math.PI * Math.pow(5, 2) * 8;

        return getUserAnswerAndCheck(correctAnswer);
    }

    public static boolean solveGeometryProblem() {
        // Geometry question
        System.out.println("Solving a geometry problem: What is the area of a rectangle with length 10 and width 6?");
        // Correct answer
        double correctAnswer = 10 * 6;

        return getUserAnswerAndCheck(correctAnswer);
    }

    public static boolean solveIntegersProblem() {
        // Integers question
        System.out.println("Solving an integers problem: What is the product of -7 and 9?");
        // Correct answer
        int correctAnswer = -7 * 9;

        return getUserAnswerAndCheck(correctAnswer);
    }

    public static boolean solveArithmeticProblem() {
        // Arithmetic question
        System.out.println("Solving an arithmetic problem: What is the result of 15 + 7 - 3 * 2?");
        // Correct answer
        int correctAnswer = 15 + 7 - 3 * 2;

        return getUserAnswerAndCheck(correctAnswer);
    }

    public static boolean getUserAnswerAndCheck(double correctAnswer) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Your answer: ");
        double userAnswer = scanner.nextDouble();

        return Math.abs(userAnswer - correctAnswer) < 0.0001;
    }

    public static boolean getUserAnswerAndCheck(int correctAnswer) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Your answer: ");
        int userAnswer = scanner.nextInt();

        return userAnswer == correctAnswer;
    }
}



    
    


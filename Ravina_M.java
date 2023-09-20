/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ravina_m;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ravina_M {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Kelvin to Fahrenheit");
        System.out.println("4. Kelvin to Celsius");
        System.out.println("5. Celsius to Kelvin");
        System.out.println("6. Fahrenheit to Kelvin");
        System.out.print("Enter your choice (1-6): ");

        int choice = scanner.nextInt();

        double inputTemperature, convertedTemperature;
        String fromUnit, toUnit;

        switch (choice) {
            case 1:
                fromUnit = "Celsius";
                toUnit = "Fahrenheit";
                System.out.print("Enter temperature in Celsius: ");
                inputTemperature = scanner.nextDouble();
                convertedTemperature = (inputTemperature * 9 / 5) + 32;
                break;
            case 2:
                fromUnit = "Fahrenheit";
                toUnit = "Celsius";
                System.out.print("Enter temperature in Fahrenheit: ");
                inputTemperature = scanner.nextDouble();
                convertedTemperature = (inputTemperature - 32) * 5 / 9;
                break;
            case 3:
                fromUnit = "Kelvin";
                toUnit = "Fahrenheit";
                System.out.print("Enter temperature in Kelvin: ");
                inputTemperature = scanner.nextDouble();
                convertedTemperature = (inputTemperature - 273.15) * 9 / 5 + 32;
                break;
            case 4:
                fromUnit = "Kelvin";
                toUnit = "Celsius";
                System.out.print("Enter temperature in Kelvin: ");
                inputTemperature = scanner.nextDouble();
                convertedTemperature = inputTemperature - 273.15;
                break;
            case 5:
                fromUnit = "Celsius";
                toUnit = "Kelvin";
                System.out.print("Enter temperature in Celsius: ");
                inputTemperature = scanner.nextDouble();
                convertedTemperature = inputTemperature + 273.15;
                break;
            case 6:
                fromUnit = "Fahrenheit";
                toUnit = "Kelvin";
                System.out.print("Enter temperature in Fahrenheit: ");
                inputTemperature = scanner.nextDouble();
                convertedTemperature = (inputTemperature - 32) * 5 / 9 + 273.15;
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        System.out.println(inputTemperature + " " + fromUnit + " is " + convertedTemperature + " " + toUnit);
    }
}
    
    


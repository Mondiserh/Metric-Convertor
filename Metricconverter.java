package com.mycompany.metricconverter;

import java.util.Scanner;
/**
 *
 * @author Xolani.Sithole
 */

public class Metricconverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a conversion choice from");
        System.out.println("1. Feets to Meters");
        System.out.println("2. Pounds to Kgs");
        System.out.println("3. Fahrenheit to Celsius");

        System.out.println("**************************************************");
        System.out.println("Choice: ");
        Integer choice =scanner.nextInt();

        if (choice == 1){
            System.out.print("Enter the number of feet: ");
            double feet = scanner.nextDouble();
            double meters = feet * 0.3048;
            System.out.printf("%.2f feet is equal to %.2f meters%n", feet, meters);
            System.out.println("**************************************************");
        }
        else if (choice == 2){
            System.out.print("Enter the number of pounds: ");
            double pounds = scanner.nextDouble();
            double kgs = pounds * 0.453592;
            System.out.printf("%.2f pounds is equal to %.2f kilograms%n", pounds, kgs);
            System.out.println("**************************************************");
        }
        else if (choice == 3){
            System.out.print("Enter the number of fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = (fahrenheit - 32) * 5 / 9;
            System.out.printf("%.2f degrees Fahrenheit is equal to %.2f degrees Celsius%n", fahrenheit, celsius);
            System.out.println("**************************************************");
        }
        else {
            System.out.println("Invalid choice. Please try again.");
        }
        

    }
}

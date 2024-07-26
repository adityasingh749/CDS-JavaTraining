package DSAPractice;

import java.util.Scanner;

import java.util.Scanner;

public class BMIcalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your weight in kg: ");
        float weight = sc.nextFloat();

        System.out.print("Enter your height in meters: ");
        float height = sc.nextFloat();

        float bmi = calculateBMI(weight, height);

        System.out.println("Your BMI is: " + bmi);

        String category = getBMICategory(bmi);
        System.out.println("Your BMI category is: " + category);
    }
    public static float calculateBMI(float weight, float height) {
        return weight / (height * height);
    }

    public static String getBMICategory(float bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}
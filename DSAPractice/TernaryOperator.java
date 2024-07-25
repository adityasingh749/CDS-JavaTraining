package DSAPractice;

import java.util.*;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        String result = (age >= 18) ? "eligible" : "not eligible";
        System.out.println(result);
    }

}

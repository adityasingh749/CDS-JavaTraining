package DSAPractice;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your age ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        String result = (age >= 18) ? "eligible" : "not eligible";
        System.out.println(result);

    }
}
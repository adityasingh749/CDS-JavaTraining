package DSAPractice;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        System.out.println("Enter height and Width");
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        int height = sc.nextInt();
        int area = areaRectangle(width, height);
        System.out.println(area);
    }

    public static int areaRectangle(int width, int height) {
        return(width*height);
    }
}
import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {
        String name = "Aditya Singh";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println("Enter Your Name");
        Scanner sc = new Scanner(System.in);
        String sname = sc.nextLine();
        if(sname.equals("aditya singh")) {
            System.out.println("allowed");
        }
    }
}

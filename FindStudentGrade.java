import java.util.Scanner;

public class FindStudentGrade {
    public static void main(String[] args) {
        System.out.println("Enter Student Marks: ");
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        switch(marks)
        {
            case 10 :
                System.out.println("Fail Grade: E");
                break;
            case 50 :
                System.out.println("Pass Grade: D");
                break;
            case 80 :
                System.out.println("Pass Grade: B");
                break;
            default :
                System.out.println("Marks not match");
        }
    }
}

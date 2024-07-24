public class doWhileDemo {
    public static void main(String[] args) {
        int sum = 0;
        int i = 10;
        do {
            sum = sum + i;
            System.out.println(i);
            i--;
        } while (i >= 1) ;
    System.out.println(sum);
}
}

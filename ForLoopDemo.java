public class ForLoopDemo {
    public static void  main(String [] args) {
        int sum = 0;
        for(int i=10; i >= 1; i--) {
            System.out.println(i);
            sum = sum + i;
        }
        System.out.println(sum);
    }
}

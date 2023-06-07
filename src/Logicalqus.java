import java.util.Scanner;

public class Logicalqus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a and b :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter the number to check number is in the ratio or not :");
        int num = sc.nextInt();
        if (num % (a + b) == 0)
            System.out.println("Given number is in the ratio of " + a + ":" + b);
        else
            System.out.println("Given number is not in the ratio of " + a + ":" + b);
    }
}

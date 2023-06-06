import java.util.Scanner;

public class Ratio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of x :"); // taking input from user
        int x = sc.nextInt();
        System.out.println("Enter number to check it can have ratio 7:3 :"); // taking input from user
        int num = sc.nextInt();
        int res = 7*x+3*x;
        if(num==res)
            System.out.println("Given number has a ration of 7:3");
        else
            System.out.println("Given number has not a ration of 7:3");
    }
}

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :"); // taking input from user
        int num = sc.nextInt();
        checkArmstrong(num); // calling funtion
    }

    // function for checkArmstrong
    public static void checkArmstrong(int num) {
        int temp = num;
        int res = 0, rem;
        while (num != 0) {
            rem = num % 10;
            res = res + rem * rem * rem;
            num = num / 10;
        } // end of while loop
        if (res == temp)
            System.out.println("Number is armstrong");
        else
            System.out.println("Number is not armstrong");
    }
}

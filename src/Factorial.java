import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find factorial :"); // taking input from user
        int num = sc.nextInt();
        int res = fact(num); // calling fact function with paasing argument and storing result into res varible
        System.out.println("Factorial of " + num + " is :" +res);
    } // end of main class

    // function for fact
    public static int fact(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) // for loop
            fact = fact * i;
        return fact;
    } // end of function body
} // end of the factorial class

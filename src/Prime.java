import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :"); // taking input from user
        int num = sc.nextInt();
        checkPrime(num); // calling funtion with paasing value
    }

    // funtion for checkPrime
    public static void checkPrime(int num) {
        int flag = 0;
        if (num == 0 || num == 1)
            System.out.println("Number is not a prime");
        else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    //num = num / 2;
                    flag = 1;
                    break;
                } // end of second if
            } // end of for loop
        } // end of else
        if(flag==0)
            System.out.println("Number is prime");
        else
            System.out.println("Number is not a prime");
    }
}

import java.util.Scanner;

public class InClass 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("What digit do you want from 345678? ");
        int nth = in.nextInt();
        int n = 345678;
        int len = 6;
        int d = len - nth;
        int digit = (int) (n / Math.pow(10, d));  // 34
        int ones = digit % 10;


        System.out.println("The digit is " + ones);
        
        /* Other Examples */
        // System.out.println(Math.sqrt(16));
        // System.out.println("Pi: " + Math.PI);
        // System.out.println(Math.tan(Math.PI / 3));

        // 345678 / 10000 = 34
        // 34 % 10 = 4
}

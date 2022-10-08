import java.util.*;
class okay
 {
    public static void main (String args[])
    {
        int a, b, c, largest;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first  number:");
        a = sc.nextInt();
        System.out.println("Enter second number:");
        b = sc.nextInt();
        System.out.println("Enter third  number:");
        c = sc.nextInt();

        if (a > b && a > c)
            largest = a;
        else if (b > a && b > c)
            largest = b;
        else
            largest = c;

        System.out.println("Largest Number is : " + largest);


    }
}

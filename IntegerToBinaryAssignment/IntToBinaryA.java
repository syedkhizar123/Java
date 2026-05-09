
import java.util.Scanner;

class IntToBInaryA {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Your Integer Value : ");

        int ivalue = sc.nextInt();

        System.out.println("\nYour Binary Value is : " + Integer.toBinaryString(ivalue));

        sc.close();
    }

}

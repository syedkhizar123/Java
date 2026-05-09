
import java.util.Scanner;

class IntToBinaryC {

    public static String toBinaryString(int num) {
        return Integer.toBinaryString(num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Your Integer Number : ");
        int num = sc.nextInt();
        System.out.println("\nNow Let's Calculate Your Binary Number :)");
        String bvalue = toBinaryString(num);
        System.out.println("\nYour Binary Number : " + bvalue);
        sc.close();
    }

}

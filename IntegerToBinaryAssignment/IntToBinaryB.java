
import java.util.Scanner;

class IntToBinaryB {

    public static int[] toBinary(int num) {
        String ivalue = Integer.toBinaryString(num);
        int[] arr = new int[ivalue.length()];
        for (int i = 0; i < ivalue.length(); i++) {
            arr[i] = ivalue.charAt(i) - '0';
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Your Integer Number : ");
        int num = sc.nextInt();

        System.out.println("\nNow Let's Calculate Your Binary Number :)");

        int[] bvalue = toBinary(num);
        System.out.print("\nYour Binary Number : ");
        for (int i = 0; i < bvalue.length; i++) {
            System.out.print(bvalue[i]);

            sc.close();
        }
        System.out.println();
    }

}

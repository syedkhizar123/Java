import java.util.Scanner;

public class HammingCodes {

    public static String[] HammingCodes(String[] array) {
        
        int N = array.length;
        array[0] = "h1";
        array[1] = "h2";
        int hCounter = 3;
        int i = 2;
        
        while (Math.pow(2, i) <= N) {
            int position = (int) Math.pow(2, i);
            array[position - 1] = "h" + hCounter;
            hCounter++; 
            i++;
        }
        return array;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int N = scanner.nextInt();
        String[] arr = new String[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = "d";
        }
        arr = HammingCodes(arr);
        for (String s : arr) {
            System.out.print(s + " ");
        }
        scanner.close();
    }
}


package масив1;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        int arr[] = initializeArray();
        int max=max(arr);
        System.out.println(max);


    }

    public static int[] initializeArray() {
        int[] arr = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++)
            arr[i] = Integer.parseInt(scanner.nextLine());
        return arr;
    }

    public static int max(int[] Array) {
        int max = Array[0];
        for (int i = 1; i < Array.length; i++) {
            if (Array[i] >= max)
                max = Array[i];
        }
        return max;
    }
}

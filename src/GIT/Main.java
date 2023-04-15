package GIT;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Введіть масив");
        for (int i=0; i<arr.length; i++) {
            arr[i]=Integer.parseInt(scanner.nextLine());
        }
        Arrays.sort(arr);
        int temp;
        for (int i=0; i<arr.length; i++) {
        temp=arr[arr.length-1-i];
        arr[arr.length-1-i]=arr[i];
        arr[i]=temp;
        System.out.println(arr[i]);
        }

    }
}

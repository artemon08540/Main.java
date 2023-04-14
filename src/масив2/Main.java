package масив2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner scanner=new Scanner(System.in);
        long number = 8;
        long sotka=10;
        long arr[] = new long[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=number;
            number=8*sotka+number;
            sotka=sotka*10;
            System.out.println(arr[i]);
        }
    }
}

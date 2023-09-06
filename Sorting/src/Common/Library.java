package Common;

import java.util.Random;
import java.util.Scanner;

public class Library {

    public int getInt(String promt, int m, int n) {
        int a = -1;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print(promt + ": ");
            try {
                String s = sc.nextLine();
                a = Integer.parseInt(s);
                if (a >= m && a <= m) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Enter number between " + m + " and " + n);
            }
        }
        return a;
    }

    public int[] createArray(int arr_size) {
        int[] array = new int[arr_size];
        Random rd = new Random();
        for (int i = 0; i < arr_size; i++) {
            array[i] = rd.nextInt(100);
        }
        return array;
    }

    public void display(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                System.out.println(array[i] + ", ");
            } else {
                System.out.println(array[i]);
            }
        }
        System.out.println("");
    }
}

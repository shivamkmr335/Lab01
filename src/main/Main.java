/*
 * @aurtor Shivam Kumar Rai
 * @version 1.0
 * */
package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(number + " X " + i + " = " + (number * i));
        }

    }
}

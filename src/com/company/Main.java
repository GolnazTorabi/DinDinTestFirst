package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().toLowerCase();

        // Get n from user
        scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        n %= 30;

        String ShiftedString = new String();
        for(int i = 0; i < str.length(); i++) {
            int charToASCII = (int) str.charAt(i);

            if ((charToASCII + n) <= 122) {
                ShiftedString +=  Character.toString((char) (charToASCII + n));
            }
            else {
                n = charToASCII + n - 122 - 1;
                System.out.println(n);
                ShiftedString += Character.toString((char) (97 + n));
            }
        }

        System.out.println(ShiftedString);
    }
}

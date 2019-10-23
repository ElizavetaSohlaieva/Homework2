package com.epam;

public class Task5 {
    public static void main(String[] args) {
        int n = 1;
        while (n <= 2) {
            int i = 0;
            while (i <= 5) {
                i++;
                int x = 5;
                while (x >= i) {
                    System.out.print(" ");
                    x--;
                }
                int y = 1;

                while (y <= i * 2) {
                    System.out.print("*");
                    y++;

                }
                System.out.println();
            }
            n++;
        }
    }
}




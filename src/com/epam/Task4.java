package com.epam;

public class Task4 {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 4){
            i++;
            int x = 4;
            while (x >= i){
                System.out.print(" ");
                x--;
            }
            int y = 1;
            while (i >= y){
                System.out.print("*");
                y++;
            }
            System.out.println();
        }
        i = 0;
        while (i <= 4){
            i++;
            int x = 1;
            while (x <= i){
                System.out.print(" ");
                x++;
            }
            int y = 4;
            while (i <= y){
                System.out.print("*");
                y--;
                ;               }
            System.out.println();
        }

    }
}

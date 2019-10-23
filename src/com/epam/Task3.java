package com.epam;

public class Task3 {
    public static void main(String[] args){
        int i = 0;
        while (i <= 5){
            i++;
            int x = 5;
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
    }
}

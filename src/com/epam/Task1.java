package com.epam;

public class Task1 {

    public static void main(String[] args) {
		int i = 0;
		while (i <= 4){
			i++;
			int x = 1;
			while (x <= i){
				System.out.print("*");
				x++;
			}
			System.out.println( );
		}
		while (i >= 0){
			i--;
			int x = 1;
			while (x <= i){
				System.out.print("8");
				x++;
			}
			System.out.println( );
		}
    }
}

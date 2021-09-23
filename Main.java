package com.company;

public class Main {

    public static void main(String[] args) {
	int x =9 ,y=8;
        System.out.println("x & y="+(x&y));//why 8?->addition of the binary of the numbers one of the number is the product
        System.out.println("    ");
        System.out.println("x ^ y="+(x^y));
        System.out.println("  ");
        System.out.println("x|y="+(x|y));
        System.out.println("  ");
        x=1;
        System.out.println("~x="+(~x));//why -2?->uses 2's complement to represent negative

    }
}

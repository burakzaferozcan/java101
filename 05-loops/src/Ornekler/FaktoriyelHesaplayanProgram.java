package Ornekler;

import java.util.Scanner;

public class FaktoriyelHesaplayanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("faktoriyel sayısını giriniz : ");
        int n = input.nextInt();
        int total = 1;
        for (int i = 1; i <= n; i++) {
            total *= i;
        }
        System.out.println(n + ". faktöriyel : " + total);
    }
}

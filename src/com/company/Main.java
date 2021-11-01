package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer[] barcode = new Integer[12];
        int evenTot = 0;
        int oddTot = 0;
        for (int i = 0; i < 12; i++){
            System.out.println("enter you next digit of the barcode");
            int num = input.nextInt();
            barcode[i] = num;

        }
        for (int i = 0;i <12;i++){
            if (i == 0 || i % 2 == 0){
                evenTot = evenTot + barcode[i];
                System.out.println(evenTot);
            }
            else{
                oddTot = oddTot + barcode[i];
                System.out.println(oddTot);
            }

        }
        oddTot = oddTot * 3;
        int Total = evenTot + oddTot;
        int checkDigit = 80 - Total;
        System.out.println("the check digit is "+ checkDigit);


    }
}

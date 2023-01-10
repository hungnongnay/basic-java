package com.mycompany.p0004_quicksortalgorithm;

import java.util.Scanner;

public class validation {
    public static int checkInput(){
        Scanner sc = new Scanner(System.in);
        while(true){
            try {
                int result = Integer.parseInt(sc.nextLine());
                if(result > 0){
                    return result;
                }else{
                    System.out.println("Negative integers and zeros are not accepted!!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter positive integer: ");
            }
        }
    } 
}

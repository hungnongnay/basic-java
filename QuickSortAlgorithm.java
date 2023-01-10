package com.mycompany.p0004_quicksortalgorithm;

import java.util.Random;
import java.util.Scanner;

public class QuickSortAlgorithm {
    
    Random rand = new Random();
    Scanner sc = new Scanner(System.in);
    validation validation = new validation();    
    private int[] arr;
    int n;
    
    public void array(){
        System.out.println("Enter number of array: ");
        n = validation.checkInput();
        int[] array2 = new int[n];  
        for(int i = 0; i<n; i++){
            array2[i] = rand.nextInt(100);                
        }
        arr = array2;
    }
    
    public void printArr(){
        System.out.print("[");
        for(int i =0; i<n; i++){
            System.out.print(arr[i]);
            if(i<n-1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    
    public int partition(int[] arr, int l, int r) {       
        int pivot = arr[(l+r)/2];

        while (l<= r) {
            while (arr[l]<pivot) {
                l++;
            }
            while (arr[r]>pivot) {
                r--;
            }
            if (l <= r) {
                int t = arr[l];
                arr[l] = arr[r];
                arr[r] = t;
                l++; r--;       
            }
        }
        return l;
    }
      
    public void quickSort(int[] arr, int l, int r) {
        int pi = partition(arr, l, r);
        if (l < pi - 1) {
            quickSort(arr, l, pi-1);
        }
        if (pi < r) {
            quickSort(arr, pi, r);
        }
    }
    
    public void addParameter() {
        quickSort(arr, 0, n-1);
    }
}

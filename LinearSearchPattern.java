package com.firstpackage;

public class LinearSearchPattern {
    public static void main(String[] args) {
        int[] arr = {10,30,20,50,40,60,90,80,70};
        int key = 60;
        for (int i=0; i< arr.length;i++){
            if (key== arr[i]){
                System.out.println("key is found at index:"+ " "+i);
                System.exit(0);
            }
        }
        System.out.println("key not found");
    }
}

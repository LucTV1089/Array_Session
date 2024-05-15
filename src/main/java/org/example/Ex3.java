package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ar1 = new int[3];
        int[] ar2 = new int[4];

        System.out.println("Nhap cac gia tri pha ntu vao mang");
        for (int i = 0; i < ar1.length; i++) {
            System.out.println("Nhap phan tu vao mang o vi tri : " + i);
            ar1[i] = sc.nextInt();
        }
        System.out.println("--------------------------------");
        System.out.println("Cac phan tu trong mang la : ");
        for (int element : ar1) {
            System.out.println(element);
        }

        System.out.println("Nhap cac gia tri pha ntu vao mang");
        for (int i = 0; i < ar2.length; i++) {
            System.out.println("Nhap phan tu vao mang o vi tri : " + i);
            ar2[i] = sc.nextInt();
        }
        System.out.println("--------------------------------");
        System.out.println("Cac phan tu trong mang la : ");
        for (int element : ar2) {
            System.out.println(element);
        }

        int length = ar1.length + ar2.length;
        int[] result = new int[length];
        int pos = 0;
        for(int element : ar1)
        {
            result[pos] = element;
            pos++;
        }
        for(int element : ar2)
        {
            result[pos] = element;
            pos++;
        }
        System.out.println("--------------------------------");
        System.out.println(Arrays.toString(result));
    }
}

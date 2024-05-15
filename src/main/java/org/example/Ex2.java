package org.example;


import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[7];
        System.out.println("Nhap cac gia tri pha ntu vao mang");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhap phan tu vao mang o vi tri : " + i);
            array[i] = sc.nextInt();
        }
        System.out.println("--------------------------------");
        System.out.println("Cac phan tu trong mang la : ");
        for (int element : array) {
            System.out.println(element);
        }

        System.out.println("--------------------------------");
        System.out.println("Nhap vao gia tri can them vao mang");
        int numberInsert = Integer.parseInt(sc.nextLine());
        int indexInsert = Integer.parseInt(sc.nextLine());

        int[] arrNew = new int[array.length+1];
        for(int i = 0;i<arrNew.length;i++) {
            if(i<indexInsert) {
                arrNew[i] = array[i];
            } else if (i == indexInsert) {
                arrNew[i] = numberInsert;
            }
            else {
                arrNew[i] = array[i-1];
            }
        }
        System.out.println("Gia tri sau khi them moi : ");
        for(int i = 0;i<arrNew.length;i++)
        {
            System.out.printf("%d\t", arrNew[i]);
        }

    }
}
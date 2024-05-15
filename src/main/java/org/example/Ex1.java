package org.example;


import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Ex1 {
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
        System.out.println("Tim kiem phan tu va xuat ra vi tri cua phan tu trong mang :");
        System.out.println("Nhap vao so muon tim trong mang :");
        int findNumber = sc.nextInt();
        if (IntStream.of(findNumber).anyMatch(x -> true)) {
            System.out.println("Mang co chua phan tu :" + findNumber);
//            int index = Arrays.asList(array).indexOf(findNumber);
//            System.out.println("Vi tri cua "+findNumber+ " la : "+index);
            int index = Arrays.binarySearch(array, findNumber);
            System.out.println("Vi tri cua " + findNumber + " la : " + index);
            System.out.println("--------------------------------");
            System.out.println("Xoa 1 phan tu khoi mang : ");
            System.out.println("Nhap vao phan tu muon xoa : ");
            int delNumber = sc.nextInt();
            int count =0;
            for(int i=0; i<array.length; i++)
            {
                if(array[i]==delNumber)
                {
                    count++;
                }
            }
            int[] arrayNew = new int[array.length-count];
            int ind =0;
            for(int i=0; i<array.length; i++)
            {
                if(array[i]==delNumber)
                {
                    continue;
                }
                else {
                    arrayNew[ind] = array[i];
                    ind++;
                }
            }
            System.out.println("Gia tri cac phan tu cua mang sau khi xoa :");
            for(int i=0; i<arrayNew.length;i++)
            {
                System.out.printf("%d",arrayNew[i]);
            }
        } else {
            System.out.println("Mang khong co chua phan : " + findNumber);
        }
    }
}
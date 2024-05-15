package org.example;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Nhap vao so dong  cua ma tran : ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap vao so cot cua ma tran : ");
        int m = Integer.parseInt(sc.nextLine());
        float[][] matran = new float[n][m];
        System.out.println("Nhap vao gia tri cac phan tu cua ma tran : ");
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                System.out.printf("matran[%d][%d] = ",i,j);
                matran[i][j] = Float.parseFloat(sc.nextLine());
            }
        }
        float max = matran[0][0];
        for(int i=0;i<n;i++)
        {
            for(int j = 0;j<m;j++)
            {
                if(max<matran[i][j])
                {
                    max = matran[i][j];
                }
            }
        }
        for(int i =0;i<n;i++ )
        {
            for(int j = 0;j<m;j++)
            {
                if(matran[i][j] ==max)
                {
                    System.out.printf("Toa do: {%d,%d} - Gia tri : %f\n",i,j,matran[i][j]);
                }
            }
        }
    }
}

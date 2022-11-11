package com.nowcoder.mavendemo2;

import java.util.Scanner;

public class Text2 {
    public static int ef(int[] arr,int a,int b,int num){
        int c=(a+b)/2;
            if(arr[c]==num){
                return c;
            }else if(arr[c]<num){
                return ef(arr,c,b,num);
            }else if(arr[c]>num){
                return ef(arr,a,c,num);
            }
            return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] arr=new int[n];
        int[] mm=new int[m];
        int i=0,j=0;
        while (i<n){
            arr[i]=sc.nextInt();
            i++;
        }
        while (j<m){
            mm[j]=sc.nextInt();
            j++;
        }
        for(int k=0;k<m;k++){
            if(k==m-1){
                System.out.print(ef(arr,0,arr.length,mm[k]));
            }else {
                System.out.print(ef(arr,0,arr.length,mm[k])+" ");
            }
        }
    }
}

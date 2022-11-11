package com.nowcoder.mavendemo2;

public class App {
    //分治法--快排
    public static void main( String[] args ) {
        int[] arr={100,21,51,45,96,32};
        kuaipai(arr,0,arr.length-1);
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
    static void kuaipai(int[] arr,int left,int right){
        if(left>=right){
            return;
        }
        int cen=arr[(left+right)/2],l=left-1,r=right+1;
        while (l<r){
            do {
                l++;
            }while (arr[l]<cen);
            do {
                r--;
            }while (arr[r]>cen);
            if(l<r){
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
            }
        }
        kuaipai(arr,left,r);
        kuaipai(arr,r+1,right);
    }
}

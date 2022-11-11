package com.nowcoder.mavendemo2.Demo1;

import java.util.Arrays;
import java.util.Comparator;

public class Text4{
    public static void main(String[] args) {
        int[][] arr={{1,4},{3,5},{0,6},{4,7},{3,9},{5,9},{6,10},{8,11},{8,12},{2,14},{12,16}};
        Arrays.sort(arr,new Comparator<int[]>(){
            public int compare(int[] o1,int[] o2){
                return o1[1]-o2[1];
            }
        });
        int sum=0;
        int time=0;
        for (int i = 0; i < arr.length; i++) {
            if(time<=arr[i][0]){
                sum++;
                time=arr[i][1];
            }
        }
        System.out.println(sum);
    }
}

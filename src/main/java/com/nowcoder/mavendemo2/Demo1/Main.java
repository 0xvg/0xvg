package com.nowcoder.mavendemo2.Demo1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int V=sc.nextInt();//最大金额
        sc.nextLine();
        String s=sc.nextLine();
        String[] str=s.split(" ");
        int[] jz=new int[str.length];//物品价格
        int sum=0;
        for (int i=0;i<jz.length;i++){
            jz[i]=Integer.parseInt(str[i]);
        }
        Arrays.sort(jz);
        for (int i : jz) {
            sum += i;
            if (sum > V) {
                sum -= i;
                break;
            }
        }
        System.out.println(sum);
    }
}

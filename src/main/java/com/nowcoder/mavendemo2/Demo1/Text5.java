package com.nowcoder.mavendemo2.Demo1;

public class Text5 {
    public static void main(String[] args) {
        int[] arr={3,5,5,2,5,1,5,5};
        int n=8;
        int ar=arr[0],a=1;
        for (int i = 1; i < n; i++) {
            if(arr[i]==ar){
                a++;
            }else {
                if(a>0){
                    a--;
                }else {
                    ar=arr[i];
                }
            }
        }
        int b=0;
        for (int i = 0; i < n; i++) {
            if (arr[i]==ar){
                b++;
            }
        }
        if(2*b>n){
            System.out.println("主元素："+ar);
        }
    }
}

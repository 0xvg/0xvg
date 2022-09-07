package com.nowcoder.mavendemo2;

import java.util.Arrays;

public class Text1 {
    /**
     * 添加功能
     * public static void add(int[] a,int index,int num){
     *         for(int i=a.length-1;(i>=index+1);i--){
     *             a[i]=a[i-1];
     *         }
     *         a[index]=num;
     *     }
     *     public static void main(String[] args) {
     *         int[] a=new int[]{1,2,3,4,5,6,8};
     *         add(a,2,7);
     *         for(int i=0;i<a.length;i++){
     *             System.out.print(a[i]+" ");
     *         }
     *     }
     */
    /**
     * 删除功能
     * public static void sc(int[] a,int index){
     *         for(int i=index;i<a.length-1;i++){
     *             a[i]=a[i+1];
     *         }
     *         a[a.length-1]=0;
     *     }
     *     public static void main(String[] args) {
     *         int[] a=new int[]{1,2,3,4,5,6,8};
     *         sc(a,3);
     *         System.out.println(Arrays.toString(a));
     *     }
     */

    //删除指定数组中元素前后两个数
    public static void main(String[] args) {
        int[] a=new int[]{11,21,3,4,5,6,7,1,3,10,2,13,12,14};
        int index=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==4){
                index=i;
            }
        }
        int[] b=new int[a.length-2];
        System.arraycopy(a,0,b,0,index-1);
        System.arraycopy(a,index,b,index-1,1);
        System.arraycopy(a,index+2,b,index,a.length-2-index);
        System.out.println(Arrays.toString(b));
    }
}

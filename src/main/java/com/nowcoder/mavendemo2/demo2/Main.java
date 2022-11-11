package com.nowcoder.mavendemo2.demo2;

import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class Main {
    public static volatile int num=0;//结果
    public static int m=0;//打印的数
    public static int n=0;//线程数
    public static final Semaphore sem=new Semaphore(1);//1个线程
    static class Text implements Runnable{
        private final int index;
        public Text(int index){
            this.index=index;
        }
        @Override
        public void run() {
            while (num<m){
                if( (num%n==index) && (num<m) ){
                    try {
                        sem.acquire();
                        System.out.println(Thread.currentThread().getName()+"="+(num+1));
                        num++;
                    }catch (Exception ignored){

                    }finally {
                        sem.release();
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m=sc.nextInt();//1...m个数
        n=sc.nextInt();//n个线程交替输出到m
        for (int i=0;i<=n;i++) {
            Thread thread=new Thread(new Text(i));
            thread.setName("线程"+(i+1));
            thread.start();
        }
    }
}

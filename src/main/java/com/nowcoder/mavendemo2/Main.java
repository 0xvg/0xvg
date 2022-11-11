package com.nowcoder.mavendemo2;

import java.util.*;

/*class Node{
    public int val;
    public Node next;
    public Node(int val){
        this.val=val;
    }
}
public class Main {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int q=sc.nextInt();//操作次数
            Queue<Integer> queue=new LinkedList<>();
            queue.peek();//头
        }
}*/
class Student{
    String name;
    ArrayList<Double> score;
    double average(ArrayList<Double> score){
        double v=0;
        for (double i : score){
            v+=i;
        }
        return v/score.size();
    }
    Student contains(ArrayList<Student> arr,String name){
        for (int i=0;i<arr.size();i++){
            Student stu=arr.get(i);
            if(stu.name.equals(name)){
                return stu;
            }
        }
        return null;
    }
    void print(){
        System.out.printf("%-9s",name);
        System.out.printf("%.2f\n",average(score));
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Student> stu=new ArrayList<>();
        String str="";
        while (!str.equals("#")){
            str=sc.next();
            if(str.equals("#")){
                break;
            }
            Student stu1=new Student();
            double cj=sc.nextDouble();
            Student stu2=stu1.contains(stu,str);
            if (stu2==null){
                stu1.name=str;
                stu1.score=new ArrayList<Double>();
                stu1.score.add(cj);
                stu.add(stu1);
            }else {
                stu2.score.add(cj);
            }
        }
        System.out.println("姓 名     平均成绩");
        for (Student i: stu) {
            i.print();
        }
    }
}

package com.nowcoder.mavendemo2;

/**
 * @Auther:xvg
 * @Date:2022/8/17 - 08 - 17 - 18:32
 */
public class Text2 {
    public static void main(String[] args) {
        int sum=63;
        int count=0;
        while(sum>0){
            if(sum % 8 == 1){
                System.out.println(sum);
                break;
            }
            count++;
            sum=63*(count*10+3);
        }
    }
}

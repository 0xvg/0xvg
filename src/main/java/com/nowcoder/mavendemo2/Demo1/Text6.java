package com.nowcoder.mavendemo2.Demo1;

public class Text6 {
    static int[] w ={5,2,6,4,3} ;
    static int n=5,W=10;
    static int maxw=0;   //存放最优解的总重量,初值是0
    static int[] x ={0,0,0,0,0}; //存放最优解向量,初值是0
    static int minnum=999999;   //存放最优解的集装箱个数，初值为最大值
    static void dfs(int num,int tw,int rw,int op[],int i){
        if(i>=n){  //i>n说明所有的集装箱都判断完了
  		if(tw==W&&num<minnum){ //满足这个条件即为最优解，则覆盖之前的解
  			maxw=tw;
  			minnum=num;
  			for(int j=0;j<n;j++){
  				x[j]=op[j];  //把最优解的值依次赋给最优解向量
                         }
  		}
  	}else{  //没到最后一个集装箱则需要判断当前这个集装箱是选还是不选
  		op[i]=1;  //如果选择
  		if(tw+w[i]<=W){  //判断剪枝条件
  			dfs(num+1,tw+w[i],rw-w[i],op,i+1);
  		}
  		op[i]=0;  //如果不选
  		if(tw+rw-w[i]>=W){  //判断剪枝条件
  			dfs(num,tw,rw-w[i],op,i+1);
  		}
        }
    }
    static void displaySolution(int n) {
        for(int i=0;i<n;i++){
  		if(x[i]==1){
            System.out.println("选择第"+i+"个集装箱");
  		}
  	}
        System.out.println("总重量为"+maxw);
    }
    public static void main(String[] args) {
        int[] op={0,0,0,0,0};//可行解
        int rw=0;
        for (int i = 0; i < n; i++) {
            rw=rw+w[i];
        }
        dfs(0,0,rw,op,0);
        displaySolution(n);
    }


}

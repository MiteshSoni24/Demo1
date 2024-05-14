package FibbonacciSeries;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            System.out.print(fibbo(i)+" ");
        }
    }
    public static int fibbo(int n){
        if(n<=1){
            return n;
        }else{
            return fibbo(n-1)+fibbo(n-2);
        }
    }
}
//output
//if 10
//0 1 1 2 3 5 8 13 21 34
package OverallOverview;

public class Overview {
    public static void main(String[] args) {
        int a=5;
        int b=100;

//        swap both values without third variable
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("value of a is "+a);//100
        System.out.println("value of b is "+b);//5
        System.out.println();

        a=a*b;//50
        b=a/b;//5
        a=a/b;//10
        System.out.println("value of a is "+a);//100
        System.out.println("value of b is "+b);//5
        System.out.println();

        //Swap using third variable
        int c= a;
        a=b;
        b=c;
        System.out.println("value of a is "+a);//100
        System.out.println("value of b is "+b);//5
        System.out.println();

        //operators
        //convert integer into binary format
        System.out.println(a&b);//4
        System.out.println(a|b);//101
        System.out.println(~a);//-6
        System.out.println(~b);//-101
        System.out.println(a<<b);//10*2^5;//80
        System.out.println(a>>b);//10/2^5;//0
        System.out.println(a>>>b);//a converted to binary,//0
        int n=5000;
        System.out.println(n>>>b);//312
        //binary value converted into 32 bit
//        binary values shifted b times right side
//          remainder converted into decimal

/*
        //ternary operator
        //a,b,c the greatest number using ternary operator

        Scanner sc=new Scanner(System.in);
         a=sc.nextInt();
         b=sc.nextInt();
        int c=sc.nextInt();

        int result=(a>b)?((a>c)?a:c):((b>c)?b:c);
        System.out.println(result);//input 2 4 1   output 4
        */


    }
}

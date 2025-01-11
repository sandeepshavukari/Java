package com.sandeep.Core;

class BavaMardi{
    public int add(int a,int b)
    {
        return a+b;
    }
    public void add1(int a,int b){
        System.out.println(a+b);
    }
    public int add2(){
        int a=10;
        int b=10;
        return a+b;
    }
    public static void add3(){
        int a=10;
        int b=10;
        System.out.println(a+b);
    }
}
public class Bava {
    public static void main(String[] args) {
        BavaMardi bm = new BavaMardi();
        int ans1=bm.add(6, 8);
        System.out.println(ans1);
        bm.add1(6, 23);
        int ans2=bm.add2();
        System.out.println(ans2);
        bm.add3();
    }
    
}

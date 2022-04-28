package com.kuraido;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) 
    {
        System.out.println(fib(6));
        System.out.println(fib(7));
        System.out.println(fib(8));
        System.out.println(fib(50));
    }
    public static long fib(int n)
    {
        long[] table = new long[n+1];
        Arrays.fill(table,0);
        table[1]=1;
        for(int i=2;i<=n;i++)
        {
            table[i]=table[i-1]+table[i-2];
        }
        return table[n];
    }
}

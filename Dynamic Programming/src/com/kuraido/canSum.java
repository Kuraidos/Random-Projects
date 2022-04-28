package com.kuraido;

import java.util.Arrays;

public class canSum
{
    public static void main(String[] args)
    {
        System.out.println(canSum(300,new int[]{7,14}));
    }

    public static boolean canSum(int canGet,int[] numbers)
    {
        boolean[] table= new boolean[canGet+1];
        Arrays.fill(table,false);
        table[0]=true;
        for(int i =0; i<=canGet;i++)
        {
            if(table[i])
            {
                for (int number:numbers)
                {
                    if(i+number<=canGet)
                    {
                        table[i+number]=true;
                    }
                }
            }
        }
        return table[canGet];
    }
}

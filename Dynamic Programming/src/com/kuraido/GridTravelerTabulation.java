package com.kuraido;

import java.util.Arrays;

public class GridTravelerTabulation
{
    public static void main(String[] args)
    {
        System.out.println(traveler(18,18));
    }

    public static long traveler(int n, int m)
    {
        long[][] table = new long[m+1][n+1];
        for(long[] row: table)
        {
            Arrays.fill(row,0);
        }
        table[1][1]=1;

        for(int j=0;j<=m;j++)
        {
            for (int i=0;i<=n;i++)
            {
                if(j+1<=m)
                {
                    table[j+1][i]+=table[j][i];
                }
                if(i+1<=n)
                {
                    table[j][i+1]+=table[j][i];
                }
            }
        }

        return table[m][n];
    }
}

package com.kuraido;

public class Main {

    public static void main(String[] args)
    {
        int[] height= new int[]{4,3,2,1,4};

        System.out.println(maxArea2(height));
    }
    public static int maxArea(int[] height)
    {
        int biggest=0;
        for(int i=0;i<height.length-1;i++)
        {
            for(int j=i+1;j< height.length;j++)
            {
                int area=0;
                if(height[i]<height[j])
                {
                    area=height[i]*(j-i);
                }
                else
                {
                    area=height[j]*(j-i);
                }
                if(biggest<area)
                {
                    biggest=area;
                }
            }
        }
        return biggest;
    }
    public static int maxArea2(int[] height)
    {
        int biggest=0;
        int i=0;
        int j=height.length-1;
        while(i!=j)
        {
            int area =0;
            if(height[i]<height[j])
            {
                area=height[i]*(j-i);
            }
            else
            {
                area=height[j]*(j-i);
            }
            if(area>biggest)
            {
                biggest=area;
            }
            if(height[i]<height[j])
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        return biggest;
    }
}

package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args)
    {
        int[] array = new int[]{0,0,0,0};
        System.out.println(threeSum(array));
    }

    public static List<List<Integer>> threeSum(int[] nums)
    {
        Arrays.sort(nums);
        List<List<Integer>> listOfTriplets = new ArrayList<>();
        for (int i=0;i<nums.length-2;i++)
        {
            if(i!=0 && nums[i]==nums[i-1])
            {
                continue;
            }
            int left=i+1;
            int right=nums.length-1;
            while (left<right)
            {
                if(nums[i]+nums[left]+nums[right]<0)
                {
                    left++;
                }
                else if(nums[i]+nums[left]+nums[right]>0)
                {
                    right--;
                }
                else
                {
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[left]);
                    triplet.add(nums[right]);
                    listOfTriplets.add(triplet);
                    left++;
                    while(nums[left]==nums[left-1] && left<right)
                    {
                        left++;
                    }
                }
            }

        }
        return listOfTriplets;
    }

}

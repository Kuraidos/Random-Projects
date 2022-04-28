package com.kuraido;

import java.util.Arrays;

public class Main {

    public static void main(String[] args)
    {
        String[] strs = new String[]{"dog","racecar","car"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs)
    {
        String working=strs[0];
        boolean found=false;

        for (String s:strs)
        {

           if(working.length()>s.length())
           {
               working=s;
           }
        }

        while(!found)
        {
            found=true;
            for (String s:strs)
            {
                if(!s.substring(0,working.length()).equals(working))
                {
                    found=false;
                    break;
                }
            }
            if(found)
            {
                return working;
            }
            working=working.substring(0,working.length()-1);
        }

        return working;
    }
}

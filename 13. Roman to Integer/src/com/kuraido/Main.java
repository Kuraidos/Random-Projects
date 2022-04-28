package com.kuraido;

public class Main {

    public static void main(String[] args)
    {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String string)
    {
        int result=0;
        while (!string.isEmpty())
        {
            String firstTwo="";
            String first=string.substring(0,1);
            if(string.length()>1)
            {
                firstTwo= string.substring(0,2);
            }

            if(firstTwo.equals("CM"))
            {
                result+=900;
                string=string.substring(2,string.length());
            }
            else if(first.equals("M"))
            {
                result+=1000;
                string=string.substring(1,string.length());
            }
            else if(firstTwo.equals("CD"))
            {
                result+=400;
                string=string.substring(2,string.length());
            }
            else if(first.equals("D"))
            {
                result+=500;
                string=string.substring(1,string.length());
            }
            else if(firstTwo.equals("XC"))
            {
                result+=90;
                string=string.substring(2,string.length());
            }
            else if(first.equals("C"))
            {
                result+=100;
                string=string.substring(1,string.length());
            }
            else if(firstTwo.equals("XL"))
            {
                result+=40;
                string=string.substring(2,string.length());
            }
            else if(first.equals("L"))
            {
                result+=50;
                string=string.substring(1,string.length());
            }
            else if(firstTwo.equals("IX"))
            {
                result+=9;
                string=string.substring(2,string.length());
            }
            else if(first.equals("X"))
            {
                result+=10;
                string=string.substring(1,string.length());
            }
            else if(firstTwo.equals("IV"))
            {
                result+=4;
                string=string.substring(2,string.length());
            }
            else if(first.equals("V"))
            {
                result+=5;
                string=string.substring(1,string.length());
            }
            else if(first.equals("I"))
            {
                result+=1;
                string=string.substring(1,string.length());
            }
        }
        return result;
    }
}

package com.kuraido;


public class Main {

    public static void main(String[] args)
    {
        int number=1994;
        System.out.println(intToRoman(number));
    }
    public static String intToRoman(int num)
    {

        int remainder=num;
        String result="";
        while (remainder>0)
        {
            if(remainder>=1000)
            {
                result+="M";
                remainder-=1000;
            }
            else if(remainder>=900)
            {
                result+="CM";
                remainder-=900;
            }

            else if(remainder>=500)
            {
                result+="D";
                remainder-=500;
            }
            else if(remainder>=400)
            {
                result+="CD";
                remainder-=400;
            }
            else if(remainder>=100)
            {
                result+="C";
                remainder-=100;
            }
            else if(remainder>=90)
            {
                result+="XC";
                remainder-=90;
            }
            else if(remainder>=50)
            {
                result+="L";
                remainder-=50;
            }
            else if(remainder>=40)
            {
                result+="XL";
                remainder-=40;
            }
            else if(remainder>=10)
            {
                result+="X";
                remainder-=10;
            }
            else if(remainder>=9)
            {
                result+="IX";
                remainder-=9;
            }
            else if(remainder>=5)
            {
                result+="V";
                remainder-=5;
            }
            else if(remainder>=4)
            {
                result+="IV";
                remainder-=500;
            }
            else if(remainder>=1)
            {
                result+="I";
                remainder-=1;
            }
        }




        return result;
    }
}

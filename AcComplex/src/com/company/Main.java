package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    //http://10.0.0.6/ctf_deploy/accomplex/EVyWYFjom1/flag.php?JBRSAI=True&VCELEG=True&FBORVE=True&NDNQYV=True&XKIVCY=True&NDSOZJ=True
    public static void main(String[] args)
    {
        String[] myValues = new String[]{"JBRSAI","VCELEG","FBORVE","NDNQYV","XKIVCY","NDSOZJ"};
        for (String url: getCombinations(myValues))
        {
            System.out.println(url);
        }
    }

    public static List<String> getCombinations(String[] myValues)
    {
        String url="http://10.0.0.6/ctf_deploy/accomplex/EVyWYFjom1/flag.php?";
        List<String> result = new ArrayList<>();
        for(int i=0;i<Math.pow(myValues.length,2);i++)
        {
            String tempValue="";
            tempValue+=url;
            if(getBit(i,0)==1)
            {
                tempValue+="&"+myValues[0]+"=True";
            }
            else
            {
                tempValue+="&"+myValues[0]+"=False";
            }
            if(getBit(i,1)==1)
            {
                tempValue+="&"+myValues[1]+"=True";
            }
            else
            {
                tempValue+="&"+myValues[1]+"=False";
            }
            if(getBit(i,2)==1)
            {
                tempValue+="&"+myValues[2]+"=True";
            }
            else
            {
                tempValue+="&"+myValues[2]+"=False";
            }
            if(getBit(i,3)==1)
            {
                tempValue+="&"+myValues[3]+"=True";
            }
            else
            {
                tempValue+="&"+myValues[3]+"=False";
            }
            if(getBit(i,4)==1)
            {
                tempValue+="&"+myValues[4]+"=True";
            }
            else
            {
                tempValue+="&"+myValues[4]+"=False";
            }
            if(getBit(i,5)==1)
            {
                tempValue+="&"+myValues[5]+"=True";
            }
            else
            {
                tempValue+="&"+myValues[5]+"=False";
            }
            result.add(tempValue.replaceFirst("&",""));
        }

        return result;
    }

    public  static int getBit(int n, int k) {
        return (n >> k) & 1;
    }
}

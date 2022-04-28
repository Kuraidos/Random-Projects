public class Solution
{
    public boolean isPalindrome(int x)
    {
        if(x<0){return false;}
        int start=0;
        int end =0;
        char[] numArray = (x+"").toCharArray();
        start=numArray.length/2;
        if(numArray.length%2==0) {end =start-1; }
        else {end = start;}

        while (start<numArray.length && end>=0)
        {
            if(numArray[start]!=numArray[end])
            {
                return false;
            }
            start++;
            end--;
        }


        return true;
    }
}


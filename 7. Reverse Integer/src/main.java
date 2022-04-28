public class main
{
    public static void main(String[] args)
    {

        System.out.println(reverse(-2147483648));
    }

    public static int reverse(int x)
    {
        boolean isNegative=false;
        String result="";
        if(x<0){x=x*-1; isNegative=true;}
        char[] numCharArray=String.valueOf(x).toCharArray();
        for (char c: numCharArray) {
            result=c+result;
        }
        try
        {
            if(isNegative){return -1*Integer.valueOf(result);}
            return Integer.valueOf(result);
        }
        catch (Exception e)
        {
            return 0;
        }
    }
}

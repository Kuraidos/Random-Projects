public class main
{
    public static void main(String[] args)
    {
        long startTime=System.nanoTime();
        System.out.println(longestPalindrome("aacabdkacaa"));
        long stopTime=System.nanoTime();
        System.out.println((stopTime-startTime)/1000000);
    }

    public static String longestPalindrome(String s)
    {
        int end=0;
        int beginning =0;
        String longest="";


            for(int i=0;i<=s.length();i++)
            {
                end=i;
                beginning=i;
                while(end<s.length() && beginning>=0 && s.substring(beginning,beginning+1).equals(s.substring(end,end+1)))
                {
                    if(s.substring(beginning,end+1).length()>longest.length())
                    {
                        longest=s.substring(beginning,end+1);
                    }
                    end++;
                    beginning--;
                }

                end=i+1;
                beginning=i;
                while(end<s.length() && beginning>=0 && s.substring(beginning,beginning+1).equals(s.substring(end,end+1)))
                {
                    if(s.substring(beginning,beginning+1).equals(s.substring(end,end+1)))
                    {
                        if(s.substring(beginning,end+1).length()>longest.length())
                        {
                            longest=s.substring(beginning,end+1);
                        }
                    }
                    end++;
                    beginning--;
                }
            }
        return longest;
    }

}

import java.util.HashMap;
public class main
{
    public static void main (String[] args)
    {
        System.out.println(lengthOfLongestSubstring("Hello"));
    }

        public static int lengthOfLongestSubstring(String s)
        {
            char[] charArray = s.toCharArray();
            HashMap<Character,Integer> lettersUsed = new HashMap<Character,Integer>();
            int beginning=0;
            int end=0;
            int max=0;
            while(end<s.length())
            {
                if(!lettersUsed.containsKey(charArray[end]))
                {
                    lettersUsed.put(charArray[end],0);
                }
                lettersUsed.replace(charArray[end],lettersUsed.get(charArray[end])+1);
                while(lettersUsed.get(charArray[end])>1)
                {
                    lettersUsed.replace(charArray[beginning],lettersUsed.get(charArray[beginning])+-1);
                    beginning++;
                }
                end++;
                if(end-beginning>max)
                {
                    max=end-beginning;
                }
            }
            return max;
        }


}

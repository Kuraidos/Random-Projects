import java.util.LinkedList;
public class main
{
    public static void main(String[] args)
    {
        System.out.println(convert("AB",1));
    }

    public static String convert(String s, int numRows)
    {
        if(numRows==1)
        {
            return s;
        }
        LinkedList<Character>[] cl= new LinkedList[numRows];
        for (int i=0;i<numRows;i++)
        {
            cl[i]= new LinkedList<Character>();
        }
        String result="";
        char[] ca = s.toCharArray();
        boolean increment=true;
        int pos=0;
        for(int i=0;i<ca.length;i++)
        {
            cl[pos].add(ca[i]);
            if(increment)
            {
                pos++;
            }
            else
            {
                pos--;
            }
            if(pos==numRows)
            {
                increment=false;
                pos--;
                pos--;
            }
            if(pos==-1)
            {
                increment=true;
                pos++;
                pos++;
            }
        }
        for (LinkedList<Character> l:cl)
        {
            for (Character c:l)
            {
                result+=c;
            }
        }
        return result;
    }
}

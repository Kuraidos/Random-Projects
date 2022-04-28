import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class atoi
{
    public static int myAtoi(String s)
    {
        Pattern p = Pattern.compile("^[+|-]?\\d+");
        Matcher m = p.matcher(s.trim());
        if(m.find())
        {
            try
            {
                return Integer.valueOf(m.group(0));
            }
            catch (Exception e)
            {
                if(m.group(0).contains("-"))
                {
                    return Integer.MIN_VALUE;
                }
                else
                {
                    return Integer.MAX_VALUE;
                }
            }
        }

        return 0;
    }
}

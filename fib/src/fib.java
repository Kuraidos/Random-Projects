import java.util.HashMap;
public class fib
{
    public static void main(String[] args)
    {
        System.out.println(fib((long)50, new HashMap<Long,Long>()));

    }

    public static long fib(Long n, HashMap<Long,Long> memo )
    {
        if(n<3)
        {
            return 1;
        }
        else
        {
            if(memo.containsKey(n))
            {
                return memo.get(n);
            }
            else
            {
                memo.put(n,fib(n-1,memo)+fib(n-2,memo));
                return (memo.get(n));
            }
        }
    }
}

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class SquareServlet extends HttpServlet
{
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    {
        double k=0;
        Cookie cookies[] = request.getCookies();
        for (Cookie c:
             cookies) {
            if(c.getName().equals("k"))
            {
                k=Double.parseDouble(c.getValue());
            }
        }

        try
        {
            PrintWriter out = response.getWriter();

            out.println("Square = " + Math.pow(k,2));

        }
        catch (IOException e)
        {
            System.out.println("Write not present");
        }


    }
}

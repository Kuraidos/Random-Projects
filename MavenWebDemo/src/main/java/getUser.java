import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/getUser")
public class getUser extends HttpServlet
{

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        GetUserDao db= new GetUserDao();
        int id = Integer.parseInt(request.getParameter("id"));
        request.setAttribute("user",db.getUser(id));
        request.getRequestDispatcher("result display.jsp").forward(request,response);
    }
}

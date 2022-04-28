import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/addAlien")
public class Filter implements javax.servlet.Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException
    {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException
    {
        int id =Integer.parseInt(servletRequest.getParameter("id"));
        if(id<0)
        {
            System.out.println("NOOOOOOOOOOOOOOOOO!");
            servletResponse.getWriter().println("YOU MESSED UP BOY! ");
        }
        else
        {
            System.out.println("YES BOY!");
            filterChain.doFilter(servletRequest,servletResponse);
        }

    }

    @Override
    public void destroy() {


    }


}

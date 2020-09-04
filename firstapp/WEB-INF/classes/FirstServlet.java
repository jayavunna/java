import java.io.*;
import javax.servlet.*;

public class FirstServlet extends GenericServlet
{
        public void service(ServletRequest req, ServletResponse res)
        {
                    try{
                    PrintWriter pw=res.getWriter();
                    pw.println("<html><body bgcolor=green text=yellow><h1>");
                    pw.println("WELCOME to the world of Servlets");
                    }catch(Exception e)
                    {
                           System.err.println(e);
                    }
        }
}
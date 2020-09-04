import java.io.*;
import javax.servlet.*;

public class ContextServlet extends GenericServlet
{
     public void service(ServletRequest req, ServletResponse res)
     {
             try{
             ServletContext sc=getServletContext();
             String s=sc.getInitParameter("message");
             PrintWriter pw=res.getWriter();
             pw.println(s);             
             }catch(Exception e)
             {
                   System.err.println(e);
             } 
             
     }
}
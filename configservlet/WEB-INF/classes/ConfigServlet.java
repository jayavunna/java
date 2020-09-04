import java.io.*;
import javax.servlet.*;

public class ConfigServlet extends GenericServlet
{
 public void service(ServletRequest req, ServletResponse res)
 {
  try{
  String s=getInitParameter("message");
  PrintWriter pw=res.getWriter();
  pw.println(s);
  }catch(Exception e)
  {
   System.err.println(e);
  }
 }

}
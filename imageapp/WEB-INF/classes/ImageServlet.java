import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;

@WebServlet("/image")
public class ImageServlet extends GenericServlet
{
            public void service(ServletRequest req, ServletResponse res)
            {
              try{
              FileInputStream fis=new FileInputStream("C:/birthdaybaby.jpg");
              int n=fis.available();
              byte[] b=new byte[n];
              fis.read(b);
              ServletOutputStream sos=res.getOutputStream();
              sos.write(b);
              }catch(Exception e)
              {
                    System.err.println(e);
              } 
            } 

}
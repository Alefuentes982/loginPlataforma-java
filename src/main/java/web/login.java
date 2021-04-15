

package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/intranet")
public class login extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        
        String user = req.getParameter("usuario");
        String pass = req.getParameter("clave");
       
        if("alejandro".equals(user) && "1234".equals(pass)){
            response(resp, "Bienvenido " + user);
           }
        else {
            response(resp,"Datos erroneos");
        }
        
    }
    
     private void response(HttpServletResponse resp, String mensaje)
         throws IOException{
        
         resp.setContentType("text/html;charset=UTF-8");
         try (PrintWriter out = resp.getWriter()) {
             out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>"+ mensaje + "</h1>");
            out.println("</body>");
            out.println("</html>");
           }
     
     }

}

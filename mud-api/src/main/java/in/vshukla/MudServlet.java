package in.vshukla;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MudServlet implements Servlet {

    public void init(ServletConfig servletConfig) throws ServletException {

    }

    public ServletConfig getServletConfig() {
        return null;
    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        PrintWriter out = servletResponse.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<h1>Hello, world!</h1>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }

    public String getServletInfo() {
        return null;
    }

    public void destroy() {

    }
}

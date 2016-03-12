package in.vshukla;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MudServlet extends HttpServlet {

    private Person person;

    @Override
    public void init() throws ServletException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/spring_config.xml");
        person = (Person) applicationContext.getBean("person");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter pw = resp.getWriter();
        pw.write(String.format("Received a %s request.\n", req.getMethod()));
        pw.write(person.toString());
        pw.close();
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter pw = resp.getWriter();
        pw.write(String.format("Received a %s request.\n", req.getMethod()));
        pw.write(person.toString());
        pw.close();
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter pw = resp.getWriter();
        pw.write(String.format("Received a %s request.\n", req.getMethod()));
        pw.write(person.toString());
        pw.close();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter pw = resp.getWriter();
        pw.write(String.format("Received a %s request.\n", req.getMethod()));
        pw.write(person.toString());
        pw.close();
    }
}

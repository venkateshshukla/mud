package in.vshukla;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

public class MudServlet extends HttpServlet {

    private static final Logger LOGGER = Logger.getLogger(MudServlet.class.getName());

    private Person person;
    private ObjectMapper mapper;

    @Override
    public void init() throws ServletException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/spring_config.xml");
        person = (Person) applicationContext.getBean("person");
        mapper = (ObjectMapper) applicationContext.getBean("objectMapper");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LOGGER.info(String.format("Received a %s request.", req.getMethod()));
        addResponse(resp);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LOGGER.info(String.format("Received a %s request.", req.getMethod()));
        addResponse(resp);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LOGGER.info(String.format("Received a %s request.", req.getMethod()));
        addResponse(resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LOGGER.info(String.format("Received a %s request.", req.getMethod()));
        addResponse(resp);
    }

    private void addResponse(HttpServletResponse resp) throws IOException {
        PrintWriter pw = resp.getWriter();
        pw.write(mapper.writeValueAsString(person));
        pw.close();
    }
}

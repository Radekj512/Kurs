package pl.sda;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Log")
public class LogExampleServlet extends HttpServlet {
    private static final Logger logger = Logger.getLogger(LogExampleServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("<h3 style = color:#ff0000>Log servlet</h3>");
        runMe();
    }

    private void runMe() {
        System.out.println("!!!!!!!!!!!!!!!!!11sout!!!!!!!!!!!!!!!11");
        logger.trace("This is trac");
        logger.debug("This is debug");
        logger.info("This is info");
        logger.warn("This is warn");
        logger.error("This is error");
        logger.fatal("This is fatal");

    }
}

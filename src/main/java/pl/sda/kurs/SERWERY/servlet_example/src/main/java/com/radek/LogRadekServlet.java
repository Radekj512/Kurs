package com.radek;

import org.apache.log4j.Logger;
import pl.sda.LogExampleServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/radek")
public class LogRadekServlet extends HttpServlet {
    private static final Logger logger = Logger.getLogger(LogRadekServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("<h3 style = color:#ff0000>Log servlet</h3>");
        runMe();
    }

    private void runMe() {
        System.out.println("!!!!!!!!!!!!!!!!!11sout!!!!!!!!!!!!!!!11");
        logger.trace("This is trac r");
        logger.debug("This is debug r");
        logger.info("This is info r");
        logger.warn("This is warn r");
        logger.error("This is error r");
        logger.fatal("This is fatal r");

    }
}



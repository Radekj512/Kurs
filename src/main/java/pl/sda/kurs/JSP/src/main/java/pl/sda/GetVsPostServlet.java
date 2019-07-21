package pl.sda;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/process-example-form")
public class GetVsPostServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName = req.getParameter("fn");
        String lastName = req.getParameter("ln");
        String gender = req.getParameter("gen");
        String g = "";
        if (gender.equals("m")){
            g="Male";
        }
        else {
            g = "Female";
        }
        PrintWriter writer = resp.getWriter();
        writer.print(String.format("<h1>Hello %s %s from GET</h1><br /> <h2>You are %s</h2>", firstName, lastName, g));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName = req.getParameter("fn");
        String lastName = req.getParameter("ln");
        String gender = req.getParameter("gen");
        String g = "";
        if (gender.equals("m")){
            g="Male";
        }
        else {
            g = "Female";
        }
        PrintWriter writer = resp.getWriter();
        writer.print(String.format("<h1>Hello %s %s from PoST</h1><br /> <h2>You are %s</h2>", firstName, lastName, g));
    }
}

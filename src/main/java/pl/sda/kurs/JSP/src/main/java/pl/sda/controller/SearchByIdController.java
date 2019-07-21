package pl.sda.controller;

import org.apache.commons.lang3.StringUtils;
import pl.sda.dao.StudentDao;
import pl.sda.model.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebServlet("/search-by-id")
public class SearchByIdController extends HttpServlet {

    private final StudentDao studentDao = new StudentDao();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("studentId");
        List<Student> student = Arrays.asList(studentDao.getStudent(StringUtils.isNotBlank(id) ? Integer.parseInt(id) : 1));
        req.setAttribute("student", student);
        req.getRequestDispatcher("/WEB-INF/view/student-info.jsp").forward(req,resp);
    }
}

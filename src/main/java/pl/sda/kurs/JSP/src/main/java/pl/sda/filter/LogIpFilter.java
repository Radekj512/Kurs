package pl.sda.filter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LogIpFilter extends HttpFilter {
    @Override
    public void init() throws ServletException {
        System.out.println("inti() LogIpFilter");
        super.init();
    }

    @Override
    public void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
        System.out.println("Adres ip: "+ req.getRemoteAddr());
        super.doFilter(req, res, chain);
    }

    @Override
    public void destroy() {
        System.out.println("destroy() LogIpFilter");
    }
}

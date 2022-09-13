package br.pro.ramon.mvc.bhaskara;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/raizes")
public class RaizesServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double a = Double.parseDouble(req.getParameter("a"));
        double b = Double.parseDouble(req.getParameter("b"));
        double c = Double.parseDouble(req.getParameter("c"));

        Equacao2Grau eq = new Equacao2Grau(a, b, c);

        req.setAttribute("equacao", eq);
        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/resultado.jsp");
        rd.forward(req, resp);
    }

}

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="CountServlet", urlPatterns = "/count")
public class CountServlet extends HttpServlet {
    int count = 0;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String reset = req.getParameter("reset");

        PrintWriter out = resp.getWriter();
        String countParam = req.getParameter("count");
        if (countParam == null) {
            count = 1;
        } else {
//            count = Integer.parseInt(countParam);
            count += 1;
        }
//        req.setAttribute("count", count);
//        resp.sendRedirect("/counter?count=" + count);
        out.println("<h1>Counter is at " +  count + "!<h1>");
    }
}

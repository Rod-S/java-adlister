import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="CountServlet", urlPatterns = "/count")
public class CounterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String count = req.getParameter("count");
        Integer countInt;
        if (count == null) {
            count = "1";
        } else {
            countInt = Integer.parseInt(req.getParameter("count")) + 1;
            count = String.valueOf(countInt);
        }
        req.setAttribute("count", count);
//        resp.sendRedirect("/counter?count=" + count);
        out.println("<h1>Counter is at " +  count + "!<h1>");
    }
}

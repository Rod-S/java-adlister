import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet (name="DadJokeServer", urlPatterns = "/dadjoke")
public class DadJokeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String passedJoke = req.getParameter("joke");

        if (passedJoke == null) {
            passedJoke = "hungry";
        }

        out.println("<h1>Hi " + passedJoke + ", I'm Dad.</h1>");
    }
}

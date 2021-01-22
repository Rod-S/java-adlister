import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="GuessServlet", urlPatterns = "/guess")
public class GuessServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        if (req.getAttribute("guess") == "1") {
        res.sendRedirect("/correct.jsp");
        }
        req.getRequestDispatcher("/guessing-game/guess.jsp").forward(req, res);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String guess = req.getParameter("guess");
        System.out.println(req.getParameter("guess"));
        req.setAttribute("guess", guess);
        req.getRequestDispatcher("/guessing-game/correct.jsp").forward(req, res);
    }
}

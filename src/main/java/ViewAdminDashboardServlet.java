import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "ViewAdminDashBoardServlet", urlPatterns = "/admin")
public class ViewAdminDashboardServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        HttpSession session = req.getSession(); //get current session

        boolean isAdmin = (boolean) session.getAttribute("isAdmin");
        if (!isAdmin) {
            //user path
            res.sendRedirect("/profile");
            //USE RETURN OR ELSE BLOCK
            return;
        }
        //TODO: CHECK FOR ADMIN STATUS!
        req.getRequestDispatcher("/WEB-INF/admin.jsp").forward(req, res);
    }
}


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="OrderPizzaServlet", urlPatterns="/orderpizza")
public class OrderPizzaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.getRequestDispatcher("/pizza-order/orderpizza.jsp").forward(req, res);
    }
    protected void doPost(HttpServletRequest req, HttpServletResponse res) {

    }
}

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet(name="OrderPizzaServlet", urlPatterns="/orderpizza")
public class OrderPizzaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.getRequestDispatcher("/pizza-order/orderpizza.jsp").forward(req, res);
    }
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        for(String name : req.getParameterMap().keySet()) {
            for (String value : req.getParameterValues(name)) {
                if (name.equalsIgnoreCase("toppings")) {
                    String[] toppings = req.getParameterValues("toppings");
                    req.setAttribute("toppings", toppings);
                } else {
                req.setAttribute(name, value);
                }
                System.out.println(name + ": " + value);
            }
        }
        req.getRequestDispatcher("/pizza-order/orderpizza.jsp").forward(req, res);
    }
}

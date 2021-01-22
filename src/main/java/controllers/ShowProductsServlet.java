package controllers;

import daos.DaoFactory;
import daos.Products;
import models.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/products")
public class ShowProductsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        // Use the factory to get the dao object
        // Use a method on the dao to get all the products
//        first way to get products
//        Products productsDao = DaoFactory.getProductsDao();
//        List<Product> products = productsDao.all();
//        second way to get products
        List<Product> products = DaoFactory.getProductsDao().all();
        // Pass the data to the jsp
        request.setAttribute("products", products);
        //simplified
//        request.setAttribute("products", DaoFactory.getProductsDao().all());
        request.getRequestDispatcher("/products/index.jsp").forward(request, resp);
    }
}
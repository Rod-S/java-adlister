package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO: show the registration form
        request.getRequestDispatcher("/WEB-INF/register.jsp").forward(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // TODO: ensure the submitted information is valid
        // TODO: create a new user based off of the submitted information
        // TODO: if a user was successfully created, send them to their profile
        // TODO: make sure we find a user with that username
        String email = request.getParameter("email");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(email);
        System.out.println(username);
        System.out.println(password);
        User registerUser = new User(username, email, password);
        User user = DaoFactory.getUsersDao().findByUsername(username);
//
//        if (user.getUsername().equalsIgnoreCase(username)) {
//            response.sendRedirect("/register");
//        } else {
        request.getSession().setAttribute("user", registerUser);
        DaoFactory.getUsersDao().insert(registerUser);
            response.sendRedirect("/profile");
//        }

    }
}

package com.codecool.shop.controller;

import com.codecool.shop.model.User;
import com.codecool.shop.service.UserService;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/api/details"})
public class UserDetails extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        User userTemplate = new Gson().fromJson(request.getReader(), User.class);
        System.out.println(userTemplate.getName());
    }
}

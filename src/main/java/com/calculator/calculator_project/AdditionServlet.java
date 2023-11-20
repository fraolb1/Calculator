package com.calculator.calculator_project;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "AdditionServlet", value = "/addition")
public class AdditionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int operand1 = Integer.parseInt(request.getParameter("operand1"));
        int operand2 = Integer.parseInt(request.getParameter("operand2"));
        int additionResult = operand1 + operand2;

        try {
            response.getWriter().print("Result of Addition: " + additionResult);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

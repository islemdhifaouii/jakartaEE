package com.horizon.calculatorlab1;


import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "CalculatorServlet", value = "/calc-servlet")
public class CalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            int num1 = Integer.parseInt(request.getParameter("num1"));
            int num2 = Integer.parseInt(request.getParameter("num2"));
            String operation = request.getParameter("operation");

            // Use JavaBean
            CalculatorBean calc = new CalculatorBean();
            calc.setNum1(num1);
            calc.setNum2(num2);

            double result = 0;
            String opText = "";

            // Perform operation
            switch (operation) {
                case "add":
                    result = calc.add();
                    opText = "Addition";
                    break;
                case "sub":
                    result = calc.sub();
                    opText = "Subtraction";
                    break;
                case "mul":
                    result = calc.mul();
                    opText = "Multiplication";
                    break;
                case "div":
                    result = calc.div();
                    opText = "Division";
                    break;
                default:
                    opText = "Unknown Operation";
            }

            // Display result
            out.println("<html><body>");
            out.println("<h2>Result of " + opText + ":</h2>");
            out.println("<p>" + num1 + " and " + num2 + " = " + result + "</p>");
            out.println("</body></html>");

        } catch (NumberFormatException e) {
            out.println("<html><body>");
            out.println("<p style='color:red;'>Please enter valid integer values!</p>");
            out.println("</body></html>");
        } catch (ArithmeticException e) {
            out.println("<html><body>");
            out.println("<p style='color:red;'>" + e.getMessage() + "</p>");
            out.println("</body></html>");
        }
    }
}


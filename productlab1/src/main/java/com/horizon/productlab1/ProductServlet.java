package com.horizon.productlab1;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/productservlet")
public class ProductServlet extends HttpServlet {

    private ProductList productList;

    @Override
    public void init() {
        productList = new ProductList();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String productName = request.getParameter("productName");


        int quantity = Integer.parseInt(request.getParameter("quantity"));

        Product product = productList.findByName(productName);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();


        if (product != null) {
            double totalTTC = quantity * product.getPrixHT() * (1 + product.getTVA());
            out.println("<h2>Product: " + product.getName() + "</h2>");
            out.println("<p>Quantity: " + quantity + "</p>");
            out.println("<p>Total TTC: " + totalTTC + "</p>");
        } else {
            out.println("<h2>Product not found!</h2>");
        }
    }
}

package com.horizon.lab1jakarta;

import java.io.IOException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "ServletSearch", value = "/ServletSearch")
public class ServletSearch extends HttpServlet {
    private String keyword;
    private String browser;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        keyword = request.getParameter("Keyword");
        browser = request.getParameter("browser");

        if(browser.equals("Google")) {
            response.sendRedirect("https://www.google.com/search?q=" + keyword);
        } else if (browser.equals("Bing")) {
            response.sendRedirect("https://www.bing.com/search?q=" + keyword);
        } else {
            response.sendRedirect("https://fr.ask.com/web?q=" + keyword);
        }
    }
}
